package com.ss.android.ugc.aweme.live.notification;

import X.AYW;
import X.C245469kE;
import X.C73969T1h;
import X.InterfaceC64592gB;
import X.InterfaceC68914R2w;
import X.T16;
import X.UC0;
import Y.AfS56S0100000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NotificationLiveAssemViewModel extends AssemViewModel<C245469kE> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C245469kE defaultState() {
        return new C245469kE(0);
    }

    public final void gv0(String secToUserId) {
        if (secToUserId == null || secToUserId.length() == 0) {
            return;
        }
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ().getClass();
        o.LJIIIZ(secToUserId, "secToUserId");
        AYW.LJLILLLLZI.getClass();
        disposeOnClear(UC0.LJ(AYW.LJLJJI).LJII(secToUserId, new InterfaceC68914R2w[0]).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 27), new InterfaceC64592gB() { // from class: X.9k7
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }));
    }
}
