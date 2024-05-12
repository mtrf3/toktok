package com.ss.android.ugc.tools.infosticker.view.internal.main;

import X.AbstractC73672Svk;
import X.C109434Rf;
import X.TMQ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InfoStickerStateViewModel extends BaseInfoStickerStateViewModel {
    public final TMQ LJLJJL;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
    public final AbstractC73672Svk gv0(Object obj) {
        Effect sticker = (Effect) obj;
        o.LJIIIZ(sticker, "sticker");
        return this.LJLJJL.LJFF(sticker, true).LJJIJL(C109434Rf.LJLIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoStickerStateViewModel(LifecycleOwner lifecycleOwner, TMQ repository) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(repository, "repository");
        this.LJLJJL = repository;
    }
}
