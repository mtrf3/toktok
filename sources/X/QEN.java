package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public final class QEN extends QEF {
    public final QEM LIZ;
    public final String LIZIZ;
    public final QER LIZJ;
    public final Executor LIZLLL;
    public String LJ;
    public boolean LJI;
    public AbstractC66664QEi LJIIIIZZ;
    public Executor LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public final ArrayList<Pair<String, String>> LJFF = new ArrayList<>();
    public int LJII = 3;
    public final long LJIILJJIL = -1;

    @Override // X.QEF
    public final QEN LJI() {
        this.LJI = true;
        return this;
    }

    static {
        C16880lQ.LJLLJ(QEN.class);
    }

    @Override // X.QEF
    public final AbstractC66659QEd LJFF() {
        AbstractC66659QEd LJJJJIZL = this.LIZ.LJJJJIZL(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJII, this.LJI, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL);
        String str = this.LJ;
        if (str != null) {
            LJJJJIZL.LJIILIIL(str);
        }
        Iterator<Pair<String, String>> it = this.LJFF.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            LJJJJIZL.LJIIL((String) next.first, (String) next.second);
        }
        AbstractC66664QEi abstractC66664QEi = this.LJIIIIZZ;
        if (abstractC66664QEi != null) {
            LJJJJIZL.LJIJ(abstractC66664QEi, this.LJIIIZ);
        }
        LJJJJIZL.LJIILL(this.LJIILL);
        LJJJJIZL.LJIILLIIL(this.LJIILLIIL);
        LJJJJIZL.LJIIZILJ(this.LJIIZILJ);
        LJJJJIZL.LJIILJJIL(this.LJIJ);
        return LJJJJIZL;
    }

    @Override // X.QEH
    public final QEN LIZ(int i) {
        this.LJIJ = i;
        return this;
    }

    @Override // X.QEH
    public final QEN LIZIZ(int i) {
        this.LJIILL = i;
        return this;
    }

    @Override // X.QEH
    public final QEN LIZJ(int i) {
        this.LJIILLIIL = i;
        return this;
    }

    @Override // X.QEH
    public final QEN LIZLLL(int i) {
        this.LJIIZILJ = i;
        return this;
    }

    @Override // X.QEF
    public final QEN LJII(String str) {
        if (str != null) {
            this.LJ = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    @Override // X.QEF
    public final QEN LJIIIIZZ(int i) {
        this.LJII = i;
        return this;
    }

    @Override // X.QEF
    public final void LJIIIZ(int i) {
        this.LJIIJ = true;
        this.LJIIJJI = i;
    }

    @Override // X.QEF
    public final void LJIIJ(int i) {
        this.LJIIL = true;
        this.LJIILIIL = i;
    }

    @Override // X.QEF
    public final QEN LJ(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                this.LJFF.add(Pair.create(str, str2));
                if ("Accept-Encoding".equalsIgnoreCase(str)) {
                    this.LJFF.add(Pair.create(str, str2));
                }
                return this;
            }
            throw new NullPointerException("Invalid header value.");
        }
        throw new NullPointerException("Invalid header name.");
    }

    @Override // X.QEF
    public final QEN LJIIJJI(AbstractC66664QEi abstractC66664QEi, PU3 pu3) {
        if (abstractC66664QEi != null) {
            if (pu3 != null) {
                if (this.LJ == null) {
                    this.LJ = "POST";
                }
                this.LJIIIIZZ = abstractC66664QEi;
                this.LJIIIZ = pu3;
                return this;
            }
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        }
        throw new NullPointerException("Invalid UploadDataProvider.");
    }

    public QEN(String str, QE8 qe8, PU3 pu3, QEM qem) {
        if (str != null) {
            if (pu3 != null) {
                if (qem != null) {
                    this.LIZIZ = str;
                    this.LIZJ = qe8;
                    this.LIZLLL = pu3;
                    this.LIZ = qem;
                    return;
                }
                throw new NullPointerException("CronetEngine is required.");
            }
            throw new NullPointerException("Executor is required.");
        }
        throw new NullPointerException("URL is required.");
    }
}
