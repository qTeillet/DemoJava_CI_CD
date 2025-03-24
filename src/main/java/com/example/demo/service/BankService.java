package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankService {

    /**
     * RG-11515 : Nom du ticket
     * @param amount Le montant à prélever
     * @return
     */
    public ServiceResponseDTO<Float> debit(float amount) {
        // 2300 €
        // Cas : Erreur 789
        if (amount > 2300) {
            return ServiceResponseDTO.buildResponse("789", "Solde insuffisant");
        }
        // Cas : Succès 207
        return ServiceResponseDTO.buildResponseWithData("207", "Prélèvement reussi", 2300 - amount);
    }
}
