package com.bytedance.pitaya.api;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes9.dex */
public interface PTYNormalCallback extends ReflectionCall {
    void onResult(boolean z, PTYError pTYError);
}
