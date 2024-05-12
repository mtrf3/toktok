package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.72g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1793872g {
    public static String LIZLLL(Comment comment) {
        if (comment == null) {
            return "original";
        }
        String replyId = comment.getReplyId();
        boolean LJJIFFI = C79004UzY.LJJIFFI(comment.getReplyComments());
        if (comment.getCommentType() == 0) {
            return "reply";
        }
        if (!TextUtils.isEmpty(replyId) && !TextUtils.equals(replyId, CardStruct.IStatusCode.DEFAULT)) {
            return "reply_to_reply";
        }
        if (!LJJIFFI) {
            return "original";
        }
        return "reply";
    }

    public static void LJIIL(LinkedHashMap linkedHashMap) {
        if (linkedHashMap.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append(',');
            sb2.append(entry.getValue());
            sb2.append(',');
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "comment");
        c188727au.LJIIIZ("cnt", sb2.toString());
        FMX.LJIIL("send_emoji", c188727au.LIZ);
    }

    public static void LIZ(C188727au c188727au, C177156xL c177156xL) {
        String str;
        if (c177156xL != null && (str = c177156xL.LIZIZ) != null && !TextUtils.isEmpty(str)) {
            c188727au.LJI("from_page", str);
        }
    }

    public static C188727au LIZIZ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJI("group_id", str2);
        Aweme i6 = AwemeService.LIZ().i6(str2);
        if (i6 != null) {
            c188727au.LJI("author_id", i6.getAuthorUid());
        }
        return c188727au;
    }

    public static void LJFF(String str, String str2, String str3, String str4) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("return_method", str);
        c198517qh.LIZ.put("group_id", str3);
        c198517qh.LIZ.put("enter_from", str2);
        c198517qh.LIZ.put("author_id", str4);
        EF7.LIZIZ();
        FMX.LJI(0L, "emoji_to_keyboard", str2, str3, c198517qh.LJ());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("return_method", str);
        c188727au.LJIIIZ("group_id", str3);
        c188727au.LJIIIZ("author_id", str4);
        FMX.LJIIL("emoji_to_keyboard", c188727au.LIZ);
    }

    public static void LJIIJJI(Comment comment, Aweme aweme, String str, boolean z) {
        int i;
        C188727au c188727au = new C188727au();
        if (aweme != null) {
            c188727au.LJI("group_id", aweme.getAid());
            c188727au.LJI("author_id", aweme.getAuthorUid());
        }
        if (comment != null) {
            if (!TextUtils.isEmpty(comment.getText())) {
                i = comment.getText().length();
            } else {
                i = 0;
            }
            c188727au.LJI("comment_id", comment.getCid());
            c188727au.LJI("comment_author_id", comment.getUser().getUid());
            c188727au.LJI("enter_button_name", str);
            c188727au.LJI("enter_method", "icon");
            c188727au.LIZLLL(z ? 1 : 0, "is_recommendation");
            c188727au.LIZLLL(i, "comment_length");
        }
        FMX.LJIIL("click_share_comment_button", c188727au.LIZ);
    }

    public static void LJ(String str, String str2, int i, int i2, String str3, boolean z, String str4) {
        int i3 = i2 + 1;
        if (i == 2) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str2);
            c188727au.LJIIIZ("group_id", str3);
            c188727au.LJIIIZ("author_id", str4);
            c188727au.LIZLLL(i3, "click_emoji_location");
            c188727au.LIZLLL(z ? 1 : 0, "is_exposed_emoji");
            c188727au.LJIIIZ("emoji_code", str);
            FMX.LJIIL("click_fast_emoji", c188727au.LIZ);
        }
    }

    public static void LJII(String str, Aweme aweme, String str2, String str3, C177156xL c177156xL, long j, int i) {
        int i2;
        String str4;
        C188727au c188727au = new C188727au();
        c188727au.LJII(ForwardStatisticsServiceImpl.LIZIZ().LIZ(aweme, str));
        c188727au.LJI("comment_category", str2);
        if (!str3.isEmpty()) {
            c188727au.LJI("enter_method", str3);
        }
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            c188727au.LJI("country_name", aweme.getAuthor().getRegion());
        }
        c188727au.LIZLLL(i, "show_exposed_emoji");
        if (j > 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c188727au.LIZLLL(i2, "is_zero_comment");
        if (c177156xL != null && (str4 = c177156xL.LIZ) != null) {
            c188727au.LJI("from_location", str4);
        }
        LIZ(c188727au, c177156xL);
        if (aweme != null) {
            c188727au.LIZLLL(aweme.getAwemeType(), "aweme_type");
            String LIZ = C187677Yd.LIZ(aweme);
            if (LIZ != null && !LIZ.isEmpty()) {
                c188727au.LJI("photo_content_type", LIZ);
            }
        }
        if (C175306uM.LIZIZ && c177156xL != null && !TextUtils.isEmpty(c177156xL.LJI)) {
            c188727au.LJI("rectype_commenter", c177156xL.LJI);
        }
        FMX.LJIIL("enter_text", c188727au.LIZ);
    }

    public static C188727au LIZJ(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", str);
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LJIIIZ("comment_id", str3);
        c188727au.LJIIIZ("comment_user_id", str4);
        c188727au.LJIIIZ("author_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("parent_id", str5);
        c188727au.LIZLLL(i, "parent_position");
        c188727au.LIZLLL(i2, "secondary_position");
        c188727au.LJIIIZ("comment_category", str6);
        return c188727au;
    }

    public static void LJI(String str, String str2, String str3, String str4, Aweme aweme, String str5, String str6, boolean z, String str7, int i, HashMap hashMap) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("group_id", str2);
        c198517qh.LIZ.put("request_id", str4);
        c198517qh.LIZ.put("enter_from", str);
        c198517qh.LIZ.put("enter_method", str5);
        c198517qh.LIZ.put("enter_type", "normal_way");
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("enter_detail");
        obtain.setLabelName("personal_homepage");
        obtain.setValue(str3);
        obtain.setJsonObject(c198517qh.LJ());
        FMX.onEvent(obtain);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("to_user_id", str3);
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LJIIIZ("request_id", str4);
        c188727au.LJIIIZ("enter_method", str5);
        c188727au.LJIIIZ("enter_type", "normal_way");
        FMX.LJIIL("enter_personal_detail_backup", c188727au.LIZ);
        if (aweme != null) {
            C198517qh c198517qh2 = new C198517qh();
            c198517qh2.LIZ.put("request_id", aweme.getRequestId());
            c198517qh2.LIZ.put("group_id", aweme.getAid());
            MobClick obtain2 = MobClick.obtain();
            obtain2.setEventName("head");
            obtain2.setLabelName(str);
            obtain2.setValue(aweme.getAuthorUid());
            obtain2.setJsonObject(c198517qh2.LJ());
            FMX.onEvent(obtain2);
        }
        C7ZV c7zv = new C7ZV();
        c7zv.LIZLLL = str;
        c7zv.LJJLI = str5;
        c7zv.LJJLJLI = "comment_list";
        c7zv.LJJLL = "comment_list";
        c7zv.LJLIIL = str6;
        c7zv.LJJIJ(aweme);
        c7zv.LJLLILLLL = i;
        c7zv.LJJLIIIJJIZ = str3;
        C220488l2.LIZIZ.LJII(aweme, c7zv);
        C222578oP.LIZIZ(c7zv, aweme, null, null, null);
        C57258Mda.LIZJ(c7zv, hashMap);
        if (C175306uM.LIZIZ) {
            c7zv.LJIJI = str7;
            c7zv.LJLLLL = Boolean.valueOf(z);
        }
        c7zv.LJIILIIL();
        C38987FRv.LJI(LSC.PROFILE);
    }

    public static void LJIIJ(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, String str8, int i3, boolean z) {
        String str9;
        C188727au LIZJ = LIZJ(i, i2, str, str2, str3, str4, str5, str6);
        if ("message".equals(str7) && str3 != null && str8 != null && str3.equals(str8)) {
            str9 = "1";
        } else {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.LJIIIZ("enter_from", str7);
        LIZJ.LJIIIZ("reply_type", str9);
        LIZJ.LIZLLL(i3, "is_others_video");
        LIZJ.LIZLLL(z ? 1 : 0, "is_recommendation");
        FMX.LJIIL("reply_via_video", LIZJ.LIZ);
    }

    public static void LJIIIZ(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, int i, java.util.Map<String, Object> map, C177156xL c177156xL) {
        User user;
        String str10 = str2;
        if ("opus".equals(str10) || "collection".equals(str10)) {
            if (z) {
                str10 = "personal_homepage";
            } else {
                str10 = "others_homepage";
            }
        }
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("reply_uid", str6);
        c198517qh.LIZ.put("reply_comment_id", str5);
        c198517qh.LIZ.put("is_photo", Integer.valueOf(z2 ? 1 : 0));
        c198517qh.LIZ.put("is_retry", 0);
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    o.LJII(value2, "null cannot be cast to non-null type kotlin.String");
                    c198517qh.LIZLLL(key, (String) value2);
                } else if (value instanceof Boolean) {
                    String key2 = entry.getKey();
                    Object value3 = entry.getValue();
                    o.LJII(value3, "null cannot be cast to non-null type kotlin.Boolean");
                    c198517qh.LIZ((Boolean) value3, key2);
                } else if (value instanceof Integer) {
                    String key3 = entry.getKey();
                    Object value4 = entry.getValue();
                    o.LJII(value4, "null cannot be cast to non-null type kotlin.Int");
                    c198517qh.LIZIZ((Integer) value4, key3);
                }
            }
        }
        EF7.LIZIZ();
        FMX.LJI(0L, str, str10, str4, c198517qh.LJ());
        C188727au LJIIIIZZ = JBR.LJIIIIZZ("reply_uid", str6, "reply_comment_id", str5);
        LJIIIIZZ.LIZLLL(z2 ? 1 : 0, "is_photo");
        LJIIIIZZ.LIZLLL(0, "is_retry");
        LJIIIIZZ.LJI("enter_from", str10);
        LJIIIIZZ.LJI("group_id", str4);
        LJIIIIZZ.LJI("enter_method", str3);
        if ("post_reply_comment".equals(str)) {
            LJIIIIZZ.LIZLLL(i, "parent_comment_length");
            LJIIIIZZ.LJI("parent_comment_uid", str8);
            LJIIIIZZ.LJI("direct_reply_comment_uid", str7);
            LJIIIIZZ.LJI("reply_uid", str8);
        }
        C65832iB.LIZ(LJIIIIZZ, map);
        if (!TextUtils.isEmpty(str9)) {
            LJIIIIZZ.LJI("news_id", str9);
        }
        if (c177156xL != null) {
            LJIIIIZZ.LIZLLL(c177156xL.LJ ? 1 : 0, "is_photo_contained");
            LJIIIIZZ.LIZLLL(c177156xL.LJFF ? 1 : 0, "is_reply_cmt_photo_contained");
        }
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        C78866UxK.LJIILLIIL(LJIIIIZZ, user);
        FMX.LJIIL(str, LJIIIIZZ.LIZ);
    }

    public static void LJIIIIZZ(String str, String str2, Aweme aweme, String str3, boolean z, String str4, boolean z2, String str5, int i, String str6, String str7, int i2, String str8, String str9, String str10, java.util.Map map, String str11, int i3, int i4) {
        User user;
        String str12;
        NowPostInfo nowPostInfo;
        String str13;
        String str14 = str4;
        C188727au c188727au = new C188727au();
        c188727au.LJII(ForwardStatisticsServiceImpl.LIZIZ().LIZ(aweme, str));
        c188727au.LIZLLL(z ? 1 : 0, "is_success");
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            c188727au.LJI("country_name", aweme.getAuthor().getRegion());
        }
        if (TextUtils.equals(str, "general_search")) {
            if (IG2.LIZ) {
                str13 = "1";
            } else {
                str13 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("is_fullscreen", str13);
            c188727au.LJI("rank", C227768wm.LJIIL(9, aweme));
        }
        if (z) {
            c188727au.LJI("comment_id", str3);
        }
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        C78866UxK.LJIILLIIL(c188727au, user);
        c188727au.LJI("user_level", str9);
        c188727au.LJI("comment_author_level", str10);
        c188727au.LIZLLL(i3, "comment_length");
        if (aweme != null && (nowPostInfo = aweme.nowPostInfo) != null && nowPostInfo.getNowMediaType() != null) {
            str12 = aweme.nowPostInfo.getNowMediaType();
        } else {
            str12 = "post";
        }
        c188727au.LJI("now_type", str12);
        C65832iB.LIZ(c188727au, map);
        if (aweme != null) {
            V0N.LJI(c188727au, aweme);
        }
        if (z2 && !TextUtils.equals(str, "homepage_fresh_topic")) {
            c188727au.LJI("enter_from", "trending_page");
            c188727au.LJI("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
        }
        if (aweme != null) {
            c188727au.LJIIIZ("enter_method", str2);
            c188727au.LIZLLL(C222578oP.LJFF(aweme.getAuthor()), "follow_status");
            c188727au.LIZLLL(i, "follow_status_to_user");
            c188727au.LIZLLL(aweme.getAwemeType(), "aweme_type");
            c188727au.LIZLLL(aweme.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        }
        if (TextUtils.equals("1", str5)) {
            if (!TextUtils.isEmpty(str) && (TextUtils.equals(str, "click_comment_chain") || TextUtils.equals(str, "click_comment_bubble") || TextUtils.equals(str, "push") || TextUtils.equals(str, "web"))) {
                c188727au.LJI("comment_enter_method", str);
                c188727au.LJI("last_group_id", str6);
            } else if (!TextUtils.isEmpty(str) && TextUtils.equals(str, "notification_page")) {
                c188727au.LJI("comment_enter_method", "notification");
                c188727au.LJI("last_group_id", str6);
            } else if (!TextUtils.isEmpty(str) && TextUtils.equals(str, "comment")) {
                c188727au.LJI("comment_enter_method", "comment_panel");
                c188727au.LJI("last_group_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                c188727au.LJI("is_video", str7);
                if (TextUtils.equals(str7, "1")) {
                    c188727au.LIZLLL(i2, "is_others_video");
                }
            }
        }
        C220488l2.LIZIZ.LJII(aweme, c188727au);
        C222578oP.LIZIZ(c188727au, aweme, str, str11, null);
        c188727au.LIZLLL(i4, "is_photo_contained");
        String str15 = "cancel_like_comment";
        if (C227768wm.LJJIIJ(str)) {
            c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(aweme)));
            if (TextUtils.isEmpty(str14)) {
                str14 = "";
            }
            c188727au.LJIIIZ("comment_user_id", str14);
            if (!TextUtils.isEmpty(str7)) {
                c188727au.LJI("is_video", str7);
                if (TextUtils.equals(str7, "1")) {
                    c188727au.LIZLLL(i2, "is_others_video");
                }
            }
            if (C224888s8.LJ(str)) {
                c188727au.LJI("play_mode", C224888s8.LIZJ());
            }
            if (TextUtils.equals("1", str5)) {
                str15 = "like_comment";
            }
            c188727au.LJIIIIZZ(K02.LIZIZ(str15, aweme, str));
            c188727au.LIZLLL(C227768wm.LJIILIIL(aweme), "pic_cnt");
            FMX.LJIILJJIL(str15, C227768wm.LJJIIZI(c188727au.LIZ));
            return;
        }
        if (!TextUtils.isEmpty(str7)) {
            c188727au.LJI("is_video", str7);
            if (TextUtils.equals(str7, "1")) {
                c188727au.LIZLLL(i2, "is_others_video");
            }
        }
        if (!TextUtils.isEmpty(str8)) {
            c188727au.LJI("news_id", str8);
        }
        LQA.LIZIZ.LJII(str, (HashMap) c188727au.LIZ, aweme, false);
        C51556KLg.LIZ.getClass();
        C51556KLg.LIZ().LJJIJLIJ(aweme, (HashMap) c188727au.LIZ);
        c188727au.LIZLLL(aweme.getAwemeType(), "aweme_type");
        C57258Mda.LIZIZ(c188727au, "like_comment", C2S6.LIZ(C84763XOl.LJIIIIZZ()).getInboxLogExtra());
        if (TextUtils.equals("1", str5)) {
            str15 = "like_comment";
        }
        FMX.LJIIL(str15, c188727au.LIZ);
    }
}
