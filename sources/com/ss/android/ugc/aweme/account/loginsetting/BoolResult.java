package com.ss.android.ugc.aweme.account.loginsetting;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class BoolResult extends F9E {

    @InterfaceC65349Pkn("result")
    public final boolean result;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.result)};
    }

    public BoolResult(boolean z) {
        this.result = z;
    }
}
