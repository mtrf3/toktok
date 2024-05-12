package com.ss.android.ugc.aweme.sticker.original;

import X.C68322mC;
import X.InterfaceC46204IBk;
import X.InterfaceC74336TFk;
import X.TEF;
import X.TEZ;
import X.ViewOnClickListenerC74332TFg;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class OriginalStickerViewModel extends StickerListViewModel {
    public boolean LJLLLLLL;
    public int LJLZ;
    public final InterfaceC74336TFk LJZ;
    public final Effect LJZI;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, X.T4I
    public final void do0(String categoryKey) {
        o.LJIIIZ(categoryKey, "categoryKey");
        if (this.LJLLLLLL) {
            return;
        }
        this.LJLLLLLL = true;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        this.LJZ.LIZ(ViewOnClickListenerC74332TFg.LLILIL, new AqS143S0200000_12(this, c68322mC, 62));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginalStickerViewModel(StickerCategoryFragment lifecycleOwner, TEZ tez, InterfaceC46204IBk clickController, TEF tagHandler, InterfaceC74336TFk requestDesignerEffect, Effect currentEffect) {
        super(lifecycleOwner, tez, clickController, tagHandler, null, false, 48);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(requestDesignerEffect, "requestDesignerEffect");
        o.LJIIIZ(currentEffect, "currentEffect");
        this.LJZ = requestDesignerEffect;
        this.LJZI = currentEffect;
    }
}
