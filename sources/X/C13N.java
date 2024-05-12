package X;

import kotlin.jvm.internal.o;

/* renamed from: X.13N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13N {
    public static final C13N LJ;
    public final long LIZ;
    public final float LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13N)) {
            return false;
        }
        C13N c13n = (C13N) obj;
        return C10370av.LIZIZ(this.LIZ, c13n.LIZ) && o.LJ(Float.valueOf(this.LIZIZ), Float.valueOf(c13n.LIZIZ)) && this.LIZJ == c13n.LIZJ && C10370av.LIZIZ(this.LIZLLL, c13n.LIZLLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VelocityEstimate(pixelsPerSecond=");
        LIZ.append((Object) C10370av.LJIIIIZZ(this.LIZ));
        LIZ.append(", confidence=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", durationMillis=");
        LIZ.append(this.LIZJ);
        LIZ.append(", offset=");
        LIZ.append((Object) C10370av.LJIIIIZZ(this.LIZLLL));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    static {
        long j = C10370av.LIZIZ;
        LJ = new C13N(j, 1.0f, 0L, j);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZLLL) + JBR.LIZJ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31);
    }

    public C13N(long j, float f, long j2, long j3) {
        this.LIZ = j;
        this.LIZIZ = f;
        this.LIZJ = j2;
        this.LIZLLL = j3;
    }
}
