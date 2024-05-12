package X;

import defpackage.q;
import kotlin.jvm.internal.o;
import webcast.data.cohost_biz.BizLeaveJoinGroupParams;

/* renamed from: X.U7s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76684U7s {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final BizLeaveJoinGroupParams LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76684U7s)) {
            return false;
        }
        C76684U7s c76684U7s = (C76684U7s) obj;
        return this.LIZ == c76684U7s.LIZ && this.LIZIZ == c76684U7s.LIZIZ && this.LIZJ == c76684U7s.LIZJ && o.LJ(this.LIZLLL, c76684U7s.LIZLLL) && o.LJ(this.LJ, c76684U7s.LJ) && o.LJ(this.LJFF, c76684U7s.LJFF);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJ, (this.LIZLLL.hashCode() + JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31)) * 31, 31);
        String str = this.LJFF;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LeaveGroupData(targetRoomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", targetUserId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", targetChannelId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cohostReqExtra=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", source=");
        LIZ.append(this.LJ);
        LIZ.append(", leaveSource=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public /* synthetic */ C76684U7s(long j, long j2, long j3, BizLeaveJoinGroupParams bizLeaveJoinGroupParams, String str) {
        this(j, j2, j3, bizLeaveJoinGroupParams, str, "");
    }

    public C76684U7s(long j, long j2, long j3, BizLeaveJoinGroupParams bizLeaveJoinGroupParams, String source, String str) {
        o.LJIIIZ(source, "source");
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = bizLeaveJoinGroupParams;
        this.LJ = source;
        this.LJFF = str;
    }
}
