package class004;

public class SelectBubbleInsert {

	// 数组中交换i和j位置的数
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	// 选择排序
	public static void selectionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int minIndex, i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
	}

	// 冒泡排序
	public static void bubbleSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int end = arr.length - 1; end > 0; end--) {
			for (int i = 0; i < end; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
		}
	}

	// 插入排序
	public static void insertionSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		// 0 ~ 0上的元素天然有序，所以i从1开始
		for (int i = 1; i < arr.length; i++) {
			// 0 ~ i-1 有序了！新来的数是[i]，向左看！
			for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
				swap(arr, j, j + 1);
			}
		}
	}

	public static void insertionSort_while(int[] arr) { // insertionSort_while
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			// 将比key大的元素向后移动
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			// 插入key到正确位置
			arr[j + 1] = key;
		}
	}

}