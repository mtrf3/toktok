package com.ss.android.ugc.tools.infosticker.view.internal.main1;

import X.AbstractC73638SvC;
import X.InterfaceC74451TJv;
import X.OSZ;
import X.RTW;
import X.TFO;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;

/* loaded from: classes13.dex */
public final class InfoStickerListNewViewModel extends BaseInfoStickerListViewModel implements InterfaceC74451TJv {
    public TFO LJLJJL;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC74451TJv
    public final LiveData<List<OSZ<EffectCategoryModel, List<InfoStickerEffect>>>> qq0() {
        return null;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC73638SvC<List<InfoStickerEffect>> gv0() {
        if (this.LJLJJL == null) {
            "ListMeta not fetched yet".toString();
            throw new IllegalArgumentException("ListMeta not fetched yet");
        }
        throw null;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC73638SvC<List<InfoStickerEffect>> hv0() {
        throw new NoSuchMethodException("Category sticker list does not support load more action.");
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.TL9
    public final void CD(RTW rtw) {
        if (rtw instanceof TFO) {
            this.LJLJJL = (TFO) rtw;
            F9();
        }
    }
}
