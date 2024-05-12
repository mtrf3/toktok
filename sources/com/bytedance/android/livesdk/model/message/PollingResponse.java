package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class PollingResponse {

    @InterfaceC65349Pkn("data")
    public List<String> data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    @InterfaceC65349Pkn("internal_ext")
    public String internalExt = "";

    @InterfaceC65349Pkn("status_code")
    public int statusCode;

    /* loaded from: classes17.dex */
    public static final class Extra {

        @InterfaceC65349Pkn("cursor")
        public String cursor = "";

        @InterfaceC65349Pkn("fetch_interval")
        public long fetchInterval;

        @InterfaceC65349Pkn("now")
        public long now;
    }
}
