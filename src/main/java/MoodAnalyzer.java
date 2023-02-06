public class MoodAnalyzer {
    String message;

    MoodAnalyzer(String message) {
        this.message = message;
    }

    public String moodAnalyser() {
        if (message.contains("Sad")) {
            return "Sad";
        }
        return "Happy";
    }
}
