package com.ws.banque.wsClient;

import java.util.List;

public class TestBanqueWS {

	
	public static void main(String[] args) {
		BanqueWS stub = new BanqueServiceService().getBanqueWSPort();
		double montant = stub.conversionEuroToDh(40);
		System.out.println("Montant convertis (euro ==> dh) : "+montant);
		System.out.println("--------------------");
		Compte compte1 = stub.getCompte("45877124588965");
		System.out.println(compte1.toString());
		List<Compte> listeComptes = stub.getListeComptes();
		for(Compte compte : listeComptes){
			System.out.println("--------------------");
			System.out.println(compte.toString());
		}
	}
}
