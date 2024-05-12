package com.ss.android.ugc.aweme.editpost;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes8.dex */
public final class BizExpiration extends F9E {

    @InterfaceC65349Pkn("biz_type")
    public final int bizType;

    @InterfaceC65349Pkn("expiration_day")
    public final int expirationDay;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.bizType), Integer.valueOf(this.expirationDay)};
    }

    public BizExpiration(int i, int i2) {
        this.bizType = i;
        this.expirationDay = i2;
    }
}
