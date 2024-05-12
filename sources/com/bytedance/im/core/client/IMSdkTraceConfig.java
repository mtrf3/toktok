package com.bytedance.im.core.client;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class IMSdkTraceConfig implements Serializable {
    public static final IMSdkTraceConfig DEFAULT = new IMSdkTraceConfig();

    @InterfaceC65349Pkn("enable_crash_in_debug")
    public boolean enableCrash;

    @InterfaceC65349Pkn("enable_network_trace")
    public boolean enableNetworkTrace;

    @InterfaceC65349Pkn("log_cmd")
    public boolean logCmdUsage;
}
