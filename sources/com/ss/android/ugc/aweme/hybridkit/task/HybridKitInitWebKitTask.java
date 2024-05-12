package com.ss.android.ugc.aweme.hybridkit.task;

import X.C0RN;
import X.C33798DOg;
import X.C38600FCy;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCG;
import X.FCH;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public final class HybridKitInitWebKitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "HybridKitInitWebKitTask";
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
        return ((Boolean) C33798DOg.LIZIZ.getValue()).booleanValue();
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
        FCG fcg = FCH.LIZIZ;
        fcg.getClass();
        if (!C38600FCy.LIZ.get()) {
            fcg.LIZLLL();
        }
    }
}
