public class StringOne {

	public String helloName(String name) {
	  return "Hello " + name + "!";
	}

	public String makeAbba(String a, String b) {
	  return a +  b + b + a;
	}

	public String makeTags(String tag, String word) {
	  return "<" + tag + ">" + word + "</" + tag + ">";
	}

	public String makeOutWord(String out, String word) {
	  return out.substring(0,2) + word + out.substring(2,4);
	}







}