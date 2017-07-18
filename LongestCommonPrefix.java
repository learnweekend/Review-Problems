/*
 problem : Given a string array, return the longest common prefix in all strings
  return "" empty string if not found
*/
 public class LongestCommonPrefix {
  public static void main(String[] args){
    //String[] arr = {"geeksforgeeks", "geezer", "geek", "geeks"}; // gee
    String[] arr = {"apple", "ape", "april"}; // ap
    System.out.println(getLongestCommonPrefix(arr));
  }

  private static String getLongestCommonPrefix(String[] arr){
    if(arr == null || arr.length == 0) return "";
    int count = 0;
    String minString = arr[0];
    int minStrLength = arr[0].length();

    for(String s : arr){
      if(s.length() < minStrLength) {
        minStrLength = s.length();
        minString = s;
      }
    }

    while(count < minStrLength) {
      char ch = minString.charAt(count);
      for(String s : arr){
        if(s.charAt(count) != ch){
          return minString.substring(0, count);
        }
      }
      count++;
    }
    return minString.substring(0, count);
  }

 }
