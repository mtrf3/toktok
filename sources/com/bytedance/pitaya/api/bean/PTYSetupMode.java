package com.bytedance.pitaya.api.bean;

import X.V0N;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes7.dex */
public enum PTYSetupMode implements ReflectionCall {
    NONE(0),
    Lite(1),
    Normal(2);

    public final int code;

    public static PTYSetupMode valueOf(String str) {
        return (PTYSetupMode) V0N.LJJJ(PTYSetupMode.class, str);
    }

    public final int getCode() {
        return this.code;
    }

    PTYSetupMode(int i) {
        this.code = i;
    }
}
