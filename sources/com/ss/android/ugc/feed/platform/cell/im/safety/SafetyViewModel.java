package com.ss.android.ugc.feed.platform.cell.im.safety;

import X.InterfaceC45541Hu5;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

/* loaded from: classes10.dex */
public final class SafetyViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJJI = 0;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI = "";

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        InterfaceC45541Hu5 cameraService = IMService.createIIMServicebyMonsterPlugin(false).getCameraService();
        if (!this.LJLILLLLZI && this.LJLIL) {
            cameraService.LJIIIZ(this.LJLJI);
        }
        super.onCleared();
    }
}
