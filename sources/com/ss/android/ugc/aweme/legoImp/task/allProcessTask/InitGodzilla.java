package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C0RN;
import X.C56662Kg;
import X.C88074YhS;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F8E;
import X.F8N;
import X.F8P;
import X.FKM;
import X.InstrumentationC38473F8b;
import android.content.Context;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import java.util.List;

/* loaded from: classes7.dex */
public final class InitGodzilla implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitGodzilla";
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
        if (((Boolean) C88074YhS.LIZLLL.getValue()).booleanValue()) {
            AwemeHostApplication LIZ = FKM.LIZ();
            F8N f8n = new F8N();
            f8n.LIZJ(LIZ);
            f8n.LIZLLL();
        } else {
            F8E.LIZ(FKM.LIZ());
        }
        C56662Kg.LIZ().LIZJ("method_register_godzilla", false);
        InstrumentationC38473F8b.LIZ(new F8P());
        C56662Kg.LIZ().LJFF("method_register_godzilla", false);
    }
}
