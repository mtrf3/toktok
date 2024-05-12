package com.ss.android.ugc.aweme.legoImp.task;

import X.AV1;
import X.C0RN;
import X.C35810E3q;
import X.C36531EVj;
import X.C38866FNe;
import X.C78685UuP;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCD;
import X.FGG;
import X.FKM;
import android.content.Context;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.services.MainServiceForPush;
import defpackage.e1;
import java.util.List;

/* loaded from: classes7.dex */
public class InitPushTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitPushTask";
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

    public static boolean LJ() {
        if (C38866FNe.LIZ() || e1.LIZ(31744, "push_init_optimize_enable", true, false)) {
            return true;
        }
        return false;
    }

    @Override // X.EE1
    public final EFK type() {
        AwemeHostApplication LIZ = FKM.LIZ();
        if (LIZ != null && !FCD.LJI(LIZ)) {
            return EFK.MAIN;
        }
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    public static void LIZLLL(Context context) {
        boolean LJIIJJI;
        if (FCD.LJI(context)) {
            if (C36531EVj.LIZLLL) {
                C35810E3q.LJ(5000L);
            }
        } else if (!FGG.LIZJ(context, FCD.LIZ(context))) {
            return;
        }
        if (e1.LIZ(31744, "push_childer_mode_optimize_enable", true, true)) {
            LJIIJJI = AV1.LJIILLIIL();
        } else {
            LJIIJJI = AV1.LJIIJJI();
        }
        if (!LJIIJJI) {
            C78685UuP.LJJIII().init(context, new MainServiceForPush());
        } else {
            C78685UuP.LJJIII().initMessageDepend();
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (LJ()) {
            LIZLLL(context);
        }
    }
}
