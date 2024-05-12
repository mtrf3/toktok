package com.byted.cast.dnssd;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes29.dex */
public class AppleBrowser extends AppleService {
    public native int CreateBrowser(int i, int i2, String str, String str2);

    public AppleBrowser(int i, int i2, String str, String str2, InternalBrowseListener internalBrowseListener) {
        super(internalBrowseListener);
        Logger.d("DNSSD_AppleService", "AppleBrowser");
        ThrowOnErr(CreateBrowser(i, i2, str, str2));
        if (!AppleDNSSD.hasAutoCallbacks) {
            new PthreadThread(this, "Thread-AppleBrowser").start();
        }
    }
}
