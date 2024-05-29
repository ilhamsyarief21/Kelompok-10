import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DatasetBlogPemerintahan {
    public static void main(String[] args) {
        String filename = "blog_entries.arff";
        try {
            FileWriter fileWriter = new FileWriter(filename);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("@relation blog_entries\n");
            printWriter.println("@attribute ID numeric");
            printWriter.println("@attribute Title {Aceh, Bali, Banten, Bengkulu, Gorontalo, Jakarta, Jambi, 'Jawa Barat', 'Jawa Tengah', 'Jawa Timur', 'Kalimantan Barat', 'Kalimantan Selatan', 'Kalimantan Tengah', 'Kalimantan Timur', 'Kalimantan Utara', 'Kepulauan Bangka Belitung', 'Kepulauan Riau', Lampung, Maluku, 'Maluku Utara', 'Nusa Tenggara Barat', 'Nusa Tenggara Timur', Papua, 'Papua Barat', Riau, 'Sulawesi Barat', 'Sulawesi Selatan', 'Sulawesi Tengah', 'Sulawesi Tenggara', 'Sulawesi Utara', 'Sumatera Barat', 'Sumatera Selatan', 'Sumatera Utara', 'Daerah Istimewa Yogyakarta'}");
            printWriter.println("@attribute Content {www.acehprov.go.id, www.baliprov.go.id, www.bantenprov.go.id, www.bengkuluprov.go.id, www.gorontaloprov.go.id, www.jakartaprov.go.id, www.jambiprov.go.id, www.jawabaratprov.go.id, www.jawatengahprov.go.id, www.jawatimurprov.go.id, www.kalimantanbaratprov.go.id, www.kalimantanselatanprov.go.id, www.kalimantantengahprov.go.id, www.kalimantantimurprov.go.id, www.kalimantanutaraprov.go.id, www.kepulauanbangkabelitungprov.go.id, www.kepulauanriauprov.go.id, www.lampungprov.go.id, www.malukuprov.go.id, www.malukuutara.go.id, www.nusatenggarabaratprov.go.id, www.nusatenggaratimurprov.go.id, www.papuaprov.go.id, www.papuabaratprov.go.id, www.riauprov.go.id, www.sulawesibaratprov.go.id, www.sulawesiselatanprov.go.id, www.sulawesitengahprov.go.id, www.sulawesitenggaraprov.go.id, www.sulawesiutara.go.id, www.sumaterabaratprov.go.id, www.sumateraselatanprov.go.id, www.sumaterautaraprov.go.id, www.daerahistimewa.go.id}");
            printWriter.println("@attribute Date date \"yyyy-MM-dd\"");
            printWriter.println("@attribute Visitors numeric");
            printWriter.println("@attribute Likes numeric");
            printWriter.println("@attribute Comments numeric");
            printWriter.println("@attribute Popularity {Low, Medium, High}\n");
            printWriter.println("@data");

            printWriter.println("1, Aceh, www.acehprov.go.id, 2023-01-15, 1200, 150, 30, High");
            printWriter.println("2, Bali, www.baliprov.go.id, 2023-02-20, 900, 85, 15, Medium");
            printWriter.println("3, Banten, www.bantenprov.go.id, 2023-03-10, 700, 45, 10, Medium");
            printWriter.println("4, Bengkulu, www.bengkuluprov.go.id, 2023-04-05, 300, 20, 5, Low");
            printWriter.println("5, Gorontalo, www.gorontaloprov.go.id, 2023-05-22, 400, 25, 7, Low");
            printWriter.println("6, Jakarta, www.jakartaprov.go.id, 2023-06-12, 2500, 320, 60, High");
            printWriter.println("7, Jambi, www.jambiprov.go.id, 2023-07-18, 600, 40, 9, Medium");
            printWriter.println("8, 'Jawa Barat', www.jawabaratprov.go.id, 2023-08-23, 2200, 310, 55, High");
            printWriter.println("9, 'Jawa Tengah', www.jawatengahprov.go.id, 2023-09-10, 1400, 160, 35, High");
            printWriter.println("10, 'Jawa Timur', www.jawatimurprov.go.id, 2023-10-05, 800, 75, 17, Medium");
            printWriter.println("11, 'Kalimantan Barat', www.kalimantanbaratprov.go.id, 2023-11-15, 500, 30, 8, Low");
            printWriter.println("12, 'Kalimantan Selatan', www.kalimantanselatanprov.go.id, 2023-12-20, 700, 45, 10, Medium");
            printWriter.println("13, 'Kalimantan Tengah', www.kalimantantengahprov.go.id, 2024-01-14, 600, 40, 9, Medium");
            printWriter.println("14, 'Kalimantan Timur', www.kalimantantimurprov.go.id, 2024-02-19, 1200, 150, 30, High");
            printWriter.println("15, 'Kalimantan Utara', www.kalimantanutaraprov.go.id, 2024-03-22, 300, 20, 5, Low");
            printWriter.println("16, 'Kepulauan Bangka Belitung', www.kepulauanbangkabelitungprov.go.id, 2024-04-10, 400, 25, 7, Low");
            printWriter.println("17, 'Kepulauan Riau', www.kepulauanriauprov.go.id, 2024-05-28, 900, 85, 15, Medium");
            printWriter.println("18, Lampung, www.lampungprov.go.id, 2024-06-15, 500, 30, 8, Low");
            printWriter.println("19, Maluku, www.malukuprov.go.id, 2024-07-09, 700, 45, 10, Medium");
            printWriter.println("20, 'Maluku Utara', www.malukuutara.go.id, 2024-08-21, 600, 40, 9, Medium");
            printWriter.println("21, 'Nusa Tenggara Barat', www.nusatenggarabaratprov.go.id, 2024-09-05, 1200, 150, 30, High");
            printWriter.println("22, 'Nusa Tenggara Timur', www.nusatenggaratimurprov.go.id, 2024-10-12, 1400, 160, 35, High");
            printWriter.println("23, Papua, www.papuaprov.go.id, 2024-11-18, 2500, 320, 60, High");
            printWriter.println("24, 'Papua Barat', www.papuabaratprov.go.id, 2024-12-02, 2200, 310, 55, High");
            printWriter.println("25, Riau, www.riauprov.go.id, 2024-12-30, 800, 75, 17, Medium");
            printWriter.println("26, 'Sulawesi Barat', www.sulawesibaratprov.go.id, 2024-12-31, 300, 20, 5, Low");
            printWriter.println("27, 'Sulawesi Selatan', www.sulawesiselatanprov.go.id, 2025-01-01, 900, 85, 15, Medium");
            printWriter.println("28, 'Sulawesi Tengah', www.sulawesitengahprov.go.id, 2025-01-02, 700, 45, 10, Medium");
            printWriter.println("29, 'Sulawesi Tenggara', www.sulawesitenggaraprov.go.id, 2025-01-03, 500, 30, 8, Low");
            printWriter.println("30, 'Sulawesi Utara', www.sulawesiutara.go.id, 2025-01-04, 600, 40, 9, Medium");
            printWriter.println("31, 'Sumatera Barat', www.sumaterabaratprov.go.id, 2025-01-05, 800, 75, 17, Medium");
            printWriter.println("32, 'Sumatera Selatan', www.sumateraselatanprov.go.id, 2025-01-06, 1400, 160, 35, High");
            printWriter.println("33, 'Sumatera Utara', www.sumaterautaraprov.go.id, 2025-01-07, 2200, 310, 55, High");
            printWriter.println("34, 'Daerah Istimewa Yogyakarta', www.daerahistimewa.go.id, 2025-01-08, 2500, 320, 60, High");

            printWriter.close();
            System.out.println("ARFF file created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}