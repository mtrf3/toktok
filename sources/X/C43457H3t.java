package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H3t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43457H3t extends F9E {
    public final H1T LJLIL;
    public final H4Z LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C43457H3t(H1T publishNode, H4Z errorSource, String errorCause) {
        o.LJIIIZ(publishNode, "publishNode");
        o.LJIIIZ(errorSource, "errorSource");
        o.LJIIIZ(errorCause, "errorCause");
        this.LJLIL = publishNode;
        this.LJLILLLLZI = errorSource;
        this.LJLJI = errorCause;
    }
}
