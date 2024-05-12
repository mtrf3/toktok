package X;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: X.Emn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37445Emn {
    public final int LIZJ = 10;
    public final java.util.Map<C37437Emf, C37436Eme> LIZ = new HashMap(10);
    public final PriorityQueue<OSZ<Long, C37437Emf>> LIZIZ = new PriorityQueue<>(10, new Comparator() { // from class: X.4sc
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return (((Number) ((OSZ) obj).getFirst()).longValue() > ((Number) ((OSZ) obj2).getFirst()).longValue() ? 1 : (((Number) ((OSZ) obj).getFirst()).longValue() == ((Number) ((OSZ) obj2).getFirst()).longValue() ? 0 : -1));
        }
    });

    public final void LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        while ((!this.LIZIZ.isEmpty()) && this.LIZIZ.peek().getFirst().longValue() <= currentTimeMillis) {
            ((HashMap) this.LIZ).remove(this.LIZIZ.poll().getSecond());
        }
    }
}
