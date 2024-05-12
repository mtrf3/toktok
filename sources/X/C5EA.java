package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.5EA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EA {
    public final long LIZ;
    public final long LIZIZ;
    public final NLETrackSlot LIZJ;
    public final C08630Vn<C76800UCe> LIZLLL;

    public C5EA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5EA)) {
            return false;
        }
        C5EA c5ea = (C5EA) obj;
        return this.LIZ == c5ea.LIZ && this.LIZIZ == c5ea.LIZIZ && o.LJ(this.LIZJ, c5ea.LIZJ) && o.LJ(this.LIZLLL, c5ea.LIZLLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CropTrackStates(currentPlayTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", totalPlayTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nleTrackSlot=");
        LIZ.append(this.LIZJ);
        LIZ.append(", invalidateTrack=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
        NLETrackSlot nLETrackSlot = this.LIZJ;
        int i = 0;
        if (nLETrackSlot == null) {
            hashCode = 0;
        } else {
            hashCode = nLETrackSlot.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        C08630Vn<C76800UCe> c08630Vn = this.LIZLLL;
        if (c08630Vn != null) {
            i = c08630Vn.hashCode();
        }
        return i2 + i;
    }

    public /* synthetic */ C5EA(int i) {
        this(0L, 0L, null, null);
    }

    public C5EA(long j, long j2, NLETrackSlot nLETrackSlot, C08630Vn<C76800UCe> c08630Vn) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = nLETrackSlot;
        this.LIZLLL = c08630Vn;
    }

    public static C5EA LIZ(C5EA c5ea, long j, long j2, NLETrackSlot nLETrackSlot, C08630Vn c08630Vn, int i) {
        C08630Vn c08630Vn2 = c08630Vn;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        long j3 = j;
        long j4 = j2;
        if ((i & 1) != 0) {
            j3 = c5ea.LIZ;
        }
        if ((i & 2) != 0) {
            j4 = c5ea.LIZIZ;
        }
        if ((i & 4) != 0) {
            nLETrackSlot2 = c5ea.LIZJ;
        }
        if ((i & 8) != 0) {
            c08630Vn2 = c5ea.LIZLLL;
        }
        c5ea.getClass();
        return new C5EA(j3, j4, nLETrackSlot2, c08630Vn2);
    }
}
