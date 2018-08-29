package com.lamjavaweb.dto;

public class RoleDTO extends AbstractDTO {

    private static final long serialVersionUID = -4350364039560997708L;

    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
