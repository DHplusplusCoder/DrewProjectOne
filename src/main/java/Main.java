/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drew
*/
import com.mycompany.drew_harley_project.LoginManager;
import io.javalin.Javalin;
import com.mycompany.drew_harley_project.LoginManager;
import static io.javalin.apibuilder.ApiBuilder.path;
public class Main {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        Javalin app = Javalin.create();
        app.start(5000);
        
        LoginManager loginManager = new LoginManager();
     
        path("login", ()->{
            post(loginManager::ProcessLogin);
        }
        path("register", ()->{
            post(loginManager::ProcessRegistration);
        }
        //path("login", ()->{
        //    post(loginManager::ProcessLogin);
       // }
       // path("register", ()->{
       //     post(loginManager::ProcessRegistration);
       // }
       
        System.out.println("======Employee and Finance Management System======");
        System.out.println("++++++Created by Drew Harley++++++");
        System.out.println(" ");
        System.out.println("======Main Menu======");
        System.out.println("++++++Type the number of the option you choose++++++");
        System.out.println(" ");
        System.out.println("1 = View Employee Records");
        System.out.println("2 = View Financial Records");
    }
    
}
