package punto8;

import java.util.Scanner;

public class Punto8 {

    private static Scanner scanner = new Scanner(System.in);
    private static int[][] arrayA;
    private static int[][] arrayB;
    private static int[][] arrayC;
    private static int rowsA;
    private static int colsA;
    private static int rowsB;
    private static int colsB;

    public void Algebra () {
        boolean exit = false;
        while (!exit) {
        	System.out.println("Introduzca una opción:");
            System.out.println("a. Introduzca Arreglo A");
            System.out.println("b. Introducir Arreglo B");
            System.out.println("c. Indicar A + B");
            System.out.println("d. Mostrar A - B");
            System.out.println("e. Mostrar A * B");
            System.out.println("f. Salir");

            String option = scanner.nextLine();

            switch (option) {
                case "a":
                    enterArrayA();
                    break;
                case "b":
                    enterArrayB();
                    break;
                case "c":
                    if (arrayA != null && arrayB != null && rowsA == rowsB && colsA == colsB) {
                        displayArray(addArrays(arrayA, arrayB));
                    } else {
                        System.out.println("Las matrices deben tener las mismas dimensiones y no ser nulas.");
                    }
                    break;
                case "d":
                    if (arrayA != null && arrayB != null && rowsA == rowsB && colsA == colsB) {
                        displayArray(subtractArrays(arrayA, arrayB));
                    } else {
                        System.out.println("Las matrices deben tener las mismas dimensiones y no ser nulas.");
                    }
                    break;
                case "e":
                    if (arrayA != null && arrayB != null && colsA == rowsB) {
                        displayArray(multiplyArrays(arrayA, arrayB));
                    } else {
                        System.out.println("Las columnas de la matriz A deben ser iguales a las filas de la matriz B y ambas matrices no deben ser nulas.");
                    }
                    break;
                case "f":
                    exit = true;
                    break;
                default:
                    System.out.println("Opción Invalida");
                    break;
            }
        }
    }

    private static Object multiplyArrays(int[][] arrayA2, int[][] arrayB2) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object subtractArrays(int[][] arrayA2, int[][] arrayB2) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void displayArray(Object addArrays) {
		// TODO Auto-generated method stub
		
	}

	private static Object addArrays(int[][] arrayA2, int[][] arrayB2) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void enterArrayA() {
        System.out.println("Introduzca el número de filas de la matriz A:");
        rowsA = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduzca el número de columnas de la matriz A:");
        colsA = scanner.nextInt();
        scanner.nextLine();

        arrayA = new int[rowsA][colsA];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.printf("Introduzca el valor de la fila %d y la columna %d de la matriz A:", i+1, j+1);
                arrayA[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        displayArray(arrayA);
    }

    private static void enterArrayB() {
        System.out.println("Enter number of rows for array B:");
        rowsB = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduzca el número de filas de la matriz B:");
        colsB = scanner.nextInt();
        scanner.nextLine();

        arrayB = new int[rowsB][colsB];

        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.printf("Introduzca el valor de la fila %d y la columna %d de la matriz B:", i+1, j+1);
                arrayB[i][j] = scanner.nextInt();
               


}
        }
    }
}