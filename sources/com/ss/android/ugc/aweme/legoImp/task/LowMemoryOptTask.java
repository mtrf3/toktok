package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C19N;
import X.C36828Ecq;
import X.C36829Ecr;
import X.C36833Ecv;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36831Ect;
import android.content.Context;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class LowMemoryOptTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "LowMemoryOptTask";
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
        if (!C19N.LJ("enable_low_memory_kill", false)) {
            return;
        }
        InterfaceC36831Ect[] interfaceC36831EctArr = {new C36829Ecr()};
        ArrayList arrayList = new ArrayList();
        interfaceC36831EctArr[0].getClass();
        arrayList.add(new C36828Ecq());
        try {
            if (arrayList.size() > 0) {
                if (arrayList.size() > 0) {
                    ((ArrayList) C36833Ecv.LJI).addAll(arrayList);
                    C36833Ecv.LIZ = 15;
                    ActivityStack.addAppBackGroundListener(C36833Ecv.LJII);
                    C36833Ecv.LIZJ = System.currentTimeMillis();
                } else {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("LowMemoryAppKillSelf", "No app kill strategy !! ");
                }
            }
        } catch (Throwable unused) {
        }
    }
}
