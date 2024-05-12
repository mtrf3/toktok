package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C34710Djm;
import X.C35274Dss;
import X.C36093EEn;
import X.EE1;
import X.EFK;
import X.EG3;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FAJ;
import X.FKM;
import X.FKN;
import Y.AObjectS22S0001000_6;
import Y.ARunnableS0S0001000_5;
import Y.ARunnableS10S0101000_6;
import Y.ARunnableS13S0000000_6;
import Y.ARunnableS1S0001000_6;
import android.content.Context;
import android.os.Build;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class MessageControllerTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "MessageControllerTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
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
        try {
            AwemeHostApplication LIZ = FKM.LIZ();
            if (C34710Djm.LJ() == 1) {
                FAJ.LJIIJ(LIZ, new ARunnableS1S0001000_6(1, 19));
            }
            if (Build.VERSION.SDK_INT >= 28 && ((Boolean) C35274Dss.LJ.getValue()).booleanValue()) {
                FAJ.LJIIJ(LIZ, new ARunnableS10S0101000_6(1, LIZ, 9));
            }
            if (C34710Djm.LIZJ()) {
                FAJ.LIZLLL(C16880lQ.LLIIIJ(), new ARunnableS13S0000000_6(20));
            }
            if (((Boolean) C35274Dss.LJIILJJIL.getValue()).booleanValue()) {
                C36093EEn c36093EEn = C36093EEn.LIZ;
                EnumC36092EEm enumC36092EEm = EnumC36092EEm.FIRST_WINDOW_FOCUS;
                AObjectS22S0001000_6 aObjectS22S0001000_6 = new AObjectS22S0001000_6(2, 3);
                c36093EEn.getClass();
                C36093EEn.LIZIZ(enumC36092EEm, false, aObjectS22S0001000_6);
                LIZ.registerActivityLifecycleCallbacks(new EG3(new AtomicBoolean(true)));
            }
            if (FKN.LIZ(LIZ) != 4) {
                FAJ.LJIIJ(LIZ, new ARunnableS0S0001000_5(1, 3));
            }
        } catch (Throwable unused) {
        }
    }
}
