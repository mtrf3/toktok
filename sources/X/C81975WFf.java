package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;

/* renamed from: X.WFf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81975WFf implements Comparable<C81975WFf>, Cloneable {
    public final int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public ImageUrlModel LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public InterfaceC81972WFc LJLLI;
    public WKQ LJLLILLLL;
    public InterfaceC81973WFd LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public InterfaceC81974WFe LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public final int LJZL;
    public boolean LL;

    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C81975WFf clone() {
        C81975WFf c81975WFf = new C81975WFf(this.LJLIL, this.LJLILLLLZI, this.LJLLI, this.LJLLLLLL, this.LJZI);
        c81975WFf.LJLJJL = this.LJLJJL;
        c81975WFf.LJLJI = this.LJLJI;
        c81975WFf.LJLJJI = this.LJLJJI;
        c81975WFf.LJLJJLL = this.LJLJJLL;
        c81975WFf.LJLJL = this.LJLJL;
        c81975WFf.LJLLL = this.LJLLL;
        c81975WFf.LJLLLL = this.LJLLLL;
        c81975WFf.LJZ = this.LJZ;
        c81975WFf.LJLZ = this.LJLZ;
        c81975WFf.LJLLILLLL = this.LJLLILLLL;
        c81975WFf.LJLLJ = this.LJLLJ;
        c81975WFf.LJLJLJ = this.LJLJLJ;
        c81975WFf.LJLL = this.LJLL;
        c81975WFf.LJLJLLL = this.LJLJLLL;
        return c81975WFf;
    }

    public final int hashCode() {
        return this.LJLIL;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C81975WFf c81975WFf) {
        return Integer.compare(this.LJLIL, c81975WFf.LJLIL);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C81975WFf)) {
            return false;
        }
        C81975WFf c81975WFf = (C81975WFf) obj;
        if (this.LJLIL == c81975WFf.LJLIL && this.LJLILLLLZI == c81975WFf.LJLILLLLZI && this.LJLLLLLL == c81975WFf.LJLLLLLL && this.LJLJI == c81975WFf.LJLJI && this.LJLJJI == c81975WFf.LJLJJI && this.LJLJJLL == c81975WFf.LJLJJLL && this.LJLJL == c81975WFf.LJLJL && this.LJLJJL == c81975WFf.LJLJJL && this.LJLJLJ == c81975WFf.LJLJLJ && this.LJLJLLL == c81975WFf.LJLJLLL) {
            return true;
        }
        return false;
    }

    public C81975WFf(int i, int i2, InterfaceC81972WFc interfaceC81972WFc, int i3, boolean z) {
        this(i, i2, interfaceC81972WFc, i3, true, false, z);
    }

    public C81975WFf(int i, int i2, InterfaceC81972WFc interfaceC81972WFc, int i3, boolean z, boolean z2) {
        this(i, i2, interfaceC81972WFc, i3, z, false, z2);
    }

    public C81975WFf(int i, int i2, InterfaceC81972WFc interfaceC81972WFc, int i3, boolean z, boolean z2, boolean z3) {
        this.LJLJI = -1;
        this.LJLJJLL = true;
        this.LJLL = -1;
        this.LJZ = true;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLLI = interfaceC81972WFc;
        this.LJLLLLLL = z3 ? i3 : -1;
        this.LJZL = i3;
        this.LJLJJLL = z;
        this.LJLJL = false;
        this.LJZI = z3;
        this.LJLJLJ = z2;
    }
}
