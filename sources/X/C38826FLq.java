package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.FLq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38826FLq extends C48153Iv7 {
    public final C38827FLr LJIJ;
    public final boolean LJIJI;
    public String LJIJJ;

    public C38826FLq() {
        this(new C38827FLr(0, null, false, 7));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enable:");
        LIZ.append(this.LJIJI);
        LIZ.append("|strategy:[age:");
        LIZ.append(this.LJIJ.LIZ);
        LIZ.append("]|url:");
        String str = this.LJIJ.LIZJ;
        if (str == null) {
            str = this.LJIJJ;
        }
        return q.LIZIZ(LIZ, str, '|', LIZ);
    }

    public C38826FLq(C38827FLr strategy) {
        o.LJIIIZ(strategy, "strategy");
        this.LJIJ = strategy;
        this.LJIJI = true;
        this.LJIJJ = "";
    }
}
