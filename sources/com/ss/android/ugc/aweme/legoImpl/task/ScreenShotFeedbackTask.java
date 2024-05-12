package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C221018lt;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.ScreenshotFeedbackSettings;
import java.util.List;

/* loaded from: classes2.dex */
public final class ScreenShotFeedbackTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ScreenShotFeedbackTask";
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
        if (context == null) {
            return;
        }
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ScreenshotFeedbackSettings.ScreenFeedbackConfig screenFeedbackConfig = ScreenshotFeedbackSettings.LIZ;
        ScreenshotFeedbackSettings.ScreenFeedbackConfig screenFeedbackConfig2 = (ScreenshotFeedbackSettings.ScreenFeedbackConfig) LIZLLL.LJIIIIZZ("screenshot_feedback_settings", ScreenshotFeedbackSettings.ScreenFeedbackConfig.class, screenFeedbackConfig);
        if (screenFeedbackConfig2 != null) {
            screenFeedbackConfig = screenFeedbackConfig2;
        }
        C221018lt.LJFF("ScreenShotFeedbackTask", "settings=" + screenFeedbackConfig);
        Integer valueOf = Integer.valueOf(screenFeedbackConfig.feedbackUsable);
        if (valueOf != null) {
            valueOf.intValue();
        }
    }
}
