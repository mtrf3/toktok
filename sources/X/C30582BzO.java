package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BzO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30582BzO extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL)};
    }

    public C30582BzO(String str, String gameTagId, boolean z, boolean z2, boolean z3, int i) {
        z = (i & 4) != 0 ? true : z;
        z2 = (i & 8) != 0 ? false : z2;
        z3 = (i & 16) != 0 ? true : z3;
        o.LJIIIZ(gameTagId, "gameTagId");
        this.LJLIL = str;
        this.LJLILLLLZI = gameTagId;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
    }
}
