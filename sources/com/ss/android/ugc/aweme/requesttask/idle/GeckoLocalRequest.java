package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0RN;
import X.C100833xX;
import X.C16880lQ;
import X.C2NW;
import X.C34639Did;
import X.C36152EGu;
import X.C36175EHr;
import X.C84763XOl;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EGC;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC36076EDw;
import X.O3U;
import Y.IDxS130S0200000_6;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GeckoLocalRequest implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "GeckoLocalRequest";
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

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        if (((Boolean) C34639Did.LJII.getValue()).booleanValue()) {
            return 0;
        }
        return 1;
    }

    @Override // X.EEY
    public final boolean meetTrigger() {
        if (C36152EGu.LJ()) {
            return C2NW.LIZ().LJIILLIIL(C100833xX.LJLIL);
        }
        return true;
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
        o.LJIIIZ(context, "context");
        if (EGC.LIZ()) {
            C84763XOl.LJI().LIZ(new IDxS130S0200000_6(this, context, 2));
            return;
        }
        try {
            O3U.LIZIZ();
        } catch (Exception e) {
            C36175EHr.LIZ(e);
            C16880lQ.LLLLIIL(e);
        }
    }
}
