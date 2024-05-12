package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ClaimIncentiveWithAddressRequest extends F9E {

    @InterfaceC65349Pkn("target_address_id")
    public final String addressId;

    @InterfaceC65349Pkn("incentive_record_id")
    public final String recordId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.recordId, this.addressId};
    }

    public ClaimIncentiveWithAddressRequest(String recordId, String addressId) {
        o.LJIIIZ(recordId, "recordId");
        o.LJIIIZ(addressId, "addressId");
        this.recordId = recordId;
        this.addressId = addressId;
    }
}
