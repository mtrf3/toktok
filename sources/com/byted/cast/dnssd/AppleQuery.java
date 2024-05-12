package com.byted.cast.dnssd;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes29.dex */
public class AppleQuery extends AppleService {
    public native int CreateQuery(int i, int i2, String str, int i3, int i4);

    public void finalize() {
        Logger.d("DNSSD_AppleService", "AppleQuery.finalize");
        super.finalize();
    }

    public AppleQuery(int i, int i2, String str, int i3, int i4, InternalQueryListener internalQueryListener) {
        super(internalQueryListener);
        Logger.d("DNSSD_AppleService", "AppleQuery");
        ThrowOnErr(CreateQuery(i, i2, str, i3, i4));
        if (!AppleDNSSD.hasAutoCallbacks) {
            new PthreadThread(this, "Thread-QueryApple").start();
        }
    }
}
