package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.WM7;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CheckShippingAddressRequest {

    @InterfaceC65349Pkn("shipping_address")
    public final Address address;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final Integer scene;

    public CheckShippingAddressRequest(Address address, Integer num) {
        o.LJIIIZ(address, "address");
        this.address = address;
        this.scene = num;
    }
}
