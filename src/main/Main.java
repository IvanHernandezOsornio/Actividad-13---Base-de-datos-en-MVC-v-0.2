
package main;
import models.ModelAgenda;
import views.ViewAgenda;
import controllers.ControllerAgenda;
/**
 * 
 * @author Familia Hernández
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelAgenda modelAgenda = new ModelAgenda();
        ViewAgenda viewAgenda = new ViewAgenda();
        ControllerAgenda controllerAgenda = new ControllerAgenda(modelAgenda, viewAgenda);
    }
    
}
