package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C33825DPh;
import X.C36152EGu;
import X.C58096Mr6;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FKM;
import android.content.Context;
import com.ss.android.ugc.aweme.NujPerformanceService;
import com.ss.android.ugc.aweme.journey.INujPerformanceService;
import java.util.List;

/* loaded from: classes7.dex */
public final class NewUserPreloadTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "NewUserPreloadTask";
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        INujPerformanceService iNujPerformanceService;
        if (C36152EGu.LJFF() && ((Boolean) C33825DPh.LIZ.getValue()).booleanValue()) {
            Object LIZ = C58096Mr6.LIZ(INujPerformanceService.class, false);
            if (LIZ != null) {
                iNujPerformanceService = (INujPerformanceService) LIZ;
            } else {
                if (C58096Mr6.LJJLIIIJJIZ == null) {
                    synchronized (INujPerformanceService.class) {
                        if (C58096Mr6.LJJLIIIJJIZ == null) {
                            C58096Mr6.LJJLIIIJJIZ = new NujPerformanceService();
                        }
                    }
                }
                iNujPerformanceService = C58096Mr6.LJJLIIIJJIZ;
            }
            iNujPerformanceService.LIZ(FKM.LIZ());
        }
    }
}
