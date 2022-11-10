package storeFront;

public class Client {
		//must be private to getter and setter can control the out put of the data
	//testing for Jai.. toniD
		
		private String numphone;
		private String name;
		private int age;
		private String gender;
		private String typeClient;
		
		public Client() {
		}

		public Client(String numphone, String name, int age, String gender, String typeClient) {
			super();
			this.numphone = numphone;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.typeClient = typeClient;
		}

		
		public String getNumphone() {
			return numphone;
		}

		public void setNumphone(String numphone) {
			numphone = numphone;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getTypeClient() {
			return typeClient;
		}

		public void setTypeClient(String typeClient) {
			this.typeClient = typeClient;
		}

		@Override
		public String toString() {
			return "Client [Numphone=" + numphone + ", name=" + name + ", age=" + age + ", gender=" + gender
					+ ", typeClient=" + typeClient + "]";
		}

}
