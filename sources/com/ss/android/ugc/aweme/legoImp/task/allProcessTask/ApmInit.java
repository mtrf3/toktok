package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C0RN;
import X.C56672Kh;
import X.DOI;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FGN;
import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.os.SystemClock;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ApmInit implements EE1 {
    public int LJLIL;
    public final String LJLILLLLZI = "APM_INIT";
    public final ARunnableS47S0100000_11 LJLJI = new ARunnableS47S0100000_11(this, 46);

    @Override // X.EEY
    public final String key() {
        return "ApmInit";
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
        return 16777213;
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (this.LJLIL == 0) {
            FGN fgn = FGN.LIZ;
            String tag = this.LJLILLLLZI;
            o.LJIIIZ(tag, "tag");
            if (!FGN.LJFF.containsKey(tag)) {
                this.LJLIL = 1;
                fgn.LIZIZ(this.LJLJI, this.LJLILLLLZI, ((Boolean) DOI.LJI.getValue()).booleanValue());
                return;
            }
        }
        C56672Kh.LIZ().LIZLLL("FakeMain_ensure_apminit");
        FGN.LIZ(this.LJLILLLLZI);
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "FakeMain_ensure_apminit");
    }
}
