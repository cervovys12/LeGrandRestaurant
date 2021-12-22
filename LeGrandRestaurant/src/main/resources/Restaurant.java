
public class Restaurant {
	public class Restaurant
    {
        private readonly Serveur[] _serveurs;

        public Restaurant(params Serveur[] serveurs)
        {
            _serveurs = serveurs;
        }

        public decimal ChiffreAffaires 
            => _serveurs.Sum(serveur => serveur.ChiffreAffaires);
    }
	private final Serveur[] serveurs;
	public Restaurant(Serveur[] serveurs)
    {
        this.serveurs = serveurs;
    }

}
