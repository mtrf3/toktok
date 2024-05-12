package com.bytedance.pitaya.cep_engine.helper;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StrProxyHelper extends ProxyHelper {
    public final String data;

    @Override // com.bytedance.pitaya.cep_engine.helper.ProxyHelper
    public boolean isString() {
        return true;
    }

    public final String getData() {
        return this.data;
    }

    public StrProxyHelper(String data) {
        o.LJIIIZ(data, "data");
        this.data = data;
    }
}
