package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25860zu {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final EnumC25790zn LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C25860zu() {
        this(true, true, EnumC25790zn.Inherit, true, true);
    }

    public final int hashCode() {
        return C16880lQ.LLJILJIL(this.LJ) + C07250Qf.LIZ(this.LIZLLL, (this.LIZJ.hashCode() + C07250Qf.LIZ(this.LIZIZ, C16880lQ.LLJILJIL(this.LIZ) * 31, 31)) * 31, 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25860zu(int r7) {
        /*
            r6 = this;
            r1 = 1
            X.0zn r3 = X.EnumC25790zn.Inherit
            java.lang.String r0 = "securePolicy"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r0 = r6
            r2 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25860zu.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25860zu)) {
            return false;
        }
        C25860zu c25860zu = (C25860zu) obj;
        if (this.LIZ == c25860zu.LIZ && this.LIZIZ == c25860zu.LIZIZ && this.LIZJ == c25860zu.LIZJ && this.LIZLLL == c25860zu.LIZLLL && this.LJ == c25860zu.LJ) {
            return true;
        }
        return false;
    }

    public C25860zu(boolean z, boolean z2, EnumC25790zn securePolicy, boolean z3, boolean z4) {
        o.LJIIIZ(securePolicy, "securePolicy");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = securePolicy;
        this.LIZLLL = z3;
        this.LJ = z4;
    }
}
