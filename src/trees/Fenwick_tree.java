package trees;

public class Fenwick_tree {
	
	int[] new_arr;
	public Fenwick_tree()
	{
		
		
		//new_arr[1]=arr[0];
		
	}
	public int[] create_tree(int put[])
	{
		
		new_arr=new int[put.length+1];
		
	for(int i=0;i<new_arr.length;i++)
	{
		new_arr[i]=0;
	}
		
		for(int i=1;i<new_arr.length;i++)
		{
		update_tree(put[i-1], i);
		}
		return new_arr;
	
	}
	public void update_tree(int value,int index)
	{
		while(index<new_arr.length)
		{
			new_arr[index]=new_arr[index]+value;
			index=getNext(index);
		}
	}
	public int getNext(int ind)
	{
		return ind+(ind & -ind);
		
	}
	public void print()
	{
		for(int ele:new_arr)
		{
			System.out.print(ele+" ");
		}
	}
    public int getSum( int index){
        index = index + 1;
        int sum = 0;
        while(index > 0){
            sum += new_arr[index];
            index = getParent(index);
        }
        return sum;
    }
    public int getParent(int ind)
    {
    	return ind-(ind & -ind);
    }
    
}
