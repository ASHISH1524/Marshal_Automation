package POMRepos;

public class Homepage {
	   
        public static String DogClick="//li[@id='cbp-hrmenu-tab-20']/a";  //Xpath of the dog 
        public static String ToyClick="//div[@id='left-column']/div/div/ul/li[9]/a"; //Xpath of the toy in the dog section
        public static String SecondToy="//div[@id='js-product-list']/div/div[2]"; //Xpath for thr Second toy in the page
        public static String Toy="//div[@class='col']/ol/li[3]/a"; //Xpath for the toy option
        public static String FirstToy="//*[@id='js-product-list']/div/div[1]/article/div[1]/a/img[2]"; //Xpath of the first toy
        public static String ToyName="//div[@class='col-md-7 col-product-info']/div/h1/span"; //Xpath of the name of the first toy
        public static String ToyPrice="//div[@class='has-discount']/div"; //Xpath of the price of the first toy
        public static String Cart="//*[@class='add']/button";  //Xpath of the add to cart
        public static String Checkout="//*[@class='cart-content-btn']/a"; //Xpath of the checkout
        public static String CartName="//*[@class='product-line-info']/a"; //Xpath of name of the product in the summary page
}
