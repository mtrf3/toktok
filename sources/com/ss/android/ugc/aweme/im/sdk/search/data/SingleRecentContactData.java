package com.ss.android.ugc.aweme.im.sdk.search.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SingleRecentContactData extends F9E {

    @InterfaceC65349Pkn("business_id")
    public final String businessId;

    @InterfaceC65349Pkn("type")
    public final int type;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.businessId, Integer.valueOf(this.type)};
    }

    public SingleRecentContactData(String businessId, int i) {
        o.LJIIIZ(businessId, "businessId");
        this.businessId = businessId;
        this.type = i;
    }
}
