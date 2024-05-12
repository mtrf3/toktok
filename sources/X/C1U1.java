package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.1U1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1U1 implements InterfaceC14750hz {
    public final int LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        LIZ.append(this.LIZ);
        LIZ.append(", lengthAfterCursor=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    @Override // X.InterfaceC14750hz
    public final void LIZ(C14820i6 buffer) {
        o.LJIIIZ(buffer, "buffer");
        int i = buffer.LIZJ;
        buffer.LIZ(i, Math.min(this.LIZIZ + i, buffer.LIZLLL()));
        buffer.LIZ(Math.max(0, buffer.LIZIZ - this.LIZ), buffer.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1U1)) {
            return false;
        }
        C1U1 c1u1 = (C1U1) obj;
        if (this.LIZ == c1u1.LIZ && this.LIZIZ == c1u1.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1U1(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        String LJIIJJI = C48690J9a.LJIIJJI("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", i2, " respectively.");
        LJIIJJI.toString();
        throw new IllegalArgumentException(LJIIJJI);
    }
}
