package com.ss.android.ugc.aweme.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RemoveVideoRequest extends F9E {

    @InterfaceC65349Pkn("collection_id")
    public final String collectionId;

    @InterfaceC65349Pkn("removed_id")
    public final String removedId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.collectionId, this.removedId};
    }

    public RemoveVideoRequest(String collectionId, String removedId) {
        o.LJIIIZ(collectionId, "collectionId");
        o.LJIIIZ(removedId, "removedId");
        this.collectionId = collectionId;
        this.removedId = removedId;
    }
}
