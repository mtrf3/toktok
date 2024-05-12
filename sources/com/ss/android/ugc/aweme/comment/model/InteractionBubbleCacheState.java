package com.ss.android.ugc.aweme.comment.model;

import X.V0N;

/* loaded from: classes4.dex */
public enum InteractionBubbleCacheState {
    NO_CACHE,
    COMMENT_CACHE,
    LIKE_CACHE,
    ALL_CACHE;

    public static InteractionBubbleCacheState valueOf(String str) {
        return (InteractionBubbleCacheState) V0N.LJJJ(InteractionBubbleCacheState.class, str);
    }
}
