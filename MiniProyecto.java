import java.util.Scanner;

public class MiniProyecto {
    int conProduc=0;
    String maestro[][]  = new String[100][5];
    int alet;
    public void insertar() {
        Scanner entrada = new Scanner (System.in); 
        System.out.printf("Digite el codigo del producto:\n");
        maestro[conProduc][0] = entrada.nextLine();
        System.out.printf("Digite el nombre del producto:\n");
        maestro[conProduc][1] = entrada.nextLine();
        System.out.printf("Digite el costo del producto:\n");
        maestro[conProduc][2] = entrada.nextLine();
        System.out.printf("Digite el precio del producto:\n");
        maestro[conProduc][3] = entrada.nextLine();
        System.out.printf("Digite la cantidad de existencias del producto:\n");
        maestro[conProduc][4] = entrada.nextLine();
        conProduc=conProduc+1;
    }

    public void actualizar() {
        String n,canNueva;
        int  fila=0;
        int pos=0;
        int cont;
    Scanner entrada = new Scanner (System.in);
        System.out.printf("Digite el codigo del producto\n");
        n = entrada.nextLine();
        cont=1;
    for (int i = 0; i < conProduc; i++) {
        if(maestro[i][0] == n){
            pos=cont;
            fila=i;
        }       
    }
    if (pos == -1){
        System.out.printf("No se encontro el producto\n");
    }else{
        System.out.printf("La cantidad actual de "+maestro[fila][1]+" es de: "+maestro[fila][4]+"\n");
        System.out.printf("--------------Ingrese la nueva cantidad de producto------------\n");
        canNueva=entrada.nextLine();
        maestro[fila][4]=String.valueOf(Integer.parseInt(canNueva) + Integer.parseInt( maestro[fila][4]));
        System.out.printf("La cantidad nueva de "+maestro[fila][1]+" es de: "+maestro[fila][4]+"\n");
    }  
}
	
	public void actualizarPrecio() {
        String n, preNuevo;
        int  fila=0;
        int pos=0;
        int cont;
    Scanner entrada = new Scanner (System.in);
        System.out.printf("Digite el codigo del producto\n");
        n = entrada.nextLine();
        cont=1;
    for (int i = 0; i < 100; i++) {
        if(maestro[i][0] == n){
            pos=cont;
            fila=i;
        }       
    }
    if (pos == -1){
        System.out.printf("No se encontro el producto\n");
    }else{
        System.out.printf("El precio actual de "+maestro[fila][1]+" es de: $"+maestro[fila][3]+"\n");
        System.out.printf("--------------Ingrese el nuevo precio del producto------------\n");
        preNuevo=entrada.nextLine();
        maestro[fila][3]=preNuevo;
        System.out.printf("El precio nuevo de "+maestro[fila][1]+" es de: $"+maestro[fila][3]+"\n");
    }  
}

    public void facturar(){
        String nombre, fecha2, o ="si", producto,  fecha, fecha3, p, alet;
        int pro=0;
        int  fila=0;
        int pos=0, seguir = 1;
        int cont, precio = 0, aleatorio = 0, nro=0, namae =0;
        String c[] = new String[100];
        String facturas [][] = new String[100][6];
        Scanner entrada = new Scanner (System.in);
        System.out.printf("Ingrese nombre del cliente"+"\n");
        nombre = entrada.nextLine();
        System.out.printf("Ingrese AÑO en que se efectúa la factura"+"\n");
        fecha = entrada.nextLine();
        System.out.printf("Ingrese MES en que se efectúa la factura"+"\n");
        fecha2 = entrada.nextLine();
        System.out.printf("Ingrese DIA en que se efectúa la factura"+"\n");
        fecha3 = entrada.nextLine();
        
            
            while(seguir==1) {
                System.out.printf("Ingrese código del producto"+"\n");
                    producto = entrada.next();
                    
                for (int i = 0; i < conProduc; i++) {
                    if(maestro[i][0].equals(producto)){
                        System.out.println("holaaa");
                    }
                    else {
                        System.out.println("No se encontro dicho producto");
                    }
                    System.out.println("Desea agregar otro producto?" +"\n"+ " 1.Si  2.No");
                    seguir=entrada.nextInt();
                }    
                       
            }
        
        for (int i = 0; i < pro; i++) {
            precio += Integer.parseInt( c[i]);
            
        }
        aleatorio = (int)(Math.random()*1000000);
        System.out.printf("Número de factura: "+aleatorio+"\n"+"Fecha: "+ fecha3+ " de "+fecha2+" del "+fecha+"\n");
        

        System.out.printf("Para la compra a nombre de: "+nombre+"\n"+"Por los siguientes productos: " );
        for (int i = 0; i < pro; i++) {
            p = c[i];
            System.out.printf(p+"\n");
        }

        System.out.printf("\n"+"El monto a pagar es de: $"+precio+"\n");
        }

      
    public void mostrarExistencias() {
    	int n=0;
    	Scanner entrada = new Scanner (System.in);
        System.out.printf("Digite la cantidad de productos tengan un stock menor a X unidades\n");
        n = entrada.nextInt();  	
    	for (int i = 0; i < conProduc; i++) {
    		if(Integer.parseInt( maestro[i][4])<n) {
    	System.out.printf("El codigo del producto es "+ maestro[i][0]+"\n");
    	System.out.printf("El nombre del producto es "+ maestro[i][1]+"\n");
    	System.out.printf("La cantidad de producto es "+ Integer.parseInt( maestro[i][4])+"\n");
    		}else {
    			System.out.printf("Existen productos que tienen una cantidad superior a "+n+"\n");
    			
    		}
    	}
    }

    public void ConsultarFacturas (){

    }
    
    public void mostrarGenerales() {
    	int n=0;
    	Scanner entrada = new Scanner (System.in);
        System.out.printf("Digite el codigo del producto\n");
        n = entrada.nextInt();  	
    	for (int i = 0; i < conProduc; i++) {
    		if(Integer.parseInt( maestro[i][0])==n) {
    	System.out.printf("El codigo del producto es "+ maestro[i][0]+"\n");
    	System.out.printf("El nombre del producto es "+ maestro[i][1]+"\n");
    	System.out.printf("El costo del producto es $"+ maestro[i][2]+"\n");
    	System.out.printf("El precio del producto es $"+ maestro[i][3]+"\n");
    	System.out.printf("La cantidad de producto es "+  maestro[i][4]+"\n");
    	System.out.printf("La utilidad del producto es "+  String.valueOf(Double.parseDouble(maestro[i][3]) - Double.parseDouble( maestro[i][2])+"\n"));
    		}else {
    			System.out.printf("No Existen productos registrados con ese codigo "+n+"\n");
    		}
    	}
    }
    
    public static void main(String [] ar){
    	MiniProyecto tn = new MiniProyecto();
    	Scanner entrada = new Scanner (System.in);
    	int opcion = 0;
    			do {
    				System.out.printf("----------El Ahorro----------\n"
    						 + "1. 	Agregar un nuevo producto\n"
    						 + "2. 	Actualizar Existencia de Productos\n"
    						 + "3. 	Actualizar el Precio de un Producto\n"
    						 + "4. 	Facturar Productos\n"
    						 + "5.  Consultar un producto por su código\n"
    	                     + "6.  Consultar las facturas generadas en un año X y mes X\n"
    	                     + "7.  Consultar los productos que tengan un stock menor a X unidades\n"
    						 + "8.  Salir\n\n");
    	                        opcion=entrada.nextInt();
    						
    				switch (opcion) {
    				case 1:
    					tn.insertar();

    					break;
    				case 2:
    					tn.actualizar();
    					break;
    				case 3:
    					tn.actualizarPrecio();
    					break;
    				case 4:
    					tn.facturar();
    					break;
    				case 5:
    					tn.mostrarGenerales();
    					break;
    				case 6:

    					break;
    				case 7:
    					tn.mostrarExistencias();
    					break;                                
    				case 8:
    	                 System.exit(0);
    					break;                                
    				default:
    					break;
    				}
    			} while (opcion !=8);

    	}  
       
 
}