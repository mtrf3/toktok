package com.ss.android.ugc.aweme.sticker.pagination;

import X.C53048Krs;
import X.InterfaceC46204IBk;
import X.InterfaceC73367Sqp;
import X.TEF;
import X.TEZ;
import Y.AObserverS80S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.SharedPoolStickerListViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class PagingStickerListViewModel extends SharedPoolStickerListViewModel {
    public final C53048Krs LJLLLLLL;
    public String LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public final AObserverS80S0100000_12 LLD;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.SharedPoolStickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerListViewModel, X.T4I
    public final void do0(String categoryKey) {
        int i;
        o.LJIIIZ(categoryKey, "categoryKey");
        if (ujb.o.LJJJJJL(categoryKey)) {
            return;
        }
        this.LJLZ = categoryKey;
        if (this.LL == 0) {
            i = this.LJLLLLLL.LJLILLLLZI;
        } else {
            i = this.LJLLLLLL.LJLJI;
        }
        this.LJLJLLL.LJJJJLL().LIZ().LIZJ(true, false, categoryKey, this.LJZ, this.LJZI, i, null).observe(this.LJLLL, this.LLD);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingStickerListViewModel(StickerCategoryFragment lifecycleOwner, C53048Krs paginationConfig, TEZ tez, InterfaceC46204IBk clickController, TEF tagHandler, InterfaceC73367Sqp interfaceC73367Sqp) {
        super(lifecycleOwner, tez, clickController, tagHandler, interfaceC73367Sqp);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(paginationConfig, "paginationConfig");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(tagHandler, "tagHandler");
        this.LJLLLLLL = paginationConfig;
        this.LJLZ = "";
        this.LLD = new AObserverS80S0100000_12(this, 0);
    }
}
