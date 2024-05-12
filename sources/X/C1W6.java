package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1W6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1W6 extends AbstractC17640me {
    public final String LJLIL;
    public final List<AbstractC17560mW> LJLILLLLZI;
    public final int LJLJI;
    public final AbstractC11740d8 LJLJJI;
    public final float LJLJJL;
    public final AbstractC11740d8 LJLJJLL;
    public final float LJLJL;
    public final float LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final float LJLLI;
    public final float LJLLILLLL;
    public final float LJLLJ;
    public final float LJLLL;

    public final int hashCode() {
        int i;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        AbstractC11740d8 abstractC11740d8 = this.LJLJJI;
        int i2 = 0;
        if (abstractC11740d8 != null) {
            i = abstractC11740d8.hashCode();
        } else {
            i = 0;
        }
        int LIZIZ2 = C47959Irz.LIZIZ(this.LJLJJL, (LIZIZ + i) * 31, 31);
        AbstractC11740d8 abstractC11740d82 = this.LJLJJLL;
        if (abstractC11740d82 != null) {
            i2 = abstractC11740d82.hashCode();
        }
        return C47959Irz.LIZIZ(this.LJLLL, C47959Irz.LIZIZ(this.LJLLJ, C47959Irz.LIZIZ(this.LJLLILLLL, C47959Irz.LIZIZ(this.LJLLI, (((C47959Irz.LIZIZ(this.LJLJLJ, C47959Irz.LIZIZ(this.LJLJL, (LIZIZ2 + i2) * 31, 31), 31) + this.LJLJLLL) * 31) + this.LJLL) * 31, 31), 31), 31), 31) + this.LJLJI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C65352Pkq.LIZ(C1W6.class), C65352Pkq.LIZ(obj.getClass()))) {
            return false;
        }
        C1W6 c1w6 = (C1W6) obj;
        if (o.LJ(this.LJLIL, c1w6.LJLIL) && o.LJ(this.LJLJJI, c1w6.LJLJJI) && this.LJLJJL == c1w6.LJLJJL && o.LJ(this.LJLJJLL, c1w6.LJLJJLL) && this.LJLJL == c1w6.LJLJL && this.LJLJLJ == c1w6.LJLJLJ && this.LJLJLLL == c1w6.LJLJLLL && this.LJLL == c1w6.LJLL && this.LJLLI == c1w6.LJLLI && this.LJLLILLLL == c1w6.LJLLILLLL && this.LJLLJ == c1w6.LJLLJ && this.LJLLL == c1w6.LJLLL && this.LJLJI == c1w6.LJLJI && o.LJ(this.LJLILLLLZI, c1w6.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C1W6(String str, List list, int i, AbstractC11740d8 abstractC11740d8, float f, AbstractC11740d8 abstractC11740d82, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.LJLIL = str;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
        this.LJLJJI = abstractC11740d8;
        this.LJLJJL = f;
        this.LJLJJLL = abstractC11740d82;
        this.LJLJL = f2;
        this.LJLJLJ = f3;
        this.LJLJLLL = i2;
        this.LJLL = i3;
        this.LJLLI = f4;
        this.LJLLILLLL = f5;
        this.LJLLJ = f6;
        this.LJLLL = f7;
    }
}
