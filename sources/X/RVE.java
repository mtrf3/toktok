package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVE extends F9E {
    public final boolean LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public RVE(boolean z, String text) {
        o.LJIIIZ(text, "text");
        this.LJLIL = z;
        this.LJLILLLLZI = text;
    }
}
