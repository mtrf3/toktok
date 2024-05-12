package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SRH extends F9E {
    public final EnumC72126SSk LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public SRH(EnumC72126SSk state, int i) {
        o.LJIIIZ(state, "state");
        this.LJLIL = state;
        this.LJLILLLLZI = i;
    }
}
