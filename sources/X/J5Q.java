package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J5Q {
    public static final /* synthetic */ int LIZLLL = 0;
    public final int LIZ;
    public J5R LIZIZ = J5R.LJLJJI;
    public final List<J5R> LIZJ = new ArrayList();

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AIPredictResult{status=");
        LIZ.append(this.LIZ);
        LIZ.append(", predic=");
        LIZ.append(this.LIZIZ.LJLIL);
        LIZ.append(", confid=");
        return C74221TAz.LIZLLL(LIZ, this.LIZIZ.LJLJI, '}', LIZ);
    }

    public J5Q(int i) {
        this.LIZ = i;
    }

    public final void LIZ(J5R j5r) {
        if (o.LJ(this.LIZIZ, J5R.LJLJJI) || j5r.LJLJI > this.LIZIZ.LJLJI) {
            this.LIZIZ = j5r;
        }
        ((ArrayList) this.LIZJ).add(j5r);
    }
}
