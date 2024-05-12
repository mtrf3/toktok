package com.bytedance.pitaya.cep_engine.helper;

/* loaded from: classes7.dex */
public final class BooleanProxyHelper extends ProxyHelper {
    public final boolean data;

    @Override // com.bytedance.pitaya.cep_engine.helper.ProxyHelper
    public boolean isBoolean() {
        return true;
    }

    public final boolean getData() {
        return this.data;
    }

    public BooleanProxyHelper(boolean z) {
        this.data = z;
    }
}
