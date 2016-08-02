
public class Hiker {


    public static int answer() {
        return 42;
    }

    public static String[] convert(int[] orig){
        String[] finalResult = new String[]{"", "", ""};
        for (int digit: orig) {
            String[] result = convert(digit);
            finalResult[0] += result[0] + " ";
            finalResult[1] += result[1] + " ";
            finalResult[2] += result[2] + " ";
        }
        for (int digit: orig) {
            finalResult[0] = finalResult[0].trim();
            finalResult[1] = finalResult[1].trim();
            finalResult[2] = finalResult[2].trim();
        }
        
        return finalResult;
    }

    public static String[] convert(int orig) {
        if(orig == 1) {
            return new String[]{"..|","..|","..|"};
        } else if(orig == 7) {
            return new String[]{"._.","..|","..|"};
        } else {
            return new String[]{"._.","|_|","..|"};
        }
    }
}
