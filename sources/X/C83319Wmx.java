package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import kotlin.jvm.internal.o;

/* renamed from: X.Wmx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83319Wmx extends AbstractC83320Wmy {
    public final String LIZ;
    public final String LIZIZ;
    public final CutsameDataItem LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83319Wmx)) {
            return false;
        }
        C83319Wmx c83319Wmx = (C83319Wmx) obj;
        return o.LJ(this.LIZ, c83319Wmx.LIZ) && o.LJ(this.LIZIZ, c83319Wmx.LIZIZ) && o.LJ(this.LIZJ, c83319Wmx.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CutsameDataItem cutsameDataItem = this.LIZJ;
        return hashCode2 + (cutsameDataItem != null ? cutsameDataItem.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CoverUIOption(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", imgUrl=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", template=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C83319Wmx(String title, String str, CutsameDataItem cutsameDataItem) {
        o.LJIIIZ(title, "title");
        this.LIZ = title;
        this.LIZIZ = str;
        this.LIZJ = cutsameDataItem;
    }
}
