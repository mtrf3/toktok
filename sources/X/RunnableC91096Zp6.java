package X;

import com.ss.android.ugc.aweme.dsp.playerservice.entity.DspExpiredPlayableRecord;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;

/* renamed from: X.Zp6, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class RunnableC91096Zp6 implements Runnable {
    public final void LIZ() {
        ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
        if (expiredPlayableManager.isTodayPlayableLimited() && !expiredPlayableManager.isToday(ExpiredPlayableManager.expiredRecord.currentDate)) {
            C2U8.LIZ(new C56082Ia());
        }
        if (!expiredPlayableManager.isToday(ExpiredPlayableManager.expiredRecord.currentDate)) {
            ExpiredPlayableManager.expiredRecord = new DspExpiredPlayableRecord();
            expiredPlayableManager.clearPreviewUpsellInfo();
            expiredPlayableManager.clearPreviewPlayedInfo();
            expiredPlayableManager.writeConfigToKeva();
            C2U8.LIZ(new C2IZ(true));
        }
        ExpiredPlayableManager.resetHandler.postDelayed(this, expiredPlayableManager.getTomorrowInterval());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
