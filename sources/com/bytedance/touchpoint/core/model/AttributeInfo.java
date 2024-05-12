package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class AttributeInfo extends F9E {

    @InterfaceC65349Pkn("need_login_gate")
    public Boolean needLoginGate;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.needLoginGate};
    }

    public AttributeInfo(Boolean bool) {
        this.needLoginGate = bool;
    }
}
