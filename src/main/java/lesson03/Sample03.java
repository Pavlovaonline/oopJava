package lesson03;

import java.util.Iterator;

public class Sample03 {

    public static void main(String[] args) {
        Notebook nb = new Notebook(3, 3.87);

        int[] source = {1, 2, 3, 4, 5, 6, 7};
        Iterator<Integer> intArrayIterator = new IntArrayIterator(source);
        while (intArrayIterator.hasNext()) {
            System.out.println(intArrayIterator.next());
        }
    }

    private static class Notebook {

        private final int ram;
        private final double price;

        public Notebook(int ram, double price) {
            this.ram = ram;
            this.price = price;
        }

        public int getRam() {
            return ram;
        }

        public double getPrice() {
            return price;
        }
    }

    private static class IntArrayIterator implements Iterator<Integer> {

        private final int[] source;

        public IntArrayIterator(int[] source) {
            this.source = source;
        }

        @Override
        public boolean hasNext() {

            return false;
        }

        @Override
        public Integer next() {

            return null;
        }
    }
}
}
