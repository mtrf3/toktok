package com.byted.cast.dnssd;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes29.dex */
public class AppleResolver extends AppleService {
    public native int CreateResolver(int i, int i2, String str, String str2, String str3);

    public AppleResolver(int i, int i2, String str, String str2, String str3, InternalResolveListener internalResolveListener) {
        super(internalResolveListener);
        Logger.d("DNSSD_AppleService", "AppleResolver");
        ThrowOnErr(CreateResolver(i, i2, str, str2, str3));
        if (!AppleDNSSD.hasAutoCallbacks) {
            new PthreadThread(this, "Thread-AppleResolver").start();
        }
    }
}
