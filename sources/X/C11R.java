package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.11R, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11R {
    public final java.util.Map<C11O, C11Q> LIZ = new LinkedHashMap();

    public final C11B LIZ(C11S c11s, C11A positionCalculator) {
        long j;
        boolean z;
        long LJIILL;
        o.LJIIIZ(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(((List) c11s.LIZIZ).size());
        List list = (List) c11s.LIZIZ;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C11T c11t = (C11T) ListProtector.get(list, i);
            C11Q c11q = (C11Q) ((LinkedHashMap) this.LIZ).get(new C11O(c11t.LIZ));
            if (c11q == null) {
                j = c11t.LIZIZ;
                LJIILL = c11t.LIZLLL;
                z = false;
            } else {
                j = c11q.LIZ;
                z = c11q.LIZJ;
                LJIILL = positionCalculator.LJIILL(c11q.LIZIZ);
            }
            long j2 = c11t.LIZ;
            linkedHashMap.put(new C11O(j2), new C11P(j2, c11t.LIZIZ, c11t.LIZLLL, c11t.LJ, c11t.LJFF, j, LJIILL, z, c11t.LJI, c11t.LJIIIIZZ, c11t.LJIIIZ));
            boolean z2 = c11t.LJ;
            if (z2) {
                this.LIZ.put(new C11O(c11t.LIZ), new C11Q(c11t.LIZIZ, c11t.LIZJ, z2));
            } else {
                this.LIZ.remove(new C11O(c11t.LIZ));
            }
        }
        return new C11B(linkedHashMap, c11s);
    }
}
