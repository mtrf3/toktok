package com.bytedance.android.live.liveinteract.multimatch.clientai;

import X.C0NB;
import X.C1EW;
import X.C221108m2;
import X.C29306Beo;
import X.C32157Cjh;
import X.C32161Cjl;
import X.C32162Cjm;
import X.C32165Cjp;
import X.C32166Cjq;
import X.C32167Cjr;
import X.C32168Cjs;
import X.C5H3;
import X.C62822Ol8;
import X.C65814PsI;
import X.C73411SrX;
import X.C78996UzQ;
import X.InterfaceC65784Pro;
import Y.AfS0S0101100_5;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.livesetting.clientai.CohostNoticeStrategySettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostFriendNoticeOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CoHostFriendNoticeService implements GenericLifecycleObserver {
    public DataChannel LJLJJL;
    public JSONObject LJLJJLL;
    public C73411SrX LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public final ConcurrentHashSet<String> LJLIL = new ConcurrentHashSet<>();
    public final int LJLILLLLZI = LiveCoHostFriendNoticeOptSetting.INSTANCE.getValue();
    public final C5H3 LJLJI = C78996UzQ.LJJIJIIJI(C32157Cjh.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C32168Cjs.LJLIL);
    public final C32162Cjm LJLJL = new C32162Cjm(this);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void LIZIZ() {
        DataChannel dataChannel = this.LJLJJL;
        if (dataChannel == null) {
            return;
        }
        long LJJIZ = C29306Beo.LJJIZ(dataChannel);
        if (LJJIZ <= 0) {
            return;
        }
        LIZ(this, null, new C32161Cjl(this, LJJIZ), 3);
    }

    public final void LIZJ(int i, long j) {
        C0NB.LIZIZ("CoHostFriendNoticeService", "requestTrigger");
        C65814PsI.LIZ().getClass();
        Object LIZJ = C65814PsI.LIZJ(CoHostApi.class);
        o.LJIIIIZZ(LIZJ, "get().getService(CoHostApi::class.java)");
        C1EW.LIZ(((CoHostApi) LIZJ).triggerLivingFriendNotice(j, CohostNoticeStrategySettings.INSTANCE.getGetStickValue())).LJJJLIIL(new AfS0S0101100_5(i, this, j, 0), new AfS0S0101100_5(i, this, j, 1));
    }

    public static void LIZ(CoHostFriendNoticeService coHostFriendNoticeService, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i) {
        C32165Cjp c32165Cjp;
        if ((i & 1) != 0) {
            c32165Cjp = C32165Cjp.LJLIL;
        } else {
            c32165Cjp = null;
        }
        if ((i & 2) != 0) {
            interfaceC65784Pro = C32166Cjq.LJLIL;
        }
        if ((i & 4) != 0) {
            interfaceC65784Pro2 = C32167Cjr.LJLIL;
        }
        int i2 = coHostFriendNoticeService.LJLILLLLZI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        c32165Cjp.getClass();
                        return;
                    } else {
                        interfaceC65784Pro.invoke();
                        interfaceC65784Pro2.invoke();
                        return;
                    }
                }
                interfaceC65784Pro2.invoke();
                return;
            }
            interfaceC65784Pro.invoke();
            return;
        }
        c32165Cjp.getClass();
    }
}
