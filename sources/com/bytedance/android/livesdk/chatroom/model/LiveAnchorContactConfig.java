package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class LiveAnchorContactConfig {

    @InterfaceC65349Pkn("enable")
    public int enable;

    public static LiveAnchorContactConfig LIZ() {
        LiveAnchorContactConfig liveAnchorContactConfig = new LiveAnchorContactConfig();
        liveAnchorContactConfig.enable = 0;
        return liveAnchorContactConfig;
    }

    public final Boolean LIZIZ() {
        boolean z = true;
        if (this.enable != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
