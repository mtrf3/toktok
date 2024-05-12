package X;

import java.util.List;

/* renamed from: X.11P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11P {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final boolean LJI;
    public final int LJII;
    public final long LJIIIIZZ;
    public final Float LJIIIZ;
    public final List<AnonymousClass119> LJIIJ;
    public AnonymousClass116 LJIIJJI;

    public C11P() {
        throw null;
    }

    public final void LIZ() {
        AnonymousClass116 anonymousClass116 = this.LJIIJJI;
        anonymousClass116.LIZIZ = true;
        anonymousClass116.LIZ = true;
    }

    public final boolean LIZIZ() {
        AnonymousClass116 anonymousClass116 = this.LJIIJJI;
        if (anonymousClass116.LIZIZ || anonymousClass116.LIZ) {
            return true;
        }
        return false;
    }

    public final String toString() {
        float f;
        String str;
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) C11O.LIZIZ(this.LIZ));
        sb.append(", uptimeMillis=");
        sb.append(this.LIZIZ);
        sb.append(", position=");
        sb.append((Object) C10370av.LJIIIIZZ(this.LIZJ));
        sb.append(", pressed=");
        sb.append(this.LIZLLL);
        sb.append(", pressure=");
        Float f2 = this.LJIIIZ;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        sb.append(f);
        sb.append(", previousUptimeMillis=");
        sb.append(this.LJ);
        sb.append(", previousPosition=");
        sb.append((Object) C10370av.LJIIIIZZ(this.LJFF));
        sb.append(", previousPressed=");
        sb.append(this.LJI);
        sb.append(", isConsumed=");
        sb.append(LIZIZ());
        sb.append(", type=");
        int i = this.LJII;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "Unknown";
                    } else {
                        str = "Eraser";
                    }
                } else {
                    str = "Stylus";
                }
            } else {
                str = "Mouse";
            }
        } else {
            str = "Touch";
        }
        sb.append((Object) str);
        sb.append(", historical=");
        Object obj = this.LJIIJ;
        if (obj == null) {
            obj = C61878OQg.INSTANCE;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) C10370av.LJIIIIZZ(this.LJIIIIZZ));
        sb.append(')');
        return sb.toString();
    }

    public C11P(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = z;
        this.LJ = j4;
        this.LJFF = j5;
        this.LJI = z2;
        this.LJII = i;
        this.LJIIIIZZ = j6;
        this.LJIIJJI = new AnonymousClass116(z3, z3);
        this.LJIIIZ = Float.valueOf(f);
    }

    public C11P(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.LJIIJ = list;
    }
}
