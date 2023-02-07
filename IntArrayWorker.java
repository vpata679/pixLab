public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** Recieves an integer and returns occurences of it in the array
   * @param integer to find occureneces of
   */
  public int getCount(int num)
  {
	  int counter = 0;
	  for (int i = 0; i < matrix.length; i++)
	  {
		  for(int j = 0; j < matrix[0].length; j++)
		  {
			  if (matrix[i][j] == num)
				counter++;
		  }
	  }
	  return counter;
  }
  
  /** Recieves integer of column to find total in column
   * @param column number
   * @return col total
   */
  public int getColTotal(int num)
  {
	  int counter = 0;
	  for (int i = 0; i < matrix.length; i++)
	  {
		  counter += matrix[i][num];
	  }
	  return counter;
  }
  
  /** Loops through array to find largest value
   * @return largest number in array
   */
  public int getLargest()
  {
	  int counter = -1;
	  for (int i = 0; i < matrix.length; i++)
	  {
		  for(int j = 0; j < matrix[0].length; j++)
		  {
			  if (matrix[i][j] > counter)
				counter = matrix[i][j];
		  }
	  }
	  return counter;
  }
  
   /** Loops through array to find largest value
   * @return reversed array
   */
  public void reverseRows()
  {
	  System.out.println("\nArray before reverseRows");
	  print();
	  for (int i = 0; i < matrix.length; i++)
	  {
		  for(int j = 0; j < matrix[0].length/2; j++)
		  {
			  int temp = matrix[i][j];
			  matrix[i][j] = matrix[i][matrix[0].length-j-1];
			  matrix[i][matrix[0].length-j-1] = temp;
		  }
	  }
	  System.out.println("Array after reverseRows");
	  print();
  }
  
  /** Loops through specified column and returns total
   * @param column index
   * @return total of column
   */
 /* public int getCount(int num)
  {
	  int counter = 0;
	  for (int i = 0; i < matrix.length; i++)
	  {
		  counter += matrix[num][i];
	  }
	  return counter;
  }
  */
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
 
}
