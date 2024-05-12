package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.PinMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CS6 {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final long LIZ;
    public User LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public CR6 LJFF;
    public PinMessage LJI;
    public long LJII;
    public CSN LJIIIIZZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinBizModel(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", pinUser=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isUnderReview=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isRejected=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", hasUnpinPermission=");
        LIZ.append(this.LJ);
        LIZ.append(", message=");
        LIZ.append(this.LJFF);
        LIZ.append(", pinMessage=");
        LIZ.append(this.LJI);
        LIZ.append(", timeLeft=");
        LIZ.append(this.LJII);
        LIZ.append(", unPinReason=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final long LIZ() {
        long j = this.LJII;
        if (j > 0) {
            return (long) Math.ceil(j / 1000.0d);
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        User user = this.LIZIZ;
        int i = 0;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        boolean z = this.LIZJ;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i2 + i4) * 31;
        boolean z2 = this.LIZLLL;
        int i6 = z2;
        if (z2 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        if (!this.LJ) {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        CR6 cr6 = this.LJFF;
        if (cr6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cr6.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        PinMessage pinMessage = this.LJI;
        if (pinMessage != null) {
            i = pinMessage.hashCode();
        }
        return this.LJIIIIZZ.hashCode() + JBR.LIZJ(this.LJII, (i9 + i) * 31, 31);
    }

    public CS6(long j) {
        CSN unPinReason = CSN.NULL;
        o.LJIIIZ(unPinReason, "unPinReason");
        this.LIZ = j;
        this.LIZIZ = null;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = 0L;
        this.LJIIIIZZ = unPinReason;
    }

    public final boolean equals(Object obj) {
        Long l;
        if (obj != this) {
            if (obj instanceof CS6) {
                PinMessage pinMessage = this.LJI;
                Long l2 = null;
                if (pinMessage != null) {
                    l = Long.valueOf(pinMessage.pinId);
                } else {
                    l = null;
                }
                PinMessage pinMessage2 = ((CS6) obj).LJI;
                if (pinMessage2 != null) {
                    l2 = Long.valueOf(pinMessage2.pinId);
                }
                if (o.LJ(l, l2)) {
                }
            }
            return false;
        }
        return true;
    }
}
