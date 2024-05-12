package com.bytedance.pitaya.api.bean;

import X.V0N;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes7.dex */
public enum PTYApplogEventType implements ReflectionCall {
    NORMAL(0),
    COLD_START(1);

    public final int code;

    public static PTYApplogEventType valueOf(String str) {
        return (PTYApplogEventType) V0N.LJJJ(PTYApplogEventType.class, str);
    }

    public final int getCode() {
        return this.code;
    }

    PTYApplogEventType(int i) {
        this.code = i;
    }
}
