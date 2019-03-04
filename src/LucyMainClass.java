import java.util.Scanner;

public class LucyMainClass {
    public static void main(String[] args) {
        System.out.println("We are making a new string array. :3");
        String[] Arraytoprint = new String[3];
        Arraytoprint[0] = "bleh";
        Arraytoprint[1] = "something owo";
        Arraytoprint[2] = "blah";
        StringArrayWriter writer = new StringArrayWriter(Arraytoprint);
        String convertedarray = writer.ConvertToString();
        writeline("Array Contents: " + convertedarray);
        while (true) {
            System.out.print("[Specify Index!]");
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine();
            if (input.toLowerCase().equals("exit")) {
                writeline("exiting! owo");
                break;
            }
            try {
                int requestedindex = Integer.parseInt(input);
                writer.printindex(requestedindex);
            } catch (NumberFormatException exception) {
                writeErrorLine("Invalid Number");
            }
        }
    }

    private static void writeline(String message) {
        System.out.println(message);
    }

    private static void writeErrorLine(String errorMessage) {
        System.err.println(errorMessage);
    }
}

