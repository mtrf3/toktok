package com.ss.android.ugc.aweme.power;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.LUZ;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public final class PowerModeTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PowerModeTask";
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
        if (context == null) {
            return;
        }
        if (LUZ.LIZIZ == null) {
            synchronized (LUZ.class) {
                if (LUZ.LIZIZ == null) {
                    LUZ.LIZIZ = new LUZ();
                }
            }
        }
        LUZ.LIZIZ.LIZ();
    }
}
