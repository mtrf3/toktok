package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C34281Dcr;
import X.C34682DjK;
import X.C34836Dlo;
import X.C34837Dlp;
import X.C36131EFz;
import X.C36152EGu;
import X.C36159EHb;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.PKR;
import android.content.Context;
import com.bytedance.crash.Npth;
import java.util.List;

/* loaded from: classes7.dex */
public class NpthSecondInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "NpthSecondInitTask";
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
        String str;
        String str2;
        if (C34837Dlp.LIZ) {
            C34281Dcr.LIZ().LJIIJJI();
            str = "false";
        } else {
            str = "true";
        }
        Npth.addTag("has_native_log", str);
        if (C34682DjK.LIZ) {
            str2 = "false";
        } else {
            str2 = "true";
        }
        Npth.addTag("has_tostring", str2);
        Npth.addTag("is_new_user", String.valueOf(C36152EGu.LJ));
        if (C34836Dlo.LIZ) {
            if (C36131EFz.LIZJ == null) {
                C36131EFz.LIZJ = new C36131EFz();
            }
            C36131EFz c36131EFz = C36131EFz.LIZJ;
            C36159EHb c36159EHb = new C36159EHb();
            synchronized (c36131EFz) {
                c36131EFz.LIZIZ.add(c36159EHb);
            }
            return;
        }
        if (C34836Dlo.LIZIZ) {
            PKR.LJIIIZ.add(new C36159EHb());
        }
    }
}
