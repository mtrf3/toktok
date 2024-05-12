package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WKi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82108WKi extends F9E {
    public final EnumC82111WKl LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final VLL LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C82108WKi(EnumC82111WKl action, int i, int i2, VLL section) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(section, "section");
        this.LJLIL = action;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = section;
    }
}
