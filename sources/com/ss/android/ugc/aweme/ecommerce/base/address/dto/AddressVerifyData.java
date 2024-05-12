package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressVerifyData {

    @InterfaceC65349Pkn("shipping_address")
    public final Address shippingAddress;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("tip_info")
    public final AddressTipInfo tipInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressVerifyData)) {
            return false;
        }
        AddressVerifyData addressVerifyData = (AddressVerifyData) obj;
        return o.LJ(this.status, addressVerifyData.status) && o.LJ(this.tipInfo, addressVerifyData.tipInfo) && o.LJ(this.shippingAddress, addressVerifyData.shippingAddress);
    }

    public final int hashCode() {
        Integer num = this.status;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        AddressTipInfo addressTipInfo = this.tipInfo;
        int hashCode2 = (hashCode + (addressTipInfo == null ? 0 : addressTipInfo.hashCode())) * 31;
        Address address = this.shippingAddress;
        return hashCode2 + (address != null ? address.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressVerifyData(status=");
        LIZ.append(this.status);
        LIZ.append(", tipInfo=");
        LIZ.append(this.tipInfo);
        LIZ.append(", shippingAddress=");
        LIZ.append(this.shippingAddress);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AddressVerifyData(Integer num, AddressTipInfo addressTipInfo, Address address) {
        this.status = num;
        this.tipInfo = addressTipInfo;
        this.shippingAddress = address;
    }
}
