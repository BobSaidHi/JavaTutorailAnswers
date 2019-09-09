class Main {
  public static void main(String[] args) {
    int x = (int)(Math.random() * 100);
    int y = (int)(Math.random() * 100);

    if(x > y) {
      System.out.println(Math.pow(x, y));
    }
    else if(x < y) {
      //System.out.println((double)y / x );
      System.out.println(y / x );
    }
    else if(x == y) {
      System.out.println("What are the odds?");
    }
    else {
      System.out.println("Help!");
    }
    System.out.println(x + " " + y);
  }
}
