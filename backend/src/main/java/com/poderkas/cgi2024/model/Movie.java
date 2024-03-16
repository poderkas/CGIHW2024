package com.poderkas.cgi2024.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;
@Document(value = "Movie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    private String id;
    private String Title;
    private String description;
    private Set<String> genres;
    private Integer ageLimit;

    private String language;
    private List<Screening> screeningList;
}
