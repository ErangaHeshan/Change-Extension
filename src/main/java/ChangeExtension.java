import java.io.File;

/**
 * Created by eranga on 7/7/17.
 */

public class ChangeExtension {

    public static void main(String[] args) {
        changeExtension(new File(System.getProperty("user.dir")), "js", "txt");
    }

    private static void changeExtension(File dir, String from, String to){
        if (dir.isDirectory()) {
            for (final File f : dir.listFiles()) {
                if(f.isDirectory()){
                    changeExtension(f, from, to);
                }else{
                    String name = f.getName();
                    String path = f.getPath();
                    if(name.substring(name.length()-from.length()).equals(from)){
                        try {
                            File newFile = new File(path.substring(0,path.length()-name.length()) + "/"
                                    + name.substring(0,name.length()-from.length()) + to);
                            if (f.renameTo(newFile)) {
                                System.out.println("\"" + name + "\" renamed to \"" + newFile.getName() + "\"");
                            } else {
                                System.out.println("Couldn't rename \"" + name + "\"");
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}