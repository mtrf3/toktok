package com.ss.android.ugc.aweme.account.task;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F9K;
import X.HG3;
import X.RBX;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public final class CookieMonitorTask implements EE1 {
    public static boolean LJLIL;

    @Override // X.EEY
    public final String key() {
        return "CookieMonitorTask";
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
        return EFK.IDLE;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (LJLIL) {
            return;
        }
        LJLIL = true;
        if (((RBX) HG3.LJIILL()).isLogin()) {
            F9K.LIZIZ(1);
        }
    }
}
