import java.util.*;
import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class Grid {

    // grid private vars
    private char[][] grid;
    private int xdim, ydim;

    // create a Grid of characters with the given dimensions and number of boxes
    public Grid(int xdim, int ydim) {
        this.xdim = xdim;
        this.ydim = ydim;

      	// grid is just 2d array of chars, initially fill with spaces
      	grid = new char[xdim][ydim];
              for (int i=0; i<xdim; i++)
                  for (int j=0; j<ydim; j++)
                    if ((i != 0 && i != 1 && i != xdim - 1 && i != xdim - 2)
                        || (j != 0 && j != 1 && j != ydim - 1 && j != ydim - 2))
                      grid[i][j] = ' ';
                    else
                      grid[i][j] = 'X';
    }

    public void print() {
        for (int i=0; i<xdim; i++) {
          System.out.print("|");
            for (int j=0; j<ydim; j++) {
                System.out.print(grid[i][j]);
                System.out.print("|");
            }
          System.out.println();
        }
    }
}
