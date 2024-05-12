package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.C107234It;
import X.C112284au;
import X.C32U;
import X.C4C7;
import X.C4HU;
import X.C4I7;
import X.C4R6;
import X.C87393br;
import X.C92023jK;
import X.InterfaceC107424Jm;
import X.InterfaceC112734bd;
import X.InterfaceC221448ma;
import X.InterfaceC221688my;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMNaviAnalyticsImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSayhiAnalyticsImpl;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMAnalyticsProvider {
    public static final IMAnalyticsProvider INSTANCE = new IMAnalyticsProvider();
    public static final C4C7 imNaviAnalytics = IMNaviAnalyticsImpl.LJLJI;
    public static final InterfaceC107424Jm activityStatusAnalytics = C112284au.LIZ;
    public static final InterfaceC221448ma quickReplyAnalytics = new InterfaceC221448ma() { // from class: X.3x0
        @Override // X.InterfaceC221448ma
        public final void LIZIZ(String str, String str2) {
            C772831o.LIZ().LIZIZ("show_quick_reply_pannel", HXX.LIZJ("enter_from", str, "to_user_id", str2));
        }

        @Override // X.InterfaceC221448ma
        public final void LIZ(String str, String str2, String str3) {
            C85323Wm LIZ2 = C772831o.LIZ();
            C1HQ LIZJ = HXX.LIZJ("enter_from", str, "click_field", str2);
            LIZJ.put("to_user_id", str3);
            LIZ2.LIZIZ("click_quick_reply_pannel", LIZJ);
        }
    };
    public static final InterfaceC221688my imSayhiAnalytics = IMSayhiAnalyticsImpl.LIZ;
    public static final C4R6 imShareAnalytics = C107234It.LIZ;
    public static final C32U stickerStoreAnalytics = C87393br.LIZ;
    public static final InterfaceC112734bd imNudgeAnalytics = C92023jK.LIZ;
    public static final C4I7 profileViewerAnalytics = new C4I7() { // from class: X.3UA
        @Override // X.C4I7
        public final void LIZ(java.util.Map<String, String> map) {
            LIZJ("click", map);
        }

        @Override // X.C4I7
        public final void LIZIZ(java.util.Map<String, String> map) {
            LIZJ("show", map);
        }

        public static void LIZJ(String str, java.util.Map map) {
            Object obj;
            if (C78685UuP.LJJJZ((String) map.get("enter_method"))) {
                obj = map.get("enter_method");
            } else {
                obj = "inner_push_profile_viewer";
            }
            C772831o.LIZ().LIZIZ("greeting_button", C113554cx.LJJLIIIJILLIZJL(C113554cx.LJJLIIIIJ(new OSZ("enter_from", "inner_push"), new OSZ("enter_method", obj), new OSZ("action_type", str), new OSZ("message_type", "send_a_hi")), map));
        }
    };
    public static final C4HU inboxAnalytics = new C4HU() { // from class: X.3Th
        @Override // X.C4HU
        public final void LIZ(String str) {
            C85323Wm LIZ2 = C772831o.LIZ();
            LinkedHashMap LIZIZ = JF1.LIZIZ("enter_from", "notification_page", "enter_method", "receive_failed_message_cell");
            LIZIZ.put("panel_version", "3");
            LIZ2.LIZIZ(str, LIZIZ);
        }

        @Override // X.C4HU
        public final void LIZIZ(java.util.Map<String, String> params) {
            String str;
            o.LJIIIZ(params, "params");
            C85323Wm LIZ2 = C772831o.LIZ();
            LinkedHashMap LIZ3 = C0JU.LIZ("enter_from", "notification_page");
            LIZ3.put("rank", params.get("rank"));
            LIZ3.put("unread_cnt", params.get("show_cnt"));
            LIZ3.put("num_strangers", params.get("num_strangers"));
            LIZ3.put("num_muf_maf", params.get("num_muf_maf"));
            LIZ3.put("num_users", params.get("num_users"));
            if (o.LJ(params.get("action_type"), "show")) {
                str = "show_receive_failed_message_cell";
            } else {
                str = "click_receive_failed_message_cell";
            }
            LIZ2.LIZIZ(str, LIZ3);
        }
    };

    public final InterfaceC107424Jm getActivityStatusAnalytics() {
        return activityStatusAnalytics;
    }

    public final C4C7 getImNaviAnalytics() {
        return imNaviAnalytics;
    }

    public final InterfaceC112734bd getImNudgeAnalytics() {
        return imNudgeAnalytics;
    }

    public final InterfaceC221688my getImSayhiAnalytics() {
        return imSayhiAnalytics;
    }

    public final C4R6 getImShareAnalytics() {
        return imShareAnalytics;
    }

    public final C4HU getInboxAnalytics() {
        return inboxAnalytics;
    }

    public final C4I7 getProfileViewerAnalytics() {
        return profileViewerAnalytics;
    }

    public final InterfaceC221448ma getQuickReplyAnalytics() {
        return quickReplyAnalytics;
    }

    public final C32U getStickerStoreAnalytics() {
        return stickerStoreAnalytics;
    }
}
