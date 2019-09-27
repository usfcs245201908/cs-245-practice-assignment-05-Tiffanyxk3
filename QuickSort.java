public class QuickSort implements SortingAlgorithm
{
	int[] arr;

	public void sort(int[] a) {
		arr = a;
		sort(0, arr.length-1);
	}

	public void sort(int left, int right) {
		if (left >= right) {
			return;
		}
		int pivot = arr[(left+right)/2];
		int index = partition(left, right, pivot);
		sort(left, index-1);
		sort(index, right);
	}

	public int partition(int left, int right, int pivot) {
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				swap(left, right);
				left++;
				right--;
			}
		}
		return left;
	}


	public void swap(int first, int second) {
		int temp = arr[second];
		arr[second] = arr[first];
		arr[first] = temp;
	}
}