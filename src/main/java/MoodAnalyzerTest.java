import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_Test_ReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.moodAnalyser();
        Assertions.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessage_Test_ReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Any Mood");
        String mood = moodAnalyzer.moodAnalyser();
        Assertions.assertEquals("Happy", mood);
    }
}
