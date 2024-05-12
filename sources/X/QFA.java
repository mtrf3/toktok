package X;

import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class QFA extends QFO {
    public final QEM LIZ;
    public final QFM LIZIZ;
    public final Executor LIZJ;
    public List<String> LIZLLL;
    public int LJ;
    public String LJFF;
    public long LJI;
    public int LJII;
    public long LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public java.util.Map<String, String> LJIIJJI;
    public java.util.Map<String, String> LJIIL;
    public boolean LJIILIIL = true;
    public boolean LJIILJJIL = true;

    static {
        C16880lQ.LJLLJ(QFA.class);
    }

    public final QFK LIZ() {
        if (this.LJIILJJIL) {
            return this.LIZ.LJJJJJ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL);
        }
        return this.LIZ.LJJJJJL(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJIIJJI, this.LJIIL, this.LJIILIIL);
    }

    public QFA(QFM qfm, Executor executor, QEM qem) {
        this.LIZ = qem;
        this.LIZIZ = qfm;
        this.LIZJ = executor;
    }
}
