package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N4P extends F9E {
    public final N4Q LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public N4P(N4Q type, int i) {
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
        this.LJLILLLLZI = i;
    }
}
