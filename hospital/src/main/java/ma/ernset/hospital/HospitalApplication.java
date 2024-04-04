package ma.ernset.hospital;

import ma.ernset.hospital.entities.Patient;
import ma.ernset.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"Oussama",new Date(),false,34));
        patientRepository.save(new Patient(null,"meriem",new Date(),false,100));
        patientRepository.save(new Patient(null,"Imane",new Date(),false,200));

    }
}
