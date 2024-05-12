package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC64623PXv;
import X.C0RN;
import X.C48488J1g;
import X.C48491J1j;
import X.C48493J1l;
import X.C56662Kg;
import X.C64821PcH;
import X.C64845Pcf;
import X.EE1;
import X.EEY;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FW5;
import X.PU3;
import android.content.Context;
import com.ss.android.ugc.aweme.net.NetworkInitTask;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class InitTTNetTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitTTNetTask";
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
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final List<EEY> triggerOtherLegoComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NetworkInitTask());
        return arrayList;
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
        FW5.LJII = true;
        C56662Kg.LIZ().LIZJ("method_init_ttnet_duration", false);
        EF7.LIZIZ();
        C48493J1l.LIZ = new C64845Pcf();
        AbstractC64623PXv.LIZ = new C64821PcH();
        C48488J1g c48488J1g = C48488J1g.LIZLLL;
        C48491J1j c48491J1j = new C48491J1j();
        if (C48488J1g.LIZ) {
            synchronized (c48488J1g) {
                if (C48488J1g.LIZ) {
                    C48488J1g.LIZIZ = c48491J1j;
                    C48488J1g.LIZ = false;
                }
            }
        }
        PU3.LJLJJLL.set(true);
        C56662Kg.LIZ().LJFF("method_init_ttnet_duration", false);
    }
}
