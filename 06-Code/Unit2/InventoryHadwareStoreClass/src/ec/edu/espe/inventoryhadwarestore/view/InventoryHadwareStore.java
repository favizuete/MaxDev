/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inventoryhadwarestore.view;

import com.google.gson.Gson;
import ec.edu.espe.inventoryhadwarestore.model.Admin;
import ec.edu.espe.inventoryhadwarestore.model.ConstructionMaterial;
import ec.edu.espe.inventoryhadwarestore.model.ElectricTool;
import ec.edu.espe.inventoryhadwarestore.model.Inventory;
import ec.edu.espe.inventoryhadwarestore.model.Product;
import ec.edu.espe.inventoryhadwarestore.model.SalesRegistry;
import ec.edu.espe.inventoryhadwarestore.model.Tool;
import espe.edu.ec.filemanagerlibrary.FileManager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Fausto Vizuete ESPE-DCCO
 */
public class InventoryHadwareStore {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Inventory inventory = new Inventory();
        SalesRegistry salesRegistry = new SalesRegistry();
        Admin admin = new Admin("Richard", "richard123", "richard123");
        inventory.login(admin);
        inventory.readProducts();
        Scanner scan = new Scanner(System.in);
        int opc;
        int option;
        int op;

        do {
            System.out.println("\t****INVENTARIO FERRETERIA****");
            System.out.println("1. INGRESAR PRODUCTO AL INVENTARIO ");
            System.out.println("2. INGRESAR CANTIDAD DE PRODUCTO AL INVENTARIO");
            System.out.println("3. VENDER PRODUCTO");
            System.out.println("4. MODIFICAR PRODUCTO");
            System.out.println("5. ELIMINAR PRODUCTO");
            System.out.println("6. MOSTRAR INVENTARIO");
            System.out.println("0. SALIR");
            System.out.print("ESCOJA UNA OPCION: ");
            opc = scan.nextInt();
            scan.nextLine();
            System.out.println("   ");
            switch (opc) {
                case 1:
                    inventory.addProduct(enterAProduct());
                    System.out.println("Inventario -->" + inventory);
                    break;
                case 2:
                    do {
<<<<<<< HEAD

                        System.out.println("Ingrese el producto que desea ingresar:");
=======
                        System.out.println("Ingrese el producto que desea registrar:");
>>>>>>> 9e8b25d3da868f1452ca8c23a5c8eaf81a6ed402
                        String readedproduct = scan.nextLine();
                        for (Product product : inventory.getProducts()) {
                            if (readedproduct.equals(product.getName())) {
                                System.out.println("Producto encontrado..");
                                System.out.println("Ingrese la cantidad que desea añadir a ese producto:");
                                int quantityToAdd = scan.nextInt();
                                scan.nextLine();
                                product.add(quantityToAdd);
                            }
                        }
                        System.out.println("Ingrese 1 para ingresar un nuevo producto");
                        System.out.println("Ingrese 2 para salir");
                        option = scan.nextInt();
                        scan.nextLine();
                    } while (option != 2);
                    break;
                case 3:
                    ArrayList<Product> productsToSell = new ArrayList<>();
                    System.out.println("Buen día,ingrese su nombre para continuar:");
                    System.out.println("Ingrese su nombre");
                    String name = scan.nextLine();
                    do {
                        System.out.println("Ingrese el producto que desea vender:");
                        String readedproduct = scan.nextLine();
                        for (Product product : inventory.getProducts()) {
                            if (readedproduct.equals(product.getName())) {
                                System.out.println("Producto encontrado..");
                                System.out.println("Ingrese la cantidad que desea vender de este producto:");
                                int quantityToSell = scan.nextInt();
                                scan.nextLine();
                                product.sell(quantityToSell);
                                productsToSell.add(product);
                            }
                        }
                        System.out.println("Ingrese 1 para vender otro producto");
                        System.out.println("Ingrese 2 para continuar al registro");
                        option = scan.nextInt();
                        scan.nextLine();
                    } while (option != 2);
                    Date date = new Date();
                    String id = "";
                    SalesRegistry registry = new SalesRegistry(name, date, id, productsToSell);
                    registry.generateId();
                    String registryString = gson.toJson(registry);
                    FileManager.writeFile("RegistroDeVentas.json", registryString);
<<<<<<< HEAD

                    while ("si".equals(validate.getYesOrNo("Desea imprimir el registro de ventra?" + "[si/no]: "))) {
                        String sales = gson.toJson(registry);
                        FileManager.readFile("RegistroDeVenta.jason");
                        SalesRegistry reg;
                        reg = gson.fromJson(sales, SalesRegistry.class);
                        System.out.println("\t\t***Registo de Venta***");
                        int i = 0;
                        System.out.println("Venta N°" + (i + 1));
                        System.out.println(reg);
                        System.out.println("==============================================");
                    }
=======
                    String sales = gson.toJson(registry);
                    FileManager.readFile("RegistroDeVenta.jason");
                    SalesRegistry reg;
                    reg = gson.fromJson(sales, SalesRegistry.class);
                    System.out.println("\t\t***Registo de Venta***");
                    int i = 0;
                    System.out.println("Venta N°" + (i + 1));
                    System.out.println(reg);
                    System.out.println("==============================================");
>>>>>>> 9e8b25d3da868f1452ca8c23a5c8eaf81a6ed402

                    break;

                case 4:
                    ArrayList<Product> products = inventory.getProducts();
                    System.out.println("Ingrese que producto desea modificar");
                    String searchName = scan.nextLine();
                    boolean found = false;
                    for (int j = 0; j < products.size(); j++) {
                        if (products.get(j).getName().equals(searchName)) {
                            found = true;
                            System.out.println("Que dato desea modificar?");
                            System.out.println("1:Marca");
                            System.out.println("2:Precio");
                            System.out.println("3:Categoria");
                            option = scan.nextInt();
                            scan.nextLine();
                            switch (option) {
                                case 1:
                                    System.out.println("Nueva Marca:");
                                    products.get(j).setBrand(scan.nextLine());
                                    break;
                                case 2:
                                    System.out.println("Nuevo Precio:");
                                    products.get(j).setPrice(scan.nextFloat());
                                    break;
                                case 3:
                                    System.out.println("Nueva Categoria:");
                                    products.get(j).setCategory(scan.nextLine());
                                    break;
                            }
                            gson.toJson(products.get(j));
                            FileManager.writeFile("RegistroProductos.json", gson.toJson(products.get(j)));
                            System.out.println("Producto modificado");
                        }
                    }
                    if (!found) {
                        System.out.println("No se encontro el producto");
                    }
                    break;
<<<<<<< HEAD
=======
                case 5:

                    break;

>>>>>>> 9e8b25d3da868f1452ca8c23a5c8eaf81a6ed402
                case 6:
                    System.out.println("Ingrese que desea ver del inventario");
                    System.out.println("1. Todo el inventario");
                    System.out.println("2. Un producto especifico de inventario");
                    option = scan.nextInt();
                    scan.nextLine();
                    switch (option) {
                        case 1:
                            System.out.println("Mostrando todo el inventario..");
                            inventoryView(inventory);
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del producto que desea ver:");
                            String productToSee = scan.nextLine();
                            for (Product product : inventory.getProducts()) {
                                if (product.getName().equals(productToSee)) {
                                    System.out.println("**************************************");
                                    System.out.println("Nombre del producto-->" + product.getName());
                                    System.out.println("Marca del producto -->" + product.getBrand());
                                    System.out.println("ID del producto -->" + product.getId());
                                    System.out.println("Categoría del producto -->" + product.getCategory());
                                    System.out.println("Precio del producto -->" + product.getPrice());
                                    System.out.println("Cantidad actual en el inventario del producto -->" + product.getQuantity());
                                    System.out.println("**************************************");
                                }
                            }
                            break;
                        default:
                    }
                    break;
                case 0:
                    System.out.println("\t**GRACIAS POR USAR MI PROGRAMA....!!**"
                            + "");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");

            }

        } while (opc != 0);

    }

    public static Product enterAProduct() {
        Scanner reader = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("=====INGRESE UN NUEVO PRODUCTO=====");
        System.out.println("Ingrese el id del producto        :");
        int id = reader.nextInt();
        reader.nextLine();
        System.out.println("Ingrese el nombre del producto    :");
        String name = reader.nextLine();
        System.out.println("Ingrese la marca del producto     :");
        String brand = reader.nextLine();
        System.out.println("Ingrese la cantidad del producto  :");
        int quantity = reader.nextInt();
        reader.nextLine();
        System.out.println("Ingrese el precio del producto    :");
        float price = reader.nextFloat();
        reader.nextLine();
        System.out.println("Ingrese la categoría del producto :");
        String category = reader.nextLine();

        if ("Herramienta".equals(category)) {
            System.out.println("Ingrese la calidad de la herramienta:");
            String qualityh = reader.nextLine();
            Product tool = new Tool(qualityh, id, name, brand, quantity, price, category);
            return tool;

        } else if ("Herramienta electrica".equals(category)) {
            System.out.println("Ingrese la calidad de la herramienta electrica:");
            String qualityh = reader.nextLine();
            Product electricTool = new ElectricTool(qualityh, category, id, name, brand, quantity, price, category);
            return electricTool;
        } else if ("Material de Construcción".equals(category)) {
            System.out.println("Ingrese el peso del material:");
            float weigth = reader.nextFloat();
            Product material = new ConstructionMaterial(weigth, id, name, brand, quantity, price, category);
            return material;

        } else {
            Product product = new Product(id, name, brand, quantity, price, category);
            return product;
        }

    }

    public static void inventoryView(Inventory inventory) {

        System.out.println("*********Inventario Actual*********");
        System.out.println("Total de productos: " + inventory.getProducts().size());
        int i = 0;
        for (Product product : inventory.getProducts()) {
            System.out.println("Producto N°" + (i + 1));
            System.out.println("Nombre del producto-->" + product.getName());
            System.out.println("Marca del producto -->" + product.getBrand());
            System.out.println("ID del producto -->" + product.getId());
            System.out.println("Categoría del producto -->" + product.getCategory());
            System.out.println("Precio del producto -->" + product.getPrice());
            System.out.println("Cantidad actual en el inventario del producto -->" + product.getQuantity());
            int j = i + 1;
            i = j;
        }
        System.out.println("********************************");
    }

    public String answerYesorNo(String question) {
        Scanner scan = new Scanner(System.in);
        String data = "";
        while (data.equals("")) {
            System.out.println(question);
            data = scan.nextLine();
            if (!"si".equals(data) & !"no".equals(data)) {
                data = "";
            }
        }
        return data;
    }
<<<<<<< HEAD
=======

>>>>>>> 9e8b25d3da868f1452ca8c23a5c8eaf81a6ed402
}
