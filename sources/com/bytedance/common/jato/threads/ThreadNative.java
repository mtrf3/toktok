package com.bytedance.common.jato.threads;

/* loaded from: classes2.dex */
public class ThreadNative {
    public static native ThreadInfo[] nativeGetAllThreadInfo(boolean z);

    public static native int[] nativeGetThreadStats(int i);

    public static native int nativeGetThreadTid(Thread thread);

    public static native boolean nativeResumeThread(int i);

    public static native boolean nativeResumeThreadByName(String str);

    public static native boolean nativeSuspendThread(int i);

    public static native boolean nativeSuspendThreadByName(String str);
}
