package score;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreRegister {
    private int score;
    private int maxScore;
    String filePath = "src\\score\\Score.txt";

    public ScoreRegister(int score) {
        this.score = score;
    }

    public void printMaxScore() throws IOException {
        try {
            List<Integer> scores = new ArrayList<>();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filePath));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                int score = Integer.parseInt(line.trim());
                scores.add(score);
            }
            
            scores.add(score);
            maxScore = Collections.max(scores);


            FileWriter fileWriter = new FileWriter(this.filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(score + "\n");

            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.getMessage();
        }
        
    }
        
    public int getMaxScore() {
        return maxScore;
    }
}
