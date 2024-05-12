package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes5.dex */
public final class CheckShippingAddressData {

    @InterfaceC65349Pkn("errors")
    public final List<Error> errors;

    @InterfaceC65349Pkn("tips")
    public final List<DisplayTip> tips;

    @InterfaceC65349Pkn("verify_data")
    public final AddressVerifyData verifyData;

    public CheckShippingAddressData(List<Error> list, List<DisplayTip> list2, AddressVerifyData addressVerifyData) {
        this.errors = list;
        this.tips = list2;
        this.verifyData = addressVerifyData;
    }
}
