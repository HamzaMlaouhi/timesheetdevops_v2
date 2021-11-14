package tn.esprit.spring;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.IEntrepriseService;
import java.util.List;







@SpringBootTest
@RunWith(SpringRunner.class)
public class EntrepriseServiceImplTest {
	//comment
	@Autowired IEntrepriseService entservice;
	@Autowired EntrepriseRepository  entrepriserepository;
	@Autowired DepartementRepository  departementrepository;
	Integer idEntreprise;
	
	
	@Test
	public void testAjoutEntreprise(){
		 Entreprise ent=new Entreprise("CHAIMAHICHRI","Chima");
		 int idE=entservice.ajouterEntreprise(ent);
		 assertNotNull(idE);
	}
	


	 

@Test
public void testGetEtrepriseById(){    
    Entreprise ent=entservice.getEntrepriseById(1);
    assertEquals(1, ent.getId());
}

/*
@Test
public void testDeleteEntrepriseById(){
	if(idEntreprise!=null){
		int i = entservice.deleteEntrepriseById(idEntreprise);
		assertEquals(0, i);
		}
		else {
			int i = entservice.deleteEntrepriseById(5);			
			assertEquals(0, i);
			}
}
*/


@Test
public void testGetAllDepartementsNamesByEntreprise() {
	List<String> depNames = entservice.getAllDepartementsNamesByEntreprise(1);
	assertNotNull(depNames);
}

}
