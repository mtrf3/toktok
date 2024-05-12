package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C66873QMj;
import X.C66875QMl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.HG3;
import X.QQQ;
import X.RBX;
import X.RunnableC39007FSp;
import Y.ARunnableS47S0100000_11;
import android.content.Context;
import java.util.List;

/* loaded from: classes12.dex */
public class RedBadgeUpdateTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "RedBadgeUpdateTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        QQQ LIZJ = QQQ.LIZJ(context);
        String sessionKey = ((RBX) HG3.LJIILL()).getSessionKey();
        LIZJ.getClass();
        try {
            C66873QMj LIZIZ = C66875QMl.LIZ(LIZJ.LJLIL).LIZ.LIZIZ();
            LIZIZ.LIZIZ.put("session_key", sessionKey);
            LIZIZ.LIZ();
            RunnableC39007FSp.LIZIZ(new ARunnableS47S0100000_11(LIZJ, 10));
        } catch (Throwable unused) {
        }
    }
}
