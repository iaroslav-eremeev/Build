package program;

import util.Util;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        /*if(args.length < 1){
            System.out.println("Error: not enough arguments");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n == 0){
            if(args.length < 2){
                System.out.println("Error: not enough arguments");
                return;
            }
            int m = Integer.parseInt(args[1]);
            int[][] arr = Util.builderMxM(m);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        else if (n == 1){
            if(args.length < 3){
                System.out.println("Error: not enough arguments");
                return;
            }
            int m = Integer.parseInt(args[1]);
            int t = Integer.parseInt(args[2]);
            int[][] arr = Util.builderMxT(m, t);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("Invalid N!");*/

        /*try(BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"))){
            String s = bufferedReader.readLine();
            System.out.println(s);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(
                Program.class.getClassLoader().getResourceAsStream("test.txt"))){
            byte[] bytes = bufferedInputStream.readAllBytes();
            String str = new String(bytes);
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
