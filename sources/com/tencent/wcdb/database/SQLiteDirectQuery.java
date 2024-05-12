package com.tencent.wcdb.database;

import X.AbstractC84311X7b;

/* loaded from: classes14.dex */
public class SQLiteDirectQuery extends AbstractC84311X7b {
    public static native byte[] nativeGetBlob(long j, int i);

    public static native double nativeGetDouble(long j, int i);

    public static native long nativeGetLong(long j, int i);

    public static native String nativeGetString(long j, int i);

    public static native int nativeGetType(long j, int i);

    public static native int nativeStep(long j, int i);

    @Override // X.AbstractC84311X7b, X.AbstractC84314X7e
    public final void LIZIZ() {
        synchronized (this) {
        }
        super.LIZIZ();
    }
}
