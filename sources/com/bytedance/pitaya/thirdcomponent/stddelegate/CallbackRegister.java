package com.bytedance.pitaya.thirdcomponent.stddelegate;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes30.dex */
public interface CallbackRegister<CallbackID, Callback extends ReflectionCall> extends ReflectionCall {
    void registerCallback(CallbackID callbackid, Callback callback);
}
