package com.ss.android.ugc.aweme.requesttask.background;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.IWF;
import android.content.Context;
import defpackage.e1;
import java.util.List;

/* loaded from: classes7.dex */
public class PreCreatePlayerTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PreCreatePlayerTask";
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (e1.LIZ(31744, "enable_precreate_session", true, false)) {
            IWF.LJJLIIIIJ().LJJ();
        } else {
            IWF.LJJLIIIIJ().LJIILIIL();
        }
    }
}
