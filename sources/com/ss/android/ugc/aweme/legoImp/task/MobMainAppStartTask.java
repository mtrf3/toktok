package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C1I1;
import X.C56662Kg;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import android.content.Context;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.List;
import yq4.a;

/* loaded from: classes7.dex */
public class MobMainAppStartTask implements EE1 {
    public final long LJLIL = System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ;

    @Override // X.EEY
    public final String key() {
        return "MobMainAppStartTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (a.LJIJI().LIZ()) {
            MobClick LIZLLL = C1I1.LIZLLL("load_application_start", "perf_monitor");
            LIZLLL.setExtValueLong(this.LJLIL);
            FMX.onEvent(LIZLLL);
        }
    }
}
