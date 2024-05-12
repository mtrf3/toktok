package com.ss.android.ugc.aweme.legoImp.task;

import X.ActivityC86117Xqz;
import X.C0RN;
import X.C40858G1u;
import X.C71426S1m;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class InitStringHotUpdateTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitStringHotUpdateTask";
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C71426S1m c71426S1m = ActivityC86117Xqz.Companion;
        C40858G1u g = C40858G1u.LJLIL;
        c71426S1m.getClass();
        o.LJIIIZ(g, "g");
        ActivityC86117Xqz.processGenerator.add(g);
    }
}
