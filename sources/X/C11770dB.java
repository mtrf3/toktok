package X;

/* renamed from: X.0dB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11770dB {
    public static final C11770dB LIZLLL = new C11770dB();
    public final long LIZ;
    public final long LIZIZ;
    public final float LIZJ;

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZJ) + JBR.LIZJ(this.LIZIZ, C61876OQe.LIZJ(this.LIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Shadow(color=");
        C78920UyC.LJ(this.LIZ, LIZ, ", offset=");
        LIZ.append((Object) C10370av.LJIIIIZZ(this.LIZIZ));
        LIZ.append(", blurRadius=");
        return C74221TAz.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public C11770dB() {
        this(C78897Uxp.LJFF(4278190080L), C10370av.LIZIZ, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11770dB)) {
            return false;
        }
        C11770dB c11770dB = (C11770dB) obj;
        if (C11850dJ.LIZJ(this.LIZ, c11770dB.LIZ) && C10370av.LIZIZ(this.LIZIZ, c11770dB.LIZIZ) && this.LIZJ == c11770dB.LIZJ) {
            return true;
        }
        return false;
    }

    public C11770dB(long j, long j2, float f) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = f;
    }
}
