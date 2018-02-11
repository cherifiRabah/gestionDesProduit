package org.sid;

import org.sid.dao.ProduitRepository;
import org.sid.enteties.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DemoApplication.class, args);
		ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
		produitRepository.save(new Produit("HP", 3000, 50));
		produitRepository.save(new Produit("dell", 2000, 20));
		produitRepository.save(new Produit("acer", 1000, 10));
		produitRepository.save(new Produit("mac", 7000, 90));
		produitRepository.save(new Produit("rabah", 7000, 90));
		
		produitRepository.findAll().forEach(p->System.out.println(p.getDesignation()));
	}
}
