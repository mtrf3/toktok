package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O4U extends F9E {
    public final String LJLIL;
    public final EnumC35448Dvg LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public O4U(String url, EnumC35448Dvg state) {
        o.LJIIJ(url, "url");
        o.LJIIJ(state, "state");
        this.LJLIL = url;
        this.LJLILLLLZI = state;
    }
}
