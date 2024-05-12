package com.ss.android.ugc.aweme.sticker.pagination;

import X.C74266TCs;
import X.C74267TCt;
import X.T4I;
import Y.AObserverS80S0100000_12;
import Y.IDrS50S0100000_12;
import android.view.View;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public final class CategoryEffectPageFragment extends StickerCategoryFragment {
    public final Map<Integer, View> LLFF = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final T4I<Effect> Tl() {
        return new PagingStickerListViewModel(this, Al().LJJIL().LJLJL, Al(), vl(), Dl(), Wl());
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFF).clear();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final C74266TCs Vl() {
        return new C74267TCt(Al(), Dl(), Pl(), xl().LJFF, wl().LIZLLL, wl().LIZIZ, wl(), Ol(), this.LJLJJL);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final void Ml() {
        super.Ml();
        w6().LJIIJJI(new IDrS50S0100000_12(this, 6));
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final void Nl() {
        super.Nl();
        Pl().ro0().observe(this, new AObserverS80S0100000_12(this, 27));
    }
}
