/**
 * 具体装饰类
 * 它是抽象装饰类的子类，负责向构件添加新的职责。每一个具体装饰类都定义了一些新的行为，
 * 它可以调用在抽象装饰类中定义的方法，并可以增加新的方法用以扩充对象的行为。
 *
 * Author: markliu
 * Time  : 16-8-31 下午8:24
 */
public class ScrollBarDecorator extends ComponentDecorator {

	public ScrollBarDecorator(Component component) {
		super(component);
	}

	@Override
	public void display() {
		setScrollBar();
		super.display();
	}

	public void setScrollBar() {
		System.out.println("set ScrollBar");
	}
}
