package com.example.medicinecache.medicine;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MedicineServiceTest {

    @Mock
    private MedicineRepository repository;

    @InjectMocks
    private MedicineService service;

    @Test
    void findByIdReturnsMedicineFromRepository() {
        Medicine medicine = new Medicine(
                "Paracetamol 500mg",
                "DHG Pharma",
                "Thuốc giảm đau, hạ sốt",
                new BigDecimal("12000"),
                100);
        when(repository.findById(1L)).thenReturn(Optional.of(medicine));

        assertThat(service.findById(1L)).isSameAs(medicine);
        verify(repository, times(1)).findById(1L);
    }
}
