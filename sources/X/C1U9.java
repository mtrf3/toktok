package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.1U9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1U9 implements InterfaceC14750hz {
    public final int LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SetSelectionCommand(start=");
        LIZ.append(this.LIZ);
        LIZ.append(", end=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    @Override // X.InterfaceC14750hz
    public final void LIZ(C14820i6 buffer) {
        o.LJIIIZ(buffer, "buffer");
        int LJIIL = C78842Uww.LJIIL(this.LIZ, 0, buffer.LIZLLL());
        int LJIIL2 = C78842Uww.LJIIL(this.LIZIZ, 0, buffer.LIZLLL());
        if (LJIIL < LJIIL2) {
            buffer.LJI(LJIIL, LJIIL2);
        } else {
            buffer.LJI(LJIIL2, LJIIL);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1U9)) {
            return false;
        }
        C1U9 c1u9 = (C1U9) obj;
        if (this.LIZ == c1u9.LIZ && this.LIZIZ == c1u9.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1U9(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
