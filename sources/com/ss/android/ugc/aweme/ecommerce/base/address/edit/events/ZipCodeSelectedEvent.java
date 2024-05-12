package com.ss.android.ugc.aweme.ecommerce.base.address.edit.events;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ZipCodeSelectedEvent extends F9E {

    @InterfaceC65349Pkn("zipcode")
    public final String zipcode;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.zipcode};
    }

    public ZipCodeSelectedEvent(String zipcode) {
        o.LJIIIZ(zipcode, "zipcode");
        this.zipcode = zipcode;
    }
}
