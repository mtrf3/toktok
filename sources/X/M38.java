package X;

import com.ss.android.ugc.aweme.placediscovery2.model.DiscoverMapResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M38 implements C33Q {
    public final AbstractC72932td<DiscoverMapResponse> LJLIL;
    public final List<C191707fi> LJLILLLLZI;
    public final IJX LJLJI;
    public final C7B4 LJLJJI;

    public M38() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M38)) {
            return false;
        }
        M38 m38 = (M38) obj;
        return o.LJ(this.LJLIL, m38.LJLIL) && o.LJ(this.LJLILLLLZI, m38.LJLILLLLZI) && o.LJ(this.LJLJI, m38.LJLJI) && o.LJ(this.LJLJJI, m38.LJLJJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiscoveryMapState(response=");
        LIZ.append(this.LJLIL);
        LIZ.append(", markerList=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", highLightMarkerModel=");
        LIZ.append(this.LJLJI);
        LIZ.append(", tabChange=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        IJX ijx = this.LJLJI;
        int i = 0;
        if (ijx == null) {
            hashCode = 0;
        } else {
            hashCode = ijx.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        C7B4 c7b4 = this.LJLJJI;
        if (c7b4 != null) {
            i = c7b4.hashCode();
        }
        return i2 + i;
    }

    public /* synthetic */ M38(int i) {
        this(C33X.LIZ, new ArrayList(), null, null);
    }

    public M38(AbstractC72932td<DiscoverMapResponse> response, List<C191707fi> markerList, IJX ijx, C7B4 c7b4) {
        o.LJIIIZ(response, "response");
        o.LJIIIZ(markerList, "markerList");
        this.LJLIL = response;
        this.LJLILLLLZI = markerList;
        this.LJLJI = ijx;
        this.LJLJJI = c7b4;
    }

    public static M38 LIZ(M38 m38, AbstractC72932td response, List markerList, IJX ijx, C7B4 c7b4, int i) {
        if ((i & 1) != 0) {
            response = m38.LJLIL;
        }
        if ((i & 2) != 0) {
            markerList = m38.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            ijx = m38.LJLJI;
        }
        if ((i & 8) != 0) {
            c7b4 = m38.LJLJJI;
        }
        m38.getClass();
        o.LJIIIZ(response, "response");
        o.LJIIIZ(markerList, "markerList");
        return new M38(response, markerList, ijx, c7b4);
    }
}
