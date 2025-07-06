public String missingChar(String str, int n) {
  StringBuilder strBuilder = new StringBuilder(str);
  return strBuilder.deleteCharAt(n).toString();
}
