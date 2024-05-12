package X;

import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.poi.PoiData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xe4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85316Xe4 implements InterfaceC57784Mm4 {
    public final PoiData LJLIL;
    public final List<Position> LJLILLLLZI;
    public final String LJLJI;
    public final C85317Xe5 LJLJJI;
    public final Boolean LJLJJL;

    public C85316Xe4() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85316Xe4)) {
            return false;
        }
        C85316Xe4 c85316Xe4 = (C85316Xe4) obj;
        return o.LJ(this.LJLIL, c85316Xe4.LJLIL) && o.LJ(this.LJLILLLLZI, c85316Xe4.LJLILLLLZI) && o.LJ(this.LJLJI, c85316Xe4.LJLJI) && o.LJ(this.LJLJJI, c85316Xe4.LJLJJI) && o.LJ(this.LJLJJL, c85316Xe4.LJLJJL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        PoiData poiData = this.LJLIL;
        int hashCode = (poiData == null ? 0 : poiData.hashCode()) * 31;
        List<Position> list = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LJLJI;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C85317Xe5 c85317Xe5 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (c85317Xe5 == null ? 0 : c85317Xe5.hashCode())) * 31;
        Boolean bool = this.LJLJJL;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiSearchItem(poiItem=");
        LIZ.append(this.LJLIL);
        LIZ.append(", positions=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", logId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", extras=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isCacheSearch=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C85316Xe4(PoiData poiData, List<? extends Position> list, String str, C85317Xe5 c85317Xe5, Boolean bool) {
        this.LJLIL = poiData;
        this.LJLILLLLZI = list;
        this.LJLJI = str;
        this.LJLJJI = c85317Xe5;
        this.LJLJJL = bool;
    }
}
