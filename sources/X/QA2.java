package X;

/* loaded from: classes12.dex */
public final class QA2 {
    public String LIZ;
    public String LIZIZ;
    public C66545Q9t LIZJ;
    public QA1 LIZLLL;
    public C66543Q9r LJ;

    public final Long LIZ() {
        if (this.LJ != null) {
            return null;
        }
        QA1 qa1 = this.LIZLLL;
        if (qa1 != null && qa1.LIZIZ != null) {
            return qa1.LIZJ;
        }
        C66545Q9t c66545Q9t = this.LIZJ;
        if (c66545Q9t == null || c66545Q9t.LJ == null) {
            return null;
        }
        return c66545Q9t.LJFF;
    }

    public QA2(C66545Q9t c66545Q9t, C66543Q9r c66543Q9r) {
        boolean z;
        boolean z2;
        boolean z3;
        if (c66545Q9t != null) {
            z = true;
        } else {
            z = false;
        }
        if (c66543Q9r != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        T2R.LJIILJJIL("exactly one of authResponse or authError should be non-null", z ^ z2);
        if (c66545Q9t != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        T2R.LJIILJJIL("exactly one of authResponse or authException should be non-null", (c66543Q9r != null) ^ z3);
        if (c66543Q9r != null) {
            if (c66543Q9r.type == 1) {
                this.LJ = c66543Q9r;
            }
        } else {
            this.LIZJ = c66545Q9t;
            this.LIZLLL = null;
            this.LIZ = null;
            this.LJ = null;
            String str = c66545Q9t.LJII;
            this.LIZIZ = str == null ? c66545Q9t.LIZ.LJII : str;
        }
    }
}
