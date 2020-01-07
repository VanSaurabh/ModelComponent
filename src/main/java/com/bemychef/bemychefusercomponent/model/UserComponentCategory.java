package com.bemychef.bemychefusercomponent.model;

import com.bemychef.modelComponent.commonEnum.StatusEnum;

import javax.persistence.*;

@Entity
@Table(name = "bemychef_category")
public class UserComponentCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String categoryName;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

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
