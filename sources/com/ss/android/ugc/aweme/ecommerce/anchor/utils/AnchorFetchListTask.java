package com.ss.android.ugc.aweme.ecommerce.anchor.utils;

import X.C0RN;
import X.C35154Dqw;
import X.C56274M6s;
import X.C67128QWe;
import X.C67143QWt;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.QWY;
import android.content.Context;
import java.util.List;

/* loaded from: classes10.dex */
public final class AnchorFetchListTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AnchorFetchListTask";
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
        C56274M6s c56274M6s = C56274M6s.LJLIL;
        if (C35154Dqw.LIZ()) {
            C67128QWe c67128QWe = C67128QWe.LIZIZ;
            c67128QWe.LJIIIIZZ(c56274M6s);
            c67128QWe.LIZJ(C56274M6s.LIZIZ().LJLIL, C56274M6s.LIZIZ().LJLILLLLZI, c56274M6s);
        } else {
            C67143QWt c67143QWt = QWY.LJIIIZ;
            c67143QWt.LIZ().LIZJ(c56274M6s);
            c67143QWt.LIZ().LIZLLL(C56274M6s.LIZIZ(), c56274M6s);
        }
    }
}
