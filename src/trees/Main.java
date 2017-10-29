package trees;

public class Main {
	public static void main(String args[])
	{
		
		int [] input={32,69,81,3,11,2,7,83,97,52,57};
		/*Segment_trees segment_trees=new Segment_trees();
		int[] segment;
		segment=segment_trees.construct_Segment_trees(put);
		segment_trees.print_seg_tree(segment);
		/*int g=segment_trees.min(3, 9);
		System.out.print(g);*/
		int[] fen_arr;
		Fenwick_tree fenwick_tree=new Fenwick_tree();
		fen_arr=fenwick_tree.create_tree(input);
		fenwick_tree.print();
		int get=fenwick_tree.getSum(4);
		System.out.println(get+"");
	}
}
