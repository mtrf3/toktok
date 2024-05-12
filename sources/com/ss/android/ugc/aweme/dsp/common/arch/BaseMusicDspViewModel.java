package com.ss.android.ugc.aweme.dsp.common.arch;

import X.C73318Sq2;
import X.C78983UzD;
import androidx.lifecycle.ViewModel;

/* loaded from: classes22.dex */
public class BaseMusicDspViewModel extends ViewModel {
    public final C73318Sq2 LJLIL = new C73318Sq2();

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        try {
            this.LJLIL.dispose();
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }
}
