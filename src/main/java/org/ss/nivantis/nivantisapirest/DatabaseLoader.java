package org.ss.nivantis.nivantisapirest;

import org.ss.nivantis.nivantisapirest.dao.*;
import org.ss.nivantis.nivantisapirest.model.Pharmacie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public abstract class DatabaseLoader implements CommandLineRunner {

    private PharmacieRepository pharmacieRepository;
    private AchatRepository achatRepository;
    private ClientRepository clientRepository;
    private DMORepository dmoRepository;
    private ProduitRepository produitRepository;

    @Autowired
    public DatabaseLoader(PharmacieRepository pharmacieRepository,
                          AchatRepository achatRepository,
                          ClientRepository clientRepository,
                          DMORepository dmoRepository,
                          ProduitRepository produitRepository) {
        this.pharmacieRepository = pharmacieRepository;
        this.achatRepository = achatRepository;
        this.clientRepository = clientRepository;
        this.dmoRepository = dmoRepository;
        this.produitRepository = produitRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.pharmacieRepository.save(new Pharmacie("avenue de brocéliande", 3, 44300, "1", "1"));
    }
}
