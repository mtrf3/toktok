package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Apw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27448Apw {
    public final Integer LIZ;
    public final String LIZIZ;
    public final EntranceBannerInfo LIZJ;
    public final HashMap<String, Object> LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27448Apw)) {
            return false;
        }
        C27448Apw c27448Apw = (C27448Apw) obj;
        return o.LJ(this.LIZ, c27448Apw.LIZ) && o.LJ(this.LIZIZ, c27448Apw.LIZIZ) && o.LJ(this.LIZJ, c27448Apw.LIZJ) && o.LJ(this.LIZLLL, c27448Apw.LIZLLL) && this.LJ == c27448Apw.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EntranceBannerInfo entranceBannerInfo = this.LIZJ;
        int hashCode3 = (this.LIZLLL.hashCode() + ((hashCode2 + (entranceBannerInfo != null ? entranceBannerInfo.hashCode() : 0)) * 31)) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromotionEntranceVO(style=");
        LIZ.append(this.LIZ);
        LIZ.append(", schema=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bannerInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", daInfo=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isShowSplitLine=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C27448Apw(Integer num, String str, EntranceBannerInfo entranceBannerInfo, HashMap<String, Object> hashMap, boolean z) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = entranceBannerInfo;
        this.LIZLLL = hashMap;
        this.LJ = z;
    }
}
