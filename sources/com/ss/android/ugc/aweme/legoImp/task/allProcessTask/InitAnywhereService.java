package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FKM;
import android.content.Context;
import com.ss.android.ugc.aweme.app.IInitAllService;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public final class InitAnywhereService implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitAnywhereService";
    }

    @Override // X.EEY
    public final boolean meetTrigger() {
        return false;
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
        return 15728639;
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
        IInitAllService LJIILLIIL = InitAllServiceImpl.LJIILLIIL();
        FKM.LIZ();
        LJIILLIIL.LJ();
    }
}