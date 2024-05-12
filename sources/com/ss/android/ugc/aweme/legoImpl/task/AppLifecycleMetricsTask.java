package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import X.InterfaceC63764P0u;
import android.content.Context;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AppLifecycleMetricsTask implements EE1, InterfaceC63764P0u {
    @Override // X.EEY
    public final String key() {
        return "AppLifecycleMetricsTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
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

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        FMX.onEventV3("app_foreground");
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
        o.LJIIIZ(context, "context");
        FMX.onEventV3("lifecycle_listener_init");
        ActivityStack.addNonWeakAppBackGroundListener(this);
        new ExitBackgroundManager("exit_background");
    }
}
