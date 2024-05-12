package X;

import com.bytedance.touchpoint.core.model.InviteBanner;
import com.bytedance.touchpoint.core.model.TouchPoint;

/* renamed from: X.95O, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C95O {
    public static void LIZ(TouchPoint touchPoint) {
        int i;
        C95U c95u = (C95U) C62819Ol5.LJIIL(touchPoint.data, InviteBanner.class);
        if (c95u != null) {
            c95u.LIZ = touchPoint.touchPointId;
            c95u.LIZ(touchPoint.touchPointName);
            Integer num = touchPoint.launchPlanId;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            c95u.LIZJ = Integer.valueOf(i);
            String str = touchPoint.abVersions;
            if (str == null) {
                str = "";
            }
            c95u.LIZLLL = str;
        }
        C2MW.LIZ().LIZ(touchPoint.touchPointId, c95u);
    }
}
