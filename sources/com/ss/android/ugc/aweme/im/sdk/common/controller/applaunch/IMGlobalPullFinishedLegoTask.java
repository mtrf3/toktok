package com.ss.android.ugc.aweme.im.sdk.common.controller.applaunch;

import X.C0RN;
import X.C780334l;
import X.C80763Ey;
import X.C80943Fq;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.XKX;
import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public final class IMGlobalPullFinishedLegoTask implements EE1 {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // X.EEY
    public final String key() {
        return "IMGlobalPullFinishedLegoTask";
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
        if (!C80763Ey.LIZLLL()) {
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C80943Fq(null), 3);
    }
}
