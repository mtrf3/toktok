package com.ss.android.ugc.awemepushlib.task;

import X.C0RN;
import X.C84763XOl;
import X.C88074YhS;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import Y.AfS58S0100000_6;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public final class CancelNotificationTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "CancelNotificationTask";
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
    public final boolean meetTrigger() {
        return !((Boolean) C88074YhS.LJFF.getValue()).booleanValue();
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
        C84763XOl.LJI().LJJJJZI(new AfS58S0100000_6(context, 22));
    }
}
