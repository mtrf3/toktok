package com.ss.android.ugc.aweme.legoImp.task.api;

import X.C0RN;
import X.C36089EEj;
import X.C36093EEn;
import X.C77266UUc;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.notification.lego.NoticeReportBootRequest;
import com.ss.android.ugc.aweme.notification.lego.ReportColdStartRequest;
import java.util.List;

/* loaded from: classes7.dex */
public final class ReportColdBootTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ReportColdBootTask";
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
        C36093EEn.LIZ.getClass();
        C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
        LJIIIZ.LIZIZ(new NoticeReportBootRequest(), true);
        LJIIIZ.LIZIZ(new ReportColdStartRequest(), true);
        LJIIIZ.LIZ(C77266UUc.LIZIZ.LJJIII());
        LJIIIZ.LIZJ();
    }
}
