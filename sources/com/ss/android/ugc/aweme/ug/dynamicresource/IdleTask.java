package com.ss.android.ugc.aweme.ug.dynamicresource;

import X.C0RN;
import X.C82802Wec;
import X.DQB;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public final class IdleTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "IdleTask";
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

    @Override // X.EE1
    public final EFK type() {
        if (((Boolean) DQB.LIZ.getValue()).booleanValue()) {
            return EFK.BOOT_FINISH;
        }
        return EFK.IDLE;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        while (true) {
            C82802Wec.LIZ.getClass();
            if (!C82802Wec.LIZJ.isEmpty()) {
                C82802Wec.LJIILIIL("idle");
            } else {
                return;
            }
        }
    }
}
