package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class POR extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public POR(String traceType) {
        o.LJIIIZ(traceType, "traceType");
        this.LJLIL = "app.ui.page";
        this.LJLILLLLZI = traceType;
    }
}
