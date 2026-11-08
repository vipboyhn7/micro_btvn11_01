package com.example.medicinecache.config;

import java.math.BigDecimal;

import com.example.medicinecache.medicine.Medicine;
import com.example.medicinecache.medicine.MedicineRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner seedMedicines(MedicineRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Medicine(
                        "Paracetamol 500mg",
                        "DHG Pharma",
                        "Thuốc giảm đau, hạ sốt",
                        new BigDecimal("12000"),
                        100));
                repository.save(new Medicine(
                        "Vitamin C 500mg",
                        "Traphaco",
                        "Bổ sung vitamin C",
                        new BigDecimal("35000"),
                        75));
            }
        };
    }
}
