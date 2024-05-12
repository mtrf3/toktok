package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* loaded from: classes14.dex */
public final class MultiGuestReserveResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes14.dex */
    public static final class Extra {

        @InterfaceC65349Pkn("now")
        public long now;
    }

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("perception_info")
        public PerceptionMessage perceptionInfo;

        @InterfaceC65349Pkn("reserve_user_info")
        public AudienceReserveUserInfo reserveUserInfo;
    }
}
