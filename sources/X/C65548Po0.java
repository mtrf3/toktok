package X;

import Y.IDComparatorS39S0000000_11;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.Po0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65548Po0<E extends Comparable> {
    public final PriorityQueue<E> LIZ;
    public final int LIZIZ;

    public final List<E> LIZIZ() {
        ArrayList arrayList = new ArrayList(this.LIZ);
        Collections.sort(arrayList);
        return arrayList;
    }

    public C65548Po0(int i) {
        if (i > 0) {
            this.LIZIZ = i;
            this.LIZ = new PriorityQueue<>(i, new IDComparatorS39S0000000_11(17));
            return;
        }
        throw new IllegalStateException();
    }

    public final void LIZ(E e) {
        if (this.LIZ.size() < this.LIZIZ) {
            this.LIZ.add(e);
        } else {
            if (e.compareTo(this.LIZ.peek()) <= 0) {
                return;
            }
            this.LIZ.poll();
            this.LIZ.add(e);
        }
    }
}
