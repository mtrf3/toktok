package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C34613DiD;
import X.C38497F8z;
import X.E6X;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import java.util.List;

/* loaded from: classes7.dex */
public final class ScopedIdInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ScopedIdInitTask";
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

    @Override // X.EE1
    public final EFK type() {
        if (((Boolean) C34613DiD.LJIIJ.getValue()).booleanValue()) {
            return EFK.BOOT_FINISH;
        }
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C38497F8z.LIZ();
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null) {
            LJIJ.LJIILJJIL(E6X.LJLIL);
        }
    }
}
