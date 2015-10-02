import java.util.Comparator;

public class GenericMergerSort {

    public static <E extends Comparable<E>> void mergeSort(E[] list){
        if ( list.length > 1){
            E[] firstHalf = new E[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            int secondHalfLenght = list.length - (list.length/2);
            E[] secondHalf = new E[secondHalfLenght];
            System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLenght);

            merge(firstHalf, secondHalf, list);
        }
    }

        public static <E> void mergeSort(E[] list, Comparator<? super E> comparator){

    }
}
