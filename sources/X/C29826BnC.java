package X;

import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BnC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29826BnC {
    public final String LIZ;
    public final DataChannel LIZIZ;
    public final RankListV2Response.RankInfo LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC88472Yns<RankListV2Response.RankInfo, C76800UCe> LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29826BnC)) {
            return false;
        }
        C29826BnC c29826BnC = (C29826BnC) obj;
        return o.LJ(this.LIZ, c29826BnC.LIZ) && o.LJ(this.LIZIZ, c29826BnC.LIZIZ) && o.LJ(this.LIZJ, c29826BnC.LIZJ) && this.LIZLLL == c29826BnC.LIZLLL && o.LJ(this.LJ, c29826BnC.LJ) && this.LJFF == c29826BnC.LJFF && this.LJI == c29826BnC.LJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        DataChannel dataChannel = this.LIZIZ;
        int i = 0;
        if (dataChannel == null) {
            hashCode = 0;
        } else {
            hashCode = dataChannel.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        RankListV2Response.RankInfo rankInfo = this.LIZJ;
        if (rankInfo != null) {
            i = rankInfo.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.LIZLLL;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int LIZIZ = QZY.LIZIZ(this.LJ, (i3 + i5) * 31, 31);
        boolean z2 = this.LJFF;
        int i6 = z2;
        if (z2 != 0) {
            i6 = 1;
        }
        int i7 = (LIZIZ + i6) * 31;
        if (!this.LJI) {
            i4 = 0;
        }
        return i7 + i4;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RankPrimaryTopBindModel(rankPageName=");
        LIZ.append(this.LIZ);
        LIZ.append(", dataChannel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", item=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isTop=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", clickListener=");
        LIZ.append(this.LJ);
        LIZ.append(", changeAvator=");
        LIZ.append(this.LJFF);
        LIZ.append(", isHistoryRank=");
        return C48339Iy7.LIZJ(LIZ, this.LJI, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C29826BnC(String rankPageName, DataChannel dataChannel, RankListV2Response.RankInfo rankInfo, boolean z, InterfaceC88472Yns<? super RankListV2Response.RankInfo, C76800UCe> interfaceC88472Yns, boolean z2, boolean z3) {
        o.LJIIIZ(rankPageName, "rankPageName");
        this.LIZ = rankPageName;
        this.LIZIZ = dataChannel;
        this.LIZJ = rankInfo;
        this.LIZLLL = z;
        this.LJ = interfaceC88472Yns;
        this.LJFF = z2;
        this.LJI = z3;
    }
}
