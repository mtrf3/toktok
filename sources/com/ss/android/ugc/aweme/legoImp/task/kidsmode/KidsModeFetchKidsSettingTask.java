package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C0RN;
import X.C56662Kg;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import java.util.List;

/* loaded from: classes5.dex */
public final class KidsModeFetchKidsSettingTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "KidsModeFetchKidsSettingTask";
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
        C56662Kg.LIZ().LIZJ("method_init_fetch_kids_setting_duration_kids_mode", false);
        KidsCommonServiceImpl.LJFF().LJ();
        C56662Kg.LIZ().LJFF("method_init_fetch_kids_setting_duration_kids_mode", false);
    }
}
