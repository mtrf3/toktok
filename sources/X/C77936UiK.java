package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import kotlin.jvm.internal.o;

/* renamed from: X.UiK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77936UiK {
    public final RankTypeV2 LIZ;
    public final EnumC31514CYk LIZIZ;
    public final RankTypeV2 LIZJ;
    public final String LIZLLL;
    public final Boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77936UiK)) {
            return false;
        }
        C77936UiK c77936UiK = (C77936UiK) obj;
        return o.LJ(this.LIZ, c77936UiK.LIZ) && this.LIZIZ == c77936UiK.LIZIZ && o.LJ(this.LIZJ, c77936UiK.LIZJ) && o.LJ(this.LIZLLL, c77936UiK.LIZLLL) && o.LJ(this.LJ, c77936UiK.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.LIZIZ.hashCode() + (this.LIZ.type * 31)) * 31) + this.LIZJ.type) * 31;
        String str = this.LIZLLL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Boolean bool = this.LJ;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RankMonitorModel(rankType=");
        LIZ.append(this.LIZ);
        LIZ.append(", groupType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", entranceRankType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", lynxCellUrl=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isHistory=");
        return C78920UyC.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C77936UiK(RankTypeV2 rankType, EnumC31514CYk groupType, RankTypeV2 entranceRankType, String str, Boolean bool) {
        o.LJIIIZ(rankType, "rankType");
        o.LJIIIZ(groupType, "groupType");
        o.LJIIIZ(entranceRankType, "entranceRankType");
        this.LIZ = rankType;
        this.LIZIZ = groupType;
        this.LIZJ = entranceRankType;
        this.LIZLLL = str;
        this.LJ = bool;
    }
}
