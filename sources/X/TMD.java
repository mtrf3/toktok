package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TMD<T, R> implements InterfaceC48038ItG<T, R> {
    public final /* synthetic */ LifecycleOwner LJLIL;
    public final /* synthetic */ TBW LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;
    public final /* synthetic */ TBW LJLJJI;
    public final /* synthetic */ TBW LJLJJL;
    public final /* synthetic */ TBW LJLJJLL;
    public final /* synthetic */ InterfaceC88475Ynv LJLJL;

    public TMD(LifecycleOwner lifecycleOwner, TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4, TBW tbw5, InterfaceC88475Ynv interfaceC88475Ynv) {
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = tbw;
        this.LJLJI = tbw2;
        this.LJLJJI = tbw3;
        this.LJLJJL = tbw4;
        this.LJLJJLL = tbw5;
        this.LJLJL = interfaceC88475Ynv;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIJ(it, "it");
        return new TMF(this.LJLILLLLZI.get(it), this.LJLJI.get(it), this.LJLJJI.get(it), this.LJLJJL.get(it), this.LJLJJLL.get(it));
    }
}
