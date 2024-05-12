package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C16880lQ;
import X.C35982EAg;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EKD;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.QM5;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SecShareSdkTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "SecShareSdkTask";
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
        return 16777215;
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
        Context LIZIZ = EF7.LIZIZ();
        EKD ekd = new EKD();
        ekd.LIZ = new C35982EAg();
        Context LLLLL = C16880lQ.LLLLL(LIZIZ);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        QM5.LIZJ = LLLLL;
        QM5.LIZ = ekd;
        QM5.LIZIZ = true;
    }
}
