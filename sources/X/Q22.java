package X;

import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes12.dex */
public final class Q22 extends Q20 {
    public final HashSet<Q20> LIZJ;

    public Q22() {
        new ArrayList();
        this.LIZJ = new HashSet<>();
    }

    @Override // X.Q20
    public final boolean LIZIZ(C66343Q1z c66343Q1z) {
        Q28 LIZ = c66343Q1z.LIZ(this);
        if (super.LIZIZ(c66343Q1z) && LIZ.LIZJ.size() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.Q20
    public final Object LIZLLL(C66343Q1z c66343Q1z) {
        return Boolean.TRUE;
    }

    @Override // X.Q20
    public final void LJ(C66343Q1z c66343Q1z, Q20 q20) {
        Q28 LIZ = c66343Q1z.LIZ(this);
        LIZ.LIZ = true;
        LIZ.LIZJ.remove(q20);
    }
}
