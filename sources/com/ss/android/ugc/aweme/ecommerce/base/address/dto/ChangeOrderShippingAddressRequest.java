package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C1FJ;
import X.C1FL;
import X.C26760Aeq;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ChangeOrderShippingAddressRequest implements Parcelable {
    public static final Parcelable.Creator<ChangeOrderShippingAddressRequest> CREATOR = new C26760Aeq();

    @InterfaceC65349Pkn("change_addr_order_id")
    public final String changeAddrOrderId;

    @InterfaceC65349Pkn("change_addr_order_type")
    public final Integer changeAddrOrderType;

    @InterfaceC65349Pkn("from_incentive")
    public final Boolean fromIncentive;

    @InterfaceC65349Pkn("incentive_record_id")
    public final String incentiveRecordId;

    @InterfaceC65349Pkn("target_shipping_address")
    public final Address shippingAddress;

    @InterfaceC65349Pkn("target_address_id")
    public final String targetAddressId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.changeAddrOrderType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.changeAddrOrderId);
        out.writeString(this.targetAddressId);
        Boolean bool = this.fromIncentive;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.incentiveRecordId);
        Address address = this.shippingAddress;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i);
        }
    }

    public ChangeOrderShippingAddressRequest(Integer num, String str, String str2, Boolean bool, String str3, Address address) {
        this.changeAddrOrderType = num;
        this.changeAddrOrderId = str;
        this.targetAddressId = str2;
        this.fromIncentive = bool;
        this.incentiveRecordId = str3;
        this.shippingAddress = address;
    }
}
