package com.ss.android.ugc.aweme.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ReorderVideosRequest extends F9E {

    @InterfaceC65349Pkn("collection_id")
    public final String collectionId;

    @InterfaceC65349Pkn("item_ids")
    public final List<String> itemIds;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.collectionId, this.itemIds};
    }

    public ReorderVideosRequest(String collectionId, List<String> itemIds) {
        o.LJIIIZ(collectionId, "collectionId");
        o.LJIIIZ(itemIds, "itemIds");
        this.collectionId = collectionId;
        this.itemIds = itemIds;
    }
}
