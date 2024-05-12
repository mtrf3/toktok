package com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper;

import X.AnonymousClass030;
import X.C3E0;
import X.C3FK;
import X.C3YC;
import X.C3YM;
import X.C48841JEv;
import X.C78613UtF;
import X.C80513Dz;
import X.C80763Ey;
import X.C80993Fv;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.J9A;
import X.XKX;
import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public final class FetchIMFollowListRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "FetchIMFollowListRequest";
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
        long j = C80993Fv.LIZ().LIZ.getLong("last_relation_fetch_max_time", 0L);
        if (j >= 0 && j > 0) {
            return EFN.IDLE;
        }
        return EFN.NORMAL;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        if (C80763Ey.LIZLLL()) {
            C3YC c3yc = C3YC.LJLIL;
            C3YM c3ym = C3YM.COLDUP_FULL;
            if (c3yc.LJ(c3ym)) {
                c3yc.LJIIIZ(c3ym, false);
                return;
            }
            C3FK.LJFF(null, null, false, null, true, 24);
            c3yc.LJIIIZ(C3YM.COLDUP_DIFF, false);
            if ((System.currentTimeMillis() - C3E0.LIZIZ.getLong("key_warm_start_time", 0L)) / 1000 < J9A.LIZIZ("im_mention_check_valid_duration_for_warm_start", 14400L)) {
                return;
            }
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C80513Dz(null), 3);
        }
    }
}
