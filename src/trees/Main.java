package trees;

public class Main {
	public static void main(String args[])
	{
		
		int [] put={32,69,81,3,11,2,7,83,97,52,57};
		Segment_trees segment_trees=new Segment_trees();
		int[] segment;
		segment=segment_trees.construct_Segment_trees(put);
		segment_trees.print_seg_tree(segment);
		/*int g=segment_trees.min(3, 9);
		System.out.print(g);*/
	}
}
