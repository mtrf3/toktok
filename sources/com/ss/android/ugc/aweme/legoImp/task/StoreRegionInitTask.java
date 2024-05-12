package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C26946Ahq;
import X.C56662Kg;
import X.C64707PaR;
import X.C66260PzU;
import X.C66261PzV;
import X.C66262PzW;
import X.C66263PzX;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.U49;
import android.content.Context;
import java.util.List;

/* loaded from: classes12.dex */
public final class StoreRegionInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "StoreRegionInitTask";
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

    @Override // X.EEY
    public final void run(Context context) {
        C56662Kg.LIZ().LIZJ("method_init_store_region_duration", false);
        C26946Ahq.LIZ("TikTokStoreRegionManager init");
        U49.LIZ.getClass();
        C66260PzU.LIZ(new C66261PzV());
        C66260PzU.LIZ = C66260PzU.LIZIZ();
        C64707PaR.LIZ().addObserver(C66262PzW.LIZ);
        C66260PzU.LIZ(new C66263PzX());
        C56662Kg.LIZ().LJFF("method_init_store_region_duration", false);
    }
}
