package lesson6;

/// создать файл
import java.io.File;
import java.util.Arrays;

public class Stream {
    public static final String
            PATH = "C://Users/Stud2/IdeaProjects";

    public static void main(String[] args) {

        File file = new File( PATH );
        if (file.exists()) {
            System.out.println( "DA" );
        } else {
            System.out.println( "NO" );
        }
        File[] files = file.listFiles();
        System.out.println( Arrays.toString( files ) );
        for (int i = 0; i < files.length; i++) {
            System.out.println( files[i].getName() );
        }
        File file1 = new File( PATH +"/newFile" );
        if (!file1.exists()){
            file1.mkdir();
            
        }
    }
}
