package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C0RN;
import X.C46538IOg;
import X.C64740Pay;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.quota.BDNetworkTagManager;
import java.util.List;

/* loaded from: classes10.dex */
public final class InitQuotaTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitQuotaTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
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
        C46538IOg.LIZJ = 0;
        BDNetworkTagManager LIZIZ = BDNetworkTagManager.LIZIZ();
        C64740Pay c64740Pay = new C64740Pay();
        if (LIZIZ.LIZIZ.get()) {
            LIZIZ.LIZ = c64740Pay;
            LIZIZ.LIZIZ.compareAndSet(true, false);
        }
        BDNetworkTagManager LIZIZ2 = BDNetworkTagManager.LIZIZ();
        int i = C46538IOg.LIZJ;
        if (LIZIZ2.LIZIZ.get()) {
            return;
        }
        LIZIZ2.LIZ.LIZ(i);
    }
}
