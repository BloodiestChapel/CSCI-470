public class columnPrint
  {
  // This program will print the alphabet columnwise
  // with 5 columns and 6 rows.
  public static void main(String[] args)
    {
    // a row
    for(char alpha1 = 'a'; alpha1 <= 'z'; alpha1 += 6)
      {
      int charCount = 0;
      System.out.printf("%-5s", alpha1);
      charCount++;
      }
    System.out.println();
    // b row
    for(char alpha2 = 'b'; alpha2 <= 'z'; alpha2 += 6)
      {
      int charCount = 0;
      System.out.printf("%-5s", alpha2);
      charCount++;
      }
    System.out.println();
    // c row
    for(char alpha3 = 'c'; alpha3 <= 'z'; alpha3 += 6)
      {
      int charCount = 0;
      System.out.printf("%-5s", alpha3);
      charCount++;
      }
    System.out.println();
    // d row
    for(char alpha4 = 'd'; alpha4 <= 'z'; alpha4 += 6)
      {
      int charCount = 0;
      System.out.printf("%-5s", alpha4);
      charCount++;
      }
    System.out.println();
    // e row
    for(char alpha5 = 'e'; alpha5 <= 'z'; alpha5 += 6)
      {
      int charCount = 0;
      System.out.printf("%-5s", alpha5);
      charCount++;
      }
    System.out.println();
    // f row
    for(char alpha6 = 'f'; alpha6 <= 'z'; alpha6 += 6)
      {
      int charCount = 0;
      System.out.printf("%-5s", alpha6);
      charCount++;
      }
    System.out.println();
    }
  }
