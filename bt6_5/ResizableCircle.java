package bt6_5;

public class ResizableCircle  extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void resize(double percent) { 
		radius *= percent/100.0;
	}


	@Override
	public String toString() {
		return "ResizableCircle [radius=" + radius +"]";
	}

}
