class Circles implements Comparable<Circles>{
	double llh;
	int centre;
	int endpoint;
	double radius;
	
	Circles(double llh, int centre,int endpoint, double radius) {
		this.llh = llh;
		this.centre = centre;
		this.endpoint = endpoint;
		this.radius = radius;
	}
	
	public int compareTo(Circles compareCircle){
		
		double curr_llh = ((Circles) compareCircle).llh;
		
		int j =  (curr_llh - this.llh) > 0 ? 1 : -1 ;
		return j ; 
	}
}
