package com.ss.android.ugc.aweme.app.api;

import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public class RequestLog {

    @InterfaceC65349Pkn("other")
    public Other other;

    @InterfaceC65349Pkn("timing")
    public Timing timing;

    /* loaded from: classes9.dex */
    public static class DetailedDuration {

        @InterfaceC65349Pkn("body_recv")
        public String bodyRecv;

        @InterfaceC65349Pkn("dns")
        public String dns;

        @InterfaceC65349Pkn("inner")
        public String inner;

        @InterfaceC65349Pkn("rtt")
        public String rtt;

        @InterfaceC65349Pkn("send")
        public String send;

        @InterfaceC65349Pkn("ssl")
        public String ssl;

        @InterfaceC65349Pkn("tcp")
        public String tcp;

        @InterfaceC65349Pkn("ttfb")
        public String ttfb;
    }

    /* loaded from: classes9.dex */
    public static class Other {

        @InterfaceC65349Pkn("libcore")
        public String libcore;
    }

    /* loaded from: classes9.dex */
    public static class Timing {

        @InterfaceC65349Pkn("detailed_duration")
        public DetailedDuration detailedDuration;
    }
}
