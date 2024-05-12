package com.ss.android.ugc.aweme.search.lynx.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class DynamicData extends F9E {

    @InterfaceC65349Pkn("card_type")
    public final int cardType;

    @InterfaceC65349Pkn("dynamic_data")
    public final DynamicPatch dynamicPatch;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.cardType), this.dynamicPatch};
    }

    public DynamicData(int i, DynamicPatch dynamicPatch) {
        o.LJIIIZ(dynamicPatch, "dynamicPatch");
        this.cardType = i;
        this.dynamicPatch = dynamicPatch;
    }

    public /* synthetic */ DynamicData(int i, DynamicPatch dynamicPatch, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, dynamicPatch);
    }
}
