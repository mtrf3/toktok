package X;

import com.ss.android.ugc.aweme.placediscovery.param.PoiDiscoveryLandingPageParams;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.LcW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54644LcW implements Serializable {
    public final PoiDiscoveryLandingPageParams LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C54644LcW() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C54644LcW copy$default(C54644LcW c54644LcW, PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams, int i, Object obj) {
        if ((i & 1) != 0) {
            poiDiscoveryLandingPageParams = c54644LcW.LJLIL;
        }
        return c54644LcW.copy(poiDiscoveryLandingPageParams);
    }

    public final C54644LcW copy(PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams) {
        return new C54644LcW(poiDiscoveryLandingPageParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C54644LcW) && o.LJ(this.LJLIL, ((C54644LcW) obj).LJLIL);
    }

    public int hashCode() {
        PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams = this.LJLIL;
        if (poiDiscoveryLandingPageParams == null) {
            return 0;
        }
        return poiDiscoveryLandingPageParams.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiscoveryLandingHierarchyData(poiDiscoveryLandingPageParams=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final PoiDiscoveryLandingPageParams getPoiDiscoveryLandingPageParams() {
        return this.LJLIL;
    }

    public C54644LcW(PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams) {
        this.LJLIL = poiDiscoveryLandingPageParams;
    }

    public /* synthetic */ C54644LcW(PoiDiscoveryLandingPageParams poiDiscoveryLandingPageParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : poiDiscoveryLandingPageParams);
    }
}
