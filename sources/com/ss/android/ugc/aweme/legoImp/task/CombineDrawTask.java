package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C34710Djm;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FAJ;
import X.FKM;
import Y.ARunnableS1S0001000_6;
import android.content.Context;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.List;

/* loaded from: classes7.dex */
public class CombineDrawTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "CombineDrawTask";
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
        if (C34710Djm.LIZIZ()) {
            try {
                AwemeHostApplication LIZ = FKM.LIZ();
                if (LIZ != null) {
                    FAJ.LJIIJ(LIZ, new ARunnableS1S0001000_6(1, 11));
                }
            } catch (Throwable unused) {
            }
        }
    }
}
