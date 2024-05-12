package com.ss.android.ugc.aweme.video;

import X.C0RN;
import X.C37131Ehj;
import X.C37132Ehk;
import X.C37133Ehl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PlayerPluginInstallTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PlayerPluginInstallTask";
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
        o.LJIIIZ(context, "context");
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (!LIZLLL.checkPluginInstalled("com.ss.android.ugc.aweme.player")) {
            C37132Ehk c37132Ehk = new C37132Ehk();
            c37132Ehk.LIZIZ = true;
            c37132Ehk.LIZ = "com.ss.android.ugc.aweme.player";
            c37132Ehk.LIZLLL = new C37133Ehl();
            LIZLLL.LIZ(new C37131Ehj(c37132Ehk));
        }
    }
}
