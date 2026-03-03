import java.util.*;
public class OOPSBannerApp {
    public static void main(String[] args){
	    Scanner sc= new Scanner(System.in);
		 String lines[] = {
        (String.join(" ","   *   ", "    *   ", "  **  ", "    ***")),
        (String.join(" "," *   * ", "  *   * ", " *    * ", "  **")),
        (String.join(" ","*     *", " *     *", " *     *", " **")),
        (String.join(" ","*     *", " *     *", " *    * ", "  ***")),
        (String.join(" ","*     *", " *     *", " **   ", "      **")),
        (String.join(" "," *   * ", "  *   * ", " *       ", "      *")),
        (String.join(" ","   *   ", "    *   ", " *       ", "  **"))};
        for(int i=0;i<lines.length;i++){
            System.out.println(lines[i]);
        }
    }
}