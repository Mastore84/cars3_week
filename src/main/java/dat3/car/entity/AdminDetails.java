package dat3.car.entity;

import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/*
In Spring Data JPA, there are several ways to implement inheritance between entities.
MappedSuperclass is one of them.
This is not exactly an inheritance strategy in the same the others you can use, but it's a way to define a base class
that contains common fields and mappings and it's super simple to implement
OBSERVE --> The base class is not an entity by itself and is NEVER used directly in queries.
 */
@MappedSuperclass
public abstract class AdminDetails {
  @CreationTimestamp
  protected LocalDateTime created;
  @UpdateTimestamp
  protected LocalDateTime edited;
}
