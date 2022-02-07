package client;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ClientDTO implements Serializable {
    private UUID id;
    private String firstname;
    private String lastname;
    private long version;
    private String createdBy;
    private String updatedBy;
    private Date createdTime;
    private Date upgradedTime;

    public ClientDTO() {
    }

    public ClientDTO(UUID id, String firstname, String lastname,
                     long version, String createdBy, String updatedBy,
                     Date createdTime, Date upgradedTime) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.version = version;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdTime = createdTime;
        this.upgradedTime = upgradedTime;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpgradedTime() {
        return upgradedTime;
    }

    public void setUpgradedTime(Date upgradedTime) {
        this.upgradedTime = upgradedTime;
    }
}
