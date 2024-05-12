package com.ss.android.ugc.aweme.ad.feed.hybrid.container;

import X.C0RN;
import X.C58582Rq;
import X.C78983UzD;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import java.util.List;

/* loaded from: classes7.dex */
public final class AdHybridTask implements EE1 {
    public final String LJLIL = "AdHybridTask";

    @Override // X.EEY
    public final String key() {
        return "AdHybridTask";
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (context == null) {
            C78983UzD.LJIILJJIL();
        } else {
            C58582Rq.LIZ("Task run initialize", this.LJLIL);
            AdHybridContainerManager.LIZLLL().initialize();
        }
    }
}
