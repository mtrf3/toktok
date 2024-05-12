package com.ss.android.ugc.aweme.feed.assem.mainactivityobserver;

import X.AbstractC55082Lja;
import X.C16880lQ;
import X.C1DH;
import X.C212428Vi;
import X.C221108m2;
import X.C22690un;
import X.C34X;
import X.C36152EGu;
import X.C37288EkG;
import X.C38816FLg;
import X.C38987FRv;
import X.C38995FSd;
import X.C48236IwS;
import X.C55096Ljo;
import X.C56662Kg;
import X.C62822Ol8;
import X.E3T;
import X.E3W;
import X.FW5;
import X.FWJ;
import X.FWK;
import X.InterfaceC36571c5;
import Y.ARunnableS1S0001000_6;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.feed.count.impl.FeedPlayNumServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CommonFeedActivityAssem extends BaseMainContainerAssem {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 41));
    public final FWK LJLILLLLZI = new FWK(this);

    @Override // X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(CommonFeedActivityAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        ((IPerformanceAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), IPerformanceAbility.class)).uf(new AqS156S0100000_6(this, 42));
        int LJI = C36152EGu.LJI();
        if (LJI != 1) {
            if (LJI == 3 && E3T.LIZ() != E3T.LIZIZ) {
                v3();
            }
        } else {
            v3();
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onResume() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(CommonFeedActivityAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        if (FW5.LJ != -1) {
            FW5.LJFF = SystemClock.elapsedRealtime() - FW5.LJ;
            FW5.LJ = -1L;
            Queue<Runnable> queue = FW5.LJIIIZ;
            if (queue != null) {
                Iterator it = ((LinkedBlockingQueue) queue).iterator();
                while (it.hasNext()) {
                    C38816FLg.LJ((Runnable) it.next());
                }
                ((LinkedBlockingQueue) FW5.LJIIIZ).clear();
                FW5.LJIIIZ = null;
            }
        }
        InterfaceC36571c5 LIZ = C212428Vi.LIZ(this);
        o.LJII(LIZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.IKeyDownListenerActivity");
        ((C34X) LIZ).registerActivityOnKeyDownListener(this.LJLILLLLZI);
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    public static void v3() {
        boolean z;
        long j;
        if (C38987FRv.LIZLLL().booleanValue()) {
            FW5.LJ = SystemClock.elapsedRealtime();
            C62822Ol8 c62822Ol8 = E3W.LJFF;
            if (((Number) c62822Ol8.getValue()).intValue() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int intValue = ((Number) c62822Ol8.getValue()).intValue();
                if (intValue != E3W.LIZIZ) {
                    if (intValue != E3W.LIZJ && intValue != E3W.LIZLLL && intValue != E3W.LJ) {
                        return;
                    }
                    j = 0;
                    C1DH.LJJIJIIJIL(j, new ARunnableS1S0001000_6(1, 18));
                }
            } else if (E3T.LIZ() != E3T.LIZJ && E3T.LIZ() != E3T.LIZLLL && E3T.LIZ() != E3T.LIZIZ) {
                return;
            }
            j = 8000;
            C1DH.LJJIJIIJIL(j, new ARunnableS1S0001000_6(1, 18));
        }
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        AbstractC55082Lja.LLFZ = 0;
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        C22690un.LIZ("feed");
        o.LJIIIIZZ(C48236IwS.LJIIZILJ.getValue(), "<get-START_CACHE>(...)");
        ((ISurveyDebuggerService) ServiceManager.get().getService(ISurveyDebuggerService.class)).isOpen();
        InterfaceC36571c5 LIZ = C212428Vi.LIZ(this);
        o.LJII(LIZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.IKeyDownListenerActivity");
        ((C34X) LIZ).unRegisterActivityOnKeyDownListener(this.LJLILLLLZI);
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        C37288EkG.LIZ();
        FeedPlayNumServiceImpl.LJ().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        if (!z || !z2 || C48236IwS.LJIILJJIL) {
            return;
        }
        C38995FSd.LIZLLL().execute(FWJ.LJLIL);
    }
}
