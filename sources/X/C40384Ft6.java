package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* renamed from: X.Ft6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40384Ft6 {
    public static boolean LIZ;

    public static void LIZJ() {
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL.isLogin()) {
            AppLog.setUserId(CastLongProtector.parseLong(LJIILL.getCurUserId()));
            AppLog.setSessionKey(LJIILL.getSessionKey());
        }
    }

    public static void LIZLLL() {
        C36292EMe c36292EMe;
        if (LiveOuterService.LJJJLL().LJJJJIZL() != null && (c36292EMe = C36292EMe.LIZIZ) != null) {
            c36292EMe.LIZ(EF7.LIZIZ());
        }
    }

    public static void LIZIZ(Bundle bundle) {
        Intent LIZ2 = C40385Ft7.LIZ(EF7.LIZIZ());
        LIZ2.putExtras(bundle);
        LIZ2.setFlags(268468224);
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            C16880lQ.LIZIZ(LJIIIIZZ, LIZ2);
            if (!LJIIIIZZ.isFinishing()) {
                LJIIIIZZ.finishAndRemoveTask();
                return;
            }
            return;
        }
        EF7.LIZIZ();
        C16880lQ.LIZJ(EF7.LIZIZ(), LIZ2);
    }

    public static void LIZ(String str, String str2) {
        C1HQ LIZJ = HXX.LIZJ("operation", str, "uid", str2);
        LIZJ.put("region_source", C64707PaR.LIZLLL);
        LIZJ.put("region_code", C64707PaR.LIZJ);
        LIZJ.put("event_time_stamp", Long.valueOf(System.currentTimeMillis()));
        C66036Pvs.LIZIZ().LJI(LIZJ);
    }
}
