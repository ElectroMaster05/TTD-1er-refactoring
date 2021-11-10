
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maast
 */
public class idMaestroAlumno {
 
    
    public static String checkID(int integrante,String valor){
    String resultado="";
    String expR="(^(al)\\d{6})";
    String expM="^(\\d{4})";
   
   //return mat.matches();
   if(integrante==2){ 
     Pattern pat=Pattern.compile(expR);
   Matcher mat=pat.matcher(valor);   
   if(mat.matches()==true && integrante==2){
   resultado="Alumno_OK";
       
   } 
   else{
   resultado="ERROR02";
   } 
   }
   
   
   if(integrante==1){
   Pattern pat=Pattern.compile(expM);
   Matcher mat=pat.matcher(valor);  
   
    if(mat.matches()==true && integrante==1){
   resultado="Maestro_OK";
       
   } 
   else{
   resultado="ERROR01";
   } 
   
   
   
   
   }
   
    
        
     
    return resultado;
    }
    
    
    
}
