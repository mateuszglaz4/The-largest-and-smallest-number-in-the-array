
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



       
        int [] tab = new int[20];
        for(int i=0; i< tab.length; i++){
            tab[i] = Integer.parseInt(reader.readLine());
        }
        int maksimum = tab[0];
        int minimum = tab[0];
        for(int i=1; i< tab.length; i++) {
            if (tab[i] > maksimum) {
                maksimum = tab[i];
            }
            if (tab[i] < minimum) {
                minimum = tab[i];
            }

        }
            System.out.println(maksimum + " " + minimum);


    }
}
