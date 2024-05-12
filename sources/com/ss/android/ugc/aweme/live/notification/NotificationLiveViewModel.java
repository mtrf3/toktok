package com.ss.android.ugc.aweme.live.notification;

import X.ALZ;
import X.AYW;
import X.C73969T1h;
import X.InterfaceC68914R2w;
import X.T16;
import X.UC0;
import Y.AfS56S0100000_4;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NotificationLiveViewModel extends JediViewModel<ResponseState> {
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final ResponseState kv0() {
        return new ResponseState(0, 0, null, null, 15, null);
    }

    public final void Hv0(String secToUserId) {
        if (secToUserId == null || secToUserId.length() == 0) {
            return;
        }
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ().getClass();
        o.LJIIIZ(secToUserId, "secToUserId");
        AYW.LJLILLLLZI.getClass();
        disposeOnClear(UC0.LJ(AYW.LJLJJI).LJII(secToUserId, new InterfaceC68914R2w[0]).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 28), ALZ.LJLIL));
    }
}
