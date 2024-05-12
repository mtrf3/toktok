package com.ss.android.ugc.aweme.requesttask.idle;

import X.AnonymousClass030;
import X.C16880lQ;
import X.C2YJ;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SecSdkRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "SecSdkRequest";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "request_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return AnonymousClass030.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    @Override // X.EFM
    public final EFN type() {
        try {
            Boolean disableDelaySecReport = C2YJ.LIZIZ.LIZ.getDisableDelaySecReport();
            o.LJIIIIZZ(disableDelaySecReport, "get().disableDelaySecReport");
            if (disableDelaySecReport.booleanValue()) {
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return EFN.IDLE;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        SecApiImpl.LIZ().setParams();
    }
}
