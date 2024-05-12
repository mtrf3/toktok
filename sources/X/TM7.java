package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TM7<T, R> implements InterfaceC48038ItG<T, R> {
    public final /* synthetic */ LifecycleOwner LJLIL;
    public final /* synthetic */ TBW LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;
    public final /* synthetic */ TBW LJLJJI;
    public final /* synthetic */ InterfaceC88473Ynt LJLJJL;

    public TM7(LifecycleOwner lifecycleOwner, TBW tbw, TBW tbw2, TBW tbw3, InterfaceC88473Ynt interfaceC88473Ynt) {
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = tbw;
        this.LJLJI = tbw2;
        this.LJLJJI = tbw3;
        this.LJLJJL = interfaceC88473Ynt;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIJ(it, "it");
        return new C157166Eu(this.LJLILLLLZI.get(it), this.LJLJI.get(it), this.LJLJJI.get(it));
    }
}
