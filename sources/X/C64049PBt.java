package X;

import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.PBt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64049PBt<T> {
    public final int LIZ;
    public final ConcurrentLinkedQueue<T> LIZIZ = new ConcurrentLinkedQueue<>();
    public C64050PBu LIZJ;

    public final boolean LIZ() {
        return this.LIZIZ.isEmpty();
    }

    public final T LIZIZ() {
        return this.LIZIZ.poll();
    }

    public C64049PBt(int i) {
        this.LIZ = i;
    }

    public final void LIZJ(T t) {
        this.LIZIZ.add(t);
        if (this.LIZIZ.size() > this.LIZ) {
            T poll = this.LIZIZ.poll();
            if (this.LIZJ != null && PCE.LJ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("evicted Monitorable ");
                LIZ.append(poll);
                C64028PAy.LIZIZ("APM-CommonEvent", X1D.LIZIZ(LIZ));
            }
        }
    }
}
