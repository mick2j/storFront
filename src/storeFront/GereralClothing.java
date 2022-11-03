package storeFront;

public class GereralClothing {
		
		private String code;
		private String description;
		private String size;
		private double price;
		
		public GereralClothing() {
		}

		public GereralClothing(String code, String description, String size, double price) {
			super();
			this.code = code;
			this.description = description;
			this.size = size;
			this.price = price;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "ClothingMen [code=" + code + ", description=" + description + ", size=" + size + ", price=" + price
					+ "]";
		}

}
