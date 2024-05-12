package X;

import com.bytedance.android.livesdk.model.Gift;
import kotlin.jvm.internal.o;

/* renamed from: X.Cux, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32855Cux {
    public final Gift LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public boolean LIZLLL = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32855Cux)) {
            return false;
        }
        C32855Cux c32855Cux = (C32855Cux) obj;
        return o.LJ(this.LIZ, c32855Cux.LIZ) && this.LIZIZ == c32855Cux.LIZIZ && this.LIZJ == c32855Cux.LIZJ && this.LIZLLL == c32855Cux.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZJ = JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShownGiftData(gift=");
        LIZ.append(this.LIZ);
        LIZ.append(", colorId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", priceGap=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isSending=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C32855Cux(Gift gift, long j, long j2) {
        this.LIZ = gift;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
