package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class HostCheckOtherAudienceMultiGuestPermissionResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes6.dex */
    public static final class Extra {

        @InterfaceC65349Pkn("now")
        public long now;
    }

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("other_permission_info")
        public MultiGuestPermissionInfo otherPermissionInfo;
    }
}
