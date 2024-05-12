package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel;

import X.C221108m2;
import X.C36372EPg;
import X.C47261Igj;
import X.C5L7;
import X.C60903NvH;
import X.C62822Ol8;
import X.C73318Sq2;
import X.EQL;
import X.InterfaceC46204IBk;
import X.InterfaceC73367Sqp;
import X.OSZ;
import X.TEF;
import X.TEZ;
import X.XKX;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.effectcreator.EffectCreatorServiceImpl;
import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TemplateEffectsService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MyEffectsViewModel extends FixedStickerListViewModel {
    public final MutableLiveData<OSZ<Effect, Integer>> LJLLLLLL;
    public final MutableLiveData<Integer> LJLZ;
    public final MutableLiveData<OSZ<Effect, Integer>> LJZ;
    public final MutableLiveData<List<DraftEffect>> LJZI;
    public final C62822Ol8 LJZL;
    public final TemplateEffectsService LL;
    public final C73318Sq2 LLD;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, X.T4I
    public final void do0(String categoryKey) {
        o.LJIIIZ(categoryKey, "categoryKey");
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.FixedStickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLD.LIZLLL();
        super.onCleared();
    }

    public final void nv0(DraftEffect draftEffect) {
        if (draftEffect.getDraft().effectId.length() > 0) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new EQL(this, draftEffect, null), 3);
        } else {
            EffectCreatorServiceImpl.LJIIJ().LIZIZ(C5L7.LIZ(), draftEffect.getDraft().draftID);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyEffectsViewModel(EffectTemplateCategoryFragment lifecycleOwner, TEZ tez, InterfaceC46204IBk clickController, TEF tagHandler, InterfaceC73367Sqp interfaceC73367Sqp) {
        super(lifecycleOwner, tez, clickController, tagHandler, interfaceC73367Sqp);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(tagHandler, "tagHandler");
        this.LJLLLLLL = new MutableLiveData<>();
        this.LJLZ = new MutableLiveData<>();
        this.LJZ = new MutableLiveData<>();
        this.LJZI = new MutableLiveData<>();
        this.LJZL = C221108m2.LIZIZ(C36372EPg.LJLIL);
        TemplateEffectsService.LIZ.getClass();
        this.LL = (TemplateEffectsService) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getNetworkService().createRetrofitWithInterceptors(C60903NvH.LJIIJJI().getNetworkService().getApiHost(), true, TemplateEffectsService.class, C47261Igj.LJJIJ(new EPRequestInterceptor()));
        this.LLD = new C73318Sq2();
    }
}
