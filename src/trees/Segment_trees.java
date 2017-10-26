package trees;




public class Segment_trees {

	int len;int  seg_len;
	public int[]  construct_Segment_trees(int in[])
	{
		//int seg_len = 0;
		len=in.length;

		  seg_len=power2.calculate_next_power(len);
		
		int []seg=new int[seg_len];
		for(int i=0; i < seg.length; i++){
            seg[i] = Integer.MAX_VALUE;
        }
		construct_seg_tree(seg,in, 0, len-1, 0);
		return seg;
	}
	
	public void construct_seg_tree(int[] seg1,int input[],int start,int end,int pos)
	{
	
		
		try{
			if(start==end)
			{	
			seg1[pos]=input[start];
			return;
			}
			else
			{
				int mid=(start+end)/2;
			
				construct_seg_tree(seg1,input, start, mid, 2*pos+1);
				construct_seg_tree(seg1,input, mid+1, end, 2*pos+2);
				seg1[pos]=Math.min(seg1[2*pos+1],seg1[2*pos+2]);
			}
		
		
		}
		catch(Exception exception)
		{
			//exception.printStackTrace();
		}
		}
	
	public int  min(int[] seg2,int qhigh1,int qlow1)
	{
		return range_minimum(seg2, len, 0, qhigh1, qlow1 , 0 );
		
	}
	public int range_minimum(int [] seg3,int high,int low, int qhigh, int qlow ,int pos )
	{
		if(qhigh<=high&&qlow>=low)
		{
			return seg3[pos];
		}
		else if(qlow>high||qhigh<low)
		{
			return 1000000;
		}
		else
		{
			int mid=(low+high)/2;
			return Math.min(range_minimum(seg3,mid, 0, qhigh, qlow, 2*pos+1),range_minimum(seg3,high, mid+1, qhigh, qlow, 2*pos+1));
			
		}
		
		
	}
	public void print_seg_tree(int[] seg4)
	{
		for(int s:seg4)
		{
			System.out.print(s+" ");
		}
		
	}
	
}
