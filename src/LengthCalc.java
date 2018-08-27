import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lengthCalc")
public class LengthCalc extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();


        String metry = request.getParameter("metry");
        String centymetry = request.getParameter("centymetry");
        String milimetry = request.getParameter("milimetry");
        //try {
        if (!metry.equals("")) {
            double metryL = Double.valueOf(metry);
            double metryCm = metryL * 100;
            double metryMm = metryL * 1000;
            writer.println("Wprowadziłeś " + metryL + " metrów, co daje:\n");
            writer.println(metryCm + " centymetrów\n");
            writer.println(metryMm + " milimetrów");
        }
        if (!centymetry.equals("")) {
            double centymetryL = Double.valueOf(centymetry);
            double centymetryM = centymetryL / 100;
            double centymetryMm = centymetryL / 10;
            writer.println("Wprowadziłeś " + centymetryL + " centymetrów, co daje:\n");
            writer.println(centymetryM + " centymetrów\n");
            writer.println(centymetryMm + " milimetrów");
        }
        if (!milimetry.equals("")) {
            double milimetryL = Double.valueOf(milimetry);
        }
        //} catch (NumberFormatException ex) {
        //    writer.print("exception działa");
        //}


//        if (metry!=0){
//            double cm = metry / 100;
//            double mm = metry / 1000;
//            writer.print(cm + " " + mm);
//        } else if (centymetry!=0){
//            double m = centymetry * 100;
//            double mm = centymetry * 10;
//        }else if (milimetry!=0) {
//            double m = milimetry * 1000;
//            double cm = milimetry * 10;
//        } else {
//            System.out.println("Wypełnij tylko jedno pole!");
//        }
    }

    //protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    // }
}

