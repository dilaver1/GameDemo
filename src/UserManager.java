
public class UserManager {

    public static void signUp(User user) {
        if (user.getTcNo() > 0) {
            System.out.println(user.getName() + " Kayit oldu");
        } else {
            System.out.println("Yanlis TcNo");
        }
    }

    public static void Login(User user) {
        System.out.println(user.getName() + " Giris yapildi");
    }

    public static void update(User user) {
        System.out.println(user.getName() + " Guncellendi");
    }

    public static void Delete(User user) {
        System.out.println(user.getName() + " Silindi");
    }

    public static void Verifaction(User user) {
        if (user.getTcNo() > 0) {
            System.out.println(user.getName() + " Onaylandi");
        }
    }
}
