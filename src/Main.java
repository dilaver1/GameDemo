
public class Main {

    public static void main(String[] args) {
        User user1 = new User();  // Isteyen parametresiz
        user1.setBornDate("2002.08.24");
        user1.setId(1);
        user1.setName("Dilaver Agabeyov");
        user1.setTcNo(555555);;
        Product product1 = new Product(1, "Gta 5", 5000); // Isteyen parametresiz
        UserManager userManager = new UserManager();
        ProductManager productManager = new ProductManager();
        Campaign campaign1 = new Campaign();
        CampaignManager campaignManager = new CampaignManager();
        campaign1.Id = 1;
        campaign1.Discount = 20;
        userManager.signUp(user1);
        productManager.buyCampaing(user1, product1, campaign1);
        campaignManager.delete(campaign1);
    }

}
