package com.ss.android.ugc.aweme.legoImpl.task.dynamic_feature_plugin;

import X.C38987FRv;
import X.EFK;
import android.content.Context;
import com.ss.android.ugc.aweme.NewUserJourneyService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DelayedPluginInitTask extends AbstractPluginInitTask {
    @Override // X.EEY
    public final String key() {
        return "DelayedPluginInitTask";
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        Boolean LIZLLL = C38987FRv.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
        if (LIZLLL.booleanValue()) {
            return;
        }
        PluginService.createIPluginServicebyMonsterPlugin(false).runClientExperimentUploadTask();
        LIZLLL(true);
        NewUserJourneyService.LJIILLIIL().LJII();
    }
}
