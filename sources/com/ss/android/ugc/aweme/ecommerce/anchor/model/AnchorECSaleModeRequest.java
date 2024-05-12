package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnchorECSaleModeRequest extends F9E {

    @InterfaceC65349Pkn("creator_id")
    public final long creatorId;

    @InterfaceC65349Pkn("product_ids")
    public final List<String> productIds;

    @InterfaceC65349Pkn("source_type")
    public final int type;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.creatorId), Integer.valueOf(this.type), this.productIds};
    }

    public AnchorECSaleModeRequest(long j, int i, List<String> productIds) {
        o.LJIIIZ(productIds, "productIds");
        this.creatorId = j;
        this.type = i;
        this.productIds = productIds;
    }
}
