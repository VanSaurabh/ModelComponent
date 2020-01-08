package com.bemychef.bemychefusercomponent.model;

import com.bemychef.basemodel.BaseModel;
import com.bemychef.modelComponent.commonEnum.StatusEnum;

import javax.persistence.*;

@Entity
@Table(name = "bemychef_services")
public class UserComponentServices  extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String imageLocation;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
