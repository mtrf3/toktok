package com.ss.ttlivestreamer.core.utils;

import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class JniCommon {
    public static native void nativeAddRef(long j);

    public static native ByteBuffer nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j);

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        try {
            return ByteBuffer.allocateDirect(i);
        } catch (Throwable unused) {
            return null;
        }
    }
}
