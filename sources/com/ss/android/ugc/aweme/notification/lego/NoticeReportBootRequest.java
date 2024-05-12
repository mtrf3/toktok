package com.ss.android.ugc.aweme.notification.lego;

import X.AnonymousClass030;
import X.C38763FJf;
import X.C68542QvC;
import X.DNL;
import X.DY5;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.RBW;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NoticeReportBootRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "NoticeReportBootRequest";
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
            return;
        }
        Keva repo = Keva.getRepo("cold_boot_repo");
        long j = 0;
        if (repo != null) {
            j = repo.getLong(LIZJ, 0L);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (((Number) DY5.LIZ.getValue()).intValue() <= 0 || currentTimeMillis - j <= ((Number) r3.getValue()).intValue() * 3600000) {
            return;
        }
        Keva.getRepo("cold_boot_repo").storeLong(LIZJ, currentTimeMillis);
        MusNotificationApiManager.LJIIJ();
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
        C38763FJf c38763FJf = new C38763FJf(this);
        c68542QvC.getClass();
        C68542QvC.LIZ(c38763FJf);
        LIZLLL();
    }
}
