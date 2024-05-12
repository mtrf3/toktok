package com.ss.android.ugc.aweme;

import X.C0RN;
import X.C35154Dqw;
import X.C67128QWe;
import X.C72545SdZ;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.M50;
import X.QQ9;
import X.QQA;
import X.QWY;
import android.content.Context;
import java.util.List;

/* loaded from: classes12.dex */
public class WsRegionTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "WsRegionTask";
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

    @Override // X.EEY
    public final void run(Context context) {
        C72545SdZ c72545SdZ = new C72545SdZ();
        if (C35154Dqw.LIZ()) {
            C67128QWe.LIZIZ.LIZJ(1025, 1, new QQ9(c72545SdZ));
        } else {
            QWY.LJIIIZ.LIZ().LIZLLL(new M50(1025, 1), new QQA(c72545SdZ));
        }
    }
}
