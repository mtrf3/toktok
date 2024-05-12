package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q12 {
    public final int LIZ;
    public final String LIZIZ;
    public final Q1X LIZJ;
    public final List<String> LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[code = ");
        LIZ.append(this.LIZ);
        LIZ.append(", msg = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", strategyNames = ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", performance = ");
        LIZ.append(this.LIZJ);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public Q12(int i, String str, List list, int i2) {
        Q1X performance;
        i = (i2 & 1) != 0 ? -1 : i;
        str = (i2 & 2) != 0 ? null : str;
        if ((i2 & 4) != 0) {
            performance = new Q1X();
        } else {
            performance = null;
        }
        list = (i2 & 8) != 0 ? null : list;
        o.LJIIJ(performance, "performance");
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = performance;
        this.LIZLLL = list;
    }
}
