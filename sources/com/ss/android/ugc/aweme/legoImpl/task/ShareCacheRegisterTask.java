package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C36827Ecp;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.P8H;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ShareCacheRegisterTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ShareCacheRegisterTask";
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
        return EFK.IDLE;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        P8H.LJIIL(new C36827Ecp());
    }
}
