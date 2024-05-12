package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.11T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11T {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final float LJFF;
    public final int LJI;
    public final boolean LJII;
    public final List<AnonymousClass119> LJIIIIZZ;
    public final long LJIIIZ;

    public C11T() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11T)) {
            return false;
        }
        C11T c11t = (C11T) obj;
        return C11O.LIZ(this.LIZ, c11t.LIZ) && this.LIZIZ == c11t.LIZIZ && C10370av.LIZIZ(this.LIZJ, c11t.LIZJ) && C10370av.LIZIZ(this.LIZLLL, c11t.LIZLLL) && this.LJ == c11t.LJ && o.LJ(Float.valueOf(this.LJFF), Float.valueOf(c11t.LJFF)) && this.LJI == c11t.LJI && this.LJII == c11t.LJII && o.LJ(this.LJIIIIZZ, c11t.LJIIIIZZ) && C10370av.LIZIZ(this.LJIIIZ, c11t.LJIIIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PointerInputEventData(id=");
        LIZ.append((Object) C11O.LIZIZ(this.LIZ));
        LIZ.append(", uptime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", positionOnScreen=");
        LIZ.append((Object) C10370av.LJIIIIZZ(this.LIZJ));
        LIZ.append(", position=");
        LIZ.append((Object) C10370av.LJIIIIZZ(this.LIZLLL));
        LIZ.append(", down=");
        LIZ.append(this.LJ);
        LIZ.append(", pressure=");
        LIZ.append(this.LJFF);
        LIZ.append(", type=");
        int i = this.LJI;
        LIZ.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        LIZ.append(", issuesEnterExit=");
        LIZ.append(this.LJII);
        LIZ.append(", historical=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", scrollDelta=");
        LIZ.append((Object) C10370av.LJIIIIZZ(this.LJIIIZ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZJ = JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31), 31);
        boolean z = this.LJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LIZIZ = (C47959Irz.LIZIZ(this.LJFF, (LIZJ + i2) * 31, 31) + this.LJI) * 31;
        if (!this.LJII) {
            i = 0;
        }
        return C16880lQ.LLJIJIL(this.LJIIIZ) + AnonymousClass391.LIZIZ(this.LJIIIIZZ, (LIZIZ + i) * 31, 31);
    }

    public C11T(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = z;
        this.LJFF = f;
        this.LJI = i;
        this.LJII = z2;
        this.LJIIIIZZ = list;
        this.LJIIIZ = j5;
    }
}
