package com.ss.android.ugc.aweme.comment.model;

/* loaded from: classes13.dex */
public final class CommentImageUploadAuthKt {
    public static final boolean isValid(CommentImageUploadAuth commentImageUploadAuth) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (commentImageUploadAuth == null) {
            return false;
        }
        String accessKey = commentImageUploadAuth.getAccessKey();
        if (accessKey == null || accessKey.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z5 = !z;
        String secretKey = commentImageUploadAuth.getSecretKey();
        if (secretKey == null || secretKey.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z5 & (!z2);
        String sessionToken = commentImageUploadAuth.getSessionToken();
        if (sessionToken == null || sessionToken.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z6 & (!z3);
        if (commentImageUploadAuth.getExpiredTime() != 0) {
            z4 = true;
        }
        return z7 & z4;
    }
}
