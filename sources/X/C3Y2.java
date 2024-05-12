package X;

import java.util.Objects;

/* renamed from: X.3Y2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Y2 extends C3UX {
    public final String LJ;
    public final String LJFF;

    public final Object[] LIZ() {
        return new Object[]{this.LJ, this.LJFF};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3Y2) {
            return C78966Uyw.LJIIIZ(((C3Y2) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    @Override // X.C3UX
    public final String toString() {
        return C78966Uyw.LJJJLL("GlobalActionEventKey:%s,%s", LIZ());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3Y2(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r2 = X.C15190ih.LIZ()
            java.lang.String r0 = "global_action_"
            java.lang.String r1 = defpackage.i0.LJFF(r0, r7)
            X.3US r4 = X.C3US.TEA
            r3 = 0
            r5 = 4
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r0.LJ = r7
            r0.LJFF = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Y2.<init>(java.lang.String):void");
    }
}
