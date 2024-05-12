package X;

import android.content.Context;
import com.ss.android.ugc.aweme.notice.api.ab.GuideOutPushExperiment;

/* renamed from: X.42R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42R {
    public static boolean LIZ(boolean z, Context context, boolean z2, C99033ud c99033ud) {
        boolean LIZJ;
        if (C97843si.LIZ()) {
            LIZJ = C40322Fs6.LIZIZ(context);
        } else {
            LIZJ = C40322Fs6.LIZJ(context);
        }
        if (z || LIZJ) {
            return false;
        }
        if (z2 && (c99033ud == null || (c99033ud.getEnterFrom() != 6 && c99033ud.getUnreadCount() <= 0))) {
            return false;
        }
        if (!((Boolean) GuideOutPushExperiment.LJIIIIZZ.getValue()).booleanValue() && !GuideOutPushExperiment.LIZIZ()) {
            return false;
        }
        return C55888Lwa.LIZIZ.LIZ.LJIILLIIL(context);
    }
}
