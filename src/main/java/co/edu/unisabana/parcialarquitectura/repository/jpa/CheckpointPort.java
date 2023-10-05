package co.edu.unisabana.parcialarquitectura.repository.jpa;

import co.edu.unisabana.parcialarquitectura.service.model.Checkin;
import co.edu.unisabana.parcialarquitectura.service.model.Checkout;

public interface CheckpointPort {

  void saveCheckout(Checkout checkpoints);

  Checkin findLastCheckin(String driver, String facility);

  void finishCheckin(Checkin checkin);
}