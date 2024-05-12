package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: X.Mb5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57103Mb5 extends AbstractC57102Mb4 {
    public final C57104Mb6 LIZ = new C57104Mb6();

    @Override // X.AbstractC57102Mb4, X.InterfaceC57163Mc3
    public final void onCleared() {
        this.LIZ.LIZJ = 0;
        C55371LoF.LIZIZ().LJLJJL = "";
    }

    @Override // X.InterfaceC57163Mc3
    public final boolean LIZ(long j, long j2) {
        C57104Mb6 c57104Mb6 = this.LIZ;
        c57104Mb6.getClass();
        long j3 = C55371LoF.LIZIZ().LJLJJI * 1000;
        if (j3 >= 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            calendar.set(11, c57104Mb6.LIZ);
            calendar.set(12, c57104Mb6.LIZIZ);
            calendar.set(13, 0);
            long timeInMillis = calendar.getTimeInMillis();
            long longValue = SharePrefCache.inst().getLastHintToastTime().LIZ().longValue();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(longValue);
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(calendar2.getTime());
            if (longValue < timeInMillis && j >= timeInMillis) {
                SharePrefCache.inst().getLastHintToastTime().LIZLLL(Long.valueOf(timeInMillis));
                c57104Mb6.LIZJ = 0;
            } else {
                timeInMillis = longValue;
            }
            if (j - timeInMillis > j3) {
                this.LIZ.getClass();
                if (j2 > C55371LoF.LIZIZ().LJLJJI * 1000) {
                    this.LIZ.getClass();
                    if (C55371LoF.LIZIZ().LJLJJI * 1000 > 0) {
                        C57104Mb6 c57104Mb62 = this.LIZ;
                        c57104Mb62.getClass();
                        SharePrefCache.inst().getLastHintToastTime().LIZLLL(Long.valueOf(System.currentTimeMillis()));
                        c57104Mb62.LIZJ++;
                        this.LIZ.getClass();
                        C55371LoF.LIZIZ().LJLJJL = String.valueOf(((C55371LoF.LIZIZ().LJLJJI * 1000) * this.LIZ.LIZJ) / 60000);
                    }
                }
            }
        }
        return false;
    }
}
