public class InsertionSort implements SortingAlgorithm
{
	int[] arr;

	public void sort(int[] a) {
		arr = a;
		for (int i=1; i<arr.length; i++) {
			int index = i;
			for (int j=i-1; j>=0; j--) {
				if (arr[j] > arr[index]) {
					swap(j, index);
					index = j;
				}
			}
		}
	}


	public void swap(int first, int second) {
		int temp = arr[second];
		arr[second] = arr[first];
		arr[first] = temp;
	}
}