package com.ss.android.ugc.aweme.a11y;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.X1W;
import android.content.Context;
import java.util.List;

/* loaded from: classes16.dex */
public final class AccessibilityEventTrackingTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AccessibilityEventTrackingTask";
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
        X1W x1w = AccessibilityEventTrackingMonitor.Companion;
        x1w.getClass();
        AccessibilityEventTrackingMonitor accessibilityEventTrackingMonitor = AccessibilityEventTrackingMonitor.monitor;
        if (accessibilityEventTrackingMonitor == null) {
            synchronized (x1w) {
                accessibilityEventTrackingMonitor = AccessibilityEventTrackingMonitor.monitor;
                if (accessibilityEventTrackingMonitor == null) {
                    accessibilityEventTrackingMonitor = new AccessibilityEventTrackingMonitor();
                    AccessibilityEventTrackingMonitor.monitor = accessibilityEventTrackingMonitor;
                }
            }
        }
        if (context != null) {
            accessibilityEventTrackingMonitor.startAccessibilityEventTracking(context);
        }
        accessibilityEventTrackingMonitor.addAppBackGroundListener();
        accessibilityEventTrackingMonitor.addNewLifeCycleCallbacks();
    }
}
