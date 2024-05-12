package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C61878OQg;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GetCartRequest {

    @InterfaceC65349Pkn("is_first_screen")
    public final Boolean isFirstScreen;

    @InterfaceC65349Pkn("selected_cart_item_ids")
    public final List<String> selectedCartItemIds;

    @InterfaceC65349Pkn("with_announcement")
    public final Boolean withAnnouncement;

    public GetCartRequest() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCartRequest)) {
            return false;
        }
        GetCartRequest getCartRequest = (GetCartRequest) obj;
        return o.LJ(this.selectedCartItemIds, getCartRequest.selectedCartItemIds) && o.LJ(this.isFirstScreen, getCartRequest.isFirstScreen) && o.LJ(this.withAnnouncement, getCartRequest.withAnnouncement);
    }

    public final int hashCode() {
        List<String> list = this.selectedCartItemIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.isFirstScreen;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.withAnnouncement;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetCartRequest(selectedCartItemIds=");
        LIZ.append(this.selectedCartItemIds);
        LIZ.append(", isFirstScreen=");
        LIZ.append(this.isFirstScreen);
        LIZ.append(", withAnnouncement=");
        return C78920UyC.LIZIZ(LIZ, this.withAnnouncement, ')', LIZ);
    }

    public GetCartRequest(List<String> list, Boolean bool, Boolean bool2) {
        this.selectedCartItemIds = list;
        this.isFirstScreen = bool;
        this.withAnnouncement = bool2;
    }

    public GetCartRequest(List list, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? Boolean.FALSE : bool2);
    }
}
