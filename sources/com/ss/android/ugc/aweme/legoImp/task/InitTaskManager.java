package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C38995FSd;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FGR;
import X.FGS;
import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public class InitTaskManager implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitTaskManager";
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        FGS fgs = new FGS();
        ExecutorService LIZLLL = C38995FSd.LIZLLL();
        if (LIZLLL == null) {
            LIZLLL = C16880lQ.LLLLZ(4);
        }
        fgs.LIZ = LIZLLL;
        FGR LIZIZ = FGR.LIZIZ();
        LIZIZ.getClass();
        LIZIZ.LIZIZ = fgs.LIZ;
        LIZIZ.LIZ = true;
    }
}
