import java.util.Scanner;

public class Matrix {

    public static int row;
    public static int col;

    // method for reading matrix
    public static void readMatrix(int arr[][]){

        System.out.println("Enter values row wise: ");

        try{
            for (int i=0;i<row;i++){

                // as java doesn't take space as new line
                // I'm getting column number by splitting row

                String line = new Scanner(System.in).nextLine();
                String[] vals = line.split(" ");

                // length of value is column number
                if(col==vals.length){

                    // vals.length is the number of column
                    for (int j=0;j<vals.length;j++){

                        arr[i][j]= Integer.parseInt(vals[j]);
                    }

                // checking if user input less amount of of value
                }else if(vals.length<col){

                    System.out.println("VALUE MISSING IN LAST ROW !!! ENTER THE MATRIX AGAIN ");
                    readMatrix(arr);
                    break;

                // checking if user inputs more value then index
                }else if(vals.length>col){
                    System.out.println("Trying to put value in wrong index !!! row must be: "+row+ " column must be: "+col);
                    readMatrix(arr);
                    break;
                }
            }
        }catch (NumberFormatException n){

            // if user inputs anything than number
            System.out.println("Value must be number !!! row must be: "+row+ " column must be: "+col);
            readMatrix(arr);
        }

    }

    // method for printing matrix
    public static void printMatrix(int arr[][]){

        System.out.println("Matrix is :");

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }

    }


    // method for checking zero matrix
    public static boolean isZeroMatrix(int arr[][]){

        if(row==col){
            System.out.print("Is Zero Matrix: ");

            for(int i = 0;i<row;i++){
                for(int j =0;j<col;j++){

                    if(arr[i][j] != 0){
                        return false;
                    }
                }
            }
            return true;

        }else{
            System.out.println("Row And Column must be same for zero matrix.");
            System.out.print("Is Zero Matrix: ");
            return false;
        }


    }



    // method for checking upper triangular matrix
    public static boolean isUpperTriangularMatrix(int arr[][]){

        if(row == col){

            System.out.print("IsUpperTriangularMatrix: ");

            for(int i = 0;i<row;i++){
                for(int j =0;j<col;j++){
                    if(i>j)
                        if(arr[i][j]!=0)
                            return false;
                }
            }
            return true;
        }else{
            System.out.println("Row And Column must be same for upper triangular matrix.");
            System.out.print("IsUpperTriangularMatrix: ");
            return false;
            }
        }

    // method for checking lower triangular matrix
    public static boolean isLowerTriangularMatrix(int arr[][]){

        if(row==col){

            System.out.print("IsLowerTriangularMatrix: ");


            for(int i = 0;i<row;i++){
                for(int j =0;j<col;j++){
                    if(i<j)
                        if(arr[i][j]!=0)
                            return false;
                }
            }
            return true;
        }else{
            System.out.println("Row And Column must be same for Lower triangular matrix.");
            System.out.print("IsLowerTriangularMatrix: ");
            return false;
        }

    }

    // method for checking diagonal matrix
    public static boolean isDiagonalMatrix(int arr[][]){

        if(row == col){
            System.out.print("IsDiagonalMatrix: ");
            for(int i = 0;i<row;i++){
                for(int j =0;j<col;j++){
                    if(i!=j)
                        if(arr[i][j]!=0)
                            return false;
                }
            }
            return true;

        }else{
            System.out.println("Row And Column must be same for diagonal matrix.");
            System.out.print("IsDiagonalMatrix: ");
            return false;
        }


    }

    // method for checking scalar matrix
    public static boolean isScalarMatrix(int arr[][]){


        if(row == col){

            System.out.print("IsScalarMatrix: ");

            int temp = arr[0][0];
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(i!=j)
                        if(arr[i][j]!=0)
                            return false;
                    if(i==j){
                        if(temp == arr[i][j])
                            temp = arr[i][j];
                        else
                            return false;
                    }
                }
            }

            return true;
        }else{

            System.out.println("Row And Column must be same for scalar matrix.");
            System.out.print("IsScalarMatrix: ");
            return false;
        }

    }

    // method for checking identity matrix
    public static boolean isIdentityMatrix(int arr[][]){


        if(row==col){

            System.out.print("IsIdentityMatrix: ");

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(i!=j)
                        if(arr[i][j]!=0)
                            return false;
                    if(i==j){
                        if(arr[i][j]!=1)
                            return false;
                    }
                }
            }

            return true;
        }else{
            System.out.println("Row And Column must be same for identity matrix.");
            System.out.print("IsIdentityMatrix: ");
            return false;
        }

    }

    public static void transposeMatrix (int arr[][]){

        int trnsMatrix[][] = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                trnsMatrix[j][i] =  arr[i][j];
            }
        }
        System.out.println("Transpose matrix is: ");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(trnsMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSymmetricmatrix(int arr[][]){

        if(row == col){

            System.out.print("IsSymmetricMatrix: ");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(arr[i][j]!=arr[j][i]){
                      return false;
                    }
                }
            }
            return true;
        }else{

            System.out.println("Row And Column must be same for symmetric matrix.");
            System.out.print("IsSymmetricMatrix: ");
            return false;
        }
    }

    public static boolean isSkewSymmetricmatrix(int arr[][]){

        if(row == col){

            System.out.print("IsSkewSymmetricMatrix: ");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(arr[i][j]!= - arr[j][i]){
                        return false;
                    }
                }
            }
            return true;
        }else{

            System.out.println("Row And Column must be same for skew symmetric matrix.");
            System.out.print("IsSkewSymmetricMatrix: ");
            return false;
        }
    }

}
