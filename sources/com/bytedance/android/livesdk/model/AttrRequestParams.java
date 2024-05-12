package com.bytedance.android.livesdk.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class AttrRequestParams extends F9E {

    @InterfaceC65349Pkn("attr_types")
    public String attrTypes;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.attrTypes;
        return new Object[]{str, str};
    }
}
