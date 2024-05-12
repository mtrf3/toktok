package com.bytedance.pitaya.api.bean.nativeobj.python;

import X.C93262aO2;
import com.bytedance.pitaya.api.bean.PTYClass;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes30.dex */
public final class CPyNativeArray extends CPyNativeObj {
    public static final C93262aO2 Companion = new C93262aO2();
    public final int listSize;
    public final long ptr;

    public static final CPyNativeArray fromJSONArray(JSONArray jSONArray, long j, boolean z) {
        Companion.getClass();
        return C93262aO2.LIZ(jSONArray, j, z);
    }

    private final native void nativeAppendArray(long j, int i, long j2);

    private final native void nativeAppendBool(boolean z, int i, long j);

    private final native void nativeAppendDict(long j, int i, long j2);

    private final native void nativeAppendDouble(double d, int i, long j);

    private final native void nativeAppendFloat(float f, int i, long j);

    private final native void nativeAppendLong(long j, int i, long j2);

    private final native void nativeAppendNull(int i, long j);

    private final native void nativeAppendPTYClass(PTYClass pTYClass, int i, boolean z, long j);

    private final native void nativeAppendStr(String str, int i, long j);

    public static final native long nativeCreateArray(int i, long j);

    @Override // com.bytedance.pitaya.api.bean.nativeobj.python.CPyNativeObj
    public long getNativePtr() {
        return this.ptr;
    }

    public final void appendNull(int i) {
        nativeAppendNull$default(this, i, 0L, 2, null);
    }

    public CPyNativeArray(int i, long j) {
        super(j);
        this.listSize = i;
        Companion.getClass();
        this.ptr = nativeCreateArray(i, j);
    }

    public final void append(CPyNativeArray a, int i) {
        o.LJIIJ(a, "a");
        nativeAppendArray$default(this, a.getNativePtr(), i, 0L, 4, null);
    }

    public final void append(CPyNativeDict d, int i) {
        o.LJIIJ(d, "d");
        nativeAppendDict$default(this, d.getNativePtr(), i, 0L, 4, null);
    }

    public final void append(String s, int i) {
        o.LJIIJ(s, "s");
        nativeAppendStr$default(this, s, i, 0L, 4, null);
    }

    public final void append(double d, int i) {
        nativeAppendDouble$default(this, d, i, 0L, 4, null);
    }

    public final void append(float f, int i) {
        nativeAppendFloat$default(this, f, i, 0L, 4, null);
    }

    public final void append(long j, int i) {
        nativeAppendLong$default(this, j, i, 0L, 4, null);
    }

    public final void append(boolean z, int i) {
        nativeAppendBool$default(this, z, i, 0L, 4, null);
    }

    public final void append(PTYClass clz, int i, boolean z) {
        o.LJIIJ(clz, "clz");
        nativeAppendPTYClass$default(this, clz, i, z, 0L, 8, null);
    }

    public static /* synthetic */ void nativeAppendNull$default(CPyNativeArray cPyNativeArray, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = cPyNativeArray.ptr;
        }
        cPyNativeArray.nativeAppendNull(i, j);
    }

    public static /* synthetic */ void nativeAppendArray$default(CPyNativeArray cPyNativeArray, long j, int i, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = cPyNativeArray.ptr;
        }
        cPyNativeArray.nativeAppendArray(j, i, j2);
    }

    public static /* synthetic */ void nativeAppendBool$default(CPyNativeArray cPyNativeArray, boolean z, int i, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = cPyNativeArray.ptr;
        }
        cPyNativeArray.nativeAppendBool(z, i, j);
    }

    public static /* synthetic */ void nativeAppendDict$default(CPyNativeArray cPyNativeArray, long j, int i, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = cPyNativeArray.ptr;
        }
        cPyNativeArray.nativeAppendDict(j, i, j2);
    }

    public static /* synthetic */ void nativeAppendDouble$default(CPyNativeArray cPyNativeArray, double d, int i, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = cPyNativeArray.ptr;
        }
        cPyNativeArray.nativeAppendDouble(d, i, j);
    }

    public static /* synthetic */ void nativeAppendFloat$default(CPyNativeArray cPyNativeArray, float f, int i, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = cPyNativeArray.ptr;
        }
        cPyNativeArray.nativeAppendFloat(f, i, j);
    }

    public static /* synthetic */ void nativeAppendLong$default(CPyNativeArray cPyNativeArray, long j, int i, long j2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = cPyNativeArray.ptr;
        }
        cPyNativeArray.nativeAppendLong(j, i, j2);
    }

    public static /* synthetic */ void nativeAppendStr$default(CPyNativeArray cPyNativeArray, String str, int i, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = cPyNativeArray.ptr;
        }
        cPyNativeArray.nativeAppendStr(str, i, j);
    }

    public static /* synthetic */ void nativeAppendPTYClass$default(CPyNativeArray cPyNativeArray, PTYClass pTYClass, int i, boolean z, long j, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            j = cPyNativeArray.ptr;
        }
        cPyNativeArray.nativeAppendPTYClass(pTYClass, i, z, j);
    }
}
