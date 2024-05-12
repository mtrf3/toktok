package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C15Y;
import X.C35478DwA;
import X.C38874FNm;
import X.C88024Yge;
import X.DPI;
import X.DS1;
import X.E3F;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FKM;
import Y.AObjectS23S0000000_6;
import android.content.Context;
import android.os.Looper;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.aweme.services.PerformanceMainServiceImpl;
import java.util.List;
import yq4.a;

/* loaded from: classes7.dex */
public class BaseOptFirstFrameTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "BaseOptFirstFrameTask";
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

    @Override // X.EE1
    public final EFK type() {
        boolean booleanValue;
        if (DPI.LIZ()) {
            if (C35478DwA.LIZIZ() && DS1.LIZ()) {
                booleanValue = true;
            } else {
                booleanValue = false;
            }
        } else {
            booleanValue = ((Boolean) C88024Yge.LJII.getValue()).booleanValue();
        }
        return (EFK) E3F.LIZJ("BaseOptFirstFrameTask_use_bootfinish", new AObjectS23S0000000_6(1), new AObjectS23S0000000_6(2), booleanValue);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        PerformanceMainServiceImpl.createPerformanceMainServicebyMonsterPlugin(false).newAddWikiActivity();
        new C15Y(context);
        PerformanceMainServiceImpl.createPerformanceMainServicebyMonsterPlugin(false).preloadPushSettingsManager();
        a.LJFF().LJIJJLI();
        if (C38874FNm.LIZIZ()) {
            AVInitializerImpl.LIZ().initAVEnv(FKM.LIZ());
        }
    }
}
