public class MoodAnalyzer {
    String message;

    MoodAnalyzer() {
    }

    MoodAnalyzer(String message) {
        this.message = message;
    }

    public String moodAnalyser() throws MoodAnalysisException{
        try {
            if (message.length() == 0){
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY,"Empty Mood, Enter Proper Message");
            }
            if (message.contains("Sad"))
                return "Sad";
            else
                return "Happy";
        }catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL,"Null Mood,Enter Proper Message");
        }
    }
}
