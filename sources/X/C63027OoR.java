package X;

import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model.AppealStatusResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.OoR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63027OoR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C188727au c188727au, AppealStatusResponse appealStatusResponse) {
        int appealType;
        if (appealStatusResponse.getAppealType() == 12) {
            appealType = 1;
        } else {
            appealType = appealStatusResponse.getAppealType();
        }
        c188727au.LIZLLL(appealType, "ban_appeal_type");
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
    }

    public static void LIZIZ(AppealStatusResponse appealStatusResponse, String enterFrom) {
        o.LJIIIZ(appealStatusResponse, "appealStatusResponse");
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        LIZ(c188727au, appealStatusResponse);
        c188727au.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("click_appeal", c188727au.LIZ);
    }

    public static void LIZJ(AppealStatusResponse appealStatusResponse, int i) {
        o.LJIIIZ(appealStatusResponse, "appealStatusResponse");
        C188727au c188727au = new C188727au();
        LIZ(c188727au, appealStatusResponse);
        c188727au.LIZLLL(i, "click_type");
        FMX.LJIIL("tns_appeal_popup_window_click", c188727au.LIZ);
    }
}
