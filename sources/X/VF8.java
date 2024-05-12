package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VF8 extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public VF8(String ip, int i) {
        o.LJIIJ(ip, "ip");
        this.LJLIL = ip;
        this.LJLILLLLZI = i;
    }
}
