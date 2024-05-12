package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C38991FRz;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FS0;
import X.FS1;
import X.FS2;
import X.FS3;
import X.FS4;
import X.FS5;
import X.FS6;
import X.FS7;
import X.FS8;
import android.content.Context;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;

/* loaded from: classes7.dex */
public final class LiveHistoryCardReportTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "LiveHistoryCardReportTask";
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
        if (FS8.LIZ() == 1 || FS8.LIZ() == 2) {
            LiveOuterService.LJJJLL().LJJIFFI().LIZJ(true);
            C84763XOl.LIZ().LJJIFFI(C38991FRz.LJLIL).LJJJLIIL(FS2.LJLIL, FS5.LJLIL);
            C84763XOl.LJFF().LJJIFFI(FS3.LJLIL).LJJJLIIL(FS0.LJLIL, FS6.LJLIL);
            C84763XOl.LIZIZ().LJJIFFI(FS4.LJLIL).LJJJLIIL(FS1.LJLIL, FS7.LJLIL);
        }
    }
}
