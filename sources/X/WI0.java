package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WI0 extends F9E {
    public final VLL LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public static WI0 L(WI0 wi0, boolean z) {
        VLL section = wi0.LJLIL;
        int i = wi0.LJLILLLLZI;
        wi0.getClass();
        o.LJIIIZ(section, "section");
        return new WI0(section, i, z);
    }

    public WI0(VLL section, int i, boolean z) {
        o.LJIIIZ(section, "section");
        this.LJLIL = section;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }

    public /* synthetic */ WI0(VLL vll, int i, boolean z, int i2) {
        this((i2 & 1) != 0 ? VLL.SLIDE : vll, i, (i2 & 4) != 0 ? false : z);
    }
}
