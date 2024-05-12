package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;

/* loaded from: classes13.dex */
public final class TPB<T> implements InterfaceC66992k3<C35794E3a<? extends CategoryEffectModel>> {
    public final /* synthetic */ TP5 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public TPB(TP5 tp5, int i) {
        this.LJLIL = tp5;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<C35794E3a<? extends CategoryEffectModel>> interfaceC65052gv) {
        C84499XEh.LJI(this.LJLIL.LJ.invoke(), this.LJLIL.LJFF, true, "", this.LJLILLLLZI, 0, 0, CardStruct.IStatusCode.DEFAULT, false, false, new TPC((C73578SuE) interfaceC65052gv), false, false, 0);
    }
}
