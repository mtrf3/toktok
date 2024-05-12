package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressClaimVoucherInfo {

    @InterfaceC65349Pkn("address_source")
    public final Integer addressSource;

    @InterfaceC65349Pkn("address_voucher_type")
    public final Integer addressVoucherType;

    @InterfaceC65349Pkn("voucher_type_id")
    public final String voucherTypeId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressClaimVoucherInfo)) {
            return false;
        }
        AddressClaimVoucherInfo addressClaimVoucherInfo = (AddressClaimVoucherInfo) obj;
        return o.LJ(this.voucherTypeId, addressClaimVoucherInfo.voucherTypeId) && o.LJ(this.addressSource, addressClaimVoucherInfo.addressSource) && o.LJ(this.addressVoucherType, addressClaimVoucherInfo.addressVoucherType);
    }

    public final int hashCode() {
        String str = this.voucherTypeId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.addressSource;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.addressVoucherType;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressClaimVoucherInfo(voucherTypeId=");
        LIZ.append(this.voucherTypeId);
        LIZ.append(", addressSource=");
        LIZ.append(this.addressSource);
        LIZ.append(", addressVoucherType=");
        return s0.LIZJ(LIZ, this.addressVoucherType, ')', LIZ);
    }

    public AddressClaimVoucherInfo(String str, Integer num, Integer num2) {
        this.voucherTypeId = str;
        this.addressSource = num;
        this.addressVoucherType = num2;
    }
}
