package X;

import com.ss.android.ugc.aweme.ecommercebase.view.PromotionLogo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rbc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69876Rbc {
    public final String LIZ;
    public final List<PromotionLogo> LIZIZ;
    public final boolean LIZJ;

    public C69876Rbc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69876Rbc)) {
            return false;
        }
        C69876Rbc c69876Rbc = (C69876Rbc) obj;
        return o.LJ(this.LIZ, c69876Rbc.LIZ) && o.LJ(this.LIZIZ, c69876Rbc.LIZIZ) && this.LIZJ == c69876Rbc.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        List<PromotionLogo> list = this.LIZIZ;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductInfo(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", promotionLogos=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", darkMode=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C69876Rbc(String title, List list) {
        o.LJIIIZ(title, "title");
        this.LIZ = title;
        this.LIZIZ = list;
        this.LIZJ = false;
    }
}
