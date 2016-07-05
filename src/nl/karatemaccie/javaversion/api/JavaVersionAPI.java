package nl.karatemaccie.javaversion.api;


public class JavaVersionAPI {
	
	
	public static boolean isJavaSeven(){
		return System.getProperty("java.version").startsWith("1.7.");
	}
	public static boolean isJavaEight(){
		return System.getProperty("java.version").startsWith("1.8.");
	}
	public static boolean isJavaNine(){
		return System.getProperty("java.version").startsWith("1.9.");
	}

	public static String getVersion(){
		return System.getProperty("java.version");
	}
	
	public static String getVersionString(){
		String result = "Java version is: " + getVersion();
		result += "\n";
		result += "Is Java 7: " + (isJavaSeven() ? "YES" : "NO");
		result += "\n";
		result += "Is Java 8: " + (isJavaEight() ? "YES" : "NO");
		result += "\n";
		result += "Is Java 9: " + (isJavaNine() ? "YES" : "NO");
		return result;
	}

}
