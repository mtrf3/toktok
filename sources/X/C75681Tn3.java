package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHMessageInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Tn3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75681Tn3 extends C66851QLn {
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final MHJoinBizContent LJFF;
    public final MHMessageInfo LJI = null;
    public final boolean LJII;
    public final Object LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75681Tn3)) {
            return false;
        }
        C75681Tn3 c75681Tn3 = (C75681Tn3) obj;
        return this.LIZIZ == c75681Tn3.LIZIZ && this.LIZJ == c75681Tn3.LIZJ && this.LIZLLL == c75681Tn3.LIZLLL && this.LJ == c75681Tn3.LJ && o.LJ(this.LJFF, c75681Tn3.LJFF) && o.LJ(this.LJI, c75681Tn3.LJI) && this.LJII == c75681Tn3.LJII && o.LJ(this.LJIIIIZZ, c75681Tn3.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, this.LIZIZ * 31, 31), 31), 31);
        MHJoinBizContent mHJoinBizContent = this.LJFF;
        int i = 0;
        if (mHJoinBizContent == null) {
            hashCode = 0;
        } else {
            hashCode = mHJoinBizContent.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        MHMessageInfo mHMessageInfo = this.LJI;
        if (mHMessageInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = mHMessageInfo.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        boolean z = this.LJII;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        Object obj = this.LJIIIIZZ;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MHJoinCancelMessage(joinType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", uid=");
        LIZ.append(this.LIZJ);
        LIZ.append(", roomId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", channelId=");
        LIZ.append(this.LJ);
        LIZ.append(", bizContent=");
        LIZ.append(this.LJFF);
        LIZ.append(", messageInfo=");
        LIZ.append(this.LJI);
        LIZ.append(", isCrossArc=");
        LIZ.append(this.LJII);
        LIZ.append(", originMessage=");
        return U26.LIZJ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public C75681Tn3(int i, long j, long j2, long j3, MHJoinBizContent mHJoinBizContent, boolean z, Object obj) {
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = mHJoinBizContent;
        this.LJII = z;
        this.LJIIIIZZ = obj;
    }
}
