package com.bytedance.crash;

/* loaded from: classes12.dex */
public interface IOOMCallback {
    void onCrash(CrashType crashType, Throwable th, Thread thread, long j);
}
