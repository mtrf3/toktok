package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.g0;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.WnQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83348WnQ {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ(char c) {
        if (c == 0 || c == '\t' || c == '\n' || c == '\r') {
            return false;
        }
        if (' ' <= c) {
            if (c < 55296) {
                return false;
            }
            if (57344 <= c) {
                if (c < 65534) {
                    return false;
                }
                if (0 <= c && c < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, C188727au c188727au) {
        OSZ LJJIIJ = g0.LJJIIJ(videoPublishEditModel);
        int intValue = ((Number) LJJIIJ.getFirst()).intValue();
        int intValue2 = ((Number) LJJIIJ.getSecond()).intValue();
        c188727au.LJIIIZ("shoot_way", videoPublishEditModel.mShootWay);
        c188727au.LJIIIZ("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        c188727au.LJIIIZ("content_type", H7R.LJIIIZ(videoPublishEditModel));
        int i = 1;
        if (intValue + intValue2 <= 1) {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_multi_content");
        c188727au.LIZLLL(intValue, "video_cnt");
        c188727au.LIZLLL(intValue2, "pic_cnt");
        c188727au.LJIIIZ("music_selected_from", videoPublishEditModel.getMusicOriginWithCheck());
        c188727au.LIZLLL(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        c188727au.LJI("creation_id", videoPublishEditModel.getCreationId());
    }

    public static void LIZ(String str, String str2, String str3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("process_id", str2);
        c188727au.LJIIIZ("creation_id", str);
        c188727au.LJIIIZ("action_type", str3);
        FMX.LJIIL("exit_chat", c188727au.LIZ);
    }

    public static void LJIIIIZZ(VideoPublishEditModel model, String str, String str2) {
        o.LJIIIZ(model, "model");
        C188727au c188727au = new C188727au();
        LIZLLL(model, c188727au);
        c188727au.LJIIIZ("enter_from", "video_edit_page_tikbot");
        c188727au.LJIIIZ("enter_method", "click_icon");
        c188727au.LJIIIZ("process_id", str);
        c188727au.LJIIIZ("action", str2);
        c188727au.LIZLLL(0, "is_fullscreen");
        FMX.LJIIL("tikbot_disclaimer_response", c188727au.LIZ);
    }

    public static void LJIIIZ(VideoPublishEditModel model, String str, String str2) {
        o.LJIIIZ(model, "model");
        C188727au c188727au = new C188727au();
        LIZLLL(model, c188727au);
        c188727au.LJIIIZ("enter_from", "video_edit_page_tikbot");
        c188727au.LJIIIZ("enter_method", "click_icon");
        c188727au.LJIIIZ("process_id", str);
        c188727au.LJI("button_type", str2);
        FMX.LJIIL("tikbot_feedback_click", c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        if (r0 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r15, X.AbstractC83369Wnl r16, int r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83348WnQ.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.Wnl, int, boolean):void");
    }

    public static void LJ(int i, VideoPublishEditModel model, String str, String str2, String rank, String interaction_name) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(rank, "rank");
        o.LJIIIZ(interaction_name, "interaction_name");
        C188727au c188727au = new C188727au();
        LIZLLL(model, c188727au);
        c188727au.LJIIIZ("enter_from", "video_edit_page_tikbot");
        c188727au.LJIIIZ("enter_method", "click_icon");
        c188727au.LJIIIZ("process_id", str);
        c188727au.LJIIIZ("query_message_id", str2);
        c188727au.LIZLLL(i, "creation_interaction_source");
        c188727au.LJIIIZ("rank", rank);
        c188727au.LJI("interaction_name", interaction_name);
        FMX.LJIIL("quick_interaction_show", c188727au.LIZ);
    }

    public static void LJI(String str, String str2, boolean z, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", str);
        c188727au.LJIIIZ("music_id_list", String.valueOf(jSONArray));
        c188727au.LJIIIZ("template_id_list", String.valueOf(jSONArray2));
        c188727au.LJIIIZ("text_list", String.valueOf(jSONArray3));
        c188727au.LIZLLL(z ? 1 : 0, "is_return_rec_list");
        c188727au.LJI("query_message_id", str2);
        FMX.LJIIL("return_rec_message_result", c188727au.LIZ);
    }

    public static void LJII(VideoPublishEditModel model, String str, String str2, String str3, String str4, String str5) {
        o.LJIIIZ(model, "model");
        C188727au c188727au = new C188727au();
        LIZLLL(model, c188727au);
        c188727au.LJIIIZ("enter_from", "video_edit_page_tikbot");
        c188727au.LJIIIZ("enter_method", "click_icon");
        c188727au.LJIIIZ("process_id", str);
        c188727au.LJIIIZ("message_id", str2);
        c188727au.LJIIIZ("server_message_id", str3);
        c188727au.LJIIIZ("send_status", str4);
        c188727au.LJI("check_msg_status_code", str5);
        FMX.LJIIL("send_message_response", c188727au.LIZ);
    }

    public static void LJFF(VideoPublishEditModel model, String str, String messageId, String str2, String str3, String str4, String creationMessageType, String str5, String str6, int i) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(messageId, "messageId");
        o.LJIIIZ(creationMessageType, "creationMessageType");
        C188727au c188727au = new C188727au();
        LIZLLL(model, c188727au);
        c188727au.LJIIIZ("enter_from", "video_edit_page_tikbot");
        c188727au.LJIIIZ("enter_method", "click_icon");
        c188727au.LJIIIZ("process_id", str);
        c188727au.LJIIIZ("message_id", messageId);
        c188727au.LJIIIZ("query_message_id", str2);
        c188727au.LJIIIZ("message_content", str3);
        c188727au.LJIIIZ("message_type", str4);
        c188727au.LJIIIZ("creation_message_type", creationMessageType);
        c188727au.LJIIIZ("answer_status", str5);
        c188727au.LJIIIZ("cration_answer_status", str6);
        c188727au.LIZLLL(i, "is_retry");
        FMX.LJIIL("receive_message", c188727au.LIZ);
    }
}
