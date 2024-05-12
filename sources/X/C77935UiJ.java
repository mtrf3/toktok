package X;

import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.list.model.WeeklyRankRegionInfo;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UiJ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77935UiJ {
    public final C31526CYw LIZ;
    public final WeeklyRankRegionInfo LIZIZ;
    public final long[] LIZJ;
    public final List<RankListV2Response.RankInfo> LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77935UiJ)) {
            return false;
        }
        C77935UiJ c77935UiJ = (C77935UiJ) obj;
        return o.LJ(this.LIZ, c77935UiJ.LIZ) && o.LJ(this.LIZIZ, c77935UiJ.LIZIZ) && o.LJ(this.LIZJ, c77935UiJ.LIZJ) && o.LJ(this.LIZLLL, c77935UiJ.LIZLLL) && this.LJ == c77935UiJ.LJ && this.LJFF == c77935UiJ.LJFF && this.LJI == c77935UiJ.LJI && this.LJII == c77935UiJ.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.LIZ.hashCode() * 31;
        WeeklyRankRegionInfo weeklyRankRegionInfo = this.LIZIZ;
        int i = 0;
        if (weeklyRankRegionInfo == null) {
            hashCode = 0;
        } else {
            hashCode = weeklyRankRegionInfo.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        long[] jArr = this.LIZJ;
        if (jArr == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Arrays.hashCode(jArr);
        }
        int i3 = (i2 + hashCode2) * 31;
        List<RankListV2Response.RankInfo> list = this.LIZLLL;
        if (list != null) {
            i = list.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJFF, JBR.LIZJ(this.LJ, (i3 + i) * 31, 31), 31);
        boolean z = this.LJI;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (LIZJ + i5) * 31;
        if (!this.LJII) {
            i4 = 0;
        }
        return i6 + i4;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RanItemClickModel(rankTypeAll=");
        LIZ.append(this.LIZ);
        LIZ.append(", weeklyRegionInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", roomIds=");
        LIZ.append(Arrays.toString(this.LIZJ));
        LIZ.append(", allRanks=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", pageOwnerRankUserId=");
        LIZ.append(this.LJ);
        LIZ.append(", pageOwnerRank=");
        LIZ.append(this.LJFF);
        LIZ.append(", isFolderListType=");
        LIZ.append(this.LJI);
        LIZ.append(", userCurrentRank=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public C77935UiJ(C31526CYw c31526CYw, WeeklyRankRegionInfo weeklyRankRegionInfo, long[] jArr, List<RankListV2Response.RankInfo> list, long j, long j2, boolean z, boolean z2) {
        this.LIZ = c31526CYw;
        this.LIZIZ = weeklyRankRegionInfo;
        this.LIZJ = jArr;
        this.LIZLLL = list;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = z;
        this.LJII = z2;
    }
}
