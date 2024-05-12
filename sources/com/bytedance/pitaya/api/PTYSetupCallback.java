package com.bytedance.pitaya.api;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes15.dex */
public interface PTYSetupCallback extends ReflectionCall {
    void onResult(boolean z, PTYError pTYError);
}
