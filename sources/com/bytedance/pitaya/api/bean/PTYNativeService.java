package com.bytedance.pitaya.api.bean;

import X.V0N;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes7.dex */
public enum PTYNativeService implements ReflectionCall {
    Normal,
    Porn;

    public static PTYNativeService valueOf(String str) {
        return (PTYNativeService) V0N.LJJJ(PTYNativeService.class, str);
    }
}
