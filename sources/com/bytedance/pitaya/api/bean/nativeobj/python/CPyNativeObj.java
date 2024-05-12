package com.bytedance.pitaya.api.bean.nativeobj.python;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes30.dex */
public abstract class CPyNativeObj implements ReflectionCall {
    public final long pyInterpreter;

    public abstract long getNativePtr();

    public final long getPyInterpreter() {
        return this.pyInterpreter;
    }

    public CPyNativeObj(long j) {
        this.pyInterpreter = j;
        if (j != 0) {
        } else {
            throw new IllegalArgumentException("You must create a CPython Java wrapper with an InterpreterState");
        }
    }
}
