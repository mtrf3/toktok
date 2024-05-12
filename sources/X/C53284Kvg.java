package X;

import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.ss.android.ugc.aweme.compliance.business.banappeal.warninginfo.AgsWarningInfoSet;

/* renamed from: X.Kvg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53284Kvg {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        int i;
        boolean z;
        AgsWarningInfo agsWarningInfo;
        AgsWarningInfoSet LIZ2 = C52541Kjh.LIZ();
        if (LIZ2 != null && (agsWarningInfo = LIZ2.itemPostWarningInfo) != null) {
            i = agsWarningInfo.getWarningLevel();
        } else {
            i = 0;
        }
        if (C48692J9c.LIZ() < i) {
            z = true;
        } else {
            z = false;
        }
        if (C48692J9c.LIZ() > i) {
            C48692J9c.LIZIZ(i);
        }
        if (!LIZIZ() || !z) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ() {
        AgsWarningInfo agsWarningInfo;
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        AgsWarningInfoSet LIZ2 = C52541Kjh.LIZ();
        if (LIZ2 == null || (agsWarningInfo = LIZ2.itemPostWarningInfo) == null || agsWarningInfo.getWarningLevel() == 0) {
            C48692J9c.LIZIZ(0);
            return false;
        }
        return true;
    }
}
