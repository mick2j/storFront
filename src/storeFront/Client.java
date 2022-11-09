package storeFront;

public class Client {
		//must be private to getter and setter can control the out put of the data
	//testing for Jai.. toniD
		
		private String Numphone;
		private String name;
		private int age;
		private char gender;
		private char typeClient;
		
		public Client() {
		}

		public Client(String numphone, String name, int age, char gender, char typeClient) {
			super();
			this.setNumphone (numphone);
			this.setName (name);
			this.setAge (age);
			this.setGender (gender);
			this.setTypeClient (typeClient);
		}

		
		public String getNumphone() {
			return Numphone;
		}

		public void setNumphone(String numphone) {
			Numphone = numphone;
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

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public char getTypeClient() {
			return typeClient;
		}

		public void setTypeClient(char typeClient) {
			this.typeClient = typeClient;
		}

		@Override
		public String toString() {
			return "Client [Numphone=" + Numphone + ", name=" + name + ", age=" + age + ", gender=" + gender
					+ ", typeClient=" + typeClient + "]";
		}

}
