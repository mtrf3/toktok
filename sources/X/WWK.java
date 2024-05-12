package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WWK extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI)};
    }

    public WWK(String clickMethod, int i) {
        o.LJIIIZ(clickMethod, "clickMethod");
        this.LJLIL = "slide_bar";
        this.LJLILLLLZI = clickMethod;
        this.LJLJI = i;
    }
}
