package com.ss.android.ugc.aweme.emoji.emojichoose.model;

import X.V0N;

/* loaded from: classes2.dex */
public enum NaviStatusCode {
    SUCCESS,
    INVALID_INPUT,
    INTERNAL_ERROR,
    NEW_USER,
    IN_PROGRESS;

    public static NaviStatusCode valueOf(String str) {
        return (NaviStatusCode) V0N.LJJJ(NaviStatusCode.class, str);
    }
}
