package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper;
import java.util.LinkedHashMap;

/* renamed from: X.NSp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59391NSp {
    public static void LIZ(Activity activity) {
        NWF LIZ;
        java.util.Map<Integer, AdPopUpWebPageHelper> map = AdPopUpWebPageHelper.LJLL;
        AdPopUpWebPageHelper adPopUpWebPageHelper = (AdPopUpWebPageHelper) ((LinkedHashMap) map).get(Integer.valueOf(activity.hashCode()));
        if (adPopUpWebPageHelper != null) {
            ActivityC45651qj LIZIZ = adPopUpWebPageHelper.LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.getLifecycle().removeObserver(adPopUpWebPageHelper);
                if (adPopUpWebPageHelper.LJLJJL != null && (LIZ = C42391GkN.LIZ(LIZIZ)) != null) {
                    LIZ.LJIJ();
                    C16880lQ.LJLLLL(LIZ, C42391GkN.LIZIZ(LIZIZ));
                }
            }
            map.remove(Integer.valueOf(activity.hashCode()));
        }
    }
}
