package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122834rv {
    public final NLETrackSlot LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C122834rv)) {
            return false;
        }
        C122834rv c122834rv = (C122834rv) obj;
        return o.LJ(this.LIZ, c122834rv.LIZ) && this.LIZIZ == c122834rv.LIZIZ && this.LIZJ == c122834rv.LIZJ;
    }

    public final int hashCode() {
        int hashCode;
        NLETrackSlot nLETrackSlot = this.LIZ;
        if (nLETrackSlot == null) {
            hashCode = 0;
        } else {
            hashCode = nLETrackSlot.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LIZJ) + JBR.LIZJ(this.LIZIZ, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CopyEffectParam(originSlot=");
        LIZ.append(this.LIZ);
        LIZ.append(", startTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", duration=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C122834rv(NLETrackSlot nLETrackSlot, long j, long j2) {
        this.LIZ = nLETrackSlot;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
