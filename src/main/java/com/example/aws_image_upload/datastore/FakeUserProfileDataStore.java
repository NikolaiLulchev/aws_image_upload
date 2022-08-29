package com.example.aws_image_upload.datastore;

import com.example.aws_image_upload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(
                UUID.fromString("83c7c605-093e-41ac-9219-93c4898321e5"),
                "lulchev", null));
        USER_PROFILES.add(new UserProfile(
                UUID.fromString("68c1cd03-b5a3-4402-8119-295ece4fa9b7"),
                "danchev", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
