public class LargestThreeDigit {
    public static String largestGoodInteger(String num) {
        String out = "";
        int max = 0;
        for(int i=0; i<num.length()-2; i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                int a = Integer.parseInt(num.charAt(i)+"");
                max = Math.max(max,a);
                out = ""+max+max+max;
            }
        }
        return out;
    }
}
