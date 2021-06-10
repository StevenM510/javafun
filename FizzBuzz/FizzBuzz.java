public class FizzBuzz {
    public String FizzBuzz(int number) {
        // fizzbuzz logic here
        String call = null;

        if(number %3 ==0 && number % 5 ==0){
            call ="FizzBuzz";
        }
        else if(number % 5 == 0){
            call = "Buzz";
        }
        else if(number % 3 == 0){
            call = "Fizz";
        }
        else{
            call = String.valueOf(number);
        }
        return call;
    }
}