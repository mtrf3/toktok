package com.bytedance.pumbaa.common.interfaces;

import X.InterfaceC39565Fft;
import X.InterfaceC39566Ffu;

/* loaded from: classes12.dex */
public interface ILogger {
    void d(String str, String str2, Throwable th);

    void e(String str, String str2, Throwable th);

    void i(String str, String str2, Throwable th);

    boolean isLoggerReady();

    void registerLogCallback(InterfaceC39566Ffu interfaceC39566Ffu);

    void setDebugMode(boolean z);

    void unregisterLogCallback(InterfaceC39566Ffu interfaceC39566Ffu);

    void upload(long j, long j2, String str, InterfaceC39565Fft interfaceC39565Fft);

    void v(String str, String str2, Throwable th);

    void w(String str, String str2, Throwable th);
}
