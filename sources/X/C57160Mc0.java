package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ContinuousTimeCalculator;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings;
import com.ss.android.ugc.aweme.compliance.protection.timelock.RevampPasscodeUtil;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Mc0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57160Mc0 extends AbstractC57102Mb4 {
    public final C55681LtF LIZ = new C55681LtF();
    public final C55682LtG LIZIZ = new C55682LtG();

    @Override // X.InterfaceC57163Mc3
    public final boolean LIZ(long j, long j2) {
        if (C86305Xu1.LJFF()) {
            long checkGap = ContinuousTimeCalculator.getCheckGap();
            if (checkGap >= 0 && this.LIZIZ.LIZ(System.currentTimeMillis())) {
                if (this.LIZ.LIZ(System.currentTimeMillis())) {
                    SharePrefCache.inst().getTodayVideoPlayTime().LIZLLL(0L);
                    this.LIZ.LIZJ(System.currentTimeMillis());
                }
                long longValue = SharePrefCache.inst().getTodayVideoPlayTime().LIZ().longValue() + checkGap;
                SharePrefCache.inst().getTodayVideoPlayTime().LIZLLL(Long.valueOf(longValue));
                if (longValue > C86305Xu1.LIZJ() * 60 * 1000) {
                    if (PipServiceImpl.LJJII().isInPipMode()) {
                        C2U8.LIZ(new IK5());
                    } else {
                        C10K.LIZIZ(new Callable() { // from class: X.UrI
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C1FO.LJIIJ(null, "");
                                return null;
                            }
                        }, C10K.LJIIIIZZ, null);
                    }
                }
            }
        }
        long checkGap2 = ContinuousTimeCalculator.getCheckGap();
        UserNightScreenTimeSettings LIZIZ = C86308Xu4.LIZIZ();
        if ((LIZIZ == null || !o.LJ(LIZIZ.getSleepReminderEnabled(), Boolean.FALSE)) && checkGap2 >= 0 && !C57399Mfr.LJ) {
            RevampPasscodeUtil.LIZ.getClass();
            if (!RevampPasscodeUtil.LIZIZ) {
                int i = C57399Mfr.LIZ;
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (1 <= i && i <= currentTimeMillis) {
                    C10K.LIZIZ(CallableC57162Mc2.LJLIL, C10K.LJIIIIZZ, null);
                }
            }
        }
        return false;
    }
}
