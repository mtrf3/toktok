package X;

import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.o;

/* renamed from: X.4bD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112474bD {
    public static boolean LIZ(C112454bB content) {
        IPrivacyService LJIIIIZZ;
        PrivacyUserSettingsV2 privacyUserSettings;
        Integer M;
        String str;
        o.LJIIIZ(content, "content");
        if (C00F.LIZ(31744, 0, "tt_im_in_app_push_show_active_status", true) != 2) {
            return false;
        }
        Integer num = content.LIZJ;
        int i = AbstractC63505Ow9.LIZ;
        if (num == null || num.intValue() != i) {
            return false;
        }
        int i2 = content.LIZ;
        if ((i2 != 0 && (i2 != 1 || content.LJIIZILJ.size() != 1)) || (LJIIIIZZ = PrivacyServiceImpl.LJIIIIZZ()) == null || (privacyUserSettings = LJIIIIZZ.getPrivacyUserSettings()) == null || (M = privacyUserSettings.M("activity_status")) == null || M.intValue() != 1) {
            return false;
        }
        if (content.LIZIZ == 2) {
            str = content.LJIL;
        } else {
            str = content.LJIJJLI;
        }
        if (str == null) {
            return false;
        }
        C3B2 activityStatusViewModel = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
        ActivityStatus LJIIJ = activityStatusViewModel.LJIIJ(str);
        if (LJIIJ == null) {
            C3B3.LIZ(activityStatusViewModel, str, null, null, 14);
            return false;
        }
        if (!OUP.LJJII(LJIIJ, null, null, 3)) {
            return false;
        }
        return true;
    }

    public static String LIZIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 12) {
                    return KMP.LJ("unknown_", i);
                }
                return "tcm";
            }
            return "aggregate";
        }
        return "normal";
    }
}
