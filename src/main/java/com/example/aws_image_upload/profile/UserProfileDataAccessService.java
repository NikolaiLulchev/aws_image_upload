package com.example.aws_image_upload.profile;

import com.example.aws_image_upload.datastore.FakeUserProfileDataStore;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final FakeUserProfileDataStore fakeUserProfileDataStore;


    public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileDataStore) {
        this.fakeUserProfileDataStore = fakeUserProfileDataStore;
    }

    List<UserProfile> getUserProfiles(){
        return fakeUserProfileDataStore.getUserProfiles();
    }
}
