package X;

import defpackage.q;
import kotlin.jvm.internal.o;
import webcast.data.cohost_biz.BizJoinGroupParams;

/* renamed from: X.U7y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76690U7y {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final Long LIZLLL;
    public final long LJ;
    public final BizJoinGroupParams LJFF;
    public final UA0 LJI;
    public final String LJII = "invite_new_arc";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76690U7y)) {
            return false;
        }
        C76690U7y c76690U7y = (C76690U7y) obj;
        return this.LIZ == c76690U7y.LIZ && this.LIZIZ == c76690U7y.LIZIZ && this.LIZJ == c76690U7y.LIZJ && o.LJ(this.LIZLLL, c76690U7y.LIZLLL) && this.LJ == c76690U7y.LJ && o.LJ(this.LJFF, c76690U7y.LJFF) && o.LJ(this.LJI, c76690U7y.LJI) && o.LJ(this.LJII, c76690U7y.LJII);
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
        LIZ.append("InviteGroupData(targetRoomId=");
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
        LIZ.append(", bizCheckBlock=");
        LIZ.append(this.LJI);
        LIZ.append(", source=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C76690U7y(long j, long j2, long j3, Long l, long j4, BizJoinGroupParams bizJoinGroupParams, U8E u8e) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = l;
        this.LJ = j4;
        this.LJFF = bizJoinGroupParams;
        this.LJI = u8e;
    }
}
