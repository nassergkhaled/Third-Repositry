import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ImageProcessing {
    public static void main(String[] args) throws IOException {
        // Read the input file
        File inputFile = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String input = "";
        String line;
        while ((line = br.readLine()) != null) {
            input += line + "\n";
        }
        br.close();

        // Partition and sort each line
        List<String> sequences = new ArrayList<>();
        Matcher m = Pattern.compile("\\d+|\\D+").matcher(input);
        while (m.find()) {
            sequences.add(m.group());
        }
        for (int i = 0; i < sequences.size(); i++) {
            char[] chars = sequences.get(i).toCharArray();
            if (Character.isDigit(chars[0])) {
                Arrays.sort(chars);
            } else {
                Arrays.sort(chars);
            }
            sequences.set(i, new String(chars));
        }

        // Write the output to a file
        File outputFile = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        for (String s : sequences) {
            bw.write(s);
        }
        bw.close();
    }
}
