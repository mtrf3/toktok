package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.Ckg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32218Ckg {
    public final long LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final Gift LJ;
    public final GiftMessage LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32218Ckg)) {
            return false;
        }
        C32218Ckg c32218Ckg = (C32218Ckg) obj;
        return this.LIZ == c32218Ckg.LIZ && o.LJ(this.LIZIZ, c32218Ckg.LIZIZ) && this.LIZJ == c32218Ckg.LIZJ && this.LIZLLL == c32218Ckg.LIZLLL && o.LJ(this.LJ, c32218Ckg.LJ) && o.LJ(this.LJFF, c32218Ckg.LJFF);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Record(giftId=");
        LIZ.append(this.LIZ);
        LIZ.append(", uniqueId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", timeStampFromBoot=");
        LIZ.append(this.LIZJ);
        LIZ.append(", sendServerTs=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", gift=");
        LIZ.append(this.LJ);
        LIZ.append(", msg=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return this.LJFF.hashCode() + ((this.LJ.hashCode() + JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31), 31)) * 31);
    }

    public C32218Ckg(long j, String uniqueId, long j2, long j3, Gift gift, GiftMessage msg) {
        o.LJIIIZ(uniqueId, "uniqueId");
        o.LJIIIZ(msg, "msg");
        this.LIZ = j;
        this.LIZIZ = uniqueId;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = gift;
        this.LJFF = msg;
    }
}
