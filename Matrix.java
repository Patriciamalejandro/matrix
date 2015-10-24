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
public class Matrix {
    

    final int SIZE =4;
    private int  [][] square= new int [SIZE][SIZE];

    public Matrix() {}
    public void addMatrices(Matrix a, Matrix b) {
        int x, y;
        for (x=0; x<SIZE; x++) {
            for (y=0; y<SIZE; y++) {
                square [x][y] = a.getCell(x,y)+ b.getCell(x,y);
            }

        }
    }
        
    public void setCell (int a, int b, int c){
        square [a] [b] = c;
    }        

    public int getCell (int x, int y){
        return square [x ][y];
    }
    
    public void displayMatrix () {
        int x, y;
        for (x=0; x<SIZE; x++) {
            for (y=0; y<SIZE; y++){
                System.out.print(this.getCell(x,y) + "\t" );
            }
            System.out.println();
        }
    }
}

