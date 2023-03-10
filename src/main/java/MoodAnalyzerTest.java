import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_Test_ReturnSad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.moodAnalyser();
        Assertions.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessage_Test_ReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Any Mood");
        String mood = moodAnalyzer.moodAnalyser();
        Assertions.assertEquals("Happy", mood);
    }

    @Test
    public void givenNullMoodShould_ReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.moodAnalyser();
        Assertions.assertEquals("Happy", mood);
    }

    @Test
    public void givenNullMoodThrowCustomException() throws MoodAnalysisException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.moodAnalyser();
        Assertions.assertEquals("Happy",mood);
    }

    @Test
    public void givenEmptyMoodThrowCustomException() throws MoodAnalysisException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        String mood = moodAnalyzer.moodAnalyser();
        Assertions.assertEquals("Happy",mood);
    }
}
