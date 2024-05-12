package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class VEA {
    public final List<Pair<VEF, Integer>> LIZ = new ArrayList();
    public final java.util.Set<C40052Fnk> LIZIZ = new HashSet();

    public final boolean LIZ(C40052Fnk c40052Fnk) {
        if (((HashSet) this.LIZIZ).contains(c40052Fnk)) {
            return true;
        }
        Iterator it = ((HashSet) this.LIZIZ).iterator();
        while (it.hasNext()) {
            C40052Fnk c40052Fnk2 = (C40052Fnk) it.next();
            if (c40052Fnk2 == c40052Fnk) {
                c40052Fnk2.getClass();
            } else {
                Iterator it2 = ((ArrayList) c40052Fnk2.LIZ).iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    Iterator it3 = ((ArrayList) c40052Fnk.LIZ).iterator();
                    while (it3.hasNext()) {
                        if (pair.equals(it3.next())) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
