package com.ss.android.ugc.aweme.search.core.viewmodel.task;

import X.C0RN;
import X.C10760bY;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.MAR;
import X.MAT;
import android.content.Context;
import android.content.IntentFilter;
import java.util.List;

/* loaded from: classes10.dex */
public final class SearchWidgetTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "SearchWidgetTask";
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
        try {
            MAR.LIZ.LIZIZ(context);
            if (context != null) {
                C10760bY.LIZ(context).LIZIZ(new MAT(), new IntentFilter("com.ss.android.ugc.tiktok.app.widget.SEARCH_SUGGEST_LIST_WIDGET_REPORT"));
            }
        } catch (Exception unused) {
        }
    }
}
