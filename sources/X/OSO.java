package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OSO<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ TBW LJLIL;
    public final /* synthetic */ TBW LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;
    public final /* synthetic */ TBW LJLJJI;
    public final /* synthetic */ TBW LJLJJL;

    public OSO(TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4, TBW tbw5) {
        this.LJLIL = tbw;
        this.LJLILLLLZI = tbw2;
        this.LJLJI = tbw3;
        this.LJLJJI = tbw4;
        this.LJLJJL = tbw5;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIIZ(it, "it");
        return new OSM(this.LJLIL.get(it), this.LJLILLLLZI.get(it), this.LJLJI.get(it), this.LJLJJI.get(it), this.LJLJJL.get(it));
    }
}
