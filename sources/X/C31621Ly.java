package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31621Ly implements InterfaceC07750Sd {
    public final float LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31621Ly) && o.LJ(Float.valueOf(this.LIZ), Float.valueOf(((C31621Ly) obj).LIZ));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Vertical(bias=");
        return C74221TAz.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public C31621Ly(float f) {
        this.LIZ = f;
    }

    @Override // X.InterfaceC07750Sd
    public final int LIZ(int i, int i2) {
        return O6R.LJJIIZ((1 + this.LIZ) * ((i2 - i) / 2.0f));
    }
}
