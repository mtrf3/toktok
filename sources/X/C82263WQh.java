package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WQh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82263WQh extends F9E {
    public final EnumC82257WQb LJLIL;
    public final C79155V4t LJLILLLLZI;
    public final C82273WQr LJLJI;
    public final Exception LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C82263WQh(EnumC82257WQb state, C79155V4t filterMeta, C82273WQr c82273WQr, Exception exc) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(filterMeta, "filterMeta");
        this.LJLIL = state;
        this.LJLILLLLZI = filterMeta;
        this.LJLJI = c82273WQr;
        this.LJLJJI = exc;
    }
}
