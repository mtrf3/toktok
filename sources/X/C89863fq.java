package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89863fq {
    public final List<IMUser> LIZ;
    public final List<IMUser> LIZIZ;
    public final List<IMUser> LIZJ;
    public final List<IMUser> LIZLLL;
    public final List<IMUser> LJ;
    public final List<IMUser> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89863fq)) {
            return false;
        }
        C89863fq c89863fq = (C89863fq) obj;
        return o.LJ(this.LIZ, c89863fq.LIZ) && o.LJ(this.LIZIZ, c89863fq.LIZIZ) && o.LJ(this.LIZJ, c89863fq.LIZJ) && o.LJ(this.LIZLLL, c89863fq.LIZLLL) && o.LJ(this.LJ, c89863fq.LJ) && o.LJ(this.LJFF, c89863fq.LJFF);
    }

    public final int hashCode() {
        return this.LJFF.hashCode() + AnonymousClass391.LIZIZ(this.LJ, AnonymousClass391.LIZIZ(this.LIZLLL, AnonymousClass391.LIZIZ(this.LIZJ, AnonymousClass391.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AllFriends(selectedSUGUsers=");
        LIZ.append(this.LIZ);
        LIZ.append(", recentFriends=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mutualFriends=");
        LIZ.append(this.LIZJ);
        LIZ.append(", allFollowingFriends=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", inviteeList=");
        LIZ.append(this.LJ);
        LIZ.append(", allContacts=");
        return C1NE.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C89863fq(List<? extends IMUser> selectedSUGUsers, List<? extends IMUser> recentFriends, List<? extends IMUser> mutualFriends, List<? extends IMUser> allFollowingFriends, List<? extends IMUser> inviteeList, List<? extends IMUser> allContacts) {
        o.LJIIIZ(selectedSUGUsers, "selectedSUGUsers");
        o.LJIIIZ(recentFriends, "recentFriends");
        o.LJIIIZ(mutualFriends, "mutualFriends");
        o.LJIIIZ(allFollowingFriends, "allFollowingFriends");
        o.LJIIIZ(inviteeList, "inviteeList");
        o.LJIIIZ(allContacts, "allContacts");
        this.LIZ = selectedSUGUsers;
        this.LIZIZ = recentFriends;
        this.LIZJ = mutualFriends;
        this.LIZLLL = allFollowingFriends;
        this.LJ = inviteeList;
        this.LJFF = allContacts;
    }
}
