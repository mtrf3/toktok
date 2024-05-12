package com.bytedance.ies.xbridge.base.utils;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class StorageValue extends F9E {

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("value")
    public final String value;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.type, this.value};
    }

    public StorageValue(String type, String value) {
        o.LJIIJ(type, "type");
        o.LJIIJ(value, "value");
        this.type = type;
        this.value = value;
    }
}
