package com.ss.android.ugc.aweme.nows.tab.viewmodel;

import X.C221108m2;
import X.C9M8;
import androidx.lifecycle.ViewModel;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class NowFFPAlertBadgeControl extends ViewModel {
    public NowFFPAlertBadgeControl() {
        C221108m2.LIZIZ(C9M8.LJLIL);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZJ().LJIJ(this);
    }
}
