class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> romint= new HashMap<>();
        romint.put('I',1);
        romint.put('V',5);
        romint.put('X',10);
        romint.put('L',50);
        romint.put('C',100);
        romint.put('D',500);
        romint.put('M',1000);

        int n = s.length();
        int finall = romint.get(s.charAt(n-1));

        for(int i=n-2;i>=0;i--){
            if(romint.get(s.charAt(i)) >= romint.get(s.charAt(i+1))){
                finall+=romint.get(s.charAt(i));
            }
            else{
                finall-=romint.get(s.charAt(i));
            }
        }
        return finall;

    }
}