/**
 * Kelas ini digunakan untuk menghitung luas permukaan kubus.
 */
public class LuasPermukaanKubus {

    /**
     * Metode ini menghitung luas permukaan kubus.
     *
     * @param sisi Panjang sisi kubus.
     * @return Luas permukaan kubus.
     */
    public static double hitungLuasPermukaan(double sisi) {
        // Rumus luas permukaan kubus: 6 * sisi * sisi
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        double sisi = 4.0; // Ganti dengan panjang sisi kubus yang diinginkan

        // Menghitung luas permukaan kubus
        double luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah: " + luasPermukaan);
    }
}