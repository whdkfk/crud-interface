public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = new UserService();

        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));
        System.out.println(user1);
        System.out.println(user2);

        System.out.println("\n id = 2인 user Read 할거임");
        User find = userService.read(2L);
        System.out.println(find);

        User updateUser = userService.update(1L, new User("park", "park@email", "q1w2e3"));
        System.out.println("\n" + updateUser);

        System.out.println(userService.delete(1L));
        User find1 = userService.read(1L);
        System.out.println(find1);

        userService.listAll().forEach(System.out::println);
    }
}