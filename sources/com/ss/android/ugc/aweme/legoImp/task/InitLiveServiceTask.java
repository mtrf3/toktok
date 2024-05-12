package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C33758DMs;
import X.C36798EcM;
import X.C78475Ur1;
import X.EE1;
import X.EFK;
import X.EKL;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36797EcL;
import android.content.Context;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;

/* loaded from: classes7.dex */
public class InitLiveServiceTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitLiveServiceTask";
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
    public final boolean meetTrigger() {
        return !((Boolean) C33758DMs.LIZIZ.getValue()).booleanValue();
    }

    @Override // X.EE1
    public final EFK type() {
        InterfaceC36797EcL interfaceC36797EcL;
        if (((Boolean) EKL.LIZIZ.getValue()).booleanValue() && (interfaceC36797EcL = C36798EcM.LIZ.get("live_play_level")) != null) {
            int LIZ = interfaceC36797EcL.LIZ();
            if (LIZ != 0 && LIZ != 1 && LIZ != 2) {
                if (LIZ == 3) {
                    return EFK.BACKGROUND;
                }
            } else {
                return EFK.BOOT_FINISH;
            }
        }
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        try {
            LiveOuterService.LJJJLL().LJJIJLIJ();
            C78475Ur1.LIZ();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
