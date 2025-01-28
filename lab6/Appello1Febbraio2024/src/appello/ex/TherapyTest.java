package appello.ex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/*
 * Implementare l'interfaccia Pharmacy che realizza il concetto di una farmacia che deve gestire un insieme di terapie per un insieme di pazienti.
 * 
 * La terapia è definita come una sequenza di farmaci (Medication) a cui è associato il dosaggio.
 * Diversi metodi sono documentati nell'interfaccia Therapy, con i quali è possibile aggiungere un farmaco,
 * definirne il dosaggio, e rimuoverlo, nonché un insieme di metodi per ispezionare la terapia.
 * In particolare:
 * - il dosaggio associato a un farmaco, è pari a: 
 *   "dosaggio per chilo definito per lo specifico farmaco" * "peso del paziente"
 * - quando si calcola il dosaggio del farmaco, va verificato che i dati del paziente, in particolare peso e altezza, siano corretti.
 *   Si stabilisce che valori di BMI superiori a 35 sono associati a un inserimento dei dati sbagliato.
 * 
 * La farmacia deve poter registrare nuove pazienti, con la loro terapia associata,
 * e definire quali sono i farmaci da comprare, considerate le terapie che i pazienti registrati devono ricevere.
 *  
 * La buona progettazione della soluzione, utilizzando patterns che portino a codice succinto 
 * che evita ripetizioni concorre al raggiungimento del punteggio pieno, così come l'utlizzo di meccanismi
 * avanzati quali lambda e stream.
 * 
 */


public class TherapyTest {
	/*
	private Pharmacy pharmacy;
    private Medication medA;
    private Medication medB;
    private Medication medC;
    private Patient john;
    private Patient alice;
    private Patient bob;

    @Before
    public void setUp() {
    	pharmacy = new PharmacyImpl();
        medA = new Medication("MedA", 100.0);
        medB = new Medication("MedB", 10.0);
        medC = new Medication("MedC", 5.0);
        john = new Patient("John", 70, 70.0, 1.75);
        alice = new Patient("Alice", 74, 350.0, 1.60);
        bob = new Patient("Bob", 60, 80.0, 1.80);
    }

    @Test
    public void testAddMedication() {
        Therapy therapy = new TherapyImpl();
        therapy.addMedication(medA, john);
        assertEquals(1, therapy.getMedications().size());
    }

    @Test
    public void testAddDuplicateMedication() {
        Therapy therapy = new TherapyImpl();
        therapy.addMedication(medA, john);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            therapy.addMedication(medA, john);
        });

        assertEquals("Duplicate medication or patient data may contain errors", exception.getMessage());
    }
    
    @Test
    public void testWrongData() {
        Therapy therapy = new TherapyImpl();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            therapy.addMedication(medA, alice);
        });

        assertEquals("Duplicate medication or patient data may contain errors", exception.getMessage());
    }

    @Test
    public void testRemoveMedication() {
        Therapy therapy = new TherapyImpl();
        therapy.addMedication(medA, john);
        therapy.addMedication(medB, john);
        assertEquals(2, therapy.getMedications().size());
        
        therapy.removeMedication("MedA");
        assertEquals(1, therapy.getMedications().size());
        assertTrue(therapy.isMedicationPresent(medB));
    }
    
    @Test
    public void testComputeBMI() {
        Patient patient = new Patient("John", 30, 70.0, 1.75);
        assertEquals(22.857, patient.computeBMI(), 0.001);
    }
    
    @Test
    public void testComputeDosagePerKilo() {
        Therapy therapy = new TherapyImpl();
        therapy.addMedication(medC, john);
        
        // Get the actual dosage from the therapy
        double actualDosage = therapy.getDosageForMedication("MedC");

        // Assert that the computed dosage matches the expected dosage
        assertEquals(350.0, actualDosage, 0.001);
    }
    
    @Test
    public void testRegisterPatientAndMedicationsToBuy() {
    	
    	Therapy therapyJohn = new TherapyImpl();
    	Therapy therapyBob = new TherapyImpl();
    	therapyJohn.addMedication(medA, john);
    	therapyJohn.addMedication(medB, john);
    	therapyBob.addMedication(medA, bob);
    	therapyBob.addMedication(medC, bob);
        
        // Register patients with their therapies
        pharmacy.registerPatient(john,therapyJohn);
        pharmacy.registerPatient(bob, therapyBob);

        // Get medications to buy for the entire pharmacy
        Set<String> medicationsToBuy = pharmacy.getMedicationsToBuy();

        // Verify that the medications to buy match the expected set
        assertTrue(medicationsToBuy.contains("MedA"));
        assertTrue(medicationsToBuy.contains("MedB"));
        assertTrue(medicationsToBuy.contains("MedC"));
        assertEquals(3, medicationsToBuy.size());
    }
    */
}

