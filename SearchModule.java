package modules.iterative;


public class SearchModule {

    //Complete this search algorithm to find an element location is in array
    //while loops here
    public static int binarySearch(int[] data, int target){
        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (data[mid] == target) {
                return mid;
            } else if (data[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }


    public static boolean contains(int[] data, int target) {
        return binarySearch(data, target) != -1;
    }


    public static int indexOf(int[] data, int target) {
        return binarySearch(data, target);
    }

}