package com.ss.android.ugc.aweme.legoImp.task.mainProcessTask;

import X.C0RN;
import X.C34450Dfa;
import X.C36152EGu;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FDW;
import X.FKM;
import android.content.Context;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public final class InitAdServiceTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitAdServiceTask";
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
        if (!C36152EGu.LJ() ? !((Boolean) C34450Dfa.LIZIZ.getValue()).booleanValue() : !C36152EGu.LIZIZ(FDW.LJLIL)) {
            return true;
        }
        return false;
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
        if (C36152EGu.LJ() && C36152EGu.LIZIZ(FDW.LJLIL)) {
            return;
        }
        InitAllServiceImpl.LJIILLIIL().LIZJ(FKM.LIZ());
    }
}
