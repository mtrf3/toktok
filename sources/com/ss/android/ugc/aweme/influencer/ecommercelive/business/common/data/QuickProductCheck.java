package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QuickProductCheck extends F9E {

    @InterfaceC65349Pkn("can_continue")
    public final boolean available;

    @InterfaceC65349Pkn("block_reason")
    public final String blockReason;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.available), this.blockReason};
    }

    public QuickProductCheck(boolean z, String blockReason) {
        o.LJIIIZ(blockReason, "blockReason");
        this.available = z;
        this.blockReason = blockReason;
    }

    public /* synthetic */ QuickProductCheck(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, str);
    }
}
