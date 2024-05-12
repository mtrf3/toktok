package com.bytedance.pitaya.log;

import X.InterfaceC93293aOX;
import android.content.Context;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes30.dex */
public interface PitayaLogPrinter extends ReflectionCall {
    void d(String str, String str2);

    void e(String str, String str2);

    long getNativeImpl();

    void i(String str, String str2);

    void init(Context context);

    void uploadLogToServer(long j, long j2, String str, InterfaceC93293aOX interfaceC93293aOX);

    void w(String str, String str2);
}
