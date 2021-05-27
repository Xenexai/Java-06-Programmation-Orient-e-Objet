public class Wilder {

		private String Firstname;
		private boolean Aware;
		/**
		 * @param firstname
		 * @param aware
		 */
		public Wilder(String firstname, boolean aware) {
			super();
			Firstname = firstname;
			Aware = aware;
		}
		/**
		 * @return the firstname
		 */
		public String getFirstname() {
			return Firstname;
		}
		/**
		 * @param firstname the firstname to set
		 */
		public void setFirstname(String firstname) {
			Firstname = firstname;
		}
		/**
		 * @return the aware
		 */
		public boolean isAware() {
			return Aware;
		}
		/**
		 * @param aware the aware to set
		 */
		public void setAware(boolean aware) {
			Aware = aware;
		}
		
		/* Method*/
		
		public String whoAmI() {
			 if(Aware) {
		         return "Je m'appelle "+ this.getFirstname() + " et je suis aware";
		     } else { 
		         return "Je m'appelle "+ this.getFirstname() + " et je ne suis pas aware";
		     }
	    }
	}


