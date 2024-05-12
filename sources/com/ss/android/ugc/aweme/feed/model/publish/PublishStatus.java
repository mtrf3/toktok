package com.ss.android.ugc.aweme.feed.model.publish;

import X.V0N;

/* loaded from: classes4.dex */
public enum PublishStatus {
    SUCCESS,
    FAILED,
    CANCEL,
    UPLOADING,
    DEFAULT;

    public static PublishStatus valueOf(String str) {
        return (PublishStatus) V0N.LJJJ(PublishStatus.class, str);
    }
}
