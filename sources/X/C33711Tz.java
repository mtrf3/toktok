package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.1Tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33711Tz implements InterfaceC14750hz {
    public final C08440Uu LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ.LJLIL.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommitTextCommand(text='");
        LIZ.append(this.LIZ.LJLIL);
        LIZ.append("', newCursorPosition=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    @Override // X.InterfaceC14750hz
    public final void LIZ(C14820i6 buffer) {
        int length;
        o.LJIIIZ(buffer, "buffer");
        int i = buffer.LIZLLL;
        if (i != -1) {
            buffer.LJ(i, buffer.LJ, this.LIZ.LJLIL);
        } else {
            buffer.LJ(buffer.LIZIZ, buffer.LIZJ, this.LIZ.LJLIL);
        }
        int i2 = buffer.LIZIZ;
        int i3 = buffer.LIZJ;
        if (i2 != i3) {
            i3 = -1;
        }
        int i4 = this.LIZIZ;
        int i5 = i3 + i4;
        if (i4 > 0) {
            length = i5 - 1;
        } else {
            length = i5 - this.LIZ.LJLIL.length();
        }
        int LJIIL = C78842Uww.LJIIL(length, 0, buffer.LIZLLL());
        buffer.LJI(LJIIL, LJIIL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33711Tz)) {
            return false;
        }
        C33711Tz c33711Tz = (C33711Tz) obj;
        if (o.LJ(this.LIZ.LJLIL, c33711Tz.LIZ.LJLIL) && this.LIZIZ == c33711Tz.LIZIZ) {
            return true;
        }
        return false;
    }

    public C33711Tz(String str, int i) {
        this.LIZ = new C08440Uu(str, null, 6);
        this.LIZIZ = i;
    }
}
