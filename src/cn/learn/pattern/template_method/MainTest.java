package cn.learn.pattern.template_method;

public class MainTest {
	public static void main(String[] args) {
		Tea tea = new Tea();
		//设置用户不需要加调料
		tea.setCustomerWants(false);
		tea.prepareRecipe();
		
		System.out.println("-----");
		
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
	}
}
