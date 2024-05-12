package com.lynx.tasm.base;

/* loaded from: classes17.dex */
public class LynxNativeMemoryTracer {
    public static native void nativeStartTracing(int i);

    public static native void nativeStopTracing();

    public static native void nativeWriteRecordsToFile(String str);
}
