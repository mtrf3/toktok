package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CandInputRequest {

    @InterfaceC65349Pkn("shipping_address")
    public final Address address;

    @InterfaceC65349Pkn("target_item_key")
    public final String itemKey;

    @InterfaceC65349Pkn("address_input_scene")
    public final Integer scene;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandInputRequest)) {
            return false;
        }
        CandInputRequest candInputRequest = (CandInputRequest) obj;
        return o.LJ(this.itemKey, candInputRequest.itemKey) && o.LJ(this.address, candInputRequest.address) && o.LJ(this.scene, candInputRequest.scene);
    }

    public final int hashCode() {
        String str = this.itemKey;
        int hashCode = (this.address.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Integer num = this.scene;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CandInputRequest(itemKey=");
        LIZ.append(this.itemKey);
        LIZ.append(", address=");
        LIZ.append(this.address);
        LIZ.append(", scene=");
        return s0.LIZJ(LIZ, this.scene, ')', LIZ);
    }

    public CandInputRequest(String str, Address address, Integer num) {
        o.LJIIIZ(address, "address");
        this.itemKey = str;
        this.address = address;
        this.scene = num;
    }

    public /* synthetic */ CandInputRequest(String str, Address address, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, address, (i & 4) != 0 ? null : num);
    }
}
