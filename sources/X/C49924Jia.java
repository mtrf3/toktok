package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jia, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49924Jia {
    public static final java.util.Map<C49915JiR, OSZ<C49915JiR, C10K<?>>> LIZ = new HashMap();
    public static final java.util.Map<String, C49931Jih> LIZIZ = new HashMap();
    public static long LIZJ;
    public static int LIZLLL;
    public static int LJ;

    public static String LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        LIZ2.append('_');
        LIZ2.append(System.currentTimeMillis());
        LIZ2.append('_');
        LIZ2.append(V0Q.Default.nextInt(0, ImagePreloadExperiment.PRIORITY_DEFAULT));
        return X1D.LIZIZ(LIZ2);
    }

    public static void LIZ(C49915JiR c49915JiR) {
        String keyword;
        SearchResultParam searchResultParam = c49915JiR.LJLIL;
        if (searchResultParam == null || (keyword = searchResultParam.getKeyword()) == null) {
            return;
        }
        java.util.Map<String, C49931Jih> map = LIZIZ;
        C49931Jih c49931Jih = (C49931Jih) ((HashMap) map).get(keyword);
        if (c49931Jih != null && !o.LJ(c49931Jih.LIZJ, "hit")) {
            Z9N.LIZIZ.LJIIIZ("cancel", keyword, "TIME_OUT");
            ((HashMap) LIZ).remove(c49915JiR);
            ((HashMap) map).remove(keyword);
        }
    }

    public static OSZ LIZJ(C49915JiR c49915JiR) {
        java.util.Map<C49915JiR, OSZ<C49915JiR, C10K<?>>> map = LIZ;
        OSZ osz = (OSZ) ((HashMap) map).get(c49915JiR);
        if (osz != null) {
            C49920JiW LJ2 = C49921JiX.LJ(c49915JiR.LJLIL);
            LJ2.getClass();
            if (!o.LJ(LJ2, C49567Jcp.LIZ)) {
                LJ2.LJJI = 1;
            }
            C49923JiZ LIZLLL2 = C49922JiY.LIZLLL(c49915JiR.LJLIL);
            LIZLLL2.getClass();
            if (!o.LJ(LIZLLL2, C49936Jim.LIZ)) {
                LIZLLL2.LJIILJJIL = 1;
            }
        } else {
            osz = null;
        }
        ((HashMap) map).remove(c49915JiR);
        String str = c49915JiR.LJLILLLLZI;
        if (str != null) {
            ((HashMap) LIZIZ).remove(str);
        }
        return osz;
    }
}
