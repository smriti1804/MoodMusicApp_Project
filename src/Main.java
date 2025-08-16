import gui.MoodSuggesterApp;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MoodSuggesterApp().setVisible(true));
    }
}
