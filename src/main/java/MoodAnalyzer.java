public class MoodAnalyzer {
    String message;

    MoodAnalyzer() {
    }

    MoodAnalyzer(String message) {
        this.message = message;
    }

    public String moodAnalyser() {
        try {
            if (message.contains("Sad"))
                return "Sad";
            else
                return "Happy";
        }catch (NullPointerException e){
            return "Happy";
        }
    }
}
