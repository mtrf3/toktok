package com.ss.android.ugc.aweme.video.preload.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;

/* loaded from: classes9.dex */
public class EnginePreloaderConfig {

    @InterfaceC65349Pkn("enable_extern_dns")
    public int enableExternDns = 1;

    @InterfaceC65349Pkn("enable_socket_reuse")
    public int enableSocketReuse = 1;

    @InterfaceC65349Pkn("enable_socket_idle_timeout")
    public int enableSocketIdleTimeout = LiveTryModeCountDownThresholdSetting.DEFAULT;
}
