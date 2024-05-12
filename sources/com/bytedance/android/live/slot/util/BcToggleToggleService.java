package com.bytedance.android.live.slot.util;

import X.C28529BHp;
import X.C28530BHq;
import X.C28531BHr;
import X.C28532BHs;
import X.C71233RxV;
import X.C72818Shy;
import com.bytedance.android.live.slot.IBcToggleService;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class BcToggleToggleService implements IBcToggleService {
    public static final C28532BHs LJLIL = new C28532BHs();
    public static final C28530BHq LJLILLLLZI = new C28530BHq();
    public static volatile boolean LJLJI;

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void destroy() {
        LJLJI = false;
        C28530BHq c28530BHq = LJLILLLLZI;
        C28531BHr c28531BHr = c28530BHq.LIZIZ().LIZ;
        c28531BHr.LIZ = 3;
        c28531BHr.LIZJ = 3;
        c28531BHr.LIZIZ = false;
        c28531BHr.LIZLLL = false;
        c28531BHr.LJFF = false;
        C72818Shy.LJII("liveBrandToggle", c28530BHq);
        c28530BHq.LJLIL = null;
        DataChannelGlobal.LJLJJI.tv0(ECBcToggleChannel.class, null);
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void init() {
        if (LJLJI) {
            return;
        }
        LJLJI = true;
        C72818Shy.LIZLLL("liveBrandToggle", LJLILLLLZI);
    }

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void DL(CommercialContentToggle commercialContentToggle) {
        C28530BHq c28530BHq = LJLILLLLZI;
        c28530BHq.getClass();
        c28530BHq.LIZIZ().LIZIZ = commercialContentToggle;
        DataChannelGlobal.LJLJJI.tv0(ECBcToggleChannel.class, c28530BHq.LIZIZ());
    }

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void Ds(C28529BHp callback) {
        o.LJIIIZ(callback, "callback");
        LJLILLLLZI.getClass();
    }

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void JO(AqS155S0100000_5 aqS155S0100000_5) {
        LJLILLLLZI.LJLJI = aqS155S0100000_5;
    }

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void Jw(C71233RxV c71233RxV) {
        LJLILLLLZI.LJLILLLLZI = c71233RxV;
    }

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void iV(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "liveMode");
        LJLILLLLZI.LJLIL = liveMode;
    }

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void pq0(boolean z) {
        LJLILLLLZI.LJLJJI = z;
    }

    @Override // com.bytedance.android.live.slot.IBcToggleService
    public final void os0(int i, int i2, LiveMode liveMode) {
        boolean z;
        if (i == 0) {
            C28531BHr c28531BHr = LJLILLLLZI.LIZIZ().LIZ;
            if (i2 != 1) {
                if (i2 == 2 && c28531BHr.LIZJ == 2) {
                    return;
                }
            } else if (c28531BHr.LIZ == 2) {
                return;
            }
            C28530BHq c28530BHq = LJLILLLLZI;
            C28531BHr c28531BHr2 = c28530BHq.LIZIZ().LIZ;
            if (i2 != 1) {
                if (i2 == 2) {
                    if (c28530BHq.LJLIL == LiveMode.VIDEO) {
                        z = c28531BHr2.LJFF;
                    } else {
                        z = c28531BHr2.LIZLLL;
                    }
                }
            } else {
                z = c28531BHr2.LIZIZ;
            }
            if (z) {
                C28531BHr c28531BHr3 = c28530BHq.LIZIZ().LIZ;
                if (i2 == 1 ? c28531BHr3.LIZ == 1 : !(i2 != 2 || c28531BHr3.LIZJ != 1)) {
                    i = 2;
                }
            }
        }
        C28530BHq c28530BHq2 = LJLILLLLZI;
        C28531BHr c28531BHr4 = c28530BHq2.LIZIZ().LIZ;
        c28531BHr4.getClass();
        int i3 = c28531BHr4.LIZ;
        boolean z2 = c28531BHr4.LIZIZ;
        int i4 = c28531BHr4.LIZJ;
        C28531BHr c28531BHr5 = new C28531BHr(i3, z2, c28531BHr4.LIZLLL, c28531BHr4.LJFF, i4, c28531BHr4.LJ);
        c28530BHq2.LIZ(i, i2, liveMode);
        if (!o.LJ(c28531BHr5, c28530BHq2.LIZIZ().LIZ)) {
            DataChannelGlobal.LJLJJI.tv0(ECBcToggleChannel.class, c28530BHq2.LIZIZ());
        }
    }
}
