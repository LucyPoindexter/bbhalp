import java.util.Arrays;

public class StringArrayWriter {
    private String[] stringArray = null;

    public StringArrayWriter() {
        stringArray = new String[0];
    }

    public StringArrayWriter(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public String ConvertToString() {
        String convertedarray = Arrays.toString(stringArray);
        return convertedarray;
    }

    public void printindex(int index) {
        String toprint = null;
        if (index > stringArray.length - 1 || index < 0) {
            toprint = "Requested Index out of bounds:" + index;
        } else {
            toprint = stringArray[index];
        }
        System.out.println(toprint);
    }

}

