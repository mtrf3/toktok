package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CandDetailPlaceRequest {

    @InterfaceC65349Pkn("autocomplete_address_id")
    public final String autocompleteAddressId;

    @InterfaceC65349Pkn("place_type")
    public final Integer placeType;

    @InterfaceC65349Pkn("session_key")
    public final String sessionKey;

    @InterfaceC65349Pkn("shipping_address")
    public final Address shippingAddress;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandDetailPlaceRequest)) {
            return false;
        }
        CandDetailPlaceRequest candDetailPlaceRequest = (CandDetailPlaceRequest) obj;
        return o.LJ(this.shippingAddress, candDetailPlaceRequest.shippingAddress) && o.LJ(this.sessionKey, candDetailPlaceRequest.sessionKey) && o.LJ(this.autocompleteAddressId, candDetailPlaceRequest.autocompleteAddressId) && o.LJ(this.placeType, candDetailPlaceRequest.placeType);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.autocompleteAddressId, C79062V1e.LJ(this.sessionKey, this.shippingAddress.hashCode() * 31, 31), 31);
        Integer num = this.placeType;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CandDetailPlaceRequest(shippingAddress=");
        LIZ.append(this.shippingAddress);
        LIZ.append(", sessionKey=");
        LIZ.append(this.sessionKey);
        LIZ.append(", autocompleteAddressId=");
        LIZ.append(this.autocompleteAddressId);
        LIZ.append(", placeType=");
        return s0.LIZJ(LIZ, this.placeType, ')', LIZ);
    }

    public CandDetailPlaceRequest(Address shippingAddress, String sessionKey, String autocompleteAddressId, Integer num) {
        o.LJIIIZ(shippingAddress, "shippingAddress");
        o.LJIIIZ(sessionKey, "sessionKey");
        o.LJIIIZ(autocompleteAddressId, "autocompleteAddressId");
        this.shippingAddress = shippingAddress;
        this.sessionKey = sessionKey;
        this.autocompleteAddressId = autocompleteAddressId;
        this.placeType = num;
    }

    public /* synthetic */ CandDetailPlaceRequest(Address address, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(address, str, str2, (i & 8) != 0 ? null : num);
    }
}
