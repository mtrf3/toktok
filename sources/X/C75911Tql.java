package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Tql, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75911Tql {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final BizReplyParams LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75911Tql)) {
            return false;
        }
        C75911Tql c75911Tql = (C75911Tql) obj;
        return this.LIZ == c75911Tql.LIZ && this.LIZIZ == c75911Tql.LIZIZ && this.LIZJ == c75911Tql.LIZJ && o.LJ(this.LIZLLL, c75911Tql.LIZLLL) && this.LJ == c75911Tql.LJ;
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = (JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31) + this.LIZJ) * 31;
        BizReplyParams bizReplyParams = this.LIZLLL;
        if (bizReplyParams == null) {
            hashCode = 0;
        } else {
            hashCode = bizReplyParams.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJ) + ((LIZJ + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReplyInviteParam(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", userId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", replyStatus=");
        LIZ.append(this.LIZJ);
        LIZ.append(", bizReplyParams=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", inviteOperatorUid=");
        return C47135Ieh.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public /* synthetic */ C75911Tql(long j, long j2, int i, BizReplyParams bizReplyParams, int i2) {
        this(j, j2, i, (i2 & 8) != 0 ? null : bizReplyParams, 0L);
    }

    public C75911Tql(long j, long j2, int i, BizReplyParams bizReplyParams, long j3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LIZLLL = bizReplyParams;
        this.LJ = j3;
    }
}
