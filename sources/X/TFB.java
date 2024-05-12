package X;

import Y.AObserverS75S0200000_12;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* loaded from: classes13.dex */
public final class TFB implements Observer<C74413TIj<PanelInfoModel>> {
    public final /* synthetic */ SearchStickerViewModel LJLIL;
    public final /* synthetic */ TEZ LJLILLLLZI;
    public final /* synthetic */ LifecycleOwner LJLJI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C74413TIj<PanelInfoModel> c74413TIj) {
        PanelInfoModel panelInfoModel;
        CategoryEffectModel categoryEffectModel;
        String categoryKey;
        C74413TIj<PanelInfoModel> c74413TIj2 = c74413TIj;
        if (c74413TIj2 == null || (panelInfoModel = c74413TIj2.LIZ) == null || (categoryEffectModel = panelInfoModel.getCategoryEffectModel()) == null || (categoryKey = categoryEffectModel.getCategoryKey()) == null || categoryKey.length() == 0 || categoryEffectModel == null) {
            return;
        }
        C74310TEk.LIZIZ(this.LJLILLLLZI.LJJJJLL().LIZ(), false, 15).removeObserver(this);
        C74310TEk.LIZ(this.LJLILLLLZI.LJJJJLL().LIZ(), categoryEffectModel.getCategoryKey(), false, 14).observe(this.LJLJI, new AObserverS75S0200000_12(categoryEffectModel, this, 45));
    }

    public TFB(SearchStickerViewModel searchStickerViewModel, TEZ tez, LifecycleOwner lifecycleOwner) {
        this.LJLIL = searchStickerViewModel;
        this.LJLILLLLZI = tez;
        this.LJLJI = lifecycleOwner;
    }
}
