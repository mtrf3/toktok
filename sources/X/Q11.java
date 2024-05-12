package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q11 {
    public final int LIZ;
    public final String LIZIZ;
    public List<String> LIZJ;
    public final Q1X LIZLLL;
    public java.util.Map<String, ? extends Object> LJ;
    public final Throwable LJFF;
    public final ArrayList<C39522FfC> LJI;

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[code = ");
        LIZ.append(this.LIZ);
        LIZ.append(", msg = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", error = ");
        LIZ.append(this.LJFF);
        LIZ.append(", strategyNames=");
        LIZ.append(this.LIZJ);
        LIZ.append(", result = ");
        LIZ.append(this.LJI);
        LIZ.append(", params = ");
        java.util.Map<String, ? extends Object> map = this.LJ;
        if (map != null) {
            str = map.toString();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", performance = ");
        LIZ.append(this.LIZLLL);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public Q11(int i, String str, List strategyNames, Throwable th, ArrayList ruleResults, int i2) {
        Q1X performance;
        i = (i2 & 1) != 0 ? -1 : i;
        str = (i2 & 2) != 0 ? null : str;
        strategyNames = (i2 & 8) != 0 ? new ArrayList() : strategyNames;
        if ((i2 & 16) != 0) {
            performance = new Q1X();
        } else {
            performance = null;
        }
        th = (i2 & 64) != 0 ? null : th;
        ruleResults = (i2 & 128) != 0 ? new ArrayList() : ruleResults;
        o.LJIIJ(strategyNames, "strategyNames");
        o.LJIIJ(performance, "performance");
        o.LJIIJ(ruleResults, "ruleResults");
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = strategyNames;
        this.LIZLLL = performance;
        this.LJ = null;
        this.LJFF = th;
        this.LJI = ruleResults;
    }
}
