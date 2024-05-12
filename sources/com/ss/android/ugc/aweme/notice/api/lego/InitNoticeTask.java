package com.ss.android.ugc.aweme.notice.api.lego;

import X.C0RN;
import X.C55888Lwa;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.HH1;
import X.LQS;
import X.LQT;
import X.MS5;
import X.X1D;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class InitNoticeTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitNoticeTask";
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init, hasInit=");
        HH1.LIZIZ(LIZ, LQS.LIZIZ, LIZ, "NoticeCountFetcher");
        if (!LQS.LIZIZ) {
            C84763XOl.LIZ().LJJJJZI(LQS.LIZJ);
            C84763XOl.LIZLLL().LJJJJZI(LQS.LIZLLL);
            C84763XOl.LJII().LJJJJZI(LQT.LJLIL);
            MS5.LIZ(new AqS159S0100000_9(819));
            LQS.LIZIZ = true;
        }
        C55888Lwa.LIZIZ.LJJJJ();
    }
}
