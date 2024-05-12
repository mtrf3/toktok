package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class PermissionLevelBannerStatsResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public PermissionLevelBannerStatusExtra extra;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("current_value")
        public int currentValue;

        @InterfaceC65349Pkn("status")
        public int status;

        @InterfaceC65349Pkn("text_key")
        public String textKey = "";

        @InterfaceC65349Pkn("threshold_value")
        public int thresholdValue;
    }
}
