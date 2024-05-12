package X;

import java.util.Objects;

/* renamed from: X.3YB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YB extends C3UX {
    public final String LJ;

    public C3YB() {
        this(0);
    }

    public final int hashCode() {
        return Objects.hash(this.LJ);
    }

    @Override // X.C3UX
    public final String toString() {
        return C78966Uyw.LJJJLL("SharePanelLoadContactEventKey:%s", this.LJ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3YB(int r7) {
        /*
            r6 = this;
            java.lang.String r2 = X.C15190ih.LIZ()
            java.lang.String r1 = "aweme_im_share_panel_load_contact"
            r3 = 0
            X.3US r4 = X.C3US.TEA
            r5 = 4
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r0.LJ = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3YB.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3YB)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C3YB) obj).LJ}, new Object[]{this.LJ});
    }
}
