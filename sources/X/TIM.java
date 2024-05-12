package X;

import Y.ACallableS89S0200000_12;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes13.dex */
public final class TIM implements InterfaceC29911Fj<C74413TIj<CategoryEffectModel>> {
    public final /* synthetic */ InterfaceC74309TEj LJLIL;
    public final /* synthetic */ W48 LJLILLLLZI;
    public final /* synthetic */ TEZ LJLJI;
    public final /* synthetic */ InterfaceC74393THp LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        CategoryEffectModel categoryEffectModel;
        I9W LJJLIIJ;
        C74413TIj c74413TIj = (C74413TIj) obj;
        if (c74413TIj != null && (categoryEffectModel = (CategoryEffectModel) c74413TIj.LIZ) != null) {
            InterfaceC74309TEj interfaceC74309TEj = this.LJLIL;
            W48 w48 = this.LJLILLLLZI;
            TEZ tez = this.LJLJI;
            InterfaceC74393THp interfaceC74393THp = this.LJLJJI;
            C74310TEk.LIZ(interfaceC74309TEj, "sticker_category:favorite", false, 14).removeObserver(this);
            Effect effect = (Effect) ORZ.LJLLLL(categoryEffectModel.getEffects());
            if (effect != null) {
                tez.LJJIIJ(new C74397THt(effect, true, null, 4), null);
            }
            if (((Boolean) C52514KjG.LIZ.getValue()).booleanValue() || (LJJLIIJ = w48.LJJLIIJ()) == null || LJJLIIJ.LLLF() == null) {
                return;
            }
            C10K.LIZJ(new ACallableS89S0200000_12(categoryEffectModel, StickerStatesStoreViewModel.hv0((StickerStatesStoreViewModel) C165706es.LJIIIIZZ(w48.LJLLLLLL, null, null, 6).get(StickerStatesStoreViewModel.class), interfaceC74393THp.LJ(), categoryEffectModel.getCategory_key(), 4), 2));
        }
    }

    public TIM(InterfaceC74309TEj interfaceC74309TEj, W48 w48, TEZ tez, InterfaceC74393THp interfaceC74393THp) {
        this.LJLIL = interfaceC74309TEj;
        this.LJLILLLLZI = w48;
        this.LJLJI = tez;
        this.LJLJJI = interfaceC74393THp;
    }
}
