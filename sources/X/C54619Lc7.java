package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lc7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54619Lc7 extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;

    public C54619Lc7() {
        this(false, false, false, false, null, 31);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), this.LJLJI, Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL)};
    }

    public C54619Lc7(boolean z, boolean z2, boolean z3, boolean z4, String enterMethod, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? true : z2;
        enterMethod = (i & 4) != 0 ? "auto" : enterMethod;
        z3 = (i & 8) != 0 ? false : z3;
        z4 = (i & 16) != 0 ? false : z4;
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = enterMethod;
        this.LJLJJI = z3;
        this.LJLJJL = z4;
    }
}
