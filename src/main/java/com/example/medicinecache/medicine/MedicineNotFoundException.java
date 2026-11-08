package com.example.medicinecache.medicine;

public class MedicineNotFoundException extends RuntimeException {

    public MedicineNotFoundException(Long id) {
        super("Không tìm thấy thuốc với id: " + id);
    }
}
