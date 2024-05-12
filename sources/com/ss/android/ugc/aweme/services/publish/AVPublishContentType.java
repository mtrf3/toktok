package com.ss.android.ugc.aweme.services.publish;

import X.V0N;

/* loaded from: classes8.dex */
public enum AVPublishContentType {
    Video("video"),
    PhotoMovie("video"),
    Photo("photo");

    public final String contentType;

    public static AVPublishContentType valueOf(String str) {
        return (AVPublishContentType) V0N.LJJJ(AVPublishContentType.class, str);
    }

    public final String getContentType() {
        return this.contentType;
    }

    AVPublishContentType(String str) {
        this.contentType = str;
    }
}
