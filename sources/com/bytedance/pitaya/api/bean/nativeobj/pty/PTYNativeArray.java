package com.bytedance.pitaya.api.bean.nativeobj.pty;

import X.C93260aO0;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes30.dex */
public final class PTYNativeArray extends PTYNativeObj {
    public static final C93260aO0 Companion = new C93260aO0();
    public final long ptr;
    public final int size;

    public static final PTYNativeArray fromJSONArray(JSONArray jSONArray) {
        Companion.getClass();
        return C93260aO0.LIZ(jSONArray);
    }

    private final native void nativeAppendArray(long j, long j2);

    private final native void nativeAppendBool(boolean z, long j);

    private final native void nativeAppendDict(long j, long j2);

    private final native void nativeAppendDouble(double d, long j);

    private final native void nativeAppendFloat(float f, long j);

    private final native void nativeAppendLong(long j, long j2);

    private final native void nativeAppendNull(long j);

    private final native void nativeAppendStr(String str, long j);

    public static final native long nativeCreateArray(int i);

    public static final native void nativeReleaseArray(long j);

    public final void appendNull() {
        nativeAppendNull$default(this, 0L, 1, null);
    }

    @Override // com.bytedance.pitaya.api.bean.nativeobj.pty.PTYNativeObj
    public void releaseNativeObj() {
        C93260aO0 c93260aO0 = Companion;
        long j = this.ptr;
        c93260aO0.getClass();
        nativeReleaseArray(j);
    }

    @Override // com.bytedance.pitaya.api.bean.nativeobj.pty.PTYNativeObj
    public long getNativePtr() {
        return this.ptr;
    }

    public PTYNativeArray(int i) {
        this.size = i;
        Companion.getClass();
        this.ptr = nativeCreateArray(i);
    }

    public final void append(PTYNativeArray a) {
        o.LJIIJ(a, "a");
        nativeAppendArray$default(this, a.getNativePtr(), 0L, 2, null);
    }

    public final void append(PTYNativeDict d) {
        o.LJIIJ(d, "d");
        nativeAppendDict$default(this, d.getNativePtr(), 0L, 2, null);
    }

    public final void append(String s) {
        o.LJIIJ(s, "s");
        nativeAppendStr$default(this, s, 0L, 2, null);
    }

    public final void append(double d) {
        nativeAppendDouble$default(this, d, 0L, 2, null);
    }

    public final void append(float f) {
        nativeAppendFloat$default(this, f, 0L, 2, null);
    }

    public final void append(long j) {
        nativeAppendLong$default(this, j, 0L, 2, null);
    }

    public final void append(boolean z) {
        nativeAppendBool$default(this, z, 0L, 2, null);
    }

    public static /* synthetic */ void nativeAppendNull$default(PTYNativeArray pTYNativeArray, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pTYNativeArray.ptr;
        }
        pTYNativeArray.nativeAppendNull(j);
    }

    public static /* synthetic */ void nativeAppendArray$default(PTYNativeArray pTYNativeArray, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = pTYNativeArray.ptr;
        }
        pTYNativeArray.nativeAppendArray(j, j2);
    }

    public static /* synthetic */ void nativeAppendBool$default(PTYNativeArray pTYNativeArray, boolean z, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = pTYNativeArray.ptr;
        }
        pTYNativeArray.nativeAppendBool(z, j);
    }

    public static /* synthetic */ void nativeAppendDict$default(PTYNativeArray pTYNativeArray, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = pTYNativeArray.ptr;
        }
        pTYNativeArray.nativeAppendDict(j, j2);
    }

    public static /* synthetic */ void nativeAppendDouble$default(PTYNativeArray pTYNativeArray, double d, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = pTYNativeArray.ptr;
        }
        pTYNativeArray.nativeAppendDouble(d, j);
    }

    public static /* synthetic */ void nativeAppendFloat$default(PTYNativeArray pTYNativeArray, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = pTYNativeArray.ptr;
        }
        pTYNativeArray.nativeAppendFloat(f, j);
    }

    public static /* synthetic */ void nativeAppendLong$default(PTYNativeArray pTYNativeArray, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = pTYNativeArray.ptr;
        }
        pTYNativeArray.nativeAppendLong(j, j2);
    }

    public static /* synthetic */ void nativeAppendStr$default(PTYNativeArray pTYNativeArray, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = pTYNativeArray.ptr;
        }
        pTYNativeArray.nativeAppendStr(str, j);
    }
}
