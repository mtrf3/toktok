package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHMessageInfo;
import com.bytedance.android.live.liveinteract.multihost.core.model.MHPermitJoinBizContent;
import kotlin.jvm.internal.o;

/* renamed from: X.Tmz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75677Tmz extends C66851QLn {
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final MHPermitJoinBizContent LJI;
    public final MHMessageInfo LJII = null;
    public final boolean LJIIIIZZ;
    public final Object LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75677Tmz)) {
            return false;
        }
        C75677Tmz c75677Tmz = (C75677Tmz) obj;
        return this.LIZIZ == c75677Tmz.LIZIZ && this.LIZJ == c75677Tmz.LIZJ && this.LIZLLL == c75677Tmz.LIZLLL && this.LJ == c75677Tmz.LJ && this.LJFF == c75677Tmz.LJFF && o.LJ(this.LJI, c75677Tmz.LJI) && o.LJ(this.LJII, c75677Tmz.LJII) && this.LJIIIIZZ == c75677Tmz.LJIIIIZZ && o.LJ(this.LJIIIZ, c75677Tmz.LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.LJFF, JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, ((this.LIZIZ * 31) + this.LIZJ) * 31, 31), 31), 31);
        MHPermitJoinBizContent mHPermitJoinBizContent = this.LJI;
        int i = 0;
        if (mHPermitJoinBizContent == null) {
            hashCode = 0;
        } else {
            hashCode = mHPermitJoinBizContent.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        MHMessageInfo mHMessageInfo = this.LJII;
        if (mHMessageInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = mHMessageInfo.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        boolean z = this.LJIIIIZZ;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        Object obj = this.LJIIIZ;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MHJoinReplyMessage(joinType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", replyStatus=");
        LIZ.append(this.LIZJ);
        LIZ.append(", uid=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", roomId=");
        LIZ.append(this.LJ);
        LIZ.append(", channelId=");
        LIZ.append(this.LJFF);
        LIZ.append(", bizContent=");
        LIZ.append(this.LJI);
        LIZ.append(", messageInfo=");
        LIZ.append(this.LJII);
        LIZ.append(", isCrossArc=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", originMessage=");
        return U26.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C75677Tmz(int i, int i2, long j, long j2, long j3, MHPermitJoinBizContent mHPermitJoinBizContent, boolean z, Object obj) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = j3;
        this.LJI = mHPermitJoinBizContent;
        this.LJIIIIZZ = z;
        this.LJIIIZ = obj;
    }
}
