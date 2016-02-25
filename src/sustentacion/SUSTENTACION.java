package sustentacion;

import java.util.Scanner;

public class SUSTENTACION {

   public static void main(String[] args) {
        
       String nombre;
       Double precio,valorventa;
       Double contador=0.0;
       Integer opcion,cantidad,venta,auxiliar=1;
       Integer numero=0;
       
       Scanner entrada_teclado = new Scanner(System.in);
       Delay retardo = new Delay();
       Data[]usuario = new Data[5];
       
       
       do{
            System.out.println("*********** INVENTARIO PELUCHITOS.COM ***********");
            System.out.println("**************************************************");
            System.out.println("**** 1.Agregar Producto");
            System.out.println("**** 2.Buscar producto");
            System.out.println("**** 3.Eliminar producto");
            System.out.println("**** 4.Mostrar Inventario");
            System.out.println("**** 5.Realizar Venta");
            System.out.println("**** 6.Mostrar ganancias totales");
            System.out.println("**** 7.Salir");
            System.out.println("**************************************************");
            System.out.println("Por favor digite la opcion deseada: ");
            opcion=entrada_teclado.nextInt();
            entrada_teclado.nextLine();
            
             switch (opcion){
            
                case 1:
                    
                    usuario[numero]= new Data();
                    
                    
                    System.out.println("Ingrese El nombre del producto["+numero+"]");
                    nombre=entrada_teclado.nextLine();
                    //entrada_teclado.nextLine();
                    usuario[numero].setNombre(nombre);
       
                    System.out.println("Ingrese El valor individual del producto["+numero+"]");
                    precio=entrada_teclado.nextDouble();
                    //entrada_teclado.nextLine();
                    usuario[numero].setPrecio(precio);
                    
                    System.out.println("Ingrese la cantidad del producto["+numero+"]");
                    cantidad=entrada_teclado.nextInt();
                    //entrada_teclado.nextLine();
                    usuario[numero].setCantidad(cantidad);
       
                    numero++;
                    break;
       
                case 2:
                    
                    System.out.print("Ingrese el nombre del producto que desea buscar: ");
                    String abuscar = entrada_teclado.next();
                    for (int i=0;i<numero;i++){
                        if (abuscar.equals(usuario[i].getNombre())){
                            System.out.println("Nombre del producto: "+usuario[i].getNombre());
                            System.out.println("Valor unitario: "+usuario[i].getPrecio());
                            System.out.println("Cantidad existente: "+usuario[i].getCantidad());
                            retardo.retardo();
                            
                        }
                    }
                    for (int i=0;i<numero;i++){
                        if (abuscar.equals(usuario[i].getNombre())){
                            System.out.println("PRODUCTO ENCONTRADO");
                        }else{
                            System.out.println("PRODUCTO NO ENCONTRADO");
                        }
                    }
                    break;
                    
                case 3:
                    
                    System.out.print("Ingrese el nombre del producto que desea eliminar: ");
                    String abuscar2 = entrada_teclado.nextLine();
                    //entrada_teclado.nextLine();
                    int encontrado=0;
                    for (int i=0;i<numero;i++){
                        if (abuscar2.equals(usuario[i].getNombre())){
                            encontrado = i;
                            for(int k=i;k<numero;k++){
                                usuario[k]=usuario[k+1];
                            }
                            numero=numero-1;
                            break;
                        }
                    }
                    
                    for (int i=0;i<numero;i++){
                        if (abuscar2.equals(usuario[i].getNombre())){
                            System.out.println("PRODUCTO ENCONTRADO");
                        }else{
                            System.out.println("PRODUCTO NO ENCONTRADO");
                        }
                    }
                    
                    break;
                    
                case 4:
                    for (int i=0;i<numero;i++){
                        
                        System.out.println("PRODUCTO EN BODEGA");
                        System.out.println("Nombre dle producto: "+usuario[i].getNombre());
                        System.out.println("Valor unitario: "+usuario[i].getPrecio());
                        System.out.println("Cantidad existente: "+usuario[i].getCantidad());
                        retardo.retardo();
                    }
                    
                    
                    break;
                    
                case 5:
                    System.out.print("Ingrese el nombre del producto que desea vender: ");
                    String abuscar3 = entrada_teclado.nextLine();
                    //entrada_teclado.nextLine();
                    for (int i=0;i<numero;i++){
                        if (abuscar3.equals(usuario[i].getNombre())){
                            System.out.print("Ingrese la cantidad de "+usuario[i].getNombre()+" que dese vender");
                            venta=entrada_teclado.nextInt();
                            usuario[i].setVenta(venta);
                            valorventa=((double)venta)*usuario[i].getPrecio();
                            usuario[i].setValorunidad(valorventa);
                            int cantidad2=usuario[i].getCantidad();
                            cantidad2=cantidad2-venta;
                            usuario[i].setCantidad(cantidad2);
                            contador=contador+valorventa;
                            usuario[i].setContador(contador);
                            break;
                        }
                        
                    }
                    break;
                    
                case 6:
                     for (int i=0;i<numero;i++){
                        
                        System.out.println("GANANCIAS TOTALES");
                        System.out.println("Nombre dle producto: "+usuario[i].getNombre());
                        System.out.println("Ventas del producto: "+usuario[i].getVenta());
                        System.out.println("Ganancias Ventas del producto: "+usuario[i].getValorunidad());
                        System.out.println("Ganancias Ventas totales: "+usuario[i].getContador());
                        retardo.retardo();
                    }
                    break;
                    
                case 7:
                    
                    System.exit(0);
                    
                    break;
             }
                    
            }while(opcion!=-1);
       }
    }
