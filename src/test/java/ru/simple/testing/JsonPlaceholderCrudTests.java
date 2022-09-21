package ru.simple.testing;

import org.junit.jupiter.api.Test;
import ru.simple.testing.dto.PostDto;
import ru.simple.testing.steps.JsonPlaceholderApiSteps;
import ru.simple.testing.testdata.ExpJsonPlaceholderData;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


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
        PostDto expPostData = ExpJsonPlaceholderData.INSTANCE.getById(1);

        PostDto result = new JsonPlaceholderApiSteps().getPost(1);

        assertThat(result.getUserId(), equalTo(expPostData.getUserId()));
        assertThat(result.getTitle(), equalTo(expPostData.getTitle()));
        assertThat(result.getBody(), equalTo(expPostData.getBody()));
    }

    @Test
    void getPostListTest() {
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
