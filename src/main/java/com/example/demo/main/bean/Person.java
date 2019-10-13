package com.example.demo.main.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;


//@PropertySource(value= {"classpath:person.properties"})
@Component
//@ConfigurationProperties(value="person")
//@Validated
public class Person {
	
	//@Value("${person.name}")
	/*和@ConfigurationProperties(prefix = "person")一样，是两种不同的方法获取值，都可以*/
	
//	@Email
	private String name;
	private int age;
	private boolean boss;
	private Date birth;
	private List<Object> list;
	private Map<Object, Object> map;
	private Money money;
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
	public boolean isBoss() {
		return boss;
	}
	public void setBoss(boolean boss) {
		this.boss = boss;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	public Map<Object, Object> getMap() {
		return map;
	}
	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}
	public Money getMoney() {
		return money;
	}
	public void setMoney(Money money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", boss=" + boss + ", birth=" + birth + ", list=" + list
				+ ", map=" + map + ", money=" + money + "]";
	}
	
	
}
