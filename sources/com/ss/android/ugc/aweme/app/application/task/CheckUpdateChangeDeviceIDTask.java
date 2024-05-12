package com.ss.android.ugc.aweme.app.application.task;

import X.AV1;
import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import java.util.List;
import yq4.a;

/* loaded from: classes11.dex */
public final class CheckUpdateChangeDeviceIDTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "CheckUpdateChangeDeviceIDTask";
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!a.LJI().LIZJ()) {
            if (AV1.LJIIJJI()) {
                a.LJI().LJIILLIIL(new ARunnableS46S0100000_10(context, 35), true);
                return;
            } else {
                a.LJI().LJIIJ();
                a.LJI().LJIILIIL(context);
                return;
            }
        }
        a.LJI().LJIILIIL(context);
    }
}
