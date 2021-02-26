
public class hola_mundoV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase="Hola";
		boolean saludo=true;
		if(frase=="Hola") {
			saludo=true;
		}else {
			if(frase=="Adios") {
				saludo=false;
			}
		}
		
		System.out.println(frase=(saludo)?"Hola mundo":"Adios mundo");
	}

}
