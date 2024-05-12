package com.ss.android.ugc.aweme.bnpl.biz.credit.landing;

import X.C113554cx;
import X.C91824a0q;
import X.C91924a2S;
import X.C92264a7w;
import X.OSZ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class LandingAssemVM extends AssemViewModel<C92264a7w> {
    public long LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C92264a7w defaultState() {
        return new C92264a7w(0);
    }

    public final void onEventClick(String objId) {
        o.LJIIIZ(objId, "objId");
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_landing_click", "bnpl_activate_landing", C91824a0q.LJFF, C113554cx.LJJL(new OSZ("obj_id", objId), new OSZ("click_use_time", String.valueOf(System.currentTimeMillis() - this.LJLIL))), 8);
    }
}
