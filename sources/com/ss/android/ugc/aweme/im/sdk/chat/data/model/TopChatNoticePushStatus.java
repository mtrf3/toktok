package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.V0N;

/* loaded from: classes2.dex */
public enum TopChatNoticePushStatus {
    PUSH_STATUS_UNKNOWN(0),
    PUSH_STATUS_ON(1),
    PUSH_STATUS_OFF(2);

    public final int status;

    public static TopChatNoticePushStatus valueOf(String str) {
        return (TopChatNoticePushStatus) V0N.LJJJ(TopChatNoticePushStatus.class, str);
    }

    public final int getStatus() {
        return this.status;
    }

    TopChatNoticePushStatus(int i) {
        this.status = i;
    }
}
