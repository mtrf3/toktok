package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiBookingInfo implements Serializable {

    @InterfaceC65349Pkn("providers")
    public final List<PoiBookingProviderInfo> providers;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PoiBookingInfo copy$default(PoiBookingInfo poiBookingInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = poiBookingInfo.providers;
        }
        return poiBookingInfo.copy(list);
    }

    public final PoiBookingInfo copy(List<PoiBookingProviderInfo> list) {
        return new PoiBookingInfo(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PoiBookingInfo) && o.LJ(this.providers, ((PoiBookingInfo) obj).providers);
    }

    public int hashCode() {
        List<PoiBookingProviderInfo> list = this.providers;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiBookingInfo(providers=");
        return C1NE.LIZIZ(LIZ, this.providers, ')', LIZ);
    }

    public final List<PoiBookingProviderInfo> getProviders() {
        return this.providers;
    }

    public PoiBookingInfo(List<PoiBookingProviderInfo> list) {
        this.providers = list;
    }
}
