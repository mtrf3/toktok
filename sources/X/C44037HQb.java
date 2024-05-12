package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.HQb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44037HQb {
    public static void LIZ(Activity activity) {
        if (activity == null) {
            return;
        }
        activity.overridePendingTransition(R.anim.ft, R.anim.g2);
    }

    public static void LIZIZ(Activity activity, int i) {
        if (activity == null) {
            return;
        }
        int i2 = R.anim.g0;
        int i3 = R.anim.fv;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            i3 = R.anim.ft;
                            i2 = R.anim.g2;
                        }
                    } else {
                        i3 = R.anim.ae;
                        i2 = 0;
                    }
                } else {
                    i3 = R.anim.fw;
                    i2 = R.anim.g1;
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
        }
        activity.overridePendingTransition(i3, i2);
    }
}
