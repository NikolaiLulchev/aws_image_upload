package com.example.aws_image_upload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;


public class UserProfile {

    private UUID userProfileId;
    private String username;
    private String UserProfileImageLink;

    public UserProfile(UUID userProfileId, String username, String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.username = username;
        UserProfileImageLink = userProfileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public UserProfile setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserProfile setUsername(String username) {
        this.username = username;
        return this;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(UserProfileImageLink);
    }

    public UserProfile setUserProfileImageLink(String userProfileImageLink) {
        UserProfileImageLink = userProfileImageLink;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId, that.userProfileId) &&
               Objects.equals(username, that.username) &&
               Objects.equals(UserProfileImageLink, that.UserProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, username, UserProfileImageLink);
    }
}
