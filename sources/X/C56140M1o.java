package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import kotlin.jvm.internal.o;

/* renamed from: X.M1o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56140M1o {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final java.util.Map<String, Object> LIZLLL;
    public final C56142M1q LJ;
    public final ReachCfg LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56140M1o)) {
            return false;
        }
        C56140M1o c56140M1o = (C56140M1o) obj;
        return o.LJ(this.LIZ, c56140M1o.LIZ) && o.LJ(this.LIZIZ, c56140M1o.LIZIZ) && o.LJ(this.LIZJ, c56140M1o.LIZJ) && o.LJ(this.LIZLLL, c56140M1o.LIZLLL) && o.LJ(this.LJ, c56140M1o.LJ) && o.LJ(this.LJFF, c56140M1o.LJFF);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcomVideoGuideConfig(guideText=");
        LIZ.append(this.LIZ);
        LIZ.append(", buttonText=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", scrollText=");
        LIZ.append(this.LIZJ);
        LIZ.append(", trackParams=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", paramsForMall=");
        LIZ.append(this.LJ);
        LIZ.append(", reachCfg=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LJ.hashCode() + C12400eC.LIZ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31)) * 31;
        ReachCfg reachCfg = this.LJFF;
        if (reachCfg == null) {
            hashCode = 0;
        } else {
            hashCode = reachCfg.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public C56140M1o(String str, String str2, String str3, java.util.Map<String, Object> map, C56142M1q c56142M1q, ReachCfg reachCfg) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
        this.LJ = c56142M1q;
        this.LJFF = reachCfg;
    }
}
