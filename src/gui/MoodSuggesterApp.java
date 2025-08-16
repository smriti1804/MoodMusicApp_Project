package gui;

import database.DatabaseManager;
import java.awt.*;
import java.io.File;
import java.net.URI;
import javax.swing.*;

/**
 * Cute, simple Swing UI:
 * 1) First screen: mood buttons (Happy, Sad, Motivated, Relaxed, Angry, Upset)
 * 2) Second screen: shows quote + "Play Music" button (opens YouTube in browser)
 * Pastel background; optional background image if resources/bg.jpg exists.
 */
public class MoodSuggesterApp extends JFrame {
    private final JPanel mainPanel = new JPanel(new CardLayout());
    private final JLabel quoteLabel = new JLabel("", SwingConstants.CENTER);
    private final JButton playButton = new JButton("Play Music.");
    private String currentLink = "";

    public MoodSuggesterApp() {
        setTitle("Mood-Based Music & Quote Suggester");
        setSize(560, 440);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Try app icon if present
        File icon = new File("resources/icon.png");
        if (icon.exists()) {
            setIconImage(new ImageIcon(icon.getPath()).getImage());
        }

        JPanel moodPanel = buildMoodPanel();
        JPanel suggestionPanel = buildSuggestionPanel();

        mainPanel.add(moodPanel, "moods");
        mainPanel.add(suggestionPanel, "suggestion");
        add(mainPanel);

        showCard("moods");
    }

    private JPanel buildMoodPanel() {
        JPanel outer = new ImagePanel(); // supports bg image or pastel
        outer.setLayout(new BorderLayout());
        outer.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("How are you feeling today?", SwingConstants.CENTER);
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        title.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10));

        JPanel grid = new JPanel(new GridLayout(3, 2, 16, 16)) {
            @Override public boolean isOpaque() { return false; } // let background show
        };

        String[] moods = {"Happy", "Sad", "Motivated", "Relaxed", "Angry", "Upset"};
        for (String mood : moods) {
            JButton btn = new JButton(mood + " " + emoji(mood));
            btn.setFont(new Font("Seoge UI Emoji", Font.BOLD, 16));
            btn.setFocusPainted(false);
            btn.setBorder(BorderFactory.createEmptyBorder(10, 16, 10, 16));
            btn.setBackground(new Color(173, 216, 230));
            btn.setOpaque(true);
            btn.addActionListener(e -> showSuggestion(mood));
            grid.add(btn);
        }

        outer.add(title, BorderLayout.NORTH);
        outer.add(grid, BorderLayout.CENTER);
        return outer;
    }

    private JPanel buildSuggestionPanel() {
        JPanel panel = new ImagePanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));

        quoteLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        quoteLabel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(12, 12, 12, 12),
                BorderFactory.createLineBorder(new Color(240, 200, 210), 2)
        ));

        JButton back = new JButton("⬅ Back");
        back.addActionListener(e -> showCard("moods"));

        playButton.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        playButton.setBackground(new Color(144, 238, 144));
        playButton.setFocusPainted(false);
        playButton.addActionListener(e -> openMusicLink());

        JPanel bottom = new JPanel();
        bottom.setOpaque(false);
        bottom.add(back);
        bottom.add(playButton);

        panel.add(quoteLabel, BorderLayout.CENTER);
        panel.add(bottom, BorderLayout.SOUTH);
        return panel;
    }

    private void showSuggestion(String mood) {
        String[] data = DatabaseManager.getMoodData(mood);
        if (data[0] != null) {
            quoteLabel.setText("<html><div style='text-align:center;'>" + data[0] + "</div></html>");
            currentLink = data[1] != null ? data[1] : "";
            showCard("suggestion");
        } else {
            JOptionPane.showMessageDialog(this, "No data found for " + mood);
        }
    }

    @SuppressWarnings({"CallToPrintStackTrace", "UseSpecificCatch"})
    private void openMusicLink() {
        if (currentLink == null || currentLink.isBlank()) {
            JOptionPane.showMessageDialog(this, "No music link available.");
            return;
        }
        try {
            Desktop.getDesktop().browse(new URI(currentLink));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Could not open the link.");
        }
    }

    private String emoji(String mood) {
        return switch (mood) {
            case "Happy" -> "😊";
            case "Sad" -> "😢";
            case "Motivated" -> "💪";
            case "Relaxed" -> "☺️";
            case "Angry" -> "😡";
            case "Upset" -> "😞";
            default -> "";
        };
    }

    private void showCard(String name) {
        ((CardLayout) mainPanel.getLayout()).show(mainPanel, name);
    }

    /**
     * Panel that paints a cute background:
     * - If resources/bg.jpg exists, it is drawn scaled.
     * - Otherwise, uses a pastel gradient.
     */
    static class ImagePanel extends JPanel {
        private final Image bgImage;

        ImagePanel() {
            File bg = new File("resources/bg.jpg");
            this.bgImage = bg.exists() ? new ImageIcon(bg.getPath()).getImage() : null;
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (bgImage != null) {
                g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);
            } else {
                // pastel gradient fallback
                Graphics2D g2 = (Graphics2D) g.create();
                GradientPaint gp = new GradientPaint(
                        0, 0, new Color(255, 228, 235),
                        getWidth(), getHeight(), new Color(255, 239, 213));
                g2.setPaint(gp);
                g2.fillRect(0, 0, getWidth(), getHeight());
                g2.dispose();
            }
            super.paintComponent(g);
        }

        @Override public boolean isOpaque() { return false; }
    }
}
