package yxd.string2long;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 将字符换转成long类型数字, 测试过10亿个字符串未发生碰撞.
 * 如要使用请自行测试碰撞几率再考虑是否使用.
 * @author 385639827@qq.com
 *
 */
public class String2Long {
	private static String ID = "0123456789D";
	private static int IS = ID.length();
	
	public static long gen(String str) {
		str = new String(DigestUtils.md5Hex(str.getBytes()));
		long sum = 0L;
		for (int i = 0; i < str.length(); i++) {
			sum = sum * IS + ID.indexOf(str.charAt(i));
		}
		return sum;
	}
}
