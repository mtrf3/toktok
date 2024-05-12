package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* loaded from: classes9.dex */
public final class J97 {
    public static String LIZ(M89 m89) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get key for ");
        Integer num = null;
        if (m89 != null) {
            str = m89.getEventType();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (m89 == null || !Z9N.LIZIZ.LJJIJLIJ(m89.getEventType())) {
            return "trending_detail_vm";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("trending_detail_vm");
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            num = Integer.valueOf(topActivity.hashCode());
        }
        LIZ2.append(num);
        return X1D.LIZIZ(LIZ2);
    }
}
