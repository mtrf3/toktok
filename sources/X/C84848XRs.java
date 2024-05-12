package X;

import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi;
import kotlin.jvm.internal.o;

/* renamed from: X.XRs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84848XRs implements C33Q {
    public final PoiDiscoveryApi.PoiDiscoveryCardListResponse LJLIL;

    public C84848XRs() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C84848XRs) && o.LJ(this.LJLIL, ((C84848XRs) obj).LJLIL);
    }

    public final int hashCode() {
        PoiDiscoveryApi.PoiDiscoveryCardListResponse poiDiscoveryCardListResponse = this.LJLIL;
        if (poiDiscoveryCardListResponse == null) {
            return 0;
        }
        return poiDiscoveryCardListResponse.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiDetailDiscoveryState(response=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C84848XRs(PoiDiscoveryApi.PoiDiscoveryCardListResponse poiDiscoveryCardListResponse) {
        this.LJLIL = poiDiscoveryCardListResponse;
    }
}
