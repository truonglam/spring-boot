package com.lamjavaweb.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "new")
public class NewEntity implements Serializable {

    private static final long serialVersionUID = -1156525449534782155L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String shortDescription;

    @Column
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }
}
