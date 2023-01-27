package com.fc.sns.fixture;

import com.fc.sns.model.entity.PostEntity;
import com.fc.sns.model.entity.UserEntity;

// 테스트용 postEntity
public class PostEntityFixture {

    public static PostEntity get(String userName, Integer postId, Integer userId) {
        UserEntity user = new UserEntity();
        user.setId(userId);
        user.setUserName(userName);

        PostEntity result = new PostEntity();
        result.setUser(user);
        result.setId(postId);

        return result;
    }
}