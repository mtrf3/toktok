package com.ss.android.ugc.aweme.ecommercelive.business.audience.api;

import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RefreshShortTouchRequestBody {

    @InterfaceC65349Pkn("author_id")
    public final String authorId;

    @InterfaceC65349Pkn("refresh_items")
    public final List<String> refreshItems;

    @InterfaceC65349Pkn("room_id")
    public final String roomId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshShortTouchRequestBody)) {
            return false;
        }
        RefreshShortTouchRequestBody refreshShortTouchRequestBody = (RefreshShortTouchRequestBody) obj;
        return o.LJ(this.roomId, refreshShortTouchRequestBody.roomId) && o.LJ(this.authorId, refreshShortTouchRequestBody.authorId) && o.LJ(this.refreshItems, refreshShortTouchRequestBody.refreshItems);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.authorId, this.roomId.hashCode() * 31, 31);
        List<String> list = this.refreshItems;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RefreshShortTouchRequestBody(roomId=");
        LIZ.append(this.roomId);
        LIZ.append(", authorId=");
        LIZ.append(this.authorId);
        LIZ.append(", refreshItems=");
        return C1NE.LIZIZ(LIZ, this.refreshItems, ')', LIZ);
    }

    public RefreshShortTouchRequestBody(String roomId, String authorId, List<String> list) {
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        this.roomId = roomId;
        this.authorId = authorId;
        this.refreshItems = list;
    }
}
