package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Aqz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27513Aqz {
    public final EntranceBannerInfo LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27513Aqz)) {
            return false;
        }
        C27513Aqz c27513Aqz = (C27513Aqz) obj;
        return o.LJ(this.LIZ, c27513Aqz.LIZ) && o.LJ(this.LIZIZ, c27513Aqz.LIZIZ) && o.LJ(this.LIZJ, c27513Aqz.LIZJ) && o.LJ(this.LIZLLL, c27513Aqz.LIZLLL) && this.LJ == c27513Aqz.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        EntranceBannerInfo entranceBannerInfo = this.LIZ;
        int hashCode = (entranceBannerInfo == null ? 0 : entranceBannerInfo.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromotionResourceBannerVO(bannerInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", buttonText=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", schema=");
        LIZ.append(this.LIZJ);
        LIZ.append(", style=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isShowSplitLine=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public C27513Aqz(EntranceBannerInfo entranceBannerInfo, String str, String str2, Integer num, boolean z) {
        this.LIZ = entranceBannerInfo;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = num;
        this.LJ = z;
    }
}
