public class JavaLinkedList
{
    private MyLinkedList<Integer> list;

    /**
     *  Default Constructor
     *  Create a new MyLinkedList of Integers
     */
    public JavaLinkedList()
    {
        list = new MyLinkedList<Integer>();
    }

    /**
     *  Create a new MyLinkedList of Integers from the array
     */
    public JavaLinkedList(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
            list.add(nums[i]);
    }

    /**
     *  Return the sum of all the items in the list
     */
    public double getSum(  )
    {
        double total=0;
        for(int i = 0; i < list.size(); i++)
            total += list.get(i);

        return total;
    }

    /**
     *  Return the mean of all the items in the list
     */
    public double getMean(  )
    {
        double total=0;
        int i = 0;
        for(i = 0; i < list.size(); i++){
         total += (double)list.get(i); 
        }
        double y = (double)i;
        double x = (total  /  y);
        return(x);
    }
    
    /**
     *  Return the largest item in the list
     */
    public int getLargest()
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
         if(largest < list.get(i))
                largest = list.get(i); 
        }
        return largest;
    }

    /**
     *  Return the smallest item in the list
     */
    public int getSmallest()
    {
        int smallest= Integer.MAX_VALUE;
        for(int i = 0; i < list.size(); i++){
         if(smallest > list.get(i))
            smallest = list.get(i); 
        }
        return smallest;
    }

    /**
     *  Return a string with this format:
     *  
     *  SUM:: 10.0
     *  MEAN:: 4.65
     *  SMALLEST:: -1.23
     *  LARGEST:: 5.0
     */
    public String toString()
    {
        String output="SUM::" + getSum() +"\nMEAN::" + getMean() + "\nSMALLEST::" + getSmallest() + "\nLARGEST::" + getLargest();
        return output;
    }
}