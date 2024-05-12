package X;

import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.ml.api.SmartOHRService;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class J5Z extends AbstractC48596J5k {
    public static final /* synthetic */ int LIZJ = 0;

    @Override // X.AbstractC48600J5o
    public final void LIZIZ() {
        LJI().LIZIZ("cl_ai_fast_slow_predict", new C48594J5i(0));
        LJI().LIZIZ("cl_ai_ohr", null);
        LJI().LIZIZ("cl_ai_har", null);
    }

    @Override // X.AbstractC48600J5o
    public final ConcurrentHashMap<String, String> LJFF() {
        java.util.Set<String> keySet = LJI().LIZIZ.keySet();
        if (keySet != null) {
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                LIZJ(it.next());
            }
        }
        return LJI().LIZLLL();
    }

    @Override // X.AbstractC48600J5o
    public final String LIZJ(String str) {
        InterfaceC38870FNi lastPredictResult;
        String str2 = null;
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1697181347) {
            if (hashCode != 1986024088) {
                if (hashCode == 1986031032 && str.equals("cl_ai_ohr")) {
                    C48598J5m LJI = LJI();
                    SmartOHRService smartOHRService = C48591J5f.LIZ;
                    if (smartOHRService != null && (lastPredictResult = smartOHRService.getLastPredictResult()) != null) {
                        str2 = String.valueOf(lastPredictResult.LIZJ());
                    }
                    LJI.LJFF(str2, str);
                }
            } else if (str.equals("cl_ai_har")) {
                C48598J5m LJI2 = LJI();
                SmartHARService.Companion.getClass();
                LJI2.LJFF(Integer.valueOf(J4P.LIZ.getLastStatus()), str);
            }
        } else if (str.equals("cl_ai_fast_slow_predict")) {
            C48598J5m LJI3 = LJI();
            SmartFeedPreloadService.Companion.getClass();
            LJI3.LJFF(Integer.valueOf(IWB.LIZ.obtainAiFastSlowPredict()), str);
        }
        return LJI().LIZJ(str);
    }
}
