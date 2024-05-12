package com.ss.android.ugc.aweme.compliance.api.services.privacy;

import X.Q7K;

/* loaded from: classes4.dex */
public final class CommentFilterDislikeControl {
    public static final int DEFAULT = 0;
    public static final CommentFilterDislikeControl INSTANCE = new CommentFilterDislikeControl();

    public static final boolean isNewVersion() {
        if (Q7K.LIZIZ("comment_filter_l3_dislike_control", 0) == 0) {
            return false;
        }
        return true;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
