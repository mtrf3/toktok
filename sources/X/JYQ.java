package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JYQ {
    public final InterfaceC88471Ynr<SearchMixFeed, String, Boolean> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JYQ)) {
            return false;
        }
        JYQ jyq = (JYQ) obj;
        return o.LJ(this.LIZ, jyq.LIZ) && this.LIZIZ == jyq.LIZIZ && this.LIZJ == jyq.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + (this.LIZJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BrandNewMeta(finder=");
        LIZ.append(this.LIZ);
        LIZ.append(", duplicateRemoval=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isHotspotScene=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JYQ(InterfaceC88471Ynr<? super SearchMixFeed, ? super String, Boolean> finder, boolean z, boolean z2) {
        o.LJIIIZ(finder, "finder");
        this.LIZ = finder;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
