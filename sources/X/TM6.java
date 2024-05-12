package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TM6<T, R> implements InterfaceC48038ItG<T, R> {
    public final /* synthetic */ LifecycleOwner LJLIL;
    public final /* synthetic */ TBW LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;
    public final /* synthetic */ TBW LJLJJI;
    public final /* synthetic */ TBW LJLJJL;
    public final /* synthetic */ InterfaceC88474Ynu LJLJJLL;

    public TM6(LifecycleOwner lifecycleOwner, TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4, InterfaceC88474Ynu interfaceC88474Ynu) {
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = tbw;
        this.LJLJI = tbw2;
        this.LJLJJI = tbw3;
        this.LJLJJL = tbw4;
        this.LJLJJLL = interfaceC88474Ynu;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIJ(it, "it");
        return new W1T(this.LJLILLLLZI.get(it), this.LJLJI.get(it), this.LJLJJI.get(it), this.LJLJJL.get(it));
    }
}
