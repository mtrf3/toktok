package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0O4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0O4 {
    public final float LIZ;
    public final long LIZIZ;
    public final C1J4<Float> LIZJ;

    public C0O4() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O4)) {
            return false;
        }
        C0O4 c0o4 = (C0O4) obj;
        return o.LJ(Float.valueOf(this.LIZ), Float.valueOf(c0o4.LIZ)) && this.LIZIZ == c0o4.LIZIZ && o.LJ(this.LIZJ, c0o4.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Scale(scale=");
        LIZ.append(this.LIZ);
        LIZ.append(", transformOrigin=");
        LIZ.append((Object) C12000dY.LIZJ(this.LIZIZ));
        LIZ.append(", animationSpec=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + JBR.LIZJ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31);
    }

    public C0O4(float f, long j, C1J4 c1j4) {
        this.LIZ = f;
        this.LIZIZ = j;
        this.LIZJ = c1j4;
    }
}
