package bertkoor;
 
public class EPI {
   public static void main(String[] args) {
      int e = (int)Math.E;
      int pi = (int)Math.PI;
      int ee = e+e;					// 4
      int epi = e+pi;				// 5
      int pie = pi*e;               // 6
      int pipi = pi*pi;				// 9
      int pipie = pipi+e;			// 11
      int piepie = pie*pie;			// 36
      int piepiepi = piepie*pi;		// 108
      int piepiepip = piepiepi+pi;	// 111
      hey(piepie*e);				// 72
      hey(pipie*pipi+e);			// 101
      hey(piepiepi);				// 108
      hey(piepiepi);				// 108
      hey(piepiepip);				// 111
      hey(pipie*ee);				// 44
      hey(ee*ee*e);					// 32
      hey((piepie+pi)*pi+e);		// 119
      hey(piepiepip);				// 111
      hey(piepiepip+pi);			// 114
      hey(piepiepi);				// 108
      hey(epi*epi*ee);				// 100
      hey(pipie*pi);				// 33
   }
   private static void hey(int $) {
      System.out.print((char)$);
   }
}
