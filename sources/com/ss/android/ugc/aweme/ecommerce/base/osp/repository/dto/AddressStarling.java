package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressStarling {

    @InterfaceC65349Pkn("change_address")
    public final BillStarlingText changeAddressStarling;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressStarling) && o.LJ(this.changeAddressStarling, ((AddressStarling) obj).changeAddressStarling);
    }

    public final int hashCode() {
        BillStarlingText billStarlingText = this.changeAddressStarling;
        if (billStarlingText == null) {
            return 0;
        }
        return billStarlingText.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressStarling(changeAddressStarling=");
        LIZ.append(this.changeAddressStarling);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AddressStarling(BillStarlingText billStarlingText) {
        this.changeAddressStarling = billStarlingText;
    }
}
