package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1QU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QU extends AbstractC11540co {
    public final C10410az LIZ;
    public final C1QX LIZIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C1QU(C10410az c10410az) {
        boolean z;
        boolean z2;
        C1QX LIZ;
        this.LIZ = c10410az;
        if (C10340as.LIZIZ(c10410az.LJII) == C10340as.LIZIZ(c10410az.LJI) && C10340as.LIZIZ(c10410az.LJI) == C10340as.LIZIZ(c10410az.LJFF) && C10340as.LIZIZ(c10410az.LJFF) == C10340as.LIZIZ(c10410az.LJ)) {
            z = true;
        } else {
            z = false;
        }
        if (C10340as.LIZJ(c10410az.LJII) == C10340as.LIZJ(c10410az.LJI) && C10340as.LIZJ(c10410az.LJI) == C10340as.LIZJ(c10410az.LJFF) && C10340as.LIZJ(c10410az.LJFF) == C10340as.LIZJ(c10410az.LJ)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            LIZ = null;
        } else {
            LIZ = C1JI.LIZ();
            LIZ.LJ(c10410az);
        }
        this.LIZIZ = LIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1QU) && o.LJ(this.LIZ, ((C1QU) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
