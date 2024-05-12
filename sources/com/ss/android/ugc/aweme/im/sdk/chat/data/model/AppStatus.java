package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.V0N;

/* loaded from: classes2.dex */
public enum AppStatus {
    APP_STATUS_UNKNOWN(0),
    APP_STATUS_NEW_LOGIN(1),
    APP_STATUS_COLD_START(2),
    APP_STATUS_NORMAL(3);

    public final int status;

    public static AppStatus valueOf(String str) {
        return (AppStatus) V0N.LJJJ(AppStatus.class, str);
    }

    public final int getStatus() {
        return this.status;
    }

    AppStatus(int i) {
        this.status = i;
    }
}
