package com.ss.android.ugc.aweme.viewModel;

import X.C36392EQa;
import X.C72568Sdw;
import X.C72569Sdx;
import X.C72570Sdy;
import X.C72593SeL;
import X.C73969T1h;
import X.InterfaceC61312at;
import X.OON;
import X.OOO;
import X.T16;
import Y.AfS61S0200000_12;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviSwitcherViewModel extends BaseJediViewModel<ProfileNaviSwitcherState> {
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new ProfileNaviSwitcherState(null, false, false, false, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Mv0() {
        ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) lv0();
        if (profileNaviSwitcherState.getHasMore()) {
            OOO ooo = new OOO();
            OON oon = new OON();
            oon.LIZ = ooo.LIZ;
            C36392EQa.LIZ(oon).LJJIIJ(T16.LIZ).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS61S0200000_12(profileNaviSwitcherState, this, 6), C72568Sdw.LJLIL);
        }
    }

    public final void Nv0(ProfileNaviDataModel navi) {
        o.LJIIIZ(navi, "navi");
        C72593SeL.LIZ.LIZIZ(navi);
        setStateImmediate(C72569Sdx.LJLIL);
        setStateImmediate(C72570Sdy.LJLIL);
    }
}
