package com.ss.android.ugc.tools.infosticker.view.internal.main1;

import X.RTW;
import X.TEN;
import X.TLZ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;

/* loaded from: classes13.dex */
public final class InfoStickerListMetaNewViewModel extends HumbleViewModel implements TLZ {
    @Override // X.TLZ
    public final LiveData<List<RTW>> N90() {
        return null;
    }

    @Override // X.TLZ
    public final LiveData<TEN> getPageState() {
        return null;
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.TLZ
    public final void go() {
        if (isDestroyed()) {
        } else {
            throw null;
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        throw null;
    }
}
