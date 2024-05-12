package com.bytedance.android.livesdk.wallet;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class NoticesRequestParams extends F9E {

    @InterfaceC65349Pkn("currency")
    public String currency = "";

    @InterfaceC65349Pkn("view_name")
    public String viewName;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.viewName;
        return new Object[]{str, str};
    }
}
