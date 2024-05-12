package com.ss.android.ugc.aweme.notification.lego;

import X.AnonymousClass030;
import X.C221018lt;
import X.C38764FJg;
import X.C68542QvC;
import X.DNL;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.MS5;
import X.RBW;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.AqS44S1000000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ReportColdStartRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "ReportColdStartRequest";
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

    public final void LIZLLL() {
        String LIZJ = RBW.LJLLI.LIZJ();
        if (TextUtils.isEmpty(LIZJ) || o.LJ(CardStruct.IStatusCode.DEFAULT, LIZJ)) {
            C221018lt.LJFF("ReportColdStartRequest", "report filter. User info is empty");
        } else {
            C221018lt.LJFF("ReportColdStartRequest", "report");
            MS5.LIZ(new AqS44S1000000_6(LIZJ, 1));
        }
    }

    @Override // X.EFM
    public final EFN type() {
        if (DNL.LIZ()) {
            return EFN.BOOT_FINISH;
        }
        return EFN.NORMAL;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        C68542QvC c68542QvC = C68542QvC.LIZ;
        C38764FJg c38764FJg = new C38764FJg(this);
        c68542QvC.getClass();
        C68542QvC.LIZ(c38764FJg);
        LIZLLL();
    }
}
