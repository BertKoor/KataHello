package stevendijkxhoorn;
import java.security.SecureClassLoader;
public class $$ {
	static {
		class $$$$ extends SecureClassLoader {
			public void $$$() {
				byte[] __ = new byte[] {-54,-2,-70,-66,0,0,0,52,0,31,10,0,6,0,17,9,0,18,0,19,8,0,20,10,0,21,0,22,7,0,
						23,7,0,24,1,0,6,60,105,110,105,116,62,1,0,3,40,41,86,1,0,4,67,111,100,101,1,0,15,76,105,110,
						101,78,117,109,98,101,114,84,97,98,108,101,1,0,18,76,111,99,97,108,86,97,114,105,97,98,108,101,
						84,97,98,108,101,1,0,4,116,104,105,115,1,0,12,76,72,101,108,108,111,87,111,114,108,100,59,1,0,
						3,115,97,121,1,0,10,83,111,117,114,99,101,70,105,108,101,1,0,15,72,101,108,108,111,87,111,114,
						108,100,46,106,97,118,97,12,0,7,0,8,7,0,25,12,0,26,0,27,1,0,11,72,101,108,108,111,32,119,111,
						114,108,100,7,0,28,12,0,29,0,30,1,0,10,72,101,108,108,111,87,111,114,108,100,1,0,16,106,97,118,
						97,47,108,97,110,103,47,79,98,106,101,99,116,1,0,16,106,97,118,97,47,108,97,110,103,47,83,121,
						115,116,101,109,1,0,3,111,117,116,1,0,21,76,106,97,118,97,47,105,111,47,80,114,105,110,116,83,
						116,114,101,97,109,59,1,0,19,106,97,118,97,47,105,111,47,80,114,105,110,116,83,116,114,101,97,
						109,1,0,7,112,114,105,110,116,108,110,1,0,21,40,76,106,97,118,97,47,108,97,110,103,47,83,116,
						114,105,110,103,59,41,86,0,33,0,5,0,6,0,0,0,0,0,2,0,1,0,7,0,8,0,1,0,9,0,0,0,47,0,1,0,1,0,0,0,5,
						42,-73,0,1,-79,0,0,0,2,0,10,0,0,0,6,0,1,0,0,0,4,0,11,0,0,0,12,0,1,0,0,0,5,0,12,0,13,0,0,0,1,0,
						14,0,8,0,1,0,9,0,0,0,55,0,2,0,1,0,0,0,9,-78,0,2,18,3,-74,0,4,-79,0,0,0,2,0,10,0,0,0,10,0,2,0,0,
						0,6,0,8,0,7,0,11,0,0,0,12,0,1,0,0,0,9,0,12,0,13,0,0,0,1,0,15,0,0,0,2,0,16};
				defineClass("HelloWorld", __, 0, __.length);
			}
		}
		$$$$ _$ = new $$$$();
		_$.$$$();
		Class<?> ___ = null;
		try {
			___ = _$.loadClass("HelloWorld");
			Object _$__ = ___.getConstructor().newInstance(); 
			___.getMethod("say").invoke(_$__);
		} catch (Exception ____) {}
	}
	public static void main(String[] args) {}
}