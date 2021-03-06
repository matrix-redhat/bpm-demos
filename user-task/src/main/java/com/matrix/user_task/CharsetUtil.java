package com.matrix.user_task;

import java.nio.charset.Charset;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CharsetUtil implements java.io.Serializable {

    static final long serialVersionUID = 1L;

	private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");
	
	
    public CharsetUtil() {
    }



	public static String decodeUTF8(byte[] bytes) {
	    return new String(bytes, UTF8_CHARSET);
	}

	public static byte[] encodeUTF8(String string) {
	    return string.getBytes(UTF8_CHARSET);
	}
	
}