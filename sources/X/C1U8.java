package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.1U8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1U8 implements InterfaceC14750hz {
    public final C08440Uu LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ.LJLIL.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SetComposingTextCommand(text='");
        LIZ.append(this.LIZ.LJLIL);
        LIZ.append("', newCursorPosition=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    @Override // X.InterfaceC14750hz
    public final void LIZ(C14820i6 buffer) {
        int length;
        o.LJIIIZ(buffer, "buffer");
        int i = buffer.LIZLLL;
        int i2 = -1;
        if (i != -1) {
            buffer.LJ(i, buffer.LJ, this.LIZ.LJLIL);
            if (this.LIZ.LJLIL.length() > 0) {
                buffer.LJFF(i, this.LIZ.LJLIL.length() + i);
            }
        } else {
            int i3 = buffer.LIZIZ;
            buffer.LJ(i3, buffer.LIZJ, this.LIZ.LJLIL);
            if (this.LIZ.LJLIL.length() > 0) {
                buffer.LJFF(i3, this.LIZ.LJLIL.length() + i3);
            }
        }
        int i4 = buffer.LIZIZ;
        int i5 = buffer.LIZJ;
        if (i4 == i5) {
            i2 = i5;
        }
        int i6 = this.LIZIZ;
        int i7 = i2 + i6;
        if (i6 > 0) {
            length = i7 - 1;
        } else {
            length = i7 - this.LIZ.LJLIL.length();
        }
        int LJIIL = C78842Uww.LJIIL(length, 0, buffer.LIZLLL());
        buffer.LJI(LJIIL, LJIIL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1U8)) {
            return false;
        }
        C1U8 c1u8 = (C1U8) obj;
        if (o.LJ(this.LIZ.LJLIL, c1u8.LIZ.LJLIL) && this.LIZIZ == c1u8.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1U8(String str, int i) {
        this.LIZ = new C08440Uu(str, null, 6);
        this.LIZIZ = i;
    }
}
