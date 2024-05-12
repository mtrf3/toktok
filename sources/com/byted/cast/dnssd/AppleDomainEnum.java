package com.byted.cast.dnssd;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes29.dex */
public class AppleDomainEnum extends AppleService {
    public native int BeginEnum(int i, int i2);

    public AppleDomainEnum(int i, int i2, InternalDomainListener internalDomainListener) {
        super(internalDomainListener);
        Logger.d("DNSSD_AppleService", "AppleDomainEnum");
        ThrowOnErr(BeginEnum(i, i2));
        if (!AppleDNSSD.hasAutoCallbacks) {
            new PthreadThread(this, "Thread-AppleDomainEnum").start();
        }
    }
}
