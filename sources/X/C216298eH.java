package X;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.8eH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216298eH {
    public final LinkedList<AbstractC216018dp> LIZ;
    public final LinkedList<AbstractC216018dp> LIZIZ;
    public final LinkedList<AbstractC216018dp> LIZJ;
    public final C216758f1 LIZLLL;
    public boolean LJ;
    public int LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;

    public final long LIZ() {
        if (this.LIZ.size() > 0) {
            int size = this.LIZ.size() - 1;
            int i = this.LJFF;
            if (i >= 0 && i <= size) {
                return this.LIZ.get(i).LIZJ - this.LJIIIIZZ;
            }
        }
        return -1L;
    }

    public final long LIZJ() {
        if (!this.LJ) {
            return this.LJIIIIZZ;
        }
        long currentTimeMillis = (((float) ((System.currentTimeMillis() - this.LJII) * this.LIZLLL.LIZJ.LIZJ)) / 100.0f) + ((float) this.LJI);
        this.LJIIIIZZ = currentTimeMillis;
        return currentTimeMillis;
    }

    public C216298eH(C216678et controller) {
        o.LJIIIZ(controller, "controller");
        this.LIZ = new LinkedList<>();
        this.LIZIZ = new LinkedList<>();
        this.LIZJ = new LinkedList<>();
        this.LIZLLL = controller.LIZ;
    }

    public final void LIZIZ(long j) {
        this.LJ = true;
        int i = 0;
        this.LJFF = 0;
        this.LJI = Math.max(0L, j);
        this.LJII = System.currentTimeMillis();
        this.LJIIIIZZ = this.LJI;
        Iterator<AbstractC216018dp> it = this.LIZ.iterator();
        while (it.hasNext() && it.next().LIZJ < j) {
        }
        Iterator<AbstractC216018dp> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            AbstractC216018dp next = it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                long j2 = next.LIZJ;
                if (j2 >= j) {
                    return;
                }
                this.LIZLLL.LIZJ.getClass();
                if (j2 < j - 0) {
                    this.LJFF = i2;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
