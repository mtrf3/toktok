package X;

import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowListUser;

/* renamed from: X.TgR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75271TgR {
    public final ShowListUser LIZ;
    public final List<ShowListUser> LIZIZ;
    public final List<ShowListUser> LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75271TgR)) {
            return false;
        }
        C75271TgR c75271TgR = (C75271TgR) obj;
        return o.LJ(this.LIZ, c75271TgR.LIZ) && o.LJ(this.LIZIZ, c75271TgR.LIZIZ) && o.LJ(this.LIZJ, c75271TgR.LIZJ) && this.LIZLLL == c75271TgR.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        ShowListUser showListUser = this.LIZ;
        int hashCode = (showListUser == null ? 0 : showListUser.hashCode()) * 31;
        List<ShowListUser> list = this.LIZIZ;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ShowListUser> list2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveShowUserListData(showingUser=");
        LIZ.append(this.LIZ);
        LIZ.append(", readyUserList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", finishedUserList=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isFromSei=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C75271TgR(ShowListUser showListUser, List<ShowListUser> list, List<ShowListUser> list2, boolean z) {
        this.LIZ = showListUser;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = z;
    }
}
