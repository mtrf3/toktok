package com.bytedance.pitaya.api.bean.nativeobj.pty;

import X.C93261aO1;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class PTYNativeDict extends PTYNativeObj {
    public static final C93261aO1 Companion = new C93261aO1();
    public final long ptr;
    public final int size;

    public static final PTYNativeDict fromJSONObject(JSONObject jSONObject) {
        Companion.getClass();
        return C93261aO1.LIZ(jSONObject);
    }

    public static final native long nativeCreateDict(int i);

    public static final native void nativeReleaseDict(long j);

    private final native void nativeSetArray(String str, long j, long j2);

    private final native void nativeSetBool(String str, boolean z, long j);

    private final native void nativeSetDict(String str, long j, long j2);

    private final native void nativeSetDouble(String str, double d, long j);

    private final native void nativeSetFloat(String str, float f, long j);

    private final native void nativeSetLong(String str, long j, long j2);

    private final native void nativeSetNull(String str, long j);

    private final native void nativeSetStr(String str, String str2, long j);

    private final native String nativeToString(long j);

    public String toString() {
        return nativeToString$default(this, 0L, 1, null);
    }

    @Override // com.bytedance.pitaya.api.bean.nativeobj.pty.PTYNativeObj
    public void releaseNativeObj() {
        C93261aO1 c93261aO1 = Companion;
        long j = this.ptr;
        c93261aO1.getClass();
        nativeReleaseDict(j);
    }

    @Override // com.bytedance.pitaya.api.bean.nativeobj.pty.PTYNativeObj
    public long getNativePtr() {
        return this.ptr;
    }

    public PTYNativeDict(int i) {
        this.size = i;
        Companion.getClass();
        this.ptr = nativeCreateDict(i);
    }

    public final void setNull(String key) {
        o.LJIIJ(key, "key");
        nativeSetNull$default(this, key, 0L, 2, null);
    }

    public final void set(String key, PTYNativeArray value) {
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        nativeSetArray$default(this, key, value.getNativePtr(), 0L, 4, null);
    }

    public final void set(String key, PTYNativeDict value) {
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        nativeSetDict$default(this, key, value.getNativePtr(), 0L, 4, null);
    }

    public final void set(String key, String value) {
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        nativeSetStr$default(this, key, value, 0L, 4, null);
    }

    public final void set(String key, double d) {
        o.LJIIJ(key, "key");
        nativeSetDouble$default(this, key, d, 0L, 4, null);
    }

    public final void set(String key, float f) {
        o.LJIIJ(key, "key");
        nativeSetFloat$default(this, key, f, 0L, 4, null);
    }

    public final void set(String key, long j) {
        o.LJIIJ(key, "key");
        nativeSetLong$default(this, key, j, 0L, 4, null);
    }

    public final void set(String key, boolean z) {
        o.LJIIJ(key, "key");
        nativeSetBool$default(this, key, z, 0L, 4, null);
    }

    public static /* synthetic */ String nativeToString$default(PTYNativeDict pTYNativeDict, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pTYNativeDict.ptr;
        }
        return pTYNativeDict.nativeToString(j);
    }

    public static /* synthetic */ void nativeSetNull$default(PTYNativeDict pTYNativeDict, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = pTYNativeDict.ptr;
        }
        pTYNativeDict.nativeSetNull(str, j);
    }

    public static /* synthetic */ void nativeSetArray$default(PTYNativeDict pTYNativeDict, String str, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = pTYNativeDict.ptr;
        }
        pTYNativeDict.nativeSetArray(str, j, j2);
    }

    public static /* synthetic */ void nativeSetBool$default(PTYNativeDict pTYNativeDict, String str, boolean z, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = pTYNativeDict.ptr;
        }
        pTYNativeDict.nativeSetBool(str, z, j);
    }

    public static /* synthetic */ void nativeSetDict$default(PTYNativeDict pTYNativeDict, String str, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = pTYNativeDict.ptr;
        }
        pTYNativeDict.nativeSetDict(str, j, j2);
    }

    public static /* synthetic */ void nativeSetDouble$default(PTYNativeDict pTYNativeDict, String str, double d, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = pTYNativeDict.ptr;
        }
        pTYNativeDict.nativeSetDouble(str, d, j);
    }

    public static /* synthetic */ void nativeSetFloat$default(PTYNativeDict pTYNativeDict, String str, float f, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = pTYNativeDict.ptr;
        }
        pTYNativeDict.nativeSetFloat(str, f, j);
    }

    public static /* synthetic */ void nativeSetLong$default(PTYNativeDict pTYNativeDict, String str, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = pTYNativeDict.ptr;
        }
        pTYNativeDict.nativeSetLong(str, j, j2);
    }

    public static /* synthetic */ void nativeSetStr$default(PTYNativeDict pTYNativeDict, String str, String str2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = pTYNativeDict.ptr;
        }
        pTYNativeDict.nativeSetStr(str, str2, j);
    }
}
