package com.ss.android.ugc.aweme.feed.motivatelogin;

import X.ActivityC45651qj;
import X.C188727au;
import X.C221018lt;
import X.C54088LKq;
import X.C54089LKr;
import X.C62822Ol8;
import X.DW2;
import X.FMX;
import X.HG3;
import X.RBX;
import X.X1D;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.social.service.IMotivateLoginService;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MotivateLoginPopupManager implements IMotivateLoginService {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_hot");
        c188727au.LJIIIZ("action_type", str);
        FMX.LJIIL("signup_login_popup", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.social.service.IMotivateLoginService
    public final void LIZ(ActivityC45651qj activityC45651qj) {
        int i;
        int i2;
        int i3;
        if (!((Boolean) DW2.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (!o.LJ(curUserId, C54089LKr.LIZIZ)) {
            C54089LKr.LIZIZ = curUserId;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("social_motivate_login_popup_freq_");
        LIZ2.append(C54089LKr.LIZIZ);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(repo, "getRepo(KEY_REPO_PREFIX + cacheUid)");
        int i4 = repo.getInt("key_per_round_show_count", 0);
        C62822Ol8 c62822Ol8 = C54089LKr.LIZ;
        Integer num = ((MotivateLoginPopupFreqParams) c62822Ol8.getValue()).maxImprPerRoundInterval;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 3;
        }
        if (i4 >= i) {
            long currentTimeMillis = (System.currentTimeMillis() - repo.getLong("key_last_show_time", 0L)) / 86400000;
            C221018lt.LJFF("motivate login", String.valueOf(currentTimeMillis));
            Integer num2 = ((MotivateLoginPopupFreqParams) c62822Ol8.getValue()).maxPerRoundInterval;
            if (num2 != null) {
                i3 = num2.intValue();
            } else {
                i3 = 7;
            }
            if (currentTimeMillis < i3) {
                return;
            }
        } else {
            long currentTimeMillis2 = (System.currentTimeMillis() - repo.getLong("key_last_show_time", 0L)) / 3600000;
            C221018lt.LJFF("motivate login", String.valueOf(currentTimeMillis2));
            Integer num3 = ((MotivateLoginPopupFreqParams) c62822Ol8.getValue()).maxPerTimeRange;
            if (num3 != null) {
                i2 = num3.intValue();
            } else {
                i2 = 24;
            }
            if (currentTimeMillis2 < i2) {
                return;
            }
        }
        PopupManager.LJIIL(new C54088LKq(activityC45651qj, new AqS175S0100000_9(this, 394)));
    }
}
