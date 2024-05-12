package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C34891Dmh;
import X.C35478DwA;
import X.DPI;
import X.DS1;
import X.E3F;
import X.EE1;
import X.EEZ;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import Y.AObjectS135S0100000_6;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public class TrimMemoryTask implements EE1 {
    public final int LJLIL;

    @Override // X.EEY
    public final String key() {
        return "TrimMemoryTask";
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

    public TrimMemoryTask(int i) {
        this.LJLIL = i;
    }

    @Override // X.EEY
    public final void run(Context context) {
        boolean z = false;
        if (!DPI.LIZ() ? (C34891Dmh.LIZ() & 16) == 16 : !(!C35478DwA.LIZIZ() || !DS1.LIZ())) {
            if (!EEZ.LIZIZ() && this.LJLIL < 40) {
                z = true;
            }
        }
        E3F.LIZIZ("run_trimMemoryTask", new AObjectS135S0100000_6(this, 0), !Boolean.valueOf(z).booleanValue());
    }
}
