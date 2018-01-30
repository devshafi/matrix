import java.util.Scanner;

public class MatrixTestingDemo {


    /***************************

     sample
     3
     4
     3 6 3 5
     5 6 3 6
     1 2 3 3

     **************************/

    static int exitValue = 0;

    public static void main(String[] args) {

        while (true) {

            System.out.print("Enter the no. of rows: ");
            Matrix.row = new Scanner(System.in).nextInt();
            System.out.print("Enter the no. of columns: ");
            Matrix.col = new Scanner(System.in).nextInt();
            int mat[][] = new int[Matrix.row][Matrix.col];
            // reading the matrix
            Matrix.readMatrix(mat);
            //printing the matrix
            Matrix.printMatrix(mat);

            // checking trypes
            typeCheck(mat);

            boolean flag = isExiting(); // checking if user wants to exit or not

            if(flag)break; // if press zero then break the loop, if press 1 continue
        }
    }

    // method for exiting from the programm
    static boolean isExiting(){

        System.out.println("Press 0 to exit 1 to continue");

        exitValue = new Scanner(System.in).nextInt();

        if(exitValue ==0){
            System.out.println("You are exiting !!!");
            System.out.println("Good bye...");
            return true ;
        }else if(exitValue ==1)
            return false;
        else {

            System.out.println("Incorrect choice !!! Press 0 or 1");
            isExiting();
            return false;
        }

    }

    static void typeCheck(int mat[][]) {


        System.out.println("Press 1 to check ZERO MATRIX");
        System.out.println("Press 2 to check LOWER TRIANGULAR MATRIX");
        System.out.println("Press 3 to check UPPER TRIANGULAR MATRIX");
        System.out.println("Press 4 to check SCALAR MATRIX");
        System.out.println("Press 5 to check DIAGONAL MATRIX");
        System.out.println("Press 6 to check IDENTITY MATRIX");
        System.out.println("Press 7 to check  SYMMETRIC MATRIX");
        System.out.println("Press 8 to check SKEW SYMMETRIC MATRIX");
        System.out.println("Press 9 to show TRANSPOSE MATRIX");
        System.out.println("Press 10 to check ALL TYPES AT A TIME");
        String choice = new Scanner(System.in).nextLine();

        switch (choice) {

            case "1":
                System.out.println(Matrix.isZeroMatrix(mat));
                break;
            case "2":
                System.out.println(Matrix.isLowerTriangularMatrix(mat));
                break;
            case "3":
                System.out.println(Matrix.isUpperTriangularMatrix(mat));
                break;
            case "4":
                System.out.println(Matrix.isScalarMatrix(mat));
                break;
            case "5":
                System.out.println(Matrix.isDiagonalMatrix(mat));
                break;
            case "6":
                System.out.println(Matrix.isIdentityMatrix(mat));
                break;
            case "7":
                System.out.println(Matrix.isSymmetricmatrix(mat));
                break;
            case "8":
                System.out.println(Matrix.isSkewSymmetricmatrix(mat));
                break;
            case "9":
                Matrix.transposeMatrix(mat);
                break;
            case "10":
                System.out.println(Matrix.isZeroMatrix(mat));
                System.out.println(Matrix.isLowerTriangularMatrix(mat));
                System.out.println(Matrix.isUpperTriangularMatrix(mat));
                System.out.println(Matrix.isScalarMatrix(mat));
                System.out.println(Matrix.isDiagonalMatrix(mat));
                System.out.println(Matrix.isIdentityMatrix(mat));
                System.out.println(Matrix.isSymmetricmatrix(mat));
                System.out.println(Matrix.isSkewSymmetricmatrix(mat));
                Matrix.transposeMatrix(mat);
                break;

                default:
                    System.out.println("INCORRECT CHOICE !!! PRESS 1 TO 10");
                    typeCheck(mat);
        }
    }
}

