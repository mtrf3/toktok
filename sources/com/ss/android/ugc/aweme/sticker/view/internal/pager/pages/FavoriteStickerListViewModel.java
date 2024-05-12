package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.C61878OQg;
import X.C74321TEv;
import X.C74413TIj;
import X.EnumC74323TEx;
import X.InterfaceC46204IBk;
import X.TEF;
import X.TEN;
import X.TEZ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class FavoriteStickerListViewModel extends StickerListViewModel {
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel
    public final void lv0(C74413TIj<CategoryEffectModel> wrapper) {
        List<Effect> effects;
        o.LJIIIZ(wrapper, "wrapper");
        EnumC74323TEx enumC74323TEx = wrapper.LIZIZ;
        if (enumC74323TEx == null) {
            return;
        }
        int i = C74321TEv.LIZ[enumC74323TEx.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                CategoryEffectModel categoryEffectModel = wrapper.LIZ;
                if (categoryEffectModel == null || (effects = categoryEffectModel.getEffects()) == null || effects.isEmpty()) {
                    this.LJLJJL.setValue(TEN.EMPTY);
                    this.LJLILLLLZI.setValue(C61878OQg.INSTANCE);
                    return;
                } else {
                    this.LJLJJL.setValue(TEN.NONE);
                    kv0(effects);
                    return;
                }
            }
            Throwable th = wrapper.LIZJ;
            if ((th instanceof StatusCodeException) && ((StatusCodeException) th).getStatusCode() == 8) {
                this.LJLJJL.setValue(TEN.EMPTY);
                return;
            } else {
                this.LJLJJL.setValue(TEN.ERROR);
                return;
            }
        }
        this.LJLJJL.setValue(TEN.LOADING);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteStickerListViewModel(StickerCategoryFragment lifecycleOwner, TEZ tez, InterfaceC46204IBk clickController, TEF tagHandler) {
        super(lifecycleOwner, tez, clickController, tagHandler, null, false, 48);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(tagHandler, "tagHandler");
    }
}
