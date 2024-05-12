package X;

import Y.ACallableS84S0200000_7;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;

/* loaded from: classes8.dex */
public final class ID2 implements Observer<C74413TIj<CategoryEffectModel>> {
    public final /* synthetic */ AbstractC46244ICy LJLIL;
    public final /* synthetic */ InterfaceC74309TEj LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC74393THp LJLJJI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C74413TIj<CategoryEffectModel> c74413TIj) {
        CategoryEffectModel categoryEffectModel;
        C74413TIj<CategoryEffectModel> c74413TIj2 = c74413TIj;
        if (c74413TIj2 != null && (categoryEffectModel = c74413TIj2.LIZ) != null) {
            C74310TEk.LIZ(this.LJLILLLLZI, this.LJLJI, false, 14).removeObserver(this);
            AbstractC46244ICy abstractC46244ICy = this.LJLIL;
            if (abstractC46244ICy.LJLJL.LJIIJJI) {
                abstractC46244ICy.g00(categoryEffectModel.getEffects(), false);
            }
            this.LJLIL.LLILZLL(categoryEffectModel.getEffects());
            if (C82894Wg6.LIZIZ.LJIIJJI() || this.LJLIL.LLLF() == null) {
                return;
            }
            ViewModelProvider viewModelProvider = (ViewModelProvider) this.LJLIL.getDiContainer().LJIIIIZZ(null, ViewModelProvider.class);
            if (viewModelProvider == null) {
                viewModelProvider = ViewModelProviders.of(this.LJLIL.LJLIL);
            }
            C10K.LIZJ(new ACallableS84S0200000_7(((StickerStatesStoreViewModel) viewModelProvider.get(StickerStatesStoreViewModel.class)).gv0(this.LJLJJI.LJ(), categoryEffectModel.getCategory_key(), this.LJLIL.LJZI()), categoryEffectModel, 2));
        }
    }

    public ID2(AbstractC46244ICy abstractC46244ICy, InterfaceC74309TEj interfaceC74309TEj, String str, InterfaceC74393THp interfaceC74393THp) {
        this.LJLIL = abstractC46244ICy;
        this.LJLILLLLZI = interfaceC74309TEj;
        this.LJLJI = str;
        this.LJLJJI = interfaceC74393THp;
    }
}
