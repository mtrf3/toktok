package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C38711FHf;
import X.C44432HcC;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FFL;
import X.FHC;
import X.FHL;
import X.FRE;
import android.content.Context;
import defpackage.e1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class ABCacheOptInitTask implements EE1 {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // X.EEY
    public final String key() {
        return "ABCacheOptInitTask";
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
        System.currentTimeMillis();
        FFL.LJIIIZ().getClass();
        FHC.LIZIZ().LJI = FFL.LJ(31744, "ab_lib_empty_call_opt", true, false);
        boolean LIZ = e1.LIZ(31744, "ab_call_opt", true, false);
        FRE.LIZ = LIZ;
        if (LIZ) {
            try {
                C44432HcC.LJLJI = LIZ;
                ((ArrayList) FHL.LIZLLL).add(C38711FHf.LIZ);
            } catch (Throwable unused) {
                FRE.LIZ = false;
                C44432HcC.LJLJI = false;
            }
        }
    }
}
