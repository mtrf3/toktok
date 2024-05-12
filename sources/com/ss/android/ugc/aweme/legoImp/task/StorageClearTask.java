package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.ETW;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import Y.AfS58S0100000_6;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public final class StorageClearTask implements EE1 {
    public static volatile boolean LJLIL;

    @Override // X.EEY
    public final String key() {
        return "StorageClearTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (context != null && !LJLIL) {
            LJLIL = true;
            C84763XOl.LJII().LJJJLIIL(new AfS58S0100000_6(context, 13), ETW.LJLIL);
        }
    }
}
