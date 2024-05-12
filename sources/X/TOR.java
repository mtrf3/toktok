package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOR extends F9E {
    public final TOM LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public TOR(TOM state, String filePath) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(filePath, "filePath");
        this.LJLIL = state;
        this.LJLILLLLZI = filePath;
    }
}
