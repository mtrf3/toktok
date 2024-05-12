package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27001Aij;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShippingTOAddressInfo implements Parcelable {
    public static final Parcelable.Creator<ShippingTOAddressInfo> CREATOR = new C27001Aij();

    @InterfaceC65349Pkn("no_ship_to_addr")
    public final Boolean noShipToAddress;

    @InterfaceC65349Pkn("ship_to_address_brief")
    public final String shipToAddressBrief;

    @InterfaceC65349Pkn("ship_to_button_text")
    public final String shipToButtonText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingTOAddressInfo)) {
            return false;
        }
        ShippingTOAddressInfo shippingTOAddressInfo = (ShippingTOAddressInfo) obj;
        return o.LJ(this.noShipToAddress, shippingTOAddressInfo.noShipToAddress) && o.LJ(this.shipToButtonText, shippingTOAddressInfo.shipToButtonText) && o.LJ(this.shipToAddressBrief, shippingTOAddressInfo.shipToAddressBrief);
    }

    public final int hashCode() {
        Boolean bool = this.noShipToAddress;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.shipToButtonText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shipToAddressBrief;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        Boolean bool = this.noShipToAddress;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
        out.writeString(this.shipToButtonText);
        out.writeString(this.shipToAddressBrief);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShippingTOAddressInfo(noShipToAddress=");
        LIZ.append(this.noShipToAddress);
        LIZ.append(", shipToButtonText=");
        LIZ.append(this.shipToButtonText);
        LIZ.append(", shipToAddressBrief=");
        return q.LIZIZ(LIZ, this.shipToAddressBrief, ')', LIZ);
    }

    public ShippingTOAddressInfo(Boolean bool, String str, String str2) {
        this.noShipToAddress = bool;
        this.shipToButtonText = str;
        this.shipToAddressBrief = str2;
    }
}
