
public class Franchise {
	public class Franchise
    {
        private readonly Restaurant[] _restaurants;

        public Franchise(params Restaurant[] restaurants)
        {
            _restaurants = restaurants;
        }

        public decimal ChiffreAffaires
            => _restaurants.Sum(restaurant => restaurant.ChiffreAffaires);
    }
	
	private final Restaurant[] restaurant;
	public Franchise(Restaurant[] restaurants)
    {
        restaurant = restaurants;
    }
	int ChiffreAffaires()
	{
		restaurant.sum()
	}

}
