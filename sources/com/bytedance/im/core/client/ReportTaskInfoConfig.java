package com.bytedance.im.core.client;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class ReportTaskInfoConfig implements Serializable {

    @InterfaceC65349Pkn("enable")
    public int enable;

    @InterfaceC65349Pkn("timeout_duration_ms")
    public long timeoutDurationMs = 8000;

    @InterfaceC65349Pkn("execute_too_long_ms")
    public long executeTooLongMs = 8000;

    @InterfaceC65349Pkn("callback_too_long_ms")
    public long callbackTooLongMs = 2000;
}
