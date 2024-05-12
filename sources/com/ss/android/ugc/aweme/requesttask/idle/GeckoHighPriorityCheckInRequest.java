package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0RN;
import X.C16880lQ;
import X.C36175EHr;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.EGC;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.O3U;
import X.RunnableC36173EHp;
import Y.IDxS130S0200000_6;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GeckoHighPriorityCheckInRequest implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "GeckoHighPriorityCheckInRequest";
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

    public final void LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        try {
            new Handler(C16880lQ.LLJJJJ()).post(RunnableC36173EHp.LJLIL);
        } catch (Exception e) {
            C36175EHr.LIZ(e);
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        if (O3U.LJ) {
            return;
        }
        if (EGC.LIZ()) {
            C84763XOl.LJI().LIZ(new IDxS130S0200000_6(this, context, 1));
        } else {
            LIZLLL(context);
        }
    }
}
