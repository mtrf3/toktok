package X;

import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJC<T> implements Comparator {
    public static final LJC<T> LJLIL = new LJC<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long l;
        String o1 = (String) obj;
        String o2 = (String) obj2;
        o.LJIIIZ(o1, "o1");
        o.LJIIIZ(o2, "o2");
        List LJFF = LJA.LJFF(o1);
        Long l2 = null;
        if (LJFF != null) {
            l = LJA.LIZLLL(LJFF);
        } else {
            l = null;
        }
        List LJFF2 = LJA.LJFF(o2);
        if (LJFF2 != null) {
            l2 = LJA.LIZLLL(LJFF2);
        }
        if (l != null && l2 != null) {
            return (int) (l2.longValue() - l.longValue());
        }
        return 0;
    }
}
