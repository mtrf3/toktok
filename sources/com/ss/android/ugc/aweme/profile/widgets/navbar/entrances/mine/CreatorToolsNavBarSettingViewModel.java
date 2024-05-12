package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine;

import X.C221108m2;
import X.C244749j4;
import X.C244799j9;
import X.C43I;
import X.C62822Ol8;
import X.C73969T1h;
import X.T16;
import Y.AfS56S0100000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.setting.services.ICreatorToolService;

/* loaded from: classes5.dex */
public final class CreatorToolsNavBarSettingViewModel extends AssemViewModel<C244749j4> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C244799j9.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C244749j4 defaultState() {
        return new C244749j4(new C43I(Boolean.FALSE));
    }

    public final void gv0() {
        disposeOnClear(((ICreatorToolService) this.LJLIL.getValue()).getCreatorPlusFeatures().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 57), new AfS56S0100000_4(this, 58)));
    }
}
