package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ter, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75173Ter {
    public final User LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final List<FanTicketRanklistResponse.RanklistUser> LIZLLL;
    public final User LJ;
    public final FanTicketRanklistResponse.ResponseData LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75173Ter)) {
            return false;
        }
        C75173Ter c75173Ter = (C75173Ter) obj;
        return o.LJ(this.LIZ, c75173Ter.LIZ) && this.LIZIZ == c75173Ter.LIZIZ && this.LIZJ == c75173Ter.LIZJ && o.LJ(this.LIZLLL, c75173Ter.LIZLLL) && o.LJ(this.LJ, c75173Ter.LJ) && o.LJ(this.LJFF, c75173Ter.LJFF);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelfRankItem(user=");
        LIZ.append(this.LIZ);
        LIZ.append(", rank=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", score=");
        LIZ.append(this.LIZJ);
        LIZ.append(", rankListUsers=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", targetUser=");
        LIZ.append(this.LJ);
        LIZ.append(", rankListRspData=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31);
        User user = this.LJ;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        return this.LJFF.hashCode() + ((LIZIZ + hashCode) * 31);
    }

    public C75173Ter(User user, long j, long j2, List<FanTicketRanklistResponse.RanklistUser> list, User user2, FanTicketRanklistResponse.ResponseData responseData) {
        this.LIZ = user;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = list;
        this.LJ = user2;
        this.LJFF = responseData;
    }
}
