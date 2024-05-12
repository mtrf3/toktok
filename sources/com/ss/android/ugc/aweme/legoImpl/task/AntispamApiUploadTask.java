package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0RN;
import X.C36922EeM;
import X.C38776FJs;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FWZ;
import android.content.Context;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AntispamApiUploadTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AntispamApiUploadTask";
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
        C36922EeM.LJ("AntispamApiUploadTask");
        if (C38776FJs.LJIIL().LIZ(context, "is_first_install", true)) {
            SecApiImpl.LIZ().reportData(FWZ.INSTALL.getReportName());
            C38776FJs.LJIIL().LJI(context, "is_first_install", false);
        }
        SecApiImpl.LIZ().reportData(FWZ.COLD_START.getReportName());
    }
}
