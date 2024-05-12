package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C52185Kdx;
import X.C52231Keh;
import X.C84757XOf;
import X.C84758XOg;
import X.C84759XOh;
import X.C84761XOj;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.G58;
import X.InterfaceC84762XOk;
import android.app.Application;
import android.content.Context;
import java.util.List;

/* loaded from: classes16.dex */
public final class InitPageMonitorTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitPageMonitorTask";
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
        if (!C52185Kdx.LIZ || context == null) {
            return;
        }
        C84759XOh c84759XOh = new C84759XOh();
        ((List) G58.LIZ.getValue()).add(new C84757XOf(c84759XOh));
        ((Application) context).registerActivityLifecycleCallbacks(new C84758XOg(c84759XOh));
        if (!C52231Keh.LIZ()) {
            return;
        }
        InterfaceC84762XOk interfaceC84762XOk = C84761XOj.LIZIZ;
        if (interfaceC84762XOk != null) {
            interfaceC84762XOk.LIZ(null);
        }
        c84759XOh.LIZ = C84761XOj.LIZ;
        C84761XOj.LIZIZ = c84759XOh;
    }
}
