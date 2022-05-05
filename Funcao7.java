package funcao7;
    public class Funcao7 {
        static int[] inverte(int vet1[]){
        int vet2[] = new int [vet1.length];
            for(int i = 0, j = vet2.length -1;i < vet1.length; i++, j--)
                vet2[j] = vet1[i];
        return vet2;
        }
        public static void main(String[] args) {
            int vetnormal[] = {5,6,7,8,9};
            int vetinvert[] = inverte(vetnormal);
        
        for(int i = 0; i<vetinvert.length;i++){
            System.out.println(vetinvert[i]);
        }
    }
}
