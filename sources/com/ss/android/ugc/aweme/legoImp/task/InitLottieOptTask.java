package com.ss.android.ugc.aweme.legoImp.task;

import X.C04040Dw;
import X.C0RN;
import X.C84723XMx;
import X.C84724XMy;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC04030Dv;
import android.content.Context;
import android.os.SystemClock;
import java.util.List;

/* loaded from: classes16.dex */
public final class InitLottieOptTask implements EE1 {
    public static final C84723XMx LJLIL = new C84723XMx();

    @Override // X.EEY
    public final String key() {
        return "InitLottieOptTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        SystemClock.uptimeMillis();
        C04040Dw.LIZ = C84724XMy.LIZ;
        if (C04040Dw.LIZIZ) {
            synchronized (C04040Dw.class) {
                InterfaceC04030Dv interfaceC04030Dv = C04040Dw.LIZ;
                if (interfaceC04030Dv != null) {
                    interfaceC04030Dv.LIZ();
                    C04040Dw.LIZ = null;
                } else {
                    C04040Dw.LIZIZ = true;
                }
            }
            C04040Dw.LIZIZ = false;
        }
    }
}
