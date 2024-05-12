package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OSP<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ TBW LJLIL;
    public final /* synthetic */ TBW LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;
    public final /* synthetic */ TBW LJLJJI;

    public OSP(TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4) {
        this.LJLIL = tbw;
        this.LJLILLLLZI = tbw2;
        this.LJLJI = tbw3;
        this.LJLJJI = tbw4;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIIZ(it, "it");
        return new OSL(this.LJLIL.get(it), this.LJLILLLLZI.get(it), this.LJLJI.get(it), this.LJLJJI.get(it));
    }
}
