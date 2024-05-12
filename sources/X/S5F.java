package X;

import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S5F {
    public static final /* synthetic */ int LIZ = 0;

    public static /* synthetic */ java.util.Map LIZIZ(String str, String str2, boolean z, String str3, String str4) {
        return LIZ(str, str2, null, str3, str4, z);
    }

    public static java.util.Map LIZ(String str, String str2, Integer num, String str3, String str4, boolean z) {
        String str5;
        boolean z2;
        HH1.LIZ(str, "roomId", str2, "authorId", str4, "pageName");
        OSZ[] oszArr = new OSZ[6];
        int i = 0;
        oszArr[0] = new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
            str5 = "before_live";
        } else {
            str5 = "during_live";
        }
        oszArr[1] = new OSZ("live_status", str5);
        oszArr[2] = new OSZ("page_name", str4);
        oszArr[3] = new OSZ("room_id", str);
        oszArr[4] = new OSZ("author_id", str2);
        oszArr[5] = new OSZ("is_new", Integer.valueOf(z ? 1 : 0));
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            LJJLIIIIJ.put("user_type", "author");
        } else {
            LJJLIIIIJ.put("user_type", "moderator");
            LJJLIIIIJ.put("moderator_id", str3);
        }
        if (num != null) {
            num.intValue();
            if (num.intValue() == 2) {
                i = 1;
            }
            LJJLIIIIJ.put("is_from_sug_template", Integer.valueOf(i));
        }
        return LJJLIIIIJ;
    }

    public static void LJFF(int i, String roomId, String authorId, String str, String str2, boolean z) {
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        java.util.Map LIZ2 = LIZ(roomId, authorId, Integer.valueOf(i), str2, "notice_board_template", z);
        LIZ2.put("button_name", str);
        b.LJJIJIIJI("livesdk_tiktokec_button_click", LIZ2);
    }

    public static void LJI(String roomId, String authorId, boolean z, boolean z2, String str, String str2, String str3, int i) {
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        java.util.Map LIZ2 = LIZ(roomId, authorId, Integer.valueOf(i), str3, "notice_board_template", z);
        LIZ2.put("is_success", Integer.valueOf(z2 ? 1 : 0));
        LIZ2.put("result_name", str);
        if (str2 != null) {
            LIZ2.put("fail_reason", str2);
        }
        LIZ2.put("photo_num", 1);
        b.LJJIJIIJI("livesdk_tiktokec_result_show", LIZ2);
    }

    public static void LIZJ(String roomId, String authorId, String templateId, boolean z, String str, String str2, boolean z2, int i, int i2) {
        int i3;
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(templateId, "templateId");
        java.util.Map LIZ2 = LIZ(roomId, authorId, Integer.valueOf(i2), str2, "notice_board_edit", z);
        LIZ2.put("button_name", str);
        LIZ2.put("template_id", templateId);
        LIZ2.put("template_type", Integer.valueOf(i));
        if (z2) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        LIZ2.put("is_suggested_template", Integer.valueOf(i3));
        b.LJJIJIIJI("livesdk_tiktokec_button_click", LIZ2);
    }

    public static void LIZLLL(String roomId, String authorId, long j, boolean z, String templateId, int i, String str, String str2, int i2, boolean z2) {
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(templateId, "templateId");
        java.util.Map LIZ2 = LIZ(roomId, authorId, Integer.valueOf(i2), str2, "notice_board_edit", z);
        LIZ2.put("stay_time", Long.valueOf(j));
        LIZ2.put("quit_type", str);
        LIZ2.put("template_id", templateId);
        LIZ2.put("template_type", Integer.valueOf(i));
        LIZ2.put("is_suggested_template", Integer.valueOf(z2 ? 1 : 0));
        b.LJJIJIIJI("livesdk_tiktokec_stay_page", LIZ2);
    }

    public static void LJ(int i, int i2, String roomId, String authorId, String str, String templateId, String str2, boolean z, boolean z2, boolean z3) {
        int i3;
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(templateId, "templateId");
        java.util.Map LIZ2 = LIZ(roomId, authorId, Integer.valueOf(i2), str2, "notice_board_template", z);
        LIZ2.put("button_name", str);
        LIZ2.put("template_id", templateId);
        if (z2) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        LIZ2.put("is_org_template", Integer.valueOf(i3));
        LIZ2.put("template_type", Integer.valueOf(i));
        LIZ2.put("is_suggested_template", Integer.valueOf(z3 ? 1 : 0));
        b.LJJIJIIJI("livesdk_tiktokec_button_click", LIZ2);
    }
}
