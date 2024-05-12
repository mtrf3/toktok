package X;

import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CountCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotResponse;

/* renamed from: X.M0g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56106M0g {
    public static M08 LIZ(CountCfg countCfg) {
        if (countCfg == null) {
            return null;
        }
        Integer showType = countCfg.getShowType();
        if (showType == null || showType.intValue() != 2 || countCfg.getCount() == null || countCfg.getCount().intValue() <= 0) {
            return M08.NORMAL;
        }
        return M08.NUMBER;
    }

    public static M06 LIZIZ(CustomDotResponse customDotResponse) {
        if (customDotResponse == null || (customDotResponse.getIconConfig() == null && customDotResponse.getCountConfig() == null)) {
            return M06.NONE;
        }
        if (customDotResponse.getIconConfig() != null) {
            return M06.SPECIAL;
        }
        return M06.NORMAL;
    }
}
