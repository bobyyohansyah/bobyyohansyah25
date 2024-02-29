import java.util.Scanner;


public class yohan {
    public static void main(String[] args) {
        Scanner pilihan = new Scanner(System.in);
        boolean selesai = false;

        while (!selesai) {
            System.out.println("===== menu =====");
            System.out.println("1. Login Mahasiswa");
            System.out.println("2. Login untuk Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi 1,2,3 : ");
            int choice = pilihan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan 3 digit terakhir Nim: ");
                    String studentNIM = pilihan.next();
                    if (studentNIM.length() >= 3 ) {
                        System.out.println("Berhasil Login Mahasiswa");
                    } else {
                        System.out.println("User tidak di temukan!!");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan username (admin): ");
                    String Username = pilihan.next();
                    System.out.print("Masukkan password (admin): ");
                    String Password = pilihan.next();
                    if (Username.equals("admin") && Password.equals("admin")) {
                        System.out.println("Berhasil Login Admin");
                    } else {
                        System.out.println("Admin tidak di temukan!!");
                    }
                    break;
                case 3:
                    selesai = true;
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("pilihan tidak tersedia");
            }
        }

    }
}