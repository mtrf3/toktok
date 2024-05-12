package com.ss.android.ugc.bytex.pthread.base.convergence.helper;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.InterfaceC74236TBo;
import X.TBT;
import android.os.Looper;

/* loaded from: classes7.dex */
public final class LooperHelper {
    public static final /* synthetic */ InterfaceC74236TBo[] $$delegatedProperties;
    public static final LooperHelper INSTANCE;
    public static final C5H3 sLooperLocal$delegate;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(LooperHelper.class), "sLooperLocal", "getSLooperLocal()Ljava/lang/ThreadLocal;");
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
        INSTANCE = new LooperHelper();
        sLooperLocal$delegate = C221108m2.LIZIZ(LooperHelper$sLooperLocal$2.INSTANCE);
    }

    private final ThreadLocal<Looper> getSLooperLocal() {
        return (ThreadLocal) sLooperLocal$delegate.getValue();
    }

    public final void clearLooper() {
        ThreadLocal<Looper> sLooperLocal;
        try {
            if (Looper.myLooper() == null || (sLooperLocal = getSLooperLocal()) == null) {
                return;
            }
            sLooperLocal.set(null);
        } catch (Throwable unused) {
        }
    }
}
