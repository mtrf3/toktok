package com.benchmark.bytemonitor.nativePort;

import X.C16880lQ;
import com.benchmark.bytemonitor.BatteryMonitor;

/* loaded from: classes.dex */
public class ByteMonitorPort {
    public static native void nativeInit(BatteryMonitor batteryMonitor);

    static {
        C16880lQ.LLJJJIL("bytemonitor");
    }
}
