package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* loaded from: classes13.dex */
public final class TP7<T> implements InterfaceC66992k3<C35794E3a<? extends ProviderEffectModel>> {
    public final /* synthetic */ TP3 LJLIL;
    public final /* synthetic */ TPH LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public TP7(TP3 tp3, TPH tph, int i) {
        this.LJLIL = tp3;
        this.LJLILLLLZI = tph;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<C35794E3a<? extends ProviderEffectModel>> interfaceC65052gv) {
        InterfaceC84497XEf invoke = this.LJLIL.LJ.invoke();
        TP3 tp3 = this.LJLIL;
        invoke.LJJIIJ(tp3.LJII, tp3.LJFF, this.LJLILLLLZI.LJLIL, this.LJLJI, false, tp3.LJI, new TPE((C73578SuE) interfaceC65052gv));
    }
}
