package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.share.ShareRespSendServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import defpackage.e1;

/* loaded from: classes8.dex */
public class HE2 implements InterfaceC43749HEz {
    public static final void LIZ(Activity activity) {
        if (activity instanceof MainActivity) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity;
            if (com.bytedance.hox.Hox.kv0(activityC45651qj).vv0("HOME")) {
                Bundle bundle = new Bundle();
                bundle.putString("fromStart", "MainPage");
                com.bytedance.hox.Hox.kv0(activityC45651qj).jv0(bundle, "HOME");
            }
        }
    }

    public final void LIZJ(ActivityC45651qj activityC45651qj, BaseShortVideoContext baseShortVideoContext, C45828Hyi c45828Hyi) {
        LIZIZ(activityC45651qj, baseShortVideoContext.mShootWay, C43723HDz.LIZJ(baseShortVideoContext), c45828Hyi);
    }

    public static final void LIZIZ(Activity activity, String str, C43722HDy c43722HDy, C45828Hyi c45828Hyi) {
        if (c43722HDy == null) {
            return;
        }
        String str2 = c43722HDy.mClientKey;
        int i = c43722HDy.mShareMediaType;
        if (str != null && C43723HDz.LJI(str)) {
            C45829Hyj.LIZIZ(str, str2, c45828Hyi, i);
        }
        if (C43723HDz.LJ(c43722HDy)) {
            if (activity != null || (activity = C84763XOl.LJIIIIZZ()) != null) {
                ShareRespSendServiceImpl.LJ().LIZJ(activity, c43722HDy, c45828Hyi);
                return;
            }
            return;
        }
        if (activity == null) {
            return;
        }
        if (e1.LIZ(31744, "should_stay_in_tiktok", true, false)) {
            Intent LIZIZ = FCD.LIZIZ(activity, activity.getPackageName());
            LIZIZ.addFlags(67108864);
            LIZIZ.addFlags(268435456);
            C16880lQ.LIZIZ(activity, LIZIZ);
        }
        SAAService.LIZ().finishCurrentPage(activity);
    }
}
