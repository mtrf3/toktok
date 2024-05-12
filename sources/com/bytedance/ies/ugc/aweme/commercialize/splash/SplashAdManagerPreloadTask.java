package com.bytedance.ies.ugc.aweme.commercialize.splash;

import X.C0RN;
import X.C10K;
import X.C34710Djm;
import X.C36922EeM;
import X.C55511LqV;
import X.C61358O6g;
import X.C87549YXp;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import X.O6Z;
import Y.ACallableS41S0000000_6;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public class SplashAdManagerPreloadTask implements EE1, InterfaceC36076EDw {
    @Override // X.EEY
    public final String key() {
        return "SplashAdManagerPreloadTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC36076EDw
    public final String[] deps() {
        return new String[]{"InitAdServiceTask"};
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C36922EeM.LJ("SplashAdManagerPreloadTask");
        if (((Boolean) C87549YXp.LIZLLL.getValue()).booleanValue()) {
            C10K.LIZIZ(new ACallableS41S0000000_6(6), C10K.LJI, null);
        }
        C61358O6g.LIZIZ(context);
        if (((Boolean) C34710Djm.LJJJJ.getValue()).booleanValue() && SplashAdServiceImpl.LJJI().LJIILJJIL()) {
            O6Z o6z = O6Z.LIZ;
            O6Z.LIZJ();
            C55511LqV.LJIIJ = true;
            o6z.LIZ(context);
        }
        if (((Boolean) C87549YXp.LJ.getValue()).booleanValue() && C55511LqV.LIZJ && !C55511LqV.LJIIJ) {
            C55511LqV.LJIIJ = true;
            O6Z.LIZ.LIZ(context);
        }
    }
}
