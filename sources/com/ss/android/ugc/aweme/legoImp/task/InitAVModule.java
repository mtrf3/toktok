package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C33778DNm;
import X.C34710Djm;
import X.C36083EEd;
import X.C36084EEe;
import X.C37179EiV;
import X.C43587H8t;
import X.C56662Kg;
import X.DPP;
import X.EE1;
import X.EE4;
import X.EE8;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FKM;
import X.HBR;
import Y.ARunnableS14S0101000_10;
import android.content.Context;
import android.os.Looper;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class InitAVModule implements EE1, EE8 {
    @Override // X.EE8
    public final boolean LJ() {
        return true;
    }

    @Override // X.EE8
    public final /* synthetic */ long LJII() {
        return 0L;
    }

    @Override // X.EEY
    public final String key() {
        return "InitAVModule";
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
        return 17;
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
        if ((C33778DNm.LIZ() & 4) == 4) {
            return EFK.IDLE;
        }
        if (C34710Djm.LIZ()) {
            return EFK.BACKGROUND;
        }
        return EFK.MAIN;
    }

    public final void LJIIJ() {
        AVInitializerImpl.LIZ().initMonitor(FKM.LIZ());
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE8
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE8
    public final void LIZLLL(Long l) {
        l.longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.EEd] */
    @Override // X.EEY
    public final void run(Context context) {
        C56662Kg.LIZ().LIZJ("method_av_module_init_duration", false);
        AVInitializerImpl.LIZ().initialize(FKM.LIZ());
        if (!C34710Djm.LIZ()) {
            LJIIJ();
        }
        if (DPP.LIZIZ()) {
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                LJIIJ();
            } else {
                C37179EiV.LIZ().post(new ARunnableS14S0101000_10(5, this, 8));
            }
        }
        C43587H8t.LIZIZ = false;
        HBR hbr = HBR.MAIN_BUSINESS;
        C36084EEe c36084EEe = new C36084EEe();
        if (C43587H8t.LIZIZ) {
            c36084EEe = new C36083EEd(c36084EEe);
        }
        ((ConcurrentHashMap) C43587H8t.LIZ).put(hbr, c36084EEe);
        C56662Kg.LIZ().LJFF("method_av_module_init_duration", false);
    }
}
