package com.bytedance.android.livesdk.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class AttrUpdateRequestParams extends F9E {

    @InterfaceC65349Pkn("attr_type")
    public Long attrType;

    @InterfaceC65349Pkn("value")
    public Long value;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.attrType;
        Long l2 = this.value;
        return new Object[]{l, l, l2, l2};
    }
}
