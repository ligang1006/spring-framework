
import org.springframework.stereotype.Component;

/**
 * @author: lee
 * @create: 2021/7/8 5:02 下午
 **/
@Component
public class People {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
