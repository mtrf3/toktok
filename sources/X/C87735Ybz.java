package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.Ybz, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87735Ybz {
    public C87735Ybz LIZ;
    public C87735Ybz LIZIZ;
    public C87735Ybz LIZJ;
    public C87735Ybz LIZLLL;
    public final String LJ;
    public CharSequence LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;

    public final void LIZJ() {
        C87735Ybz c87735Ybz;
        C87735Ybz c87735Ybz2 = this.LIZLLL;
        if (c87735Ybz2 != null && (c87735Ybz = this.LIZIZ) != null) {
            C87735Ybz c87735Ybz3 = c87735Ybz2.LIZIZ;
            if (c87735Ybz3 != null) {
                c87735Ybz3.LIZ = null;
            }
            c87735Ybz2.LIZIZ = c87735Ybz.LIZLLL;
            C87735Ybz c87735Ybz4 = this.LIZIZ.LIZLLL;
            if (c87735Ybz4 != null) {
                C87735Ybz c87735Ybz5 = c87735Ybz4.LIZ;
                if (c87735Ybz5 != null) {
                    c87735Ybz5.LIZIZ = null;
                }
                this.LIZIZ.LIZLLL.LIZ = c87735Ybz2;
            }
            c87735Ybz2.LIZJ();
        }
    }

    public final void LIZLLL() {
        C87735Ybz c87735Ybz;
        C87735Ybz c87735Ybz2 = this.LIZLLL;
        if (c87735Ybz2 != null && (c87735Ybz = this.LIZ) != null) {
            C87735Ybz c87735Ybz3 = c87735Ybz2.LIZ;
            if (c87735Ybz3 != null) {
                c87735Ybz3.LIZIZ = null;
            }
            c87735Ybz2.LIZ = c87735Ybz.LIZLLL;
            C87735Ybz c87735Ybz4 = this.LIZ.LIZLLL;
            if (c87735Ybz4 != null) {
                C87735Ybz c87735Ybz5 = c87735Ybz4.LIZIZ;
                if (c87735Ybz5 != null) {
                    c87735Ybz5.LIZ = null;
                }
                this.LIZ.LIZLLL.LIZIZ = c87735Ybz2;
            }
            c87735Ybz2.LIZLLL();
        }
    }

    public final C87735Ybz LJ() {
        C87735Ybz c87735Ybz;
        C87735Ybz c87735Ybz2 = this.LIZJ;
        if (c87735Ybz2 != null) {
            c87735Ybz = c87735Ybz2.LJ();
        } else {
            c87735Ybz = null;
        }
        C87735Ybz c87735Ybz3 = new C87735Ybz(this);
        if (c87735Ybz == null) {
            c87735Ybz3.LIZIZ = this.LIZIZ;
            C87735Ybz c87735Ybz4 = this.LIZIZ;
            if (c87735Ybz4 != null) {
                c87735Ybz4.LIZ = c87735Ybz3;
            }
            c87735Ybz3.LIZ = this;
            this.LIZIZ = c87735Ybz3;
        } else {
            c87735Ybz.LIZ(c87735Ybz3);
        }
        return c87735Ybz3;
    }

    public final void LJFF() {
        C87735Ybz c87735Ybz = this.LIZLLL;
        if (c87735Ybz != null) {
            c87735Ybz.LJFF();
        }
        C87735Ybz c87735Ybz2 = this.LIZ;
        if (c87735Ybz2 != null) {
            c87735Ybz2.LIZIZ = null;
        }
        this.LIZ = null;
        C87735Ybz c87735Ybz3 = this.LIZIZ;
        if (c87735Ybz3 != null) {
            c87735Ybz3.LIZ = null;
        }
        this.LIZIZ = null;
    }

    public final void LJI() {
        C87735Ybz c87735Ybz = this.LIZLLL;
        if (c87735Ybz != null) {
            c87735Ybz.LJI();
        }
        C87735Ybz c87735Ybz2 = this.LIZ;
        if (c87735Ybz2 != null) {
            c87735Ybz2.LIZIZ = this.LIZIZ;
        }
        C87735Ybz c87735Ybz3 = this.LIZIZ;
        if (c87735Ybz3 != null) {
            c87735Ybz3.LIZ = c87735Ybz2;
        }
        this.LIZIZ = null;
        this.LIZ = null;
    }

    public final void LJII() {
        if (this.LIZJ != null) {
            LJFF();
            this.LIZJ.LIZLLL = null;
        }
        this.LIZJ = null;
    }

    public final String toString() {
        return this.LJ;
    }

    public C87735Ybz(C87735Ybz c87735Ybz) {
        this.LJ = c87735Ybz.LJ;
        this.LJII = c87735Ybz.LJII;
        this.LJIIIIZZ = c87735Ybz.LJIIIIZZ;
        if (c87735Ybz.LJFF != null) {
            this.LJFF = new SpannableStringBuilder(c87735Ybz.LJFF);
        }
        this.LJI = c87735Ybz.LJI;
    }

    public final void LIZ(C87735Ybz c87735Ybz) {
        C87735Ybz c87735Ybz2 = this.LIZLLL;
        if (c87735Ybz2 != null) {
            c87735Ybz2.LIZJ = null;
        }
        this.LIZLLL = c87735Ybz;
        C87735Ybz c87735Ybz3 = c87735Ybz.LIZJ;
        if (c87735Ybz3 != null) {
            c87735Ybz3.LIZLLL = null;
        }
        c87735Ybz.LIZJ = this;
        LIZJ();
        LIZLLL();
    }

    public final void LIZIZ(C87735Ybz c87735Ybz) {
        if (c87735Ybz == null) {
            this.LIZIZ = null;
            return;
        }
        C87735Ybz c87735Ybz2 = c87735Ybz.LIZIZ;
        if (c87735Ybz2 != null) {
            c87735Ybz2.LIZ = null;
        }
        c87735Ybz.LIZIZ = this.LIZIZ;
        C87735Ybz c87735Ybz3 = this.LIZIZ;
        if (c87735Ybz3 != null) {
            c87735Ybz3.LIZ = c87735Ybz;
        }
        C87735Ybz c87735Ybz4 = c87735Ybz.LIZ;
        if (c87735Ybz4 != null) {
            c87735Ybz4.LIZIZ = null;
        }
        c87735Ybz.LIZ = this;
        this.LIZIZ = c87735Ybz;
        C87735Ybz c87735Ybz5 = this.LIZLLL;
        if (c87735Ybz5 == null) {
            return;
        }
        c87735Ybz5.LIZIZ(c87735Ybz.LIZLLL);
    }

    public C87735Ybz(String str) {
        this.LJ = str;
        this.LJII = 1;
    }
}
