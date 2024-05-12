package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C100833xX;
import X.C2NW;
import X.C31209CMr;
import X.C33798DOg;
import X.C33883DRn;
import X.C36152EGu;
import X.C36798EcM;
import X.C38958FQs;
import X.C53106Kso;
import X.C78475Ur1;
import X.C88045Ygz;
import X.C88074YhS;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EKL;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import X.InterfaceC36797EcL;
import android.content.Context;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;

/* loaded from: classes7.dex */
public class LivePrefetchLoadOptTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "LivePrefetchLoadOptTask";
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

    @Override // X.EE1
    public final EFK type() {
        InterfaceC36797EcL interfaceC36797EcL;
        if (C2NW.LIZ().LJIILLIIL(C33883DRn.LJLIL)) {
            return EFK.APP_BACKGROUND;
        }
        if (((Boolean) EKL.LIZIZ.getValue()).booleanValue() && (interfaceC36797EcL = C36798EcM.LIZ.get("live_play_level")) != null) {
            int LIZ = interfaceC36797EcL.LIZ();
            if (LIZ != 0) {
                if (LIZ != 1 && LIZ != 2) {
                    if (LIZ == 3) {
                        return EFK.BACKGROUND;
                    }
                } else {
                    return EFK.BOOT_FINISH;
                }
            } else {
                return EFK.APP_BACKGROUND;
            }
        }
        if (((Boolean) C88045Ygz.LIZIZ.getValue()).booleanValue()) {
            return EFK.APP_BACKGROUND;
        }
        if (((Boolean) C88074YhS.LJIIIIZZ.getValue()).booleanValue()) {
            return EFK.BOOT_FINISH;
        }
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final boolean meetTrigger() {
        if (!C36152EGu.LJ()) {
            return true;
        }
        return !C2NW.LIZ().LJIILLIIL(C100833xX.LJLIL);
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        if (C33798DOg.LIZ()) {
            return EE4.IO;
        }
        return EE4.CPU;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        LiveOuterService.LJJJLL().LJJIJLIJ();
        C78475Ur1.LIZ();
        Boolean.valueOf(((Boolean) C88074YhS.LJI.getValue()).booleanValue()).booleanValue();
        GlobalContext.setApplicationContext(context);
        try {
            Class.forName("com.bytedance.android.livesdk.utils.LiveAppBundleUtils");
        } catch (Exception unused) {
        }
        if (!((Boolean) C88074YhS.LJII.getValue()).booleanValue()) {
            C31209CMr.LIZ(context);
        }
        if (type() == EFK.BOOT_FINISH) {
            C53106Kso.LIZ.getClass();
            if (C53106Kso.LIZ() == 1) {
                LiveOuterService.LJJJLL().LJJIFFI().getClass();
                C38958FQs.LIZJ(context, "homepage_hot");
            }
        }
    }
}
