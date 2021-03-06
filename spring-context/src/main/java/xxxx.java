import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;

/**
 * TODO
 *
 * @author qinshengke
 * @since 2021/3/6
 **/
public class xxxx {
	public static void main(String[] args) {
		ConfigurationClassPostProcessor configurationClassPostProcessor = new ConfigurationClassPostProcessor();
		System.out.println(configurationClassPostProcessor instanceof BeanDefinitionRegistryPostProcessor);
	}
}
