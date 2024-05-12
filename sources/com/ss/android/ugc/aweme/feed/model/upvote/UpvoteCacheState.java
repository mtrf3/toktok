package com.ss.android.ugc.aweme.feed.model.upvote;

import X.V0N;

/* loaded from: classes4.dex */
public enum UpvoteCacheState {
    PRE_PUBLISH,
    PRE_REMOVE,
    PUBLISH_FAILED;

    public static UpvoteCacheState valueOf(String str) {
        return (UpvoteCacheState) V0N.LJJJ(UpvoteCacheState.class, str);
    }
}
