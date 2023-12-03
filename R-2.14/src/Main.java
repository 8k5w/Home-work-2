public class Main {
    public static void main(String[] args) {

        int[] numbers= {1,2,3,4,5};
        int index = 10;
        try{
            int value = numbers[index];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Don't try buffer overflow attacks in Java!");
        }
    }
}