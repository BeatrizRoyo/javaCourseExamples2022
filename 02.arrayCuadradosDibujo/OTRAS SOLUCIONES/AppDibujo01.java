public class AppDibujo01
{
	public static void main( String[] args )
	{
		Dibujo dibujo = new Dibujo();

		Cuadrado.setRELLENO(true);

		//Podría agregarse en diferentes formatos, no necesariamente creando arryas
		//A continuación se pone un ejemplo de tres formas distintas:
		Cuadrado c1 = new Cuadrado(500, 50, 50);		
		dibujo.addCuadrado(c1);

		dibujo.addCuadrado(new Cuadrado(300, 300, 100));
		
		Cuadrado cuadrados[] = new Cuadrado[10];		
		cuadrados[0] = new Cuadrado(10, 10, 200);		
		for(int i=0;i<cuadrados.length;i++)
			if(cuadrados[i]!=null)
				dibujo.addCuadrado(cuadrados[i]);
	}
}
