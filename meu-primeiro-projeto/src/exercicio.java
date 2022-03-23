public class exercicio {
     public static void main(String[] args) {

        
        String meuNome = "fernanda";
        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto (meuNome,segundoNome);
        
        System.out.println(nomeCompleto);
 }

public static String nomeCompleto (String meuNome, String segundoNome){
return meuNome.concat(" ").concat(segundoNome);    
}

}
