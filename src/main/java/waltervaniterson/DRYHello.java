package waltervaniterson;

public class DRYHello {
   public static void main(String[] args) {
       StringBuilder builder = new StringBuilder();
       for (int pos = 0; pos < 13; pos++) {
           builder.append(getChar(pos));
       }
       System.out.println(builder);
   }

   private static char getChar(int pos) {
       switch (pos) {
           case 11: return 'd';
           case 1: return 'e';
           case 0: return 'H';
           case 2:
           case 3:
           case 10: return 'l';
           case 4:
           case 8: return 'o';
           case 9: return 'r';
           case 7: return 'w';
           case 6: return ' ';
           case 5: return ',';
           case 12: return '!';
           default: return '-';
       }
   }
}