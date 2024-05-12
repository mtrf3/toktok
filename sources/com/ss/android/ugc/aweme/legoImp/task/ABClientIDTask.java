package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC73547Stj;
import X.C0RN;
import X.C38704FGy;
import X.C38987FRv;
import X.E70;
import X.E71;
import X.E73;
import X.E75;
import X.E76;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FH5;
import android.content.Context;
import defpackage.r0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ABClientIDTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ABClientIDTask";
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

    @Override // X.EE1
    public final EFK type() {
        if (!C38987FRv.LIZLLL().booleanValue()) {
            r0.LIZ.getClass();
            if (r0.LIZ().requestAfterBootFinish) {
                return EFK.BOOT_FINISH;
            }
        }
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        E76 isFirstSessionFun = E76.LJLIL;
        o.LJIIIZ(isFirstSessionFun, "isFirstSessionFun");
        E73.LIZJ = isFirstSessionFun;
        FH5.LIZIZ().LJFF = C38704FGy.LIZ;
        if (((Boolean) isFirstSessionFun.invoke()).booleanValue()) {
            ((E71) E73.LIZIZ.getValue()).LIZJ(false, false);
            return;
        }
        r0.LIZ.getClass();
        AbstractC73547Stj.LJIILJJIL(r0.LIZ().delayMs, TimeUnit.MILLISECONDS).LJIIJ(E70.LJLIL, E75.LIZ);
    }
}
