package com.bytedance.pitaya.api.bean.nativeobj.python;

import X.C93263aO3;
import com.bytedance.pitaya.api.bean.PTYClass;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class CPyNativeDict extends CPyNativeObj {
    public static final C93263aO3 Companion = new C93263aO3();
    public final long ptr;

    public static final CPyNativeDict fromJSONObject(JSONObject jSONObject, long j, boolean z) {
        Companion.getClass();
        return C93263aO3.LIZ(jSONObject, j, z);
    }

    public static final native long nativeCreateDict(long j);

    private final native void nativeSetArray(String str, long j, long j2);

    private final native void nativeSetBool(String str, boolean z, long j);

    private final native void nativeSetClass(String str, PTYClass pTYClass, boolean z, long j);

    private final native void nativeSetDict(String str, long j, long j2);

    private final native void nativeSetDouble(String str, double d, long j);

    private final native void nativeSetFloat(String str, float f, long j);

    private final native void nativeSetLong(String str, long j, long j2);

    private final native void nativeSetNull(String str, long j);

    private final native void nativeSetStr(String str, String str2, long j);

    @Override // com.bytedance.pitaya.api.bean.nativeobj.python.CPyNativeObj
    public long getNativePtr() {
        return this.ptr;
    }

    public CPyNativeDict(long j) {
        super(j);
        Companion.getClass();
        this.ptr = nativeCreateDict(j);
    }

    public final void setNull(String key) {
        o.LJIIJ(key, "key");
        nativeSetNull$default(this, key, 0L, 2, null);
    }

    public final void set(String key, CPyNativeArray value) {
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        nativeSetArray$default(this, key, value.getNativePtr(), 0L, 4, null);
    }

    public final void set(String key, CPyNativeDict value) {
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

    public final void set(String key, PTYClass value, boolean z) {
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        nativeSetClass$default(this, key, value, z, 0L, 8, null);
    }

    public static /* synthetic */ void nativeSetNull$default(CPyNativeDict cPyNativeDict, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = cPyNativeDict.ptr;
        }
        cPyNativeDict.nativeSetNull(str, j);
    }

    public static /* synthetic */ void nativeSetArray$default(CPyNativeDict cPyNativeDict, String str, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = cPyNativeDict.ptr;
        }
        cPyNativeDict.nativeSetArray(str, j, j2);
    }

    public static /* synthetic */ void nativeSetBool$default(CPyNativeDict cPyNativeDict, String str, boolean z, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = cPyNativeDict.ptr;
        }
        cPyNativeDict.nativeSetBool(str, z, j);
    }

    public static /* synthetic */ void nativeSetDict$default(CPyNativeDict cPyNativeDict, String str, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = cPyNativeDict.ptr;
        }
        cPyNativeDict.nativeSetDict(str, j, j2);
    }

    public static /* synthetic */ void nativeSetDouble$default(CPyNativeDict cPyNativeDict, String str, double d, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = cPyNativeDict.ptr;
        }
        cPyNativeDict.nativeSetDouble(str, d, j);
    }

    public static /* synthetic */ void nativeSetFloat$default(CPyNativeDict cPyNativeDict, String str, float f, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = cPyNativeDict.ptr;
        }
        cPyNativeDict.nativeSetFloat(str, f, j);
    }

    public static /* synthetic */ void nativeSetLong$default(CPyNativeDict cPyNativeDict, String str, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = cPyNativeDict.ptr;
        }
        cPyNativeDict.nativeSetLong(str, j, j2);
    }

    public static /* synthetic */ void nativeSetStr$default(CPyNativeDict cPyNativeDict, String str, String str2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = cPyNativeDict.ptr;
        }
        cPyNativeDict.nativeSetStr(str, str2, j);
    }

    public static /* synthetic */ void nativeSetClass$default(CPyNativeDict cPyNativeDict, String str, PTYClass pTYClass, boolean z, long j, int i, Object obj) {
        if ((i & 8) != 0) {
            j = cPyNativeDict.ptr;
        }
        cPyNativeDict.nativeSetClass(str, pTYClass, z, j);
    }
}
