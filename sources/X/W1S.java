package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;

/* loaded from: classes15.dex */
public final class W1S extends AbstractC65781Prl implements InterfaceC88472Yns<W1T, C76800UCe> {
    public final /* synthetic */ LifecycleOwner LJLIL;
    public final /* synthetic */ TBW LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;
    public final /* synthetic */ TBW LJLJJI;
    public final /* synthetic */ TBW LJLJJL;
    public final /* synthetic */ InterfaceC88474Ynu LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1S(C73165SnZ c73165SnZ, JediViewModel jediViewModel, LifecycleOwner lifecycleOwner, TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4, InterfaceC88474Ynu interfaceC88474Ynu) {
        super(1);
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = tbw;
        this.LJLJI = tbw2;
        this.LJLJJI = tbw3;
        this.LJLJJL = tbw4;
        this.LJLJJLL = interfaceC88474Ynu;
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(W1T w1t) {
        m46invoke(w1t);
        return C76800UCe.LIZ;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m46invoke(W1T w1t) {
        W1T w1t2 = w1t;
        this.LJLJJLL.invoke(w1t2.LJLIL, w1t2.LJLILLLLZI, w1t2.LJLJI, w1t2.LJLJJI);
    }
}
