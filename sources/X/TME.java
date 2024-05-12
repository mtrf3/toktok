package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;

/* loaded from: classes13.dex */
public final class TME extends AbstractC65781Prl implements InterfaceC88472Yns<TMF, C76800UCe> {
    public final /* synthetic */ LifecycleOwner LJLIL;
    public final /* synthetic */ TBW LJLILLLLZI;
    public final /* synthetic */ TBW LJLJI;
    public final /* synthetic */ TBW LJLJJI;
    public final /* synthetic */ TBW LJLJJL;
    public final /* synthetic */ TBW LJLJJLL;
    public final /* synthetic */ InterfaceC88475Ynv LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TME(C73165SnZ c73165SnZ, JediViewModel jediViewModel, LifecycleOwner lifecycleOwner, TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4, TBW tbw5, InterfaceC88475Ynv interfaceC88475Ynv) {
        super(1);
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = tbw;
        this.LJLJI = tbw2;
        this.LJLJJI = tbw3;
        this.LJLJJL = tbw4;
        this.LJLJJLL = tbw5;
        this.LJLJL = interfaceC88475Ynv;
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(TMF tmf) {
        m41invoke(tmf);
        return C76800UCe.LIZ;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m41invoke(TMF tmf) {
        TMF tmf2 = tmf;
        this.LJLJL.invoke(tmf2.LJLIL, tmf2.LJLILLLLZI, tmf2.LJLJI, tmf2.LJLJJI, tmf2.LJLJJL);
    }
}
