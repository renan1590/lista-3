
public class piramide {
    private double altura;
    private double ab;
    private int tipodetinta;
    
    public piramide() {
    	
    }
    public piramide(double altura, double ab, int tipodetinta) {
    	setAltura(altura);
    	setAb(ab);
    	setTipodetinta(tipodetinta);
    }
    
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if(altura > 0)
			this.altura = altura;
	}
	public double getAb() {
		return ab;
	}
	public void setAb(double ab) {
		if(ab > 0)
			this.ab = ab;
	}
	public int getTipodetinta() {
		return tipodetinta;
	}
	public void setTipodetinta(int tipodetinta) {
		if(tipodetinta > 0)
			this.tipodetinta = tipodetinta;
	}
    
    public double areaB() {
    	return ab * ab;
    }
    
    public double alturaT() {
    	return Math.sqrt((ab/2)*(ab/2) + altura*altura );
    }
    
    public double areaT() {
    	return (alturaT() * ab) / 2 ; 
    }
    
    public double areaTo() {
    	return areaB() + (4 * areaT());
    }
    
    public double quantidadeT() {
    	return areaTo() / 4.76;
    }
    
    public double latas() {
    	return Math.ceil(quantidadeT() / 18);
    }
    
    public double valor() {
    	if(tipodetinta == 1) {
    		return latas()*127.90;
    	}else if(tipodetinta == 2) {
    		return latas()*258.98;
    	}else {
    		return latas()*344.34;
    	}
    }
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("piramide [altura=");
		builder.append(altura);
		builder.append(", lado=");
		builder.append(ab);
		builder.append(", tipodetinta=");
		builder.append(tipodetinta);
		builder.append(", areaTriangulo()=");
		builder.append(areaT());
		builder.append(", areaTotal()=");
		builder.append(areaTo());
		builder.append(", quantidadeTinta()=");
		builder.append(quantidadeT());
		builder.append(", latas()=");
		builder.append(latas());
		builder.append(", valor()=");
		builder.append(valor());
		builder.append("]");
		return builder.toString();
	}
    
}
