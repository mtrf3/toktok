package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.C221108m2;
import X.C62822Ol8;
import X.C74266TCs;
import X.C74268TCu;
import X.InterfaceC46204IBk;
import X.InterfaceC74336TFk;
import X.T4I;
import X.TEF;
import X.TEZ;
import com.ss.android.ugc.aweme.sticker.original.OriginalStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class OriginalFragment extends StickerCategoryFragment {
    public static final /* synthetic */ int LLFZ = 0;
    public InterfaceC74336TFk LLFF;
    public Effect LLFFF;
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(new AqS162S0100000_12(this, 914));

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final EffectCategoryModel Ol() {
        return (EffectCategoryModel) this.LLFII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final void _$_clearFindViewByIdCache() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final T4I<Effect> Tl() {
        TEZ Al = Al();
        InterfaceC46204IBk vl = vl();
        TEF Dl = Dl();
        InterfaceC74336TFk interfaceC74336TFk = this.LLFF;
        if (interfaceC74336TFk != null) {
            Effect effect = this.LLFFF;
            if (effect != null) {
                return new OriginalStickerViewModel(this, Al, vl, Dl, interfaceC74336TFk, effect);
            }
            o.LJIJI("currentEffect");
            throw null;
        }
        o.LJIJI("requestDesignerEffect");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment
    public final C74266TCs Vl() {
        return new C74268TCu(Al(), Dl(), Pl(), xl().LJFF, wl().LIZLLL, wl().LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final void Il() {
        Pl().do0("mCategoryKey");
    }
}
