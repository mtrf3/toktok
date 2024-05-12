package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OSN<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ TBW LJLIL;
    public final /* synthetic */ TBW LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;

    public OSN(TBW tbw, TBW tbw2, TBW tbw3) {
        this.LJLIL = tbw;
        this.LJLILLLLZI = tbw2;
        this.LJLJI = tbw3;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIIZ(it, "it");
        return new OSK(this.LJLIL.get(it), this.LJLILLLLZI.get(it), this.LJLJI.get(it));
    }
}
