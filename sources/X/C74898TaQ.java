package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TaQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74898TaQ {
    public final List<LinkPlayerInfo> LIZ;
    public final List<LinkPlayerInfo> LIZIZ;
    public final List<LinkPlayerInfo> LIZJ;
    public final List<LinkPlayerInfo> LIZLLL;
    public final List<LinkPlayerInfo> LJ;
    public final List<LinkPlayerInfo> LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public C74898TaQ() {
        this(null, null, null, null, null, null, true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74898TaQ)) {
            return false;
        }
        C74898TaQ c74898TaQ = (C74898TaQ) obj;
        return o.LJ(this.LIZ, c74898TaQ.LIZ) && o.LJ(this.LIZIZ, c74898TaQ.LIZIZ) && o.LJ(this.LIZJ, c74898TaQ.LIZJ) && o.LJ(this.LIZLLL, c74898TaQ.LIZLLL) && o.LJ(this.LJ, c74898TaQ.LJ) && o.LJ(this.LJFF, c74898TaQ.LJFF) && this.LJI == c74898TaQ.LJI && this.LJII == c74898TaQ.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<LinkPlayerInfo> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<LinkPlayerInfo> list2 = this.LIZIZ;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<LinkPlayerInfo> list3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<LinkPlayerInfo> list4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<LinkPlayerInfo> list5 = this.LJ;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<LinkPlayerInfo> list6 = this.LJFF;
        int hashCode6 = (hashCode5 + (list6 != null ? list6.hashCode() : 0)) * 31;
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode6 + i) * 31) + (this.LJII ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewUserListDataAnchorSide(onlineList=");
        LIZ.append(this.LIZ);
        LIZ.append(", connectingList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", waitingList=");
        LIZ.append(this.LIZJ);
        LIZ.append(", allWaitingList=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", viewerList=");
        LIZ.append(this.LJ);
        LIZ.append(", notViewerFriendList=");
        LIZ.append(this.LJFF);
        LIZ.append(", isShowAllWaiting=");
        LIZ.append(this.LJI);
        LIZ.append(", isShowAllViewer=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C74898TaQ(List<? extends LinkPlayerInfo> list, List<? extends LinkPlayerInfo> list2, List<? extends LinkPlayerInfo> list3, List<? extends LinkPlayerInfo> list4, List<? extends LinkPlayerInfo> list5, List<? extends LinkPlayerInfo> list6, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = list4;
        this.LJ = list5;
        this.LJFF = list6;
        this.LJI = z;
        this.LJII = z2;
    }
}
