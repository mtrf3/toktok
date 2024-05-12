package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H60 {
    public final ArrayList<C42982Gtu> LIZ;

    public H60(ArrayList<C42982Gtu> arrayList) {
        this.LIZ = arrayList;
    }

    public final Integer LIZ(Object tag) {
        o.LJIIIZ(tag, "tag");
        Iterator<C42982Gtu> it = this.LIZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            C42982Gtu next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (o.LJ(next.LJLIL, tag)) {
                    return Integer.valueOf(i);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return null;
    }
}
