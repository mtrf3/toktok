package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C35810E3q;
import X.C36152EGu;
import X.C36231EJv;
import X.C36922EeM;
import X.C63081OpJ;
import X.C66001PvJ;
import X.E3F;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EK7;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import X.InterfaceC65784Pro;
import X.PLS;
import Y.AObjectS22S0001000_6;
import Y.AObjectS23S0000000_6;
import Y.AObjectS56S0101000_13;
import android.content.Context;
import com.ss.android.ugc.aweme.impl.StrategyImpl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class CrashSdkInitTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "CrashSdkInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        return 2;
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

    public static boolean LIZLLL() {
        InterfaceC65784Pro interfaceC65784Pro;
        if (C35810E3q.LJIIIIZZ()) {
            return true;
        }
        AObjectS23S0000000_6 aObjectS23S0000000_6 = new AObjectS23S0000000_6(4);
        if (C36152EGu.LJ()) {
            interfaceC65784Pro = new AObjectS56S0101000_13(4, C36231EJv.LIZ, 0);
        } else if (C36152EGu.LIZLLL(1L)) {
            interfaceC65784Pro = new AObjectS22S0001000_6(0, 7);
        } else {
            interfaceC65784Pro = aObjectS23S0000000_6;
        }
        return Boolean.TRUE.equals(E3F.LIZJ("newUserAlogOpt", aObjectS23S0000000_6, interfaceC65784Pro, StrategyImpl.LIZIZ().LJIIIIZZ(1L)));
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (C63081OpJ.LLFF()) {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C66001PvJ(LIZLLL()));
                C36922EeM.LIZJ(C16880lQ.LLLLL(context), arrayList);
            } catch (Throwable unused) {
            }
            Thread.setDefaultUncaughtExceptionHandler(new EK7(Thread.getDefaultUncaughtExceptionHandler()));
            new PLS().run();
        }
    }
}
