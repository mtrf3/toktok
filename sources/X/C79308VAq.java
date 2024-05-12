package X;

import java.util.LinkedList;

/* renamed from: X.VAq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79308VAq {
    public final Object LIZ = new Object();
    public final LinkedList<Integer> LIZIZ = new LinkedList<>();

    public final void LIZ() {
        synchronized (this.LIZ) {
            this.LIZIZ.clear();
        }
    }

    public final Integer LIZJ() {
        Integer peekLast;
        synchronized (this.LIZ) {
            peekLast = this.LIZIZ.peekLast();
        }
        return peekLast;
    }

    public final Integer LIZLLL() {
        Integer pollFirst;
        synchronized (this.LIZ) {
            pollFirst = this.LIZIZ.pollFirst();
        }
        return pollFirst;
    }

    public final void LIZIZ(int i) {
        synchronized (this.LIZ) {
            this.LIZIZ.offer(Integer.valueOf(i));
        }
    }
}
