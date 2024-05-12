package com.bytedance.pitaya.cep_engine.helper;

/* loaded from: classes7.dex */
public final class FloatProxyHelper extends ProxyHelper {
    public final double data;

    @Override // com.bytedance.pitaya.cep_engine.helper.ProxyHelper
    public boolean isFloat() {
        return true;
    }

    public final double getData() {
        return this.data;
    }

    public FloatProxyHelper(double d) {
        this.data = d;
    }
}
