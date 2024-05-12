package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SelectDistrictEvent extends F9E {

    @InterfaceC65349Pkn("regions")
    public final List<Region> regions;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.regions};
    }

    public SelectDistrictEvent(List<Region> regions) {
        o.LJIIIZ(regions, "regions");
        this.regions = regions;
    }
}
