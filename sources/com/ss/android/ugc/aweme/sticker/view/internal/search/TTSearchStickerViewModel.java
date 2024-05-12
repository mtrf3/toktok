package com.ss.android.ugc.aweme.sticker.view.internal.search;

import X.C74316TEq;
import X.InterfaceC46204IBk;
import X.TEZ;
import X.THA;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TTSearchStickerViewModel extends SearchStickerViewModel {
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel, X.TF1
    public final void hi0(C74316TEq c74316TEq) {
        this.LLFF.setValue(c74316TEq.LJLJI);
        this.LL = c74316TEq;
        this.LLD = System.currentTimeMillis();
        this.LJLJLLL.LJJJJLL().LJII(c74316TEq);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTSearchStickerViewModel(LifecycleOwner lifecycleOwner, TEZ stickerDataManager, InterfaceC46204IBk clickController, THA tha) {
        super(lifecycleOwner, stickerDataManager, clickController, tha);
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(clickController, "clickController");
    }
}
