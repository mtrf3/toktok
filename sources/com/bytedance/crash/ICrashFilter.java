package com.bytedance.crash;

/* loaded from: classes12.dex */
public interface ICrashFilter {
    boolean onJavaCrashFilter(Throwable th, Thread thread);

    boolean onNativeCrashFilter(String str, String str2);
}
