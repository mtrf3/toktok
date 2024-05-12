package X;

import defpackage.b0;

/* renamed from: X.Jva, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50730Jva implements InterfaceC50310Joo {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50730Jva) && this.LIZ == ((C50730Jva) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateCursorAction(cursor=");
        return b0.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C50730Jva(int i) {
        this.LIZ = i;
    }
}
