package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.C74266TCs;
import X.SIZ;
import X.T4I;
import X.TEN;
import X.TEW;
import X.TLG;
import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class FavoriteFragment extends StickerCategoryFragment {
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final void _$_clearFindViewByIdCache() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final T4I<Effect> Tl() {
        return new FavoriteStickerListViewModel(this, Al(), vl(), Dl());
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final TLG<TEN> Kl(View root) {
        o.LJIIIZ(root, "root");
        TLG<TEN> Kl = super.Kl(root);
        ((TEW) Kl).LIZ(TEN.EMPTY, new AqS178S0100000_12(this, 296));
        return Kl;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final void Xl(List<? extends Effect> list) {
        o.LJIIIZ(list, "list");
        C74266TCs c74266TCs = this.LJLJJI;
        if (c74266TCs != null && mo49getActivity() != null) {
            c74266TCs.LJLJI = this.LJLJJL;
            c74266TCs.setData(list);
            SIZ.LIZIZ(list, Al());
        }
    }
}
