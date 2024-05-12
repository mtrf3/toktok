package com.bytedance.pitaya.api.feature.store;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes15.dex */
public interface PTYFeatureChangeCallback extends ReflectionCall {
    void onChange(String str, String str2, String str3, String str4);
}
