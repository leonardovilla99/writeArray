/**
 * writeArray
 */
import java.io.*;

public class Array {
    public static void main(String[] args) throws IOException{
        int[] arrayStart = {2,4,7,2,6};
        int[] arrayFinal = {0,0,0,0,0};
        String name = "arrayList.dat";

        writeArray(name, arrayStart);
        readArray(name, arrayFinal);

        System.out.println("Initial \t Final");
        for(int i=0; i < arrayFinal.length; i++){
            System.out.println(arrayStart[i] + "\t\t" + arrayFinal[i]);
        }
    }

    public static void writeArray(String name, int[] array) throws IOException{
        FileOutputStream fileOut = new FileOutputStream(name);
        DataOutputStream dataOut = new DataOutputStream(fileOut);
        for(int i=0; i < array.length; i++){
            dataOut.writeInt(array[i]);
        }
        dataOut.close();
    }

    public static int[] readArray(String name, int[] array) throws IOException{
        FileInputStream fileIn = new FileInputStream(name);
        DataInputStream dataIn = new DataInputStream(fileIn);
        for(int i=0; i < array.length; i++){
            array[i] = dataIn.readInt();
        }
        dataIn.close();
        return array;
    }
}