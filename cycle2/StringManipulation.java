public class StringManipulation {
    public static void main(String[] args) {
    	System.out.print("Name : Thomas V.G\nRollno : 58\nDate : 26/03/2024\nProgram : String manipulation\n");
        // StringBuilder for string concatenation
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        System.out.println("Concatenated string : " + sb.toString()); 


        //String comparison
        String str1 = "Hello";
        String str2 = "hello";
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("String are not equal!");
        }


        //Remove white spaces
        String strWhiteSpace = "     Good  ";
        System.out.println("Trimmed String : " + strWhiteSpace.trim());


        //Split string
        String splitString = "hello,world";
        String parts[] = splitString.split(",");
        System.out.println("Split Strings:"); 
        for (String st : parts){
            System.out.println(st);
        }

        //Convert string to uppercase and lowercase
        String stringConvert = "Hello";
        System.out.println("Uppercase : " + stringConvert.toUpperCase());
        System.out.println("Lowercase : " + stringConvert.toLowerCase());

        //Check substring
        String substring = "Hello World";
        if (substring.contains("World")){
            System.out.println("Substring exist in the string");
        }else {
            System.out.println("Substring not exist in the string");
        }
    }
}
