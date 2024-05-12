package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C36922EeM;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F9J;
import X.InterfaceC36076EDw;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public class SharePreferencePreloadForAllProcessTask implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "SharePreferencePreloadForAllProcessTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 35;
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

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C36922EeM.LJ("SharePreferencePreloadForAllProcessTask");
        LIZLLL(context, 0, "app_setting");
        LIZLLL(context, 0, "use_https");
        LIZLLL(context, 0, "update_params");
        LIZLLL(context, 0, "is_allow_oppo_push");
        LIZLLL(context, 0, "push_setting");
        LIZLLL(context, 4, "push_multi_process_config");
        LIZLLL(context, 0, "applog_stats");
    }

    public final void LIZLLL(Context context, int i, String str) {
        F9J.LIZIZ(context, i, str).getAll();
    }
}
