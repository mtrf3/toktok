package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VSO extends F9E {
    public final boolean LJLIL;
    public final EnumC79770VSk LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public VSO(boolean z, EnumC79770VSk state) {
        o.LJIIJ(state, "state");
        this.LJLIL = z;
        this.LJLILLLLZI = state;
    }
}
