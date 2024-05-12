package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0HX, reason: invalid class name */
/* loaded from: classes.dex */
public class C0HX {
    public AbstractC65794Pry LIZ;

    public final void LIZ(List list) {
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0HZ c0hz = (C0HZ) it.next();
                if (!"play_pass_subs".equals(c0hz.LIZIZ)) {
                    hashSet.add(c0hz.LIZIZ);
                }
            }
            if (hashSet.size() <= 1) {
                this.LIZ = AbstractC65794Pry.zzk(list);
                return;
            }
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        throw new IllegalArgumentException("Product list cannot be empty.");
    }
}
