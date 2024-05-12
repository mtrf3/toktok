package X;

import java.util.HashMap;
import java.util.Objects;

/* renamed from: X.3L4, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3L4 implements Comparable<C3L4> {
    public String LJLILLLLZI;
    public Object LJLJI;
    public String LJLJJI;
    public CharSequence LJLJJL;
    public long LJLJL;
    public long LJLJLJ;
    public int LJLJLLL;
    public String LJLL;
    public long LJLLI;
    public volatile int LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public HashMap<String, String> LJZ;
    public boolean LJZI;
    public final C3OB LJZL;
    public boolean LL;
    public boolean LLD;
    public AbstractC82843My LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public long LJLIL = -1;
    public C82603Ma LJLJJLL = new C82603Ma("", C4FY.NO_STATUS);
    public boolean LJLLL = false;
    public boolean LLIFFJFJJ = false;

    public abstract C3OB LIZJ();

    public abstract String LJFF();

    public abstract int LJIIIIZZ();

    public abstract void LJIIIZ();

    public final long LJI() {
        long j = this.LJLJLJ;
        if (j > 0) {
            return j;
        }
        return this.LJLJL;
    }

    public int hashCode() {
        return Objects.hash(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Long.valueOf(this.LJLJL), Long.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLLILLLL), Boolean.valueOf(this.LJLLJ), Boolean.valueOf(this.LJLLL), Boolean.valueOf(this.LJLLLL), Boolean.valueOf(this.LL), this.LLF, Boolean.valueOf(this.LLFF), Boolean.valueOf(this.LLFFF), Boolean.valueOf(this.LLFII), this.LJLJJLL, Boolean.valueOf(this.LLI), Boolean.valueOf(this.LLFZ), Long.valueOf(this.LJLLI), Boolean.valueOf(this.LLD), this.LJLL);
    }

    public C3L4() {
        LJIIIZ();
        this.LJZL = LIZJ();
    }

    public final boolean LJIIJ() {
        if (LJIIIIZZ() == 0 || LJIIIIZZ() == 20 || LJIIIIZZ() == 1) {
            return true;
        }
        return false;
    }

    public CharSequence LIZLLL() {
        return this.LJLJJL;
    }

    public String LJ() {
        return this.LJLJJI;
    }

    public long LJII() {
        return this.LJLJL;
    }

    public final void LJIIJJI(long j) {
        if (j < 10000000000L) {
            this.LJLJL = j * 1000;
        } else {
            this.LJLJL = j;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C3L4 c3l4) {
        C3L4 c3l42 = c3l4;
        if (c3l42 == null) {
            return -1;
        }
        int i = this.LJLZ;
        int i2 = c3l42.LJLZ;
        if (i == i2) {
            return Long.compare(LJII(), c3l42.LJII());
        }
        return i - i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3L4 c3l4 = (C3L4) obj;
        if (this.LJLJL == c3l4.LJLJL && this.LJLJLJ == c3l4.LJLJLJ && this.LJLJLLL == c3l4.LJLJLLL && this.LJLLILLLL == c3l4.LJLLILLLL && this.LJLLI == c3l4.LJLLI && this.LLD == c3l4.LLD && this.LJLLJ == c3l4.LJLLJ && this.LJLLL == c3l4.LJLLL && this.LJLLLL == c3l4.LJLLLL && this.LL == c3l4.LL && Objects.equals(this.LJLL, c3l4.LJLL) && Objects.equals(this.LJLILLLLZI, c3l4.LJLILLLLZI) && Objects.equals(this.LJLJI, c3l4.LJLJI) && Objects.equals(this.LJLJJI, c3l4.LJLJJI) && Objects.equals(this.LJLJJL, c3l4.LJLJJL) && Objects.equals(this.LLF, c3l4.LLF) && this.LLFF == c3l4.LLFF && this.LLFFF == c3l4.LLFFF && this.LLFII == c3l4.LLFII && this.LLI == c3l4.LLI && this.LLFZ == c3l4.LLFZ && Objects.equals(this.LJLJJLL, c3l4.LJLJJLL)) {
            return true;
        }
        return false;
    }
}
