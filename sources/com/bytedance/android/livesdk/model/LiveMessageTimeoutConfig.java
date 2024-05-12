package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class LiveMessageTimeoutConfig {

    @InterfaceC65349Pkn("http_fetch_monitor_timeout")
    public long httpFetchMonitorTimeout;

    @InterfaceC65349Pkn("http_fetch_request_timeout")
    public long httpFetchRequestTimeout;

    @InterfaceC65349Pkn("ws_connect_timeout")
    public long wsConnectTimeout = 3000;
}
