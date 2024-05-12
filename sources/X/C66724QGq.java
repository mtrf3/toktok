package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.QGq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66724QGq {
    public static final long LIZLLL = TimeUnit.HOURS.toMillis(24);
    public static final long LJ = TimeUnit.MINUTES.toMillis(30);
    public final C66723QGp LIZ;
    public long LIZIZ;
    public int LIZJ;

    public final synchronized boolean LIZIZ() {
        boolean z;
        if (this.LIZJ != 0) {
            this.LIZ.LIZ.getClass();
            if (System.currentTimeMillis() <= this.LIZIZ) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized void LIZJ() {
        this.LIZJ = 0;
    }

    public C66724QGq() {
        if (C72083SQt.LJLJI == null) {
            C72083SQt.LJLJI = new C72083SQt();
        }
        C72083SQt c72083SQt = C72083SQt.LJLJI;
        if (C66723QGp.LIZLLL == null) {
            C66723QGp.LIZLLL = new C66723QGp(c72083SQt);
        }
        this.LIZ = C66723QGp.LIZLLL;
    }

    public final synchronized long LIZ(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return LIZLLL;
        }
        double pow = Math.pow(2.0d, this.LIZJ);
        this.LIZ.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), LJ);
    }

    public final synchronized void LIZLLL(int i) {
        if (i >= 200 && (i < 300 || i == 401 || i == 404)) {
            LIZJ();
            return;
        }
        this.LIZJ++;
        long LIZ = LIZ(i);
        this.LIZ.LIZ.getClass();
        this.LIZIZ = System.currentTimeMillis() + LIZ;
    }
}
