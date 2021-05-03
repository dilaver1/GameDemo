
public class ProductManager {

    public static void buyCampaing(User user, Product product, Campaign campaign) {
        float price = product.getPrice() - (product.getPrice() * campaign.Discount / 100);
        System.out.println(String.format("Kampanya kullanilarak "+user.getName() +" tarafindan "+  product.getGame() + " oyunu " + price+" tlye alindi "));
    }

    public void buy(User user, Product product) {
        System.out.println("Alindi" + user.getName());
    }

    public void add(Product product) {
        System.out.println("Eklendi: " + product.toString());
    }

    public void update(Product product) {
        System.out.println("Guncellendi: " + product.toString());

    }

    public void delete(Product product) {
        System.out.println("Silindi:" + product.toString());
    }
}
