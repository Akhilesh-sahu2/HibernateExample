package model;

public class CertificateSetMappings {
	
	private int id;
	private String name;
	
   public CertificateSetMappings() {}
   public CertificateSetMappings(String name) {
      this.name = name;
   }

	   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		int temp = 0;
		temp = (id+name).hashCode();
		return temp;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!this.getClass().equals(obj.getClass())) return false;
		CertificateSetMappings obj1 = (CertificateSetMappings)obj;
		if(this.id==obj1.getId()&&this.name.equals(obj1.getName()))
			return true;
		return false;
	} 

	

}
