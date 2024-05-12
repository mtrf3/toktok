package com.ss.android.ugc.aweme.im.sdk.common.controller.appsettings;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class IMConversationPaginationConfig extends F9E {

    @InterfaceC65349Pkn("pagination_count")
    public final int paginationCount;

    @InterfaceC65349Pkn("pre_load_count")
    public final int preLoadCount;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.preLoadCount), Integer.valueOf(this.paginationCount)};
    }

    public IMConversationPaginationConfig(int i, int i2) {
        this.preLoadCount = i;
        this.paginationCount = i2;
    }
}
