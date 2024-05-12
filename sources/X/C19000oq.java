package X;

import Y.IDRunnableS29S0200000;
import java.util.concurrent.Executor;

/* renamed from: X.0oq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19000oq<T> {
    public final int LIZ;
    public final AbstractC19010or LIZIZ;
    public final AbstractC19100p0<T> LIZJ;
    public Executor LJ;
    public final Object LIZLLL = new Object();
    public boolean LJFF = false;

    public final boolean LIZ() {
        if (this.LIZIZ.LJ()) {
            LIZIZ(C19110p1.LJFF);
            return true;
        }
        return false;
    }

    public final void LIZIZ(C19110p1<T> c19110p1) {
        Executor executor;
        synchronized (this.LIZLLL) {
            if (!this.LJFF) {
                this.LJFF = true;
                executor = this.LJ;
            } else {
                throw new IllegalStateException("callback.onResult already called, cannot call again.");
            }
        }
        if (executor != null) {
            executor.execute(new IDRunnableS29S0200000(c19110p1, this, 35));
        } else {
            this.LIZJ.LIZ(this.LIZ, c19110p1);
        }
    }

    public C19000oq(AbstractC19010or abstractC19010or, int i, Executor executor, AbstractC19100p0<T> abstractC19100p0) {
        this.LIZIZ = abstractC19010or;
        this.LIZ = i;
        this.LJ = executor;
        this.LIZJ = abstractC19100p0;
    }
}
