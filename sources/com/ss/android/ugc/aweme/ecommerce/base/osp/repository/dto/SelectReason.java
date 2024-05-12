package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SelectReason extends F9E {

    @InterfaceC65349Pkn("reason_key")
    public final String reasonKey;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.reasonKey};
    }

    public SelectReason(String reasonKey) {
        o.LJIIIZ(reasonKey, "reasonKey");
        this.reasonKey = reasonKey;
    }
}
