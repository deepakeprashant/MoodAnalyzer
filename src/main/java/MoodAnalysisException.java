public class MoodAnalysisException extends Exception {
    enum ExceptionType {
        EMPTY, NULL;
    }

    ExceptionType type;

    MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
