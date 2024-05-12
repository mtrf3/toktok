package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C36922EeM;
import X.C40322Fs6;
import X.C73040SlY;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;

/* loaded from: classes5.dex */
public class CheckNoticeTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "CheckNoticeTask";
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
        String str;
        C36922EeM.LJ("CheckNoticeTask");
        Boolean valueOf = Boolean.valueOf(C40322Fs6.LIZJ(EF7.LIZIZ()));
        Context LIZIZ = EF7.LIZIZ();
        if (valueOf.booleanValue()) {
            str = "allow_on";
        } else {
            str = "allow_off";
        }
        C73040SlY.LJII(LIZIZ, "notice", str);
    }
}
