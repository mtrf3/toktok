package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NkI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60222NkI extends F9E {
    public final android.net.Uri LJLIL;
    public final F3T LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C60222NkI(android.net.Uri uri, F3T providerFactory) {
        o.LJIIJ(uri, "uri");
        o.LJIIJ(providerFactory, "providerFactory");
        this.LJLIL = uri;
        this.LJLILLLLZI = providerFactory;
    }
}
