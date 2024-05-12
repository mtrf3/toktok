package X;

import java.util.Objects;

/* renamed from: X.306, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass306 extends C3UY {
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final int LJI;
    public final java.util.Map<String, String> LJII;

    public AnonymousClass306() {
        throw null;
    }

    public final Object[] LIZ() {
        return new Object[]{Integer.valueOf(this.LIZLLL), Boolean.valueOf(this.LJ), Boolean.valueOf(this.LJFF), Integer.valueOf(this.LJI), this.LJII};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass306) {
            return C78966Uyw.LJIIIZ(((AnonymousClass306) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("LoadConversationsEventBody:%s,%s,%s,%s,%s", LIZ());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass306(int r11, boolean r12) {
        /*
            r10 = this;
            X.3mF r7 = X.C113554cx.LJJJLIIL()
            r0 = 3
            X.OSZ[] r3 = new X.OSZ[r0]
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "has_sorted"
            r1.<init>(r0, r2)
            r9 = 0
            r3[r9] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            X.OSZ r0 = new X.OSZ
            java.lang.String r8 = "is_faulted"
            r0.<init>(r8, r1)
            r6 = 1
            r3[r6] = r0
            r5 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "version"
            r1.<init>(r0, r2)
            r3[r5] = r1
            java.util.Map r4 = X.C113554cx.LJJL(r3)
            X.OSZ[] r3 = new X.OSZ[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "conversation_count"
            r1.<init>(r0, r2)
            r3[r9] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            X.OSZ r0 = new X.OSZ
            r0.<init>(r8, r1)
            r3[r6] = r0
            java.util.Map r0 = X.C113554cx.LJJL(r3)
            r10.<init>(r4, r0, r7)
            r10.LIZLLL = r11
            r10.LJ = r6
            r10.LJFF = r12
            r10.LJI = r5
            r10.LJII = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass306.<init>(int, boolean):void");
    }
}
