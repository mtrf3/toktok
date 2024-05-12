package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C3GR;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import X.InterfaceC67072QUa;
import X.LHU;
import Y.ACallableS83S0200000_6;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ConfigSyncInitTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "ConfigSyncInitTask";
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
        LHU.LIZIZ.LIZ(C3GR.CONFIG_SYNC, new InterfaceC67072QUa() { // from class: X.LIG
            @Override // X.InterfaceC67072QUa
            public final void LIZ(C67074QUc c67074QUc) {
                byte[] data = c67074QUc.LIZ;
                C38724FHs c38724FHs = new C38724FHs(c67074QUc.LIZJ, c67074QUc.LIZLLL);
                o.LJIIJ(data, "data");
                C10K.LIZJ(new ACallableS83S0200000_6(data, c38724FHs, 16));
            }
        });
    }
}
