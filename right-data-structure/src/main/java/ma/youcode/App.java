package ma.youcode;



public class App
{
    public static void main( String[] args )
    {
/*
        TODO:
            Example:
            -----------------------------------------------------------------------------
                        Consume Less memory               Consume More Memory
            -----------------------------------------------------------------------------
                            ArrayList              vs       LinkedList
                            HashSet                vs       TreeSet
                            HashMap                vs       TreeMap
                            StringBuilder          vs       String Concatenation
                            Array                  vs       ArrayList
                            Primitive Arrays:
                            int[]   instead of Integer[]

*/


        System.out.println(palidromChecker("bob"));
        System.out.println(palidromChecker("alex"));
        System.out.println(palidromChecker("boob"));

    }


    private static boolean palidromChecker(String string){
        int length = string.length();
        for (int i = 0; i < length; i++) {
             if(string.charAt(i)!=string.charAt(length-i-1)) return false;
        }
        return true;
    }
}
