package X;

/* loaded from: classes12.dex */
public abstract class QHV {
    public static final long[] LJFF = {180000, 180000, 360000, 360000, 540000, 540000, 720000, 720000};
    public final QI4 LIZ;
    public int LIZIZ;
    public volatile boolean LIZJ;
    public long LIZLLL;
    public long LJ;

    public abstract boolean LIZJ(int i);

    public abstract String LIZLLL();

    public abstract long[] LJ();

    public abstract boolean LJFF();

    public abstract long LJI();

    public final long LIZIZ() {
        long LJI = LJI();
        if (LJFF() && !C48189Ivh.LJFF(this.LIZ.LJLJI.LJIIJ)) {
            QIX qix = this.LIZ.LJLJI.LJJIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkWorkTime, ");
            LIZ.append(LIZLLL());
            LIZ.append(", network not available");
            qix.LJIIJJI(X1D.LIZIZ(LIZ), new Object[0]);
            this.LIZ.LJLJI.LIZLLL.LJI(QIQ.pack, QIK.f_no_network, 1);
        } else if (this.LIZJ) {
            LJI = 0;
            this.LIZLLL = 0L;
            this.LIZJ = false;
        } else {
            int i = this.LIZIZ;
            if (i > 0) {
                long[] LJ = LJ();
                LJI = LJ[(i - 1) % LJ.length];
            }
        }
        return this.LIZLLL + LJI;
    }

    public QHV(QI4 qi4) {
        this.LIZ = qi4;
    }

    public final long LIZ(int i) {
        long LIZIZ = LIZIZ();
        if (LIZIZ <= System.currentTimeMillis()) {
            synchronized (this) {
                try {
                    boolean LIZJ = LIZJ(i);
                    this.LIZLLL = System.currentTimeMillis();
                    if (LIZJ) {
                        this.LIZIZ = 0;
                    } else {
                        this.LIZIZ++;
                    }
                    QIX qix = this.LIZ.LJLJI.LJJIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(LIZLLL());
                    LIZ.append(" worked:");
                    LIZ.append(LIZJ);
                    qix.LJIIL(X1D.LIZIZ(LIZ), new Object[0]);
                } catch (Throwable th) {
                    try {
                        this.LIZ.LJLJI.LJJIZ.LJIILL(null, "work failed", th, new Object[0]);
                        this.LIZLLL = System.currentTimeMillis();
                        this.LIZIZ++;
                        QIX qix2 = this.LIZ.LJLJI.LJJIZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(LIZLLL());
                        LIZ2.append(" worked:");
                        LIZ2.append(false);
                        qix2.LJIIL(X1D.LIZIZ(LIZ2), new Object[0]);
                    } catch (Throwable th2) {
                        this.LIZLLL = System.currentTimeMillis();
                        this.LIZIZ++;
                        QIX qix3 = this.LIZ.LJLJI.LJJIZ;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(LIZLLL());
                        LIZ3.append(" worked:");
                        LIZ3.append(false);
                        qix3.LJIIL(X1D.LIZIZ(LIZ3), new Object[0]);
                        throw th2;
                    }
                }
                LIZIZ = LIZIZ();
            }
        }
        return LIZIZ;
    }
}
