package com.bytedance.android.livesdk.broadcast.preview.widget.livegoal;

import X.BP4;
import X.C1EW;
import X.C221108m2;
import X.C28717BOv;
import X.C28718BOw;
import X.C62822Ol8;
import X.C73318Sq2;
import Y.AfS57S0100000_5;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.broadcast.api.LiveGetGoalInfoApi;

/* loaded from: classes6.dex */
public final class LiveGoalPreviewViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C28717BOv.LJLIL);
    public final MutableLiveData<Boolean> LJLILLLLZI = new MutableLiveData<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C73318Sq2) this.LJLIL.getValue()).dispose();
    }

    public final void gv0(long j, String str) {
        C73318Sq2 c73318Sq2 = (C73318Sq2) this.LJLIL.getValue();
        BP4 LIZ = C28718BOw.LIZ();
        LIZ.getClass();
        c73318Sq2.LIZ(C1EW.LIZ(((LiveGetGoalInfoApi) LIZ.LIZIZ(LiveGetGoalInfoApi.class)).getGoalInfo(str, j, 1, 1)).LJJJLIIL(new AfS57S0100000_5(this, 240), new AfS57S0100000_5(this, 241)));
    }
}
