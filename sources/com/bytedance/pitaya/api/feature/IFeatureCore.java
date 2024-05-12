package com.bytedance.pitaya.api.feature;

import X.InterfaceC55385LoT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes10.dex */
public interface IFeatureCore extends ReflectionCall {
    void ResetRunEventCache(String str);

    InterfaceC55385LoT createFeatureSchema(String str);

    IKVStore createInMemoryKVStore(String str);

    IKVStore createKVStore(String str);

    String getAid();
}
