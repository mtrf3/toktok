package com.ss.android.ugc.tiktok.location.task;

import X.C0RN;
import X.C36922EeM;
import X.C42625Go9;
import X.C56662Kg;
import X.C85293Xdh;
import X.C85295Xdj;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* loaded from: classes16.dex */
public final class InitLocationTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitLocationTask";
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
        C56662Kg.LIZ().LIZJ("method_init_location_duration", false);
        C36922EeM.LIZLLL(2, "InitLocationTask", "init location permission manager");
        C42625Go9.LIZIZ(C85295Xdj.LIZ);
        SettingsManager.LIZLLL().LJIIIZ(C85293Xdh.LJLIL);
        C56662Kg.LIZ().LJFF("method_init_location_duration", false);
    }
}
