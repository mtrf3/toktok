package com.ss.android.ugc.aweme.relation.auth.lego;

import X.AnonymousClass030;
import X.C48841JEv;
import X.C77266UUc;
import X.C78613UtF;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC77147UPn;
import X.L10;
import X.LA5;
import X.UT7;
import X.UTK;
import X.XKX;
import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
public final class EmailUploadRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "EmailUploadRequest";
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

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.IDLE;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        if (L10.LIZ()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = LA5.LIZJ.getLong("last_email_upload_time", 0L);
            if ((j == 0 || currentTimeMillis - j >= TimeUnit.DAYS.toMillis(90L)) && C77266UUc.LIZIZ.LJIILLIIL().LIZJ() && UTK.LIZIZ.LIZLLL(EnumC77147UPn.EMAIL).LIZIZ()) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new UT7(null), 3);
            }
        }
    }
}
