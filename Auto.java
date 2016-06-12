public class Auto {
	Position p;
	
	public void move(int x, int y){
		for(int i=0;i<x;i++){
			p.x +=i;
		}
		for(int i=0;i<y;i++){
			p.y +=y;
		}
	}

	public int getX() {
		return p.x;
	}

	public void setX(int x) {
		p.x = x;
	}

	public int getY() {
		return p.y;
	}

	public void setY(int y) {
		p.y = y;
	}
}
