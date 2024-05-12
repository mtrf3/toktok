package com.bytedance.pitaya.bdcomponentimpl.sword;

import X.C16880lQ;
import com.bytedance.pitaya.thirdcomponent.encrypt.ClientEncrypt;
import com.bytedance.security.Sword.Sword;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class SWordEncryptImpl implements ClientEncrypt {
    @Override // com.bytedance.pitaya.thirdcomponent.encrypt.ClientEncrypt
    public void init() {
        C16880lQ.LLJJJIL("bdsword");
    }

    @Override // com.bytedance.pitaya.thirdcomponent.encrypt.ClientEncrypt
    public byte[] decrypt(byte[] data) {
        o.LJIIJ(data, "data");
        return Sword.clientUnpacked(data, data.length);
    }
}
