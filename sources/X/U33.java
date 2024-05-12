package X;

import java.util.List;
import kotlin.jvm.internal.o;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public final class U33 {
    public final Long LIZ;
    public final ShowListUser LIZIZ;
    public final List<ShowListUser> LIZJ;
    public final List<ShowListUser> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U33)) {
            return false;
        }
        U33 u33 = (U33) obj;
        return o.LJ(this.LIZ, u33.LIZ) && o.LJ(this.LIZIZ, u33.LIZIZ) && o.LJ(this.LIZJ, u33.LIZJ) && o.LJ(this.LIZLLL, u33.LIZLLL);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        ShowListUser showListUser = this.LIZIZ;
        int hashCode2 = (hashCode + (showListUser == null ? 0 : showListUser.hashCode())) * 31;
        List<ShowListUser> list = this.LIZJ;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ShowListUser> list2 = this.LIZLLL;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NextGuestEventData(durationPerGuest=");
        LIZ.append(this.LIZ);
        LIZ.append(", showListUser=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", readyAndShowingList=");
        LIZ.append(this.LIZJ);
        LIZ.append(", finishGuestList=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public U33(Long l, ShowListUser showListUser, List<ShowListUser> list, List<ShowListUser> list2) {
        this.LIZ = l;
        this.LIZIZ = showListUser;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
