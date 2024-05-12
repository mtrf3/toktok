package com.ss.android.ugc.tools.infosticker.view.internal.main1;

import X.AbstractC73638SvC;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;

/* loaded from: classes13.dex */
public final class InfoStickerCategoryListNewViewModel extends BaseInfoStickerListViewModel {
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC73638SvC<List<InfoStickerEffect>> hv0() {
        return AbstractC73638SvC.LJIILJJIL(new IllegalStateException("Illegal method invoke order, should request data before request more."));
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC73638SvC<List<InfoStickerEffect>> gv0() {
        throw null;
    }
}
