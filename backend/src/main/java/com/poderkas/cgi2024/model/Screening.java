package com.poderkas.cgi2024.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
@Document(value = "Screening")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Screening {
    @Id
    private String id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<List<Integer>> seating;
    private Movie movieScreened;
}
