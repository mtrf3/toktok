package com.ss.android.ugc.aweme.bnpl.network;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StatementsDetailRequest extends F9E {

    @InterfaceC65349Pkn("bill_id")
    public final String billId;

    @InterfaceC65349Pkn("cursor")
    public final String cursor;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.billId, this.cursor};
    }

    public StatementsDetailRequest(String billId, String cursor) {
        o.LJIIIZ(billId, "billId");
        o.LJIIIZ(cursor, "cursor");
        this.billId = billId;
        this.cursor = cursor;
    }
}
