public class ReminderVisitor extends NodeVisitor {
// Implementation of visitor pattern is done here
	private Reminder m_Reminder;

	private ReminderVisitor.NodeVisitor nodeVisitor;

	public void visitProduct(Product product) {

	}

	public void visitTrading(Trading trading) {

	}

	public void visitFacade(Facade facade) {

	}
	public class ReminderVisitor extends NodeVisitor{
		String m_Reminder;
	}

	public class NodeVisitor extends ReminderVisitor {

		private ReminderVisitor reminderVisitor;

		public Reminder visitProduct(ProductList PrdList) {
			System.out.println("Product visitng...");
			return PrdList
		}

		public Reminder visitTrading(Trading trading) {
			System.out.println(" Trade visiting...");
			return trading;
		}

		public void visitFacade(Facade facade) {

		}

	}

}
