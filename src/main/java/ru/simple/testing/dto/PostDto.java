package ru.simple.testing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.simple.testing.testdata.Identifiable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto implements Identifiable {

    private Integer userId;
    private Integer id;
    private String title;
    private String body;

}
