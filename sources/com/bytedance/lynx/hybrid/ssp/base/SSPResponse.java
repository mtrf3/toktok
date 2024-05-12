package com.bytedance.lynx.hybrid.ssp.base;

import X.InterfaceC65349Pkn;
import com.google.gson.m;
import java.util.Map;

/* loaded from: classes7.dex */
public final class SSPResponse {
    public static final /* synthetic */ int LIZJ = 0;
    public m LIZ;
    public Map<String, Data> LIZIZ;

    /* loaded from: classes7.dex */
    public static final class Data {

        @InterfaceC65349Pkn("expire")
        public long expire;

        @InterfaceC65349Pkn("logID")
        public String logID = "";

        @InterfaceC65349Pkn("matchType")
        public int matchType;

        @InterfaceC65349Pkn("preconnectList")
        public PreConnect[] preConnectList;

        @InterfaceC65349Pkn("prefetchList")
        public Prefetch[] prefetchList;

        @InterfaceC65349Pkn("subpagePreconnectList")
        public PreConnect[] subpagePreConnectList;

        @InterfaceC65349Pkn("validityPeriod")
        public int validityPeriod;
    }

    /* loaded from: classes7.dex */
    public static final class PreConnect {

        @InterfaceC65349Pkn("domain")
        public String domain;

        @InterfaceC65349Pkn("level")
        public int level = 1;

        @InterfaceC65349Pkn("protocol")
        public String protocol;
    }

    /* loaded from: classes7.dex */
    public static final class Prefetch {

        @InterfaceC65349Pkn("reqHeader")
        public m reqHeader;

        @InterfaceC65349Pkn("url")
        public String url;

        @InterfaceC65349Pkn("level")
        public Integer level = 1;

        @InterfaceC65349Pkn("isMainFrame")
        public Boolean isMainFrame = Boolean.FALSE;
    }
}
