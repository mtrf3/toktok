package com.bytedance.pitaya.cep_engine.helper;

/* loaded from: classes7.dex */
public final class IntProxyHelper extends ProxyHelper {
    public final long data;

    @Override // com.bytedance.pitaya.cep_engine.helper.ProxyHelper
    public boolean isInt() {
        return true;
    }

    public final long getData() {
        return this.data;
    }

    public IntProxyHelper(long j) {
        this.data = j;
    }
}
