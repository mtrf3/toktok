package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import kotlin.jvm.internal.o;

/* renamed from: X.I3c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45988I3c {
    public static final void LIZ(C188727au c188727au, String str, String enterFrom, String fromInboxPage, boolean z) {
        int i;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(fromInboxPage, "fromInboxPage");
        c188727au.LJFF(Boolean.FALSE, "is_ui_shoot");
        if (C1808377v.LIZ().LIZIZ(C78939UyV.LJLILLLLZI)) {
            c188727au.LJI("previous_page", "push");
        }
        if (!TextUtils.isEmpty(str)) {
            c188727au.LJI("log_pb", str);
        }
        c188727au.LIZLLL(AVExternalServiceImpl.LIZ().publishService().getParallelPublishTaskSize(), "publish_cnt");
        c188727au.LJI("from_inbox_page", fromInboxPage);
        Z8A z8a = Z8A.LIZIZ;
        if ((z8a.isShowGuideCreateVideoInGuideUserUtil() || z8a.isTooltipInGuideUserUtil()) && o.LJ(enterFrom, "personal_homepage")) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "with_guidence");
        c188727au.LJI("tab_name", z8a.getTabNameInGuideUserUtil());
        if (z) {
            c188727au.LIZLLL(1, "is_special_icon");
            String effectId = AVExternalServiceImpl.LIZ().specialPlusService().getEffectId();
            if (!TextUtils.isEmpty(effectId)) {
                c188727au.LJI("prop_id", effectId);
                c188727au.LJI("template_id", effectId);
            }
        }
        if (C224888s8.LJ(enterFrom)) {
            c188727au.LJI("play_mode", C224888s8.LIZJ());
        }
        ISpecialPlusService specialPlusService = AVExternalServiceImpl.LIZ().specialPlusService();
        if (specialPlusService.isEffectVideoPlusShowed()) {
            c188727au.LJI("prop_id", specialPlusService.getEffectVideoPlusEffectId());
            c188727au.LJI("is_prop_plus", "1");
            c188727au.LJI("prop_selected_from", "direct_shoot");
        } else {
            c188727au.LJI("is_prop_plus", CardStruct.IStatusCode.DEFAULT);
        }
        AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("shoot", c188727au.LIZ);
    }
}
