package com.example.aws_image_upload.bucket;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BucketName {
    PROFILE_IMAGE("lulchev-image-upload-123");

    private final String bucketName;

}
