package controller;

public class SomatoriaController {

	public SomatoriaController() {
		super();
	}

	public double calculaSomatoria(int num) {
		//Condição de parada: contagem é 1. 
		if (num == 1) {
			//Último termo retorna 1, completando o calculo
            return 1.0;
        } else {
        	
        	//Recursiva chamando o calculo, a cada termo calcula 1/N na contagem atual. 
            return calculaSomatoria(num - 1) + 1.0 / num;
        }

	}
}