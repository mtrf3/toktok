package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.7dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190537dp implements InterfaceC87283bg {
    public final PoiBookingInfo LJLIL;
    public final C191187es LJLILLLLZI;

    public C190537dp() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190537dp)) {
            return false;
        }
        C190537dp c190537dp = (C190537dp) obj;
        return o.LJ(this.LJLIL, c190537dp.LJLIL) && o.LJ(this.LJLILLLLZI, c190537dp.LJLILLLLZI);
    }

    public final int hashCode() {
        PoiBookingInfo poiBookingInfo = this.LJLIL;
        int hashCode = (poiBookingInfo == null ? 0 : poiBookingInfo.hashCode()) * 31;
        C191187es c191187es = this.LJLILLLLZI;
        return hashCode + (c191187es != null ? c191187es.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiDetailReserveHierarchyData(bookingInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(", poiReserveTableMobData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C190537dp(PoiBookingInfo poiBookingInfo, C191187es c191187es) {
        this.LJLIL = poiBookingInfo;
        this.LJLILLLLZI = c191187es;
    }
}
