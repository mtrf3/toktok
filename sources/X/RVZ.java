package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVZ {
    public final boolean LIZ = true;
    public final List<ProductBase> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Boolean LJFF;
    public final java.util.Map<String, String> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RVZ)) {
            return false;
        }
        RVZ rvz = (RVZ) obj;
        return this.LIZ == rvz.LIZ && o.LJ(this.LIZIZ, rvz.LIZIZ) && o.LJ(this.LIZJ, rvz.LIZJ) && o.LJ(this.LIZLLL, rvz.LIZLLL) && o.LJ(this.LJ, rvz.LJ) && o.LJ(this.LJFF, rvz.LJFF) && o.LJ(this.LJI, rvz.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        List<ProductBase> list = this.LIZIZ;
        int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LJFF;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.util.Map<String, String> map = this.LJI;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddonFloatViewVO(show=");
        LIZ.append(this.LIZ);
        LIZ.append(", recommendProducts=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", recommendTitle=");
        LIZ.append(this.LIZJ);
        LIZ.append(", fullVapSchema=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", vapSchema=");
        LIZ.append(this.LJ);
        LIZ.append(", isFullScreen=");
        LIZ.append(this.LJFF);
        LIZ.append(", recommendExtra=");
        return C15890jp.LIZ(LIZ, this.LJI, ')', LIZ);
    }

    public RVZ(List list, String str, String str2, String str3, Boolean bool, java.util.Map map) {
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = bool;
        this.LJI = map;
    }
}
