package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;

/* loaded from: classes13.dex */
public final class TP6<T> implements InterfaceC66992k3<C35794E3a<? extends CategoryEffectModel>> {
    public final /* synthetic */ TP5 LJLIL;
    public final /* synthetic */ TPF LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public TP6(TP5 tp5, TPF tpf, int i) {
        this.LJLIL = tp5;
        this.LJLILLLLZI = tpf;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<C35794E3a<? extends CategoryEffectModel>> interfaceC65052gv) {
        TP5 tp5 = this.LJLIL;
        if (tp5.LJI) {
            InterfaceC84497XEf invoke = tp5.LJ.invoke();
            String str = this.LJLIL.LJFF;
            TPF tpf = this.LJLILLLLZI;
            String str2 = tpf.LJLJJL;
            C84499XEh.LIZ(this.LJLJI, tpf.LJLIL, tpf.LJLILLLLZI, new TP9((C73578SuE) interfaceC65052gv), invoke, str, str2, tpf.LJLJI, null, true);
            return;
        }
        InterfaceC84497XEf invoke2 = tp5.LJ.invoke();
        String str3 = this.LJLIL.LJFF;
        TPF tpf2 = this.LJLILLLLZI;
        C84499XEh.LIZIZ(invoke2, str3, tpf2.LJLJJL, this.LJLJI, tpf2.LJLIL, tpf2.LJLILLLLZI, tpf2.LJLJI, new TPA((C73578SuE) interfaceC65052gv));
    }
}
