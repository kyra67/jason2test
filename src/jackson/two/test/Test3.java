package jackson.two.test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test3 {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		User user = new User("Zhang san", 20, "He is a young boy.");
		try {
			System.out.println("Normal View");
			String normalView = mapper.writerWithView(Views.Normal.class).writeValueAsString(user);
			System.out.println(normalView);
			String json1 = "{\"name\" : \"Zhang san\", \"year\" : 20}";
			User normalUser = mapper.readerWithView(Views.Normal.class).forType(User.class).readValue(json1);
			System.out.println(normalUser);
			System.out.println("Manage View");
			String json2 = "{\"name\" : \"Zhang san\", \"year\" : 20, \"describe\": \"He is a young boy.\"}";
			User mangerUser = mapper.readerWithView(Views.Manager.class).forType(User.class).readValue(json2);
			System.out.println(mangerUser.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
