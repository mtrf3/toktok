package com.ss.android.ugc.aweme.app.launch;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC60972aL;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ResumeTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ResumeTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
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
        EFK RESUME_TASK_WORK_TYPE = InterfaceC60972aL.LIZ;
        o.LJIIIIZZ(RESUME_TASK_WORK_TYPE, "RESUME_TASK_WORK_TYPE");
        return RESUME_TASK_WORK_TYPE;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }
}
