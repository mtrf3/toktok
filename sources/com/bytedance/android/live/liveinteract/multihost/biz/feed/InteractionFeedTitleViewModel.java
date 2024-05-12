package com.bytedance.android.live.liveinteract.multihost.biz.feed;

import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C73098SmU;
import X.C76401Tyf;
import X.C76402Tyg;
import X.C76409Tyn;
import X.InterfaceC76404Tyi;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InteractionFeedTitleViewModel extends ViewModel {
    public DataChannel LJLIL;
    public final C76401Tyf LJLILLLLZI = new C76401Tyf(null, null, null);
    public final MutableLiveData<C76401Tyf> LJLJI = new MutableLiveData<>();

    public final void hv0() {
        gv0(this, C76409Tyn.LIZ, new C76402Tyg(0.6f, C15380j0.LIZ(40.0f), C15380j0.LIZIZ(R.color.a02)));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        super.onCleared();
    }

    public static void gv0(InteractionFeedTitleViewModel interactionFeedTitleViewModel, InterfaceC76404Tyi interfaceC76404Tyi, C76402Tyg c76402Tyg) {
        if (o.LJ(interactionFeedTitleViewModel.LJLILLLLZI.LJLILLLLZI, interfaceC76404Tyi)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switchContentState , target = ");
            LIZ.append(interfaceC76404Tyi);
            LIZ.append(" , return by same");
            C0NB.LIZIZ("InteractionFeedTitleViewModel", X1D.LIZIZ(LIZ));
            return;
        }
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            interactionFeedTitleViewModel.LJLJI.setValue(C76401Tyf.LIZ(interactionFeedTitleViewModel.LJLILLLLZI, interfaceC76404Tyi, c76402Tyg));
        } else {
            interactionFeedTitleViewModel.LJLJI.postValue(C76401Tyf.LIZ(interactionFeedTitleViewModel.LJLILLLLZI, interfaceC76404Tyi, c76402Tyg));
        }
    }
}
