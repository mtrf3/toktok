package X;

import defpackage.q;
import kotlin.jvm.internal.o;
import webcast.data.cohost_biz.BizJoinGroupParams;

/* renamed from: X.U7x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76689U7x {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final Long LIZLLL;
    public final long LJ;
    public final BizJoinGroupParams LJFF;
    public final UA0 LJI;
    public final String LJII = "apply_new_arc";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76689U7x)) {
            return false;
        }
        C76689U7x c76689U7x = (C76689U7x) obj;
        return this.LIZ == c76689U7x.LIZ && this.LIZIZ == c76689U7x.LIZIZ && this.LIZJ == c76689U7x.LIZJ && o.LJ(this.LIZLLL, c76689U7x.LIZLLL) && this.LJ == c76689U7x.LJ && o.LJ(this.LJFF, c76689U7x.LJFF) && o.LJ(this.LJI, c76689U7x.LJI) && o.LJ(this.LJII, c76689U7x.LJII);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31);
        Long l = this.LIZLLL;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int hashCode2 = (this.LJFF.hashCode() + JBR.LIZJ(this.LJ, (LIZJ + hashCode) * 31, 31)) * 31;
        UA0 ua0 = this.LJI;
        if (ua0 != null) {
            i = ua0.hashCode();
        }
        return this.LJII.hashCode() + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplyGroupData(targetRoomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", targetUserId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", targetChannelId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", targetGroupChannelId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", expireTimeInSeconds=");
        LIZ.append(this.LJ);
        LIZ.append(", cohostReqExtra=");
        LIZ.append(this.LJFF);
        LIZ.append(", bizBlock=");
        LIZ.append(this.LJI);
        LIZ.append(", source=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C76689U7x(long j, long j2, long j3, Long l, long j4, BizJoinGroupParams bizJoinGroupParams, U8E u8e) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = l;
        this.LJ = j4;
        this.LJFF = bizJoinGroupParams;
        this.LJI = u8e;
    }
}
