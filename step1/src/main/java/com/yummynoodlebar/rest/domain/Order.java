package com.yummynoodlebar.rest.domain;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

public class Order {

  private Date dateTimeOfSubmission;
  private Map<String, Integer> items;

  private final UUID key;

  public Order() {
    this.key = UUID.randomUUID();
    this.dateTimeOfSubmission = new Date();
  }

  public Date getDateTimeOfSubmission() {
    return dateTimeOfSubmission;
  }

  public UUID getKey() {
    return key;
  }

  public Map<String, Integer> getItems() {
    return items;
  }

  public void setItems(Map<String, Integer> items) {
    this.items = items;
  }
}
