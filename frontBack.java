public String frontBack(String str) {
  if(str.length() <= 1){
    return str;
  }
  
  String midString = str.substring(1, str.length()-1);
  
  return  str.charAt(str.length()-1)+midString+str.charAt(0);
}
