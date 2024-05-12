package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25780zm {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final EnumC25790zn LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public C25780zm() {
        this(false, true, true, EnumC25790zn.Inherit, true, true, false);
    }

    public final int hashCode() {
        return C16880lQ.LLJILJIL(this.LJI) + C07250Qf.LIZ(this.LJFF, C07250Qf.LIZ(this.LJ, (this.LIZLLL.hashCode() + C07250Qf.LIZ(this.LIZJ, C07250Qf.LIZ(this.LIZIZ, C07250Qf.LIZ(this.LIZ, C16880lQ.LLJILJIL(this.LIZIZ) * 31, 31), 31), 31)) * 31, 31), 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25780zm)) {
            return false;
        }
        C25780zm c25780zm = (C25780zm) obj;
        if (this.LIZ == c25780zm.LIZ && this.LIZIZ == c25780zm.LIZIZ && this.LIZJ == c25780zm.LIZJ && this.LIZLLL == c25780zm.LIZLLL && this.LJ == c25780zm.LJ && this.LJFF == c25780zm.LJFF && this.LJI == c25780zm.LJI) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25780zm(boolean r9, int r10) {
        /*
            r8 = this;
            r5 = r9
            r1 = 0
            r0 = r10 & 2
            if (r0 == 0) goto L2d
            r2 = 1
        L7:
            r0 = r10 & 4
            if (r0 == 0) goto L2b
            r3 = 1
        Lc:
            r0 = r10 & 8
            if (r0 == 0) goto L29
            X.0zn r4 = X.EnumC25790zn.Inherit
        L12:
            r0 = r10 & 16
            if (r0 == 0) goto L17
            r5 = 1
        L17:
            r0 = r10 & 32
            if (r0 == 0) goto L27
            r6 = 1
        L1c:
            java.lang.String r0 = "securePolicy"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r0 = r8
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L27:
            r6 = 0
            goto L1c
        L29:
            r4 = 0
            goto L12
        L2b:
            r3 = 0
            goto Lc
        L2d:
            r2 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25780zm.<init>(boolean, int):void");
    }

    public C25780zm(boolean z, boolean z2, boolean z3, EnumC25790zn securePolicy, boolean z4, boolean z5, boolean z6) {
        o.LJIIIZ(securePolicy, "securePolicy");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = securePolicy;
        this.LJ = z4;
        this.LJFF = z5;
        this.LJI = z6;
    }
}
