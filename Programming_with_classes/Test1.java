package Program;

public class Test1 {
        private int a;
        private int b;


        public void setA(int a) {
            this.a = a;
        }
        public void setB(int b) {
            this.b = b;

            myInfo();
            System.out.println("Наибольшее число: " + maxValue(a, b));
            System.out.println("Сумма чисел: " + sumValue(a, b));
        }

        private void myInfo() {
            System.out.println("Ввведенные числа: ");
            System.out.println(a);
            System.out.println(b);
        }

        public static int maxValue(int a, int b) {
            return Math.max(a, b);
        }

        public static int sumValue(int a, int b) {
            return a + b;
        }


    }

