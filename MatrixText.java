/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity1;

/**
 *
 * @author student
 */
public class MatrixText {
    public static void main (String [] args){
        Matrix A= new Matrix();
        Matrix B= new Matrix();

        Matrix sum = new Matrix();

        A.setCell (0, 0, 5);
        A.setCell (0, 1, 10);
        A.setCell (0, 2, 6);
        A.setCell (0, 3, 7);

        A.setCell (1, 0, 5);
        A.setCell (1, 1, 10);
        A.setCell (1, 2, 6);
        A.setCell (1, 3, 7);

        A.setCell (2, 0, 5);
        A.setCell (2, 1, 10);
        A.setCell (2, 2, 6);
        A.setCell (2, 3, 7);

        A.setCell (3, 0, 5);
        A.setCell (3, 1, 10);
        A.setCell(3, 2, 6);
        A.setCell(3, 3, 7); 
        A.displayMatrix ();
        System.out.println();

        B.setCell(0, 0, 5);
        B.setCell(0, 1, 10);
        B.setCell(0, 2, 6);
        B.setCell(0, 3, 7);

        B.setCell(1, 0, 20);
        B.setCell(1, 1, 15);
        B.setCell(1, 2, 16);
        B.setCell(1, 3, 17);

        B.setCell(2, 0, 11);
        B.setCell(2, 1, 50);
        B.setCell(2, 2, 74);
        B.setCell(2, 3, 30);

        B.setCell (3, 0, 33);
        B.setCell (3, 1, 32);
        B.setCell (3, 2, 12);
        B.setCell (3, 3, 1);
        B.displayMatrix ();
        System.out.println();

        sum.addMatrices (A, B);
        sum.displayMatrix();
    }
}
