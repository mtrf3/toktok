package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C38995FSd;
import X.C64094PDm;
import X.C84763XOl;
import X.EB7;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.PN9;
import X.PNA;
import X.PNC;
import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class TrafficPerfMonitorTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "TrafficPerfMonitorTask";
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (PN9.LIZ) {
            return;
        }
        PN9.LIZ = true;
        C84763XOl.LJI().LIZ(new PNC());
        if (EB7.LIZ()) {
            C64094PDm.LIZ.LJIIJ(PN9.LJJJJ);
        }
        C38995FSd.LJ().scheduleWithFixedDelay(PNA.LJLIL, 0L, 600000L, TimeUnit.MILLISECONDS);
    }
}
