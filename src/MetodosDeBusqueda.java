
public class MetodosDeBusqueda {
	static long contIntercambio,contVueltas;
	static long tInicio,tFinal;
	static class BusquedaSecuencial{
		public static int busquedaSecuencial(int arreglo[], int elemento) {
			boolean encontrado = false;
			for (int i = 0; i < arreglo.length &&encontrado==false; i++) {
				if (elemento == arreglo[i]) {
					encontrado= true;
					return i;
					
				}
				
			}
			return -1;
		}
	}
	static class BusquedaBinaria{
		 int busquedaBinaria(int vector[], int posicionIzq, int posicionDer, int elementoA_Buscar) 
		    { 
		        if (posicionDer >= posicionIzq) { 
		            int mitad = posicionIzq + (posicionDer - posicionIzq) / 2; 
		  
		            // Si el elemento está presente en el
		            // medio en sí
		            if (vector[mitad] == elementoA_Buscar) 
		                return mitad; 
		  
		            // Si el elemento es más pequeño que el medio, entonces 
		            // solo puede estar presente en el subconjunto izquierdo
		            if (vector[mitad] > elementoA_Buscar) 
		                return busquedaBinaria(vector, posicionIzq, mitad - 1, elementoA_Buscar); 
		            
		            //De lo contrario, el elemento solo puede 
		            //estar presente en la submatriz derecha
		            return busquedaBinaria(vector, mitad + 1, posicionDer, elementoA_Buscar); 
		        } 
		        //Llegamos aquí cuando el elemento no está presente en la matriz
		        return -1; 
		    }  
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BusquedaBinaria ob = new BusquedaBinaria(); 
        //30,200,6,10,65,70,150,4,200,1
        int vector[] = {1,4,6,10,30,65,70,150,200}; 
        int n = vector.length; 
        int x = 1; 
        int resultado = ob.busquedaBinaria(vector, 0, n, x); 
        //ob.busquedaBinaria(vector, posicionIzq, posicionDer, elementoA_Buscar)
        if (resultado == -1) 
            System.out.println("El número " +x+ " no está en el vector."); 
        else
            System.out.println("Número encontrado en la posición "+resultado+" del vector."); 
    } */

	}

}
