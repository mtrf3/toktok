package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.72i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1794072i {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LJFF(long j, String str, String str2, String str3) {
        FMX.LJIIL("video_views_permission_guide", C113554cx.LJJL(new OSZ("enter_from", str), new OSZ("action_type", str2), new OSZ("now_type", str3), new OSZ("vv_cnt", String.valueOf(j))));
    }

    public static final void LJI(String str, String str2, String str3, String str4, String str5) {
        FMX.LJIIL("search_comment_at", C113554cx.LJJL(new OSZ("enter_from", str), new OSZ("enter_method", str2), new OSZ("group_id", str3), new OSZ("author_id", str4), new OSZ("now_type", str5)));
    }

    public static final void LIZLLL(String str, String str2, String str3, int i, long j, Comment comment) {
        String str4;
        String str5;
        String str6;
        String str7;
        User user;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        String str8 = null;
        if (comment != null) {
            str4 = comment.getCid();
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("comment_id", str4);
        if (comment != null && (user = comment.getUser()) != null) {
            str5 = user.getUid();
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("comment_user_id", str5);
        if (comment != null) {
            str6 = comment.getReplyId();
        } else {
            str6 = null;
        }
        c188727au.LJIIIZ("parent_comment_id", str6);
        if (comment != null) {
            String replyToReplyCommentId = comment.getReplyToReplyCommentId();
            if (replyToReplyCommentId != null && replyToReplyCommentId.length() != 0) {
                if (comment != null) {
                    str7 = comment.getReplyToReplyCommentId();
                } else {
                    str7 = null;
                }
                if (!o.LJ(str7, CardStruct.IStatusCode.DEFAULT)) {
                    if (comment != null) {
                        str8 = comment.getReplyToReplyCommentId();
                    }
                }
            }
            if (comment != null) {
                str8 = comment.getReplyId();
            }
        }
        c188727au.LJIIIZ("reply_comment_id", str8);
        c188727au.LJIIIZ("group_id", str3);
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LIZLLL(i + 1, "comment_position");
        c188727au.LJ(j, "duration");
        FMX.LJIIL("comment_duration", c188727au.LIZ);
    }

    public static final void LJIIIIZZ(String str, String str2, int i, int i2, String str3, String str4) {
        FMX.LJIIL("interaction_bullet_show", C113554cx.LJJL(new OSZ("enter_from", str), new OSZ("notice_type", str2), new OSZ("from_user_id", str3), new OSZ("is_now_clear", String.valueOf(i)), new OSZ("now_type", str4), new OSZ("has_small_window", String.valueOf(i2))));
    }

    public static final void LIZ(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        FMX.LJIIL("interaction_bullet_click", C113554cx.LJJL(new OSZ("enter_from", str), new OSZ("enter_method", str4), new OSZ("from_user_id", str2), new OSZ("is_now_clear", String.valueOf(i)), new OSZ("now_type", str3), new OSZ("notice_type", str5), new OSZ("has_small_window", String.valueOf(i2))));
    }

    public static final void LIZJ(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Long l) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("tab_name", str2);
        c188727au.LJIIIZ("now_type", str4);
        c188727au.LJIIIZ("enter_method", str3);
        c188727au.LJIIIZ("group_id", str5);
        c188727au.LJIIIZ("author_id", str6);
        c188727au.LJFF(num, "follow_status");
        c188727au.LJFF(l, "vv_cnt");
        FMX.LJIIL("enter_author_reaction_panel", c188727au.LIZ);
    }

    public static final void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Long l) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("tab_name", str2);
        c188727au.LJIIIZ("now_type", str4);
        c188727au.LJIIIZ("enter_method", str3);
        c188727au.LJIIIZ("exit_method", str5);
        c188727au.LJIIIZ("group_id", str6);
        c188727au.LJIIIZ("author_id", str7);
        c188727au.LJFF(num, "follow_status");
        c188727au.LJFF(l, "vv_cnt");
        FMX.LJIIL("close_author_reaction_panel", c188727au.LIZ);
    }

    public static final void LJ(String str, String str2, String str3, String str4, Integer num, Integer num2, int i, String str5, String str6, String str7, int i2, Aweme aweme) {
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", "");
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LJIIIZ("author_id", str3);
        c188727au.LJIIIZ("now_type", str4);
        c188727au.LJFF(num, "input_text_length");
        c188727au.LJFF(num2, "user_text_length");
        c188727au.LIZLLL(i, "rank");
        c188727au.LJIIIZ("search_keyword", str5);
        c188727au.LJIIIZ("to_user_id", str6);
        c188727au.LJIIIZ("search_id", str7);
        c188727au.LIZLLL(i2, "follow_status");
        Object LJII = c220488l2.LJII(aweme, c188727au);
        C222578oP.LIZJ(LJII, aweme, null, null, 14);
        C188727au c188727au2 = (C188727au) LJII;
        String LJII2 = C222578oP.LJII(C84763XOl.LJIIIIZZ(), str, null);
        c188727au2.getClass();
        c188727au2.LJIIIZ("enter_position", LJII2);
        FMX.LJIIL("add_comment_at", c188727au2.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        if (r3 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bb, code lost:
    
        if (r3 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.Integer r8, java.lang.String r9, com.ss.android.ugc.aweme.comment.model.Comment r10, java.lang.String r11, java.lang.String r12, java.util.List<java.lang.String> r13, java.lang.Integer r14, int r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.Integer r19, int r20, int r21, int r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1794072i.LJII(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.ss.android.ugc.aweme.comment.model.Comment, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, int, java.lang.String, java.lang.String, int, java.lang.Integer, int, int, int, java.lang.String, java.lang.String):void");
    }
}
