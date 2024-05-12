package com.ss.android.ugc.tools.infosticker.view.internal.main;

import X.AbstractC73638SvC;
import X.C164246cW;
import X.C69610RTq;
import X.C73634Sv8;
import X.RTW;
import X.TMQ;
import X.TMR;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InfoStickerEmojiListViewModel extends BaseInfoStickerListViewModel {
    public C69610RTq LJLJJL;
    public TMR<Effect, CategoryEffectModel> LJLJJLL;
    public final TMQ LJLJL;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC73638SvC<List<Effect>> gv0() {
        TMQ tmq = this.LJLJL;
        C69610RTq c69610RTq = this.LJLJJL;
        if (c69610RTq != null) {
            TMR<Effect, CategoryEffectModel> LIZIZ = tmq.LIZIZ(c69610RTq);
            this.LJLJJLL = LIZIZ;
            return LIZIZ.next();
        }
        "ListMeta not fetched yet".toString();
        throw new IllegalArgumentException("ListMeta not fetched yet");
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC73638SvC<List<Effect>> hv0() {
        C73634Sv8 next;
        TMR<Effect, CategoryEffectModel> tmr = this.LJLJJLL;
        if (tmr != null && (next = tmr.next()) != null) {
            return next;
        }
        return AbstractC73638SvC.LJIILJJIL(new IllegalStateException("Illegal method invoke order, should request data before request more."));
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.TL9
    public final void CD(RTW rtw) {
        if (rtw instanceof C69610RTq) {
            this.LJLJJL = (C69610RTq) rtw;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoStickerEmojiListViewModel(C164246cW lifecycleOwner, TMQ repository) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(repository, "repository");
        this.LJLJL = repository;
    }
}
