package com.bytedance.crash;

/* loaded from: classes12.dex */
public interface ICrashCallback {
    void onCrash(CrashType crashType, String str, Thread thread);
}
