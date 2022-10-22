import java.util.Scanner;

public class App {

    

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        karyawan newkaryawan = getkaryawanDetails();
        double potongan = getpotongan();

        System.out.println();
        System.out.println("Confirm karyawan details: ");
        System.out.println("Id : " + newkaryawan.getkaryawan());
        System.out.println("Name : " + newkaryawan.getkaryawanName());
        System.out.println("gaji_usulan : " + newkaryawan.getgaji_usulan());

        newkaryawan.kalkulasigaji_bersih(potongan);
        System.out.println("gaji_bersih : " + newkaryawan.getgaji_bersih());
    }

    public static karyawan getkaryawanDetails() {
        karyawan karyawan = new karyawan();
        System.out.println("Id: ");
        karyawan.setkaryawan(scanner.nextInt());
        System.out.println("Name: ");
        karyawan.setkaryawanName(scanner.next());
        System.out.println("gaji_usulan: ");
        karyawan.setgaji_usulan(scanner.nextDouble());
        return karyawan;
    }

    public static double getpotongan(){
        System.out.println("potongan:");
        double potongan = scanner.nextDouble();
        return potongan;
    }

}
