package leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] s = {"cir","car"};
//        String[] s = {"flower","flow","flight"};

        System.out.println(solution(s));


    }

        public static String solution(String[] strs) {

            String prefix = strs[0];

            //No need to iterate when prefix got empty (no common start characters or string itself is empty)
            for(int i=1; i<strs.length && !prefix.isEmpty(); i++){

                while(!strs[i].startsWith(prefix)){
                    prefix = prefix.substring(0, prefix.length()-1);
                }

            }

            return prefix;
        }


}
