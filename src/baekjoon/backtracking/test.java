package baekjoon.backtracking;

public class test {
    char x[]={'R','T','C','F','J','M','A','N'};
    int count[]={0,0,0,0,0,0,0,0};
    String str="";
    public String solution(String[] survey, int[] choices) {

        for(int i=0; i<choices.length;i++){
            if
        }

//        for(int i=0; i<choices.length;i++){
//            if((choices[i]-4)>0){
//                str+=survey[i].charAt(1);
//            }else if((choices[i]-4)<0){
//                str+=survey[i].charAt(0);
//            }else{
//                continue;
//            }
//        }
        return str;
    }

    public boolean check(int i){
        boolean b = false;
        if((i-4)>0){
            b = true;
        }else if((i-4)<0){
            b = false;
        }
    }
}
