package X;

import com.bytedance.android.livesdk.model.message.PollMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04120Ee {
    public final long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final boolean LJFF;
    public PollMessage LJI;
    public boolean LJII;
    public EnumC04110Ed LJIIIIZZ;
    public boolean LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31);
        boolean z = this.LIZLLL;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZJ + i2) * 31;
        boolean z2 = this.LJ;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z3 = this.LJFF;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        PollMessage pollMessage = this.LJI;
        if (pollMessage == null) {
            hashCode = 0;
        } else {
            hashCode = pollMessage.hashCode();
        }
        int i8 = (i7 + hashCode) * 31;
        boolean z4 = this.LJII;
        int i9 = z4;
        if (z4 != 0) {
            i9 = 1;
        }
        int hashCode2 = (this.LJIIIIZZ.hashCode() + ((i8 + i9) * 31)) * 31;
        if (!this.LJIIIZ) {
            i = 0;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomPollInfo(roomId=");
        LIZ.append(this.LIZ);
        LIZ.append(", timeLeft=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", endTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", hasVoted=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", showPollEntrance=");
        LIZ.append(this.LJ);
        LIZ.append(", hasStartPermission=");
        LIZ.append(this.LJFF);
        LIZ.append(", pollMessage=");
        LIZ.append(this.LJI);
        LIZ.append(", pollAvailable=");
        LIZ.append(this.LJII);
        LIZ.append(", pollEndReason=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", showedShortTouchPreview=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C04120Ee(long j) {
        EnumC04110Ed pollEndReason = EnumC04110Ed.NULL;
        o.LJIIIZ(pollEndReason, "pollEndReason");
        this.LIZ = j;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = null;
        this.LJII = false;
        this.LJIIIIZZ = pollEndReason;
        this.LJIIIZ = false;
    }

    public final void LIZ(EnumC04110Ed enumC04110Ed) {
        o.LJIIIZ(enumC04110Ed, "<set-?>");
        this.LJIIIIZZ = enumC04110Ed;
    }

    public final boolean equals(Object obj) {
        PollMessage pollMessage;
        if (this != obj) {
            if ((obj instanceof C04120Ee) && (pollMessage = this.LJI) != null) {
                Long l = null;
                Long valueOf = Long.valueOf(pollMessage.pollId);
                PollMessage pollMessage2 = ((C04120Ee) obj).LJI;
                if (pollMessage2 != null) {
                    l = Long.valueOf(pollMessage2.pollId);
                }
                if (o.LJ(valueOf, l)) {
                }
            }
            return false;
        }
        return true;
    }
}
