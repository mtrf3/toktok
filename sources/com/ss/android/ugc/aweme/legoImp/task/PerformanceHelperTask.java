package com.ss.android.ugc.aweme.legoImp.task;

import X.C04010Dt;
import X.C0RN;
import X.C16880lQ;
import X.C34613DiD;
import X.C38987FRv;
import X.E3F;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FTB;
import Y.AObjectS22S0001000_6;
import android.content.Context;
import java.util.List;
import java.util.Objects;

/* loaded from: classes7.dex */
public class PerformanceHelperTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PerformanceHelperTask";
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

    @Override // X.EE1
    public final EFK type() {
        boolean z;
        if (((Boolean) C34613DiD.LIZJ.getValue()).booleanValue() && !C38987FRv.LIZLLL().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        EFK efk = (EFK) E3F.LIZJ("PerformanceHelperTask_downgrade", new AObjectS22S0001000_6(1, 11), new AObjectS22S0001000_6(0, 6), z);
        Objects.requireNonNull(efk);
        return efk;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        FTB.LIZ(context);
        C04010Dt.LIZ = C16880lQ.LLLZLL();
    }
}
