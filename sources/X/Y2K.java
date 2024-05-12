package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y2K<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ AbstractC86724Y1w<T> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public Y2K(AbstractC86724Y1w<T> abstractC86724Y1w, String str) {
        this.LJLIL = abstractC86724Y1w;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIIZ(it, "it");
        this.LJLIL.LIZ.remove(this.LJLILLLLZI);
        return it;
    }
}
