package com.ss.android.ugc.aweme.ug.dynamicresource;

import X.C0RN;
import X.C10K;
import X.C82802Wec;
import X.CallableC39029FTl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public final class BootFinishTask implements EE1 {
    public final boolean LJLIL = true;

    @Override // X.EEY
    public final String key() {
        return "BootFinishTask";
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
    public final boolean meetTrigger() {
        return this.LJLIL;
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
        C82802Wec.LIZ.getClass();
        if (C82802Wec.LIZJ.isEmpty()) {
            C82802Wec.LIZLLL = true;
            C10K.LIZJ(CallableC39029FTl.LJLIL);
        } else {
            C82802Wec.LJIILIIL("boot_finish");
        }
    }
}
