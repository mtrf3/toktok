package com.bytedance.pitaya.thirdcomponent.encrypt;

import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes30.dex */
public interface ClientEncrypt extends ReflectionCall {
    byte[] decrypt(byte[] bArr);

    void init();
}
