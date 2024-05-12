package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;

/* renamed from: X.9uV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251839uV {
    public static C251839uV LIZ;

    public static C251839uV LIZ() {
        if (LIZ == null) {
            LIZ = new C251839uV();
        }
        return LIZ;
    }

    public static UserResponse LIZIZ(int i, C252699vt c252699vt) {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        String LIZJ = C251809uS.LIZJ(i, Boolean.FALSE, ((RBX) HG3.LJIILL()).getCurSecUserId(), curUserId, null);
        C3EA.LIZ(LIZJ);
        return C251809uS.LIZIZ(c252699vt, LIZJ, null, true);
    }

    public static void LIZJ(Handler handler, String str) {
        C3EA.LIZ(str);
        FGR.LIZIZ().LIZ(handler, new CallableC67193QYr(2, str), 0);
    }
}
