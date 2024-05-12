package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonNotice;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Axt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27941Axt {
    public final List<C27959AyB> LIZ;
    public final java.util.Map<String, Boolean> LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final AddonNotice LJ;
    public final List<String> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27941Axt)) {
            return false;
        }
        C27941Axt c27941Axt = (C27941Axt) obj;
        return o.LJ(this.LIZ, c27941Axt.LIZ) && o.LJ(this.LIZIZ, c27941Axt.LIZIZ) && o.LJ(this.LIZJ, c27941Axt.LIZJ) && o.LJ(this.LIZLLL, c27941Axt.LIZLLL) && o.LJ(this.LJ, c27941Axt.LJ) && o.LJ(this.LJFF, c27941Axt.LJFF);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        java.util.Map<String, Boolean> map = this.LIZIZ;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        AddonNotice addonNotice = this.LJ;
        int hashCode5 = (hashCode4 + (addonNotice == null ? 0 : addonNotice.hashCode())) * 31;
        List<String> list = this.LJFF;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final boolean LIZ() {
        if (this.LIZIZ == null || !(!r0.isEmpty()) || !this.LIZIZ.containsValue(Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddonOrderVO(skuInfos=");
        LIZ.append(this.LIZ);
        LIZ.append(", isSelected=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", addonTitle=");
        LIZ.append(this.LIZJ);
        LIZ.append(", type=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", addOnNotice=");
        LIZ.append(this.LJ);
        LIZ.append(", filterSku=");
        return C1NE.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C27941Axt(List<C27959AyB> list, java.util.Map<String, Boolean> map, String str, Integer num, AddonNotice addonNotice, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = map;
        this.LIZJ = str;
        this.LIZLLL = num;
        this.LJ = addonNotice;
        this.LJFF = list2;
    }
}
