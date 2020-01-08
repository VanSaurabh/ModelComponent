package com.bemychef.bemychefusercomponent.model;

import com.bemychef.basemodel.BaseModel;
import com.bemychef.modelComponent.commonEnum.StatusEnum;

import javax.persistence.*;

@Entity
@Table(name = "bemychef_category")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class UserComponentCategory extends BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String categoryName;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    private String createdBy;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
