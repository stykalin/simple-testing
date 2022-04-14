package ru.simple.testing;

import org.junit.jupiter.api.Test;
import ru.simple.testing.dto.PostDto;
import ru.simple.testing.steps.JsonPlaceholderApiSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static ru.simple.testing.testdata.ExpJsonPlaceholderData.expPostDto;


public class JsonPlaceholderCrudTests {

    @Test
    void createPostTest() {
        PostDto dtoForCreate = new PostDto(22, 189, "Test title", "Test body");
        PostDto result = new JsonPlaceholderApiSteps().createPost(dtoForCreate);

        assertThat(result.getId(), equalTo(dtoForCreate.getId()));
        assertThat(result.getUserId(), equalTo(dtoForCreate.getUserId()));
        assertThat(result.getTitle(), equalTo(dtoForCreate.getTitle()));
        assertThat(result.getBody(), equalTo(dtoForCreate.getBody()));
    }

    @Test
    void getPostTest() {
        PostDto result = new JsonPlaceholderApiSteps().getPost(1);

        assertThat(result.getUserId(), equalTo(expPostDto.getUserId()));
        assertThat(result.getTitle(), equalTo(expPostDto.getTitle()));
        assertThat(result.getBody(), equalTo(expPostDto.getBody()));
    }

    @Test
    void getPostPageTest() {
        //TODO
    }

    @Test
    public void updatePostTest() {
        //TODO
    }


    @Test
    public void deletePostTest() {
        //TODO
    }
}
