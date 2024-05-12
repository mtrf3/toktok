package com.tencent.wcdb.database;

import X.AbstractC84314X7e;

/* loaded from: classes15.dex */
public class ChunkedCursorWindow extends AbstractC84314X7e {
    public static native void nativeClear(long j);

    public static native long nativeCreate(int i);

    public static native void nativeDispose(long j);

    public static native void nativeEndRow(long j, long j2);

    public static native byte[] nativeGetBlob(long j, int i);

    public static native double nativeGetDouble(long j, int i);

    public static native long nativeGetLong(long j, int i);

    public static native int nativeGetNumChunks(long j);

    public static native long nativeGetRow(long j, int i);

    public static native String nativeGetString(long j, int i);

    public static native int nativeGetType(long j, int i);

    public static native long nativeRemoveChunk(long j, int i);

    public static native boolean nativeSetNumColumns(long j, int i);

    @Override // X.AbstractC84314X7e
    public final void LIZIZ() {
    }

    public final void finalize() {
        super.finalize();
    }
}
