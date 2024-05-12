package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import defpackage.t1;

/* loaded from: classes14.dex */
public final class GuestMicCameraManageResponse extends F9E {

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

        @InterfaceC65349Pkn("expiration_time")
        public long expirationTime;

        @InterfaceC65349Pkn("rateLimit")
        public boolean ratelimit;

        public final String toString() {
            return t1.LIZIZ(0, 2, "ResponseData{", '}');
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        ResponseData responseData = this.data;
        return new Object[]{responseData, responseData};
    }
}
