package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import kotlin.jvm.internal.o;

/* renamed from: X.Xen, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85361Xen implements InterfaceC57784Mm4 {
    public final PoiData LJLIL;
    public final C85359Xel LJLILLLLZI;
    public final boolean LJLJI;

    public C85361Xen() {
        this(null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85361Xen)) {
            return false;
        }
        C85361Xen c85361Xen = (C85361Xen) obj;
        return o.LJ(this.LJLIL, c85361Xen.LJLIL) && o.LJ(this.LJLILLLLZI, c85361Xen.LJLILLLLZI) && this.LJLJI == c85361Xen.LJLJI;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        PoiData poiData = this.LJLIL;
        int hashCode = (poiData == null ? 0 : poiData.hashCode()) * 31;
        C85359Xel c85359Xel = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c85359Xel != null ? c85359Xel.hashCode() : 0)) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiPublishRcmdListCellData(item=");
        LIZ.append(this.LJLIL);
        LIZ.append(", extensionMiscData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", hasHeader=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C85361Xen(PoiData poiData, C85359Xel c85359Xel, boolean z) {
        this.LJLIL = poiData;
        this.LJLILLLLZI = c85359Xel;
        this.LJLJI = z;
    }
}
