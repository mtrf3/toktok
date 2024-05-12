package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Opm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63110Opm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2, Long l, String str3, String str4) {
        Integer num;
        C188727au LIZ2 = C78928UyK.LIZ(str, "eventType", str2, "optionIndex");
        LIZ2.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        LIZ2.LJIIIZ("stage", String.valueOf(l));
        if (str3 != null) {
            num = Integer.valueOf(CastIntegerProtector.parseInt(str3));
        } else {
            num = null;
        }
        LIZ2.LJFF(num, "theme");
        LIZ2.LJIIIZ("task_id", str4);
        LIZ2.LJIIIZ("option_index", str2);
        LIZ2.LJIIIZ("event_type", str);
        FMX.LJIIL("livesdk_live_center_other_reason_panel", LIZ2.LIZ);
    }

    public static void LIZ(Long l, String showType, String liveAcademyVideoSourceParams, String str, String str2, boolean z) {
        String str3;
        o.LJIIIZ(showType, "showType");
        o.LJIIIZ(liveAcademyVideoSourceParams, "liveAcademyVideoSourceParams");
        List LJLJJL = s.LJLJJL(liveAcademyVideoSourceParams, new String[]{","}, 0, 6);
        if (LJLJJL.size() < 4) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("enter_from", (String) ListProtector.get(LJLJJL, 0));
        c188727au.LJIIIZ("event_page", (String) ListProtector.get(LJLJJL, 1));
        c188727au.LJIIIZ("request_page", (String) ListProtector.get(LJLJJL, 2));
        c188727au.LJIIIZ("click_position", (String) ListProtector.get(LJLJJL, 3));
        Integer num = null;
        if (l != null) {
            str3 = l.toString();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("stage", str3);
        if (str != null) {
            num = Integer.valueOf(CastIntegerProtector.parseInt(str));
        }
        c188727au.LJFF(num, "theme");
        c188727au.LJIIIZ("task_id", str2);
        c188727au.LJIIIZ("show_type", showType);
        if (z) {
            c188727au.LJIIIZ("event_type", "show");
            FMX.LJIIL("livesdk_live_center_video_feedback", c188727au.LIZ);
        } else {
            c188727au.LJIIIZ("event_type", "click");
            FMX.LJIIL("livesdk_live_center_video_feedback", c188727au.LIZ);
        }
    }

    public static void LIZJ(boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7) {
        String str8;
        String str9;
        C188727au LIZ2 = C78928UyK.LIZ(str, "errorCode", str2, "optionIndex");
        LIZ2.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
        Integer num = null;
        if (l != null) {
            str8 = l.toString();
        } else {
            str8 = null;
        }
        LIZ2.LJIIIZ("stage", str8);
        if (str6 != null) {
            num = Integer.valueOf(CastIntegerProtector.parseInt(str6));
        }
        LIZ2.LJFF(num, "theme");
        LIZ2.LJIIIZ("task_id", str7);
        LIZ2.LJIIIZ("option_index", str2);
        if (z) {
            LIZ2.LJIIIZ("event_type", "show");
            FMX.LJIIL("livesdk_live_center_feedback_question", LIZ2.LIZ);
            return;
        }
        if (z2) {
            if (z3) {
                str9 = "1";
            } else {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ2.LJIIIZ("is_succeed", str9);
            LIZ2.LJIIIZ("submit_option", str4);
            LIZ2.LJI("platform", str5);
            if (!z3) {
                LIZ2.LJI("fail_reason", str);
            }
        }
        LIZ2.LJIIIZ("event_type", "click");
        LIZ2.LJIIIZ("icon_type", str3);
        FMX.LJIIL("livesdk_live_center_feedback_question", LIZ2.LIZ);
    }
}
