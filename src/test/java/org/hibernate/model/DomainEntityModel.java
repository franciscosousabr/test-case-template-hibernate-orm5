package org.hibernate.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class DomainEntityModel<ID extends DomainEntityId> {

  @EmbeddedId
  @AttributeOverride(name = "value", column = @Column(name = "id"))
  private final ID id;

  protected DomainEntityModel(ID id) {
    this.id = id;
  }

  public ID getId() {
    return id;
  }
}
