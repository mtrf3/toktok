package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BuyerHasAddressResponse {

    @InterfaceC65349Pkn("has_address")
    public final Boolean hasAddress;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BuyerHasAddressResponse) && o.LJ(this.hasAddress, ((BuyerHasAddressResponse) obj).hasAddress);
    }

    public final int hashCode() {
        Boolean bool = this.hasAddress;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BuyerHasAddressResponse(hasAddress=");
        return C78920UyC.LIZIZ(LIZ, this.hasAddress, ')', LIZ);
    }

    public BuyerHasAddressResponse(Boolean bool) {
        this.hasAddress = bool;
    }
}
