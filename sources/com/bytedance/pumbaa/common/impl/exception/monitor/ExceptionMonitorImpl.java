package com.bytedance.pumbaa.common.impl.exception.monitor;

import X.C64241PJd;
import X.C64246PJi;
import X.PJZ;
import X.V1M;
import com.bytedance.crash.Npth;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ExceptionMonitorImpl implements IExceptionMonitor {
    @Override // com.bytedance.pumbaa.common.interfaces.IExceptionMonitor
    public final void setDebugMode(boolean z) {
        ConfigManager configManager = Npth.getConfigManager();
        o.LJIIIIZZ(configManager, "Npth.getConfigManager()");
        configManager.setDebugMode(z);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IExceptionMonitor
    public final void monitorThrowable(Throwable throwable, String message, Map<String, String> data) {
        o.LJIIIZ(throwable, "throwable");
        o.LJIIIZ(message, "message");
        o.LJIIIZ(data, "data");
        PJZ.LIZJ(throwable, message, data);
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IExceptionMonitor
    public final void monitorNativeException(String nativeStack, String javaStack, String threadName, String message, Map<String, String> data) {
        o.LJIIIZ(nativeStack, "nativeStack");
        o.LJIIIZ(javaStack, "javaStack");
        o.LJIIIZ(threadName, "threadName");
        o.LJIIIZ(message, "message");
        o.LJIIIZ(data, "data");
        try {
            V1M.LJJJIL(0, null, message, threadName, nativeStack, javaStack, "EnsureNotReachHere", null, null, data, true, null);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.pumbaa.common.interfaces.IExceptionMonitor
    public final void monitorThrowable(String javaStack, String message, String logType, String ensureType, String threadName, boolean z, Map<String, String> customData, Map<String, String> filterData) {
        o.LJIIIZ(javaStack, "javaStack");
        o.LJIIIZ(message, "message");
        o.LJIIIZ(logType, "logType");
        o.LJIIIZ(ensureType, "ensureType");
        o.LJIIIZ(threadName, "threadName");
        o.LJIIIZ(customData, "customData");
        o.LJIIIZ(filterData, "filterData");
        C64246PJi LJJIFFI = C64246PJi.LJJIFFI(new StackTraceElement(ExceptionMonitorImpl.class.getName(), "", "", 0), javaStack, message, threadName, z, ensureType, logType);
        for (Map.Entry<String, String> entry : customData.entrySet()) {
            LJJIFFI.LIZIZ(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : filterData.entrySet()) {
            LJJIFFI.LJFF(entry2.getKey(), entry2.getValue());
        }
        C64241PJd.LIZIZ(LJJIFFI);
    }
}
