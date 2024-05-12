package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* loaded from: classes13.dex */
public final class TP8<T> implements InterfaceC66992k3<C35794E3a<? extends ProviderEffectModel>> {
    public final /* synthetic */ TP4 LJLIL;
    public final /* synthetic */ TPH LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public TP8(TP4 tp4, TPH tph, int i) {
        this.LJLIL = tp4;
        this.LJLILLLLZI = tph;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<C35794E3a<? extends ProviderEffectModel>> interfaceC65052gv) {
        InterfaceC84497XEf invoke = this.LJLIL.LJ.invoke();
        TP4 tp4 = this.LJLIL;
        invoke.LJIIIZ(tp4.LJFF, tp4.LJI, this.LJLILLLLZI.LJLIL, this.LJLJI, new TPD((C73578SuE) interfaceC65052gv));
    }
}
