package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C60832a7;
import X.C75792yF;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.experiment.ApplogDegradeABData;
import com.ss.android.ugc.aweme.experiment.ApplogDegradeInfoList;
import java.util.List;

/* loaded from: classes2.dex */
public final class AppLogOptABStoreTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AppLogOptABStoreTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C60832a7 c60832a7 = C60832a7.LIZJ;
        c60832a7.getClass();
        ApplogDegradeABData applogDegradeABData = (ApplogDegradeABData) C60832a7.LIZLLL.getValue();
        if (applogDegradeABData == null) {
            c60832a7.LIZ().storeBoolean(C60832a7.LJ, false);
            c60832a7.LIZ().storeString(C60832a7.LJFF, "");
            return;
        }
        c60832a7.LIZ().storeBoolean(C60832a7.LJ, applogDegradeABData.getEnable());
        List<ApplogDegradeInfoList> degradeInfoList = applogDegradeABData.getDegradeInfoList();
        if (degradeInfoList == null || degradeInfoList.isEmpty()) {
            c60832a7.LIZ().storeString(C60832a7.LJFF, "");
        } else {
            c60832a7.LIZ().storeString(C60832a7.LJFF, C75792yF.LIZJ(degradeInfoList));
        }
    }
}
