import java.util.Arrays;
/**
 * Write a description of class caracol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class caracol
{
    public int[][] realizarRecorrido(int a,int b){
        int[][] rec =new int [a][b];
        int aux =1;
        int filaInicio=0;
        int filaFinal=a-1;
        int columnaInicio=0;
        int columnaFinal=b-1;
        //recorrido caracol
        while(filaInicio<=filaFinal&&columnaInicio<=columnaFinal){
            for(int col =columnaInicio;col<=columnaFinal;col++){
                rec[filaInicio][col]=aux++;
                
            
            }
            for(int fila=filaInicio+1;fila<=filaFinal;fila++){
                rec[fila][columnaFinal]=aux++;
                
            
            }
            for(int col=columnaFinal-1;col>=columnaInicio;col--){
                rec[filaFinal][col]=aux++;
            
            }
            for(int fila=filaFinal-1;fila>=filaInicio+1;fila--){
                rec[fila][columnaInicio]=aux++;
            }
            filaInicio++;
            filaFinal--;
            columnaInicio++;
            columnaFinal--;
            
        
        }
        //visualiozacion de la matriz
        for(int fila=0;fila<rec.length;fila++){
            System.out.println(Arrays.toString(rec[fila]));
        }
        return rec;
    
    }
}
