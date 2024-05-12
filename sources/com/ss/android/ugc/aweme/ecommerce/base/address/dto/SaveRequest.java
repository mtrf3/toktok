package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SaveRequest {

    @InterfaceC65349Pkn("shipping_address")
    public final Address address;

    @InterfaceC65349Pkn("address_claim_voucher_info")
    public final AddressClaimVoucherInfo addressVoucher;

    @InterfaceC65349Pkn("save_address_mode")
    public final int mode;

    public SaveRequest(Address address, int i, AddressClaimVoucherInfo addressClaimVoucherInfo) {
        o.LJIIIZ(address, "address");
        this.address = address;
        this.mode = i;
        this.addressVoucher = addressClaimVoucherInfo;
    }
}
