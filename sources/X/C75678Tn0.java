package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinBizContent;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHMessageInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Tn0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75678Tn0 extends C66851QLn {
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final MHJoinBizContent LJI;
    public final MHMessageInfo LJII;
    public final Object LJIIIIZZ;
    public final boolean LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75678Tn0)) {
            return false;
        }
        C75678Tn0 c75678Tn0 = (C75678Tn0) obj;
        return this.LIZIZ == c75678Tn0.LIZIZ && this.LIZJ == c75678Tn0.LIZJ && this.LIZLLL == c75678Tn0.LIZLLL && this.LJ == c75678Tn0.LJ && o.LJ(this.LJFF, c75678Tn0.LJFF) && o.LJ(this.LJI, c75678Tn0.LJI) && o.LJ(this.LJII, c75678Tn0.LJII) && o.LJ(this.LJIIIIZZ, c75678Tn0.LJIIIIZZ) && this.LJIIIZ == c75678Tn0.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.LJFF, JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, this.LIZIZ * 31, 31), 31), 31), 31);
        MHJoinBizContent mHJoinBizContent = this.LJI;
        int i = 0;
        if (mHJoinBizContent == null) {
            hashCode = 0;
        } else {
            hashCode = mHJoinBizContent.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        MHMessageInfo mHMessageInfo = this.LJII;
        if (mHMessageInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = mHMessageInfo.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Object obj = this.LJIIIIZZ;
        if (obj != null) {
            i = obj.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z = this.LJIIIZ;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return i4 + i5;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MHJoinMessage(joinType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", uid=");
        LIZ.append(this.LIZJ);
        LIZ.append(", roomId=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", channelId=");
        LIZ.append(this.LJ);
        LIZ.append(", linkMicId=");
        LIZ.append(this.LJFF);
        LIZ.append(", bizContent=");
        LIZ.append(this.LJI);
        LIZ.append(", messageInfo=");
        LIZ.append(this.LJII);
        LIZ.append(", originMessage=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", isCrossArc=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C75678Tn0(int i, long j, long j2, long j3, String str, MHJoinBizContent mHJoinBizContent, MHMessageInfo mHMessageInfo, Object obj, boolean z) {
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = str;
        this.LJI = mHJoinBizContent;
        this.LJII = mHMessageInfo;
        this.LJIIIIZZ = obj;
        this.LJIIIZ = z;
    }
}
