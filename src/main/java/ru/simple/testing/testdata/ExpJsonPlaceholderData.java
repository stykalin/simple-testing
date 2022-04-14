package ru.simple.testing.testdata;

import lombok.experimental.UtilityClass;
import ru.simple.testing.dto.PostDto;

@UtilityClass
public class ExpJsonPlaceholderData {

    public static PostDto expPostDto = new PostDto(
            1,
            1,
            "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
            "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
    );

    public static PostDto expPostInPageDto = new PostDto(
            5,
            48,
            "ut voluptatem illum ea doloribus itaque eos",
            "voluptates quo voluptatem facilis iure occaecati\nvel assumenda rerum officia et\nillum perspiciatis ab deleniti\nlaudantium repellat ad ut et autem reprehenderit");
}
