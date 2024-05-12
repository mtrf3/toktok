package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.EB3;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackService;
import java.util.List;

/* loaded from: classes7.dex */
public final class PreloadInMeasureTriggerTask implements EE1 {
    public static final PreloadInMeasureTriggerTask LJLIL = new PreloadInMeasureTriggerTask();

    @Override // X.EEY
    public final String key() {
        return "PreloadInMeasureTriggerTask";
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
        return EnumC36092EEm.FIRST_WINDOW_FOCUS;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if ((((Number) EB3.LIZ.getValue()).intValue() & 1) == 1) {
            EarlyFeedbackService.LJI().LJ();
        }
    }
}
