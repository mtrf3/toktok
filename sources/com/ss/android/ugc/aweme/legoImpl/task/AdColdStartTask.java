package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C38987FRv;
import X.C39284FbM;
import X.C39287FbP;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public final class AdColdStartTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AdColdStartTask";
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
        if (!C38987FRv.LIZLLL().booleanValue()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        UgCommonServiceImpl.LJIJ().LJII();
        C39284FbM.LIZ.LIZ(new C39287FbP(elapsedRealtime, this));
    }
}
