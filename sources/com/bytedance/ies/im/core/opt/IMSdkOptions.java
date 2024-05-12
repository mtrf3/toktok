package com.bytedance.ies.im.core.opt;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;

/* loaded from: classes2.dex */
public final class IMSdkOptions {

    @InterfaceC65349Pkn("http_control")
    public int httpControl;

    @InterfaceC65349Pkn("http_max_retry")
    public int httpMaxRetry;

    @InterfaceC65349Pkn("is_open")
    public boolean isOpen;

    @InterfaceC65349Pkn("time_out_mills")
    public int timeOutMills;

    @InterfaceC65349Pkn("retry_interval")
    public int interval = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;

    @InterfaceC65349Pkn("ws_retry_times")
    public int retryTimes = 3;

    @InterfaceC65349Pkn("http_retry_interval")
    public int httpRetryInterval = LiveNetAdaptiveHurryTimeSetting.DEFAULT;

    @InterfaceC65349Pkn("protect_timeout")
    public long httpProtectTimeout = 30000;
}
