package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionTargetRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import kotlin.jvm.internal.o;

/* renamed from: X.M0j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56109M0j {
    public final ReachCfg LIZ;
    public final DiversionData LIZIZ;
    public final DiversionEntranceRes LIZJ;
    public final DiversionTargetRes LIZLLL;

    public C56109M0j() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56109M0j)) {
            return false;
        }
        C56109M0j c56109M0j = (C56109M0j) obj;
        return o.LJ(this.LIZ, c56109M0j.LIZ) && o.LJ(this.LIZIZ, c56109M0j.LIZIZ) && o.LJ(this.LIZJ, c56109M0j.LIZJ) && o.LJ(this.LIZLLL, c56109M0j.LIZLLL);
    }

    public final int hashCode() {
        ReachCfg reachCfg = this.LIZ;
        int hashCode = (reachCfg == null ? 0 : reachCfg.hashCode()) * 31;
        DiversionData diversionData = this.LIZIZ;
        int hashCode2 = (hashCode + (diversionData == null ? 0 : diversionData.hashCode())) * 31;
        DiversionEntranceRes diversionEntranceRes = this.LIZJ;
        int hashCode3 = (hashCode2 + (diversionEntranceRes == null ? 0 : diversionEntranceRes.hashCode())) * 31;
        DiversionTargetRes diversionTargetRes = this.LIZLLL;
        return hashCode3 + (diversionTargetRes != null ? diversionTargetRes.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcVideoGuideDiversionCfg(reachCfg=");
        LIZ.append(this.LIZ);
        LIZ.append(", diversionData=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", entranceRes=");
        LIZ.append(this.LIZJ);
        LIZ.append(", targetRes=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C56109M0j(ReachCfg reachCfg, DiversionData diversionData, DiversionEntranceRes diversionEntranceRes, DiversionTargetRes diversionTargetRes) {
        this.LIZ = reachCfg;
        this.LIZIZ = diversionData;
        this.LIZJ = diversionEntranceRes;
        this.LIZLLL = diversionTargetRes;
    }
}
