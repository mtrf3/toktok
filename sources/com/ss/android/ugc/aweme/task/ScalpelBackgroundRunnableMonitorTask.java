package com.ss.android.ugc.aweme.task;

import X.C0RN;
import X.C38524FAa;
import X.C38525FAb;
import X.C60762a0;
import X.DML;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FAZ;
import X.FEN;
import android.content.Context;
import com.ss.android.ugc.aweme.runnablemonitor.background.RunableMonitorHelper;
import java.util.List;

/* loaded from: classes7.dex */
public final class ScalpelBackgroundRunnableMonitorTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ScalpelBackgroundRunnableMonitorTask";
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
        if (DML.LIZ()) {
            FAZ faz = new FAZ();
            RunableMonitorHelper.LIZ.put("ColdBoot", faz);
            C38525FAb.LIZIZ.incrementAndGet();
            C38525FAb.LIZ(faz);
            faz.LIZLLL = new C38524FAa();
            faz.LIZ.set(true);
        }
        if (((Boolean) C60762a0.LIZIZ.getValue()).booleanValue()) {
            C38525FAb.LIZIZ.incrementAndGet();
            C38525FAb.LIZ(FEN.LIZ);
        }
    }
}
