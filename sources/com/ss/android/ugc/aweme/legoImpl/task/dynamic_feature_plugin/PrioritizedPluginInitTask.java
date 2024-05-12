package com.ss.android.ugc.aweme.legoImpl.task.dynamic_feature_plugin;

import X.C35274Dss;
import X.C38987FRv;
import X.E5I;
import X.EFK;
import X.EnumC36092EEm;
import android.content.Context;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.PluginService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PrioritizedPluginInitTask extends AbstractPluginInitTask {
    @Override // X.EEY
    public final String key() {
        return "PrioritizedPluginInitTask";
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.legoImpl.task.dynamic_feature_plugin.AbstractPluginInitTask, X.EEY
    public final EnumC36092EEm scenesType() {
        if (((Boolean) C35274Dss.LJIIJ.getValue()).booleanValue()) {
            return EnumC36092EEm.FIRST_WINDOW_FOCUS;
        }
        EnumC36092EEm enumC36092EEm = EnumC36092EEm.DEFAULT;
        o.LJIIIIZZ(enumC36092EEm, "super.scenesType()");
        return enumC36092EEm;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        PluginService.createIPluginServicebyMonsterPlugin(false).tryInit();
        if (!C38987FRv.LIZLLL().booleanValue()) {
            return;
        }
        PluginService.createIPluginServicebyMonsterPlugin(false).runClientExperimentUploadTask();
        IPluginService createIPluginServicebyMonsterPlugin = PluginService.createIPluginServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIPluginServicebyMonsterPlugin, "get().getService(IPluginService::class.java)");
        E5I.LIZ(createIPluginServicebyMonsterPlugin, Boolean.TRUE, true, 100, 7);
        LIZLLL(false);
    }
}
