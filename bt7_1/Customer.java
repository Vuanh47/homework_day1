package bt7_1;

public class Customer {
	String name;
	Boolean memBoolean = false;
	String memberType;
	public Customer(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getMemBoolean() {
		return memBoolean;
	}
	public void setMemBoolean(Boolean memBoolean) {
		this.memBoolean = memBoolean;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	

}
