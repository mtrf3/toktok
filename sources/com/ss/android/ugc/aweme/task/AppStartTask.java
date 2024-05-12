package com.ss.android.ugc.aweme.task;

import X.C0RN;
import X.C78948Uye;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import android.os.SystemClock;
import java.util.List;

/* loaded from: classes5.dex */
public final class AppStartTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AppStartTask";
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
        C78948Uye.LJLJJI = SystemClock.elapsedRealtime();
        if (C78948Uye.LJLJI < 0) {
            C78948Uye.LJLJI = SystemClock.elapsedRealtime();
        }
        C78948Uye.LJLJJL = System.currentTimeMillis();
    }
}
