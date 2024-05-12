package com.bytedance.pitaya.api.bean.nativeobj.pty;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes30.dex */
public abstract class PTYNativeObj implements ReflectionCall {
    public abstract long getNativePtr();

    public abstract void releaseNativeObj();

    public final void finalize() {
        releaseNativeObj();
    }
}
