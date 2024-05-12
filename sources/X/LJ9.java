package X;

import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJ9 implements InterfaceC57784Mm4 {
    public final LocationRegion LJLIL;

    public LJ9() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LJ9) && o.LJ(this.LJLIL, ((LJ9) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        LocationRegion locationRegion = this.LJLIL;
        if (locationRegion == null) {
            return 0;
        }
        return locationRegion.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CurrentRegion(regionItem=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public LJ9(LocationRegion locationRegion) {
        this.LJLIL = locationRegion;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
