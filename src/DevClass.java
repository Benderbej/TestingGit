public class DevClass {

    public static void main(String[] args) {
        System.out.println("Your branch is up-to-date with 'origin/master'");
    }

    public void newDevMethod(){
        System.out.println("method work!");
    }

    public String someDevMethod(String s){
        System.out.println("method work!");
        return "newdev" + s;
    }

}
