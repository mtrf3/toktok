package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C1DG;
import X.C249109q6;
import X.C44847Hit;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.IL8;
import X.IUZ;
import X.IWO;
import android.content.Context;
import java.util.List;

/* loaded from: classes9.dex */
public final class PlayerKitCommonWidgetInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PlayerKitCommonWidgetInitTask";
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
        IUZ iuz = IUZ.INSTANCE;
        iuz.setBitrateManager(C1DG.LIZ().LJFF());
        iuz.setHttpsHelper(new C44847Hit());
        iuz.setPlayUrlBuilder(new C249109q6());
        iuz.setCacheChecker(new IL8() { // from class: X.IXt
        });
        iuz.setPlayInfoCallback(IWO.LIZ().LJ());
    }
}