package dat3.car.dto;

import dat3.car.entity.Reservation;

import java.time.LocalDate;

public class ReservationResponse {
    int Id;
    int carId;
    String brand;
    String model;
    LocalDate reservationDate;

    public ReservationResponse(Reservation reservation) {
        this.Id = reservation.getId();
        this.carId = reservation.getCar().getId();
        this.brand = reservation.getCar().getBrand();
        this.model = reservation.getCar().getModel();
        this.reservationDate = reservation.getRentalDate();
    }
}
