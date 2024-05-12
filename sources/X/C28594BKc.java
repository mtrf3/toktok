package X;

/* renamed from: X.BKc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28594BKc {
    public static C28594BKc LJ;
    public boolean LIZ;
    public C28595BKd LIZIZ;
    public int LIZJ;
    public BKX LIZLLL;

    public static C28594BKc LIZJ() {
        if (LJ == null) {
            synchronized (C28594BKc.class) {
                if (LJ == null) {
                    LJ = new C28594BKc();
                }
            }
        }
        return LJ;
    }

    public final String LIZ() {
        C28595BKd c28595BKd;
        if (!this.LIZ || (c28595BKd = this.LIZIZ) == null) {
            return null;
        }
        return c28595BKd.LIZIZ;
    }

    public final String LIZIZ() {
        C28595BKd c28595BKd;
        if (!this.LIZ || (c28595BKd = this.LIZIZ) == null) {
            return null;
        }
        return c28595BKd.LIZ;
    }

    public final String LIZLLL() {
        C28595BKd c28595BKd;
        if (!this.LIZ || (c28595BKd = this.LIZIZ) == null) {
            return null;
        }
        return c28595BKd.LIZJ;
    }
}
