package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.74Z */
/* loaded from: classes4.dex */
public final class C74Z {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LJIIZILJ(String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        FMX.LJIIL("click_add_photo_comment", LIZLLL.LIZ);
    }

    public static final void LJIL(String str) {
        FMX.LJIIL("click_liked_by_creator", JBR.LJIIIIZZ("action_type", str, "tag_type", "icon").LIZ);
    }

    public static final void LJJIIJ(String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        FMX.LJIIL("show_add_photo_comment", LIZLLL.LIZ);
    }

    public static final void LIZLLL(Comment comment, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("comment_id", comment.getCid());
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static C188727au LJ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJI("group_id", str2);
        Aweme i6 = AwemeService.LIZ().i6(str2);
        if (i6 != null) {
            c188727au.LJI("author_id", i6.getAuthorUid());
        }
        return c188727au;
    }

    public static final void LJIIIZ(String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("type", str2);
        FMX.LJIIL("add_photo_comment", LIZLLL.LIZ);
    }

    public static final void LJIILJJIL(int i, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, "video_reply_number");
        c188727au.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("comment_batch_management_more_ck", c188727au.LIZ);
    }

    public static final void LJIJI(String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("type", str2);
        FMX.LJIIL("delete_photo_comment", LIZLLL.LIZ);
    }

    public static final void LJIJJ(String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("target", str2);
        LIZLLL.LIZLLL(1, "comment_cnt");
        FMX.LJIIL("delete_video_comment", LIZLLL.LIZ);
    }

    public static final void LJJIIZ(int i, String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LIZLLL(i, "is_others_video");
        FMX.LJIIL("tap_video_reply_comment", LIZLLL.LIZ);
    }

    public static final void LJJIIZI(String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("source", str2);
        FMX.LJIIL("full_screen_view_photo", LIZLLL.LIZ);
    }

    public static final void LJJIJIIJI(boolean z, C74D c74d) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Integer num;
        if (z) {
            str = "translation_success";
        } else {
            str = "translation_fail";
        }
        IAccountUserService LJIILL = HG3.LJIILL();
        String str8 = null;
        if (LJIILL != null) {
            str2 = ((RBX) LJIILL).getCurUserId();
        } else {
            str2 = null;
        }
        C188727au c188727au = new C188727au();
        if (c74d != null) {
            str3 = c74d.LIZ;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("author_id", str3);
        if (c74d != null) {
            str4 = c74d.LJ;
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("enter_from", str4);
        if (c74d != null) {
            str5 = c74d.LIZJ;
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("comment_id", str5);
        if (c74d != null) {
            str6 = c74d.LIZLLL;
        } else {
            str6 = null;
        }
        c188727au.LJIIIZ("position", str6);
        c188727au.LJIIIZ("user_id", str2);
        if (c74d != null) {
            str7 = c74d.LJI;
        } else {
            str7 = null;
        }
        c188727au.LJIIIZ("comment_source_lang", str7);
        c188727au.LJIIIZ("target_lang", C178406zM.LJFF());
        if (c74d != null) {
            num = 0;
        } else {
            num = null;
        }
        c188727au.LJFF(num, "is_liked_by_author");
        if (c74d != null) {
            str8 = c74d.LIZIZ;
        }
        c188727au.LJIIIZ("group_id", str8);
        if (c74d != null) {
            c188727au.LIZIZ(((float) (System.currentTimeMillis() - c74d.LJFF)) / 1000, "load_duration_overall");
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static final void LJIJJLI(String enterFrom, int i, Comment comment) {
        String str;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(comment, "comment");
        if (i == 1) {
            str = "favorite_comment";
        } else {
            str = "cancel_favorite_comment";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("comment_id", comment.getCid());
        c188727au.LJIIIZ("to_user_id", comment.getUser().getUid());
        c188727au.LJIIIZ("group_id", comment.getAwemeId());
        c188727au.LIZLLL(V16.LJJIZ(comment) ? 1 : 0, "is_recommendation");
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LJJII(TextExtraStruct textExtraStruct, Comment comment, String searchPosition) {
        String str;
        o.LJIIIZ(textExtraStruct, "textExtraStruct");
        o.LJIIIZ(comment, "comment");
        o.LJIIIZ(searchPosition, "searchPosition");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("search_position", searchPosition);
        c188727au.LJIIIZ("words_position", String.valueOf(textExtraStruct.getWordPosition()));
        c188727au.LJIIIZ("words_source", "comment_highlighted_words");
        c188727au.LJIIIZ("words_content", textExtraStruct.getSearchKeyword());
        c188727au.LJIIIZ("comment_id", comment.getCid());
        c188727au.LJIIIZ("group_id", textExtraStruct.getSearchKeywordId());
        c188727au.LJIIIZ("enter_group_id", comment.getAwemeId());
        LogPbBean logPb = comment.getLogPb();
        if (logPb == null || (str = logPb.getImprId()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("impr_id", str);
        FMX.LJIIL("trending_words_click", c188727au.LIZ);
    }

    public static void LJJIII(TextExtraStruct textExtraStruct, Comment comment, String searchPosition) {
        String str;
        String str2;
        String imprId;
        o.LJIIIZ(comment, "comment");
        o.LJIIIZ(searchPosition, "searchPosition");
        C199737sf c199737sf = C1798474a.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LogPbBean logPb = comment.getLogPb();
        if (logPb != null) {
            str = logPb.getImprId();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        LIZ2.append(str);
        LIZ2.append(textExtraStruct.getSearchKeywordId());
        if (!c199737sf.containsKey((Object) X1D.LIZIZ(LIZ2))) {
            StringBuilder LIZ3 = X1D.LIZ();
            LogPbBean logPb2 = comment.getLogPb();
            if (logPb2 == null || (str2 = logPb2.getImprId()) == null) {
                str2 = "";
            }
            LIZ3.append(str2);
            LIZ3.append(textExtraStruct.getSearchKeywordId());
            c199737sf.put(X1D.LIZIZ(LIZ3), null);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("search_position", searchPosition);
            c188727au.LJIIIZ("words_position", String.valueOf(textExtraStruct.getWordPosition()));
            c188727au.LJIIIZ("words_source", "comment_highlighted_words");
            c188727au.LJIIIZ("words_content", textExtraStruct.getSearchKeyword());
            c188727au.LJIIIZ("comment_id", comment.getCid());
            c188727au.LJIIIZ("group_id", textExtraStruct.getSearchKeywordId());
            c188727au.LJIIIZ("enter_group_id", comment.getAwemeId());
            LogPbBean logPb3 = comment.getLogPb();
            if (logPb3 != null && (imprId = logPb3.getImprId()) != null) {
                str3 = imprId;
            }
            c188727au.LJIIIZ("impr_id", str3);
            FMX.LJIIL("trending_words_show", c188727au.LIZ);
        }
    }

    public static final void LIZ(Context context, Comment comment, HashSet<User> hashSet, String awemeId) {
        List<TextExtraStruct> textExtra;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(awemeId, "awemeId");
        if (comment == null || (textExtra = comment.getTextExtra()) == null || hashSet == null) {
            return;
        }
        String awemeId2 = comment.getAwemeId();
        if (awemeId2 != null) {
            awemeId = awemeId2;
        }
        for (TextExtraStruct textExtraStruct : textExtra) {
            Iterator<User> it = hashSet.iterator();
            while (it.hasNext()) {
                User next = it.next();
                if (TextUtils.equals(next.getUid(), textExtraStruct.getUserId())) {
                    int atType = next.getAtType();
                    if (atType != 1) {
                        if (atType != 3) {
                            if (atType == 4) {
                                FMX.LJIIIZ("comment_at", "recent", awemeId, next.getUid());
                            }
                        } else {
                            FMX.LJIIIZ("comment_at", "follow", awemeId, next.getUid());
                        }
                    } else {
                        FMX.LJIIIZ("comment_at", "search", awemeId, next.getUid());
                    }
                }
            }
        }
    }

    public static final void LIZIZ(String eventType, String str, String authorUid, String awemeId) {
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(authorUid, "authorUid");
        o.LJIIIZ(awemeId, "awemeId");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", eventType);
        c188727au.LJIIIZ("target", str);
        c188727au.LJIIIZ("author_id", authorUid);
        c188727au.LJIIIZ("group_id", awemeId);
        FMX.LJIIL("click_pin_comment_popup", c188727au.LIZ);
    }

    public static final void LJFF(java.util.Set<String> uidSet, List<User> list, String str, String str2) {
        o.LJIIIZ(uidSet, "uidSet");
        synchronized (uidSet) {
            if (list == null) {
                return;
            }
            int size = list.size();
            int size2 = uidSet.size();
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<User> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getUid());
            }
            uidSet.addAll(arrayList);
            int size3 = size - (uidSet.size() - size2);
            if (size3 > 0) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("video_type", str);
                c188727au.LJIIIZ("list_user_type", str2);
                c188727au.LIZLLL(size3, "duplicate_cnt");
                FMX.LJIIL("video_list_user_duplicate", c188727au.LIZ);
            }
        }
    }

    public static final void LJIIJ(int i, int i2, int i3, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, "c_number");
        c188727au.LIZLLL(i2, "u_number");
        c188727au.LIZLLL(i3, "video_reply_number");
        c188727au.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("comment_batch_management_block_ck", c188727au.LIZ);
    }

    public static final void LJIIJJI(int i, int i2, int i3, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, "c_number");
        c188727au.LIZLLL(i2, "u_number");
        c188727au.LIZLLL(i3, "video_reply_number");
        c188727au.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("comment_batch_management_block_confirm_ck", c188727au.LIZ);
    }

    public static final void LJIIL(int i, int i2, int i3, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, "c_number");
        c188727au.LIZLLL(i2, "u_number");
        c188727au.LIZLLL(i3, "video_reply_number");
        c188727au.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("comment_batch_management_delete_ck", c188727au.LIZ);
    }

    public static final void LJIILIIL(int i, int i2, int i3, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, "c_number");
        c188727au.LIZLLL(i2, "u_number");
        c188727au.LIZLLL(i3, "video_reply_number");
        c188727au.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("comment_batch_management_delete_confirm_ck", c188727au.LIZ);
    }

    public static final void LJIILL(int i, int i2, int i3, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, "c_number");
        c188727au.LIZLLL(i2, "u_number");
        c188727au.LIZLLL(i3, "video_reply_number");
        c188727au.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("comment_batch_management_report_ck", c188727au.LIZ);
    }

    public static final void LJIILLIIL(int i, int i2, int i3, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, "c_number");
        c188727au.LIZLLL(i2, "u_number");
        c188727au.LIZLLL(i3, "video_reply_number");
        c188727au.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("comment_batch_management_report_confirm_ck", c188727au.LIZ);
    }

    public static final void LJII(String str, Comment comment, EnumC57365MfJ actionType, String str2, Aweme aweme) {
        boolean z;
        String str3;
        o.LJIIIZ(comment, "comment");
        o.LJIIIZ(actionType, "actionType");
        if (comment.getCommentType() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (C175296uL.LIZ(comment, z)) {
            str3 = "comment_upvote";
        } else {
            str3 = "comment_panel";
        }
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJLIIIIJ = actionType;
        c57362MfG.LJJLI = EnumC57366MfK.RELATION_LABEL;
        c57362MfG.LJJJJI();
        c57362MfG.LJJIIZI(str);
        c57362MfG.LJJIJ(str2);
        c57362MfG.LJJJ(str3);
        c57362MfG.LJJJJIZL(comment.getUser());
        Object LJII = c220488l2.LJII(aweme, c57362MfG);
        C222578oP.LIZJ(LJII, aweme, null, null, 14);
        ((JHM) LJII).LJIILIIL();
    }

    public static final void LJIIIIZZ(boolean z, Comment comment, String str, String str2, String str3) {
        String str4;
        HH1.LIZ(str, "eventType", str2, "authorUid", str3, "awemeId");
        if (z) {
            str4 = "pin_comment";
        } else {
            str4 = "unpin_comment";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("comment_id", comment.getCid());
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("to_user_id", comment.getUser().getUid());
        c188727au.LJIIIZ("group_id", str3);
        FMX.LJIIL(str4, c188727au.LIZ);
    }

    public static final void LJIJ(long j, String str, String str2, String str3, String str4) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJ(j, "duration");
        c188727au.LJIIIZ("result", str4);
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("group_id", str);
        FMX.LJIIL("comment_latency", c188727au.LIZ);
    }

    public static final void LJJIIJZLJL(CharSequence emoji, String str, int i, Integer num, String str2) {
        o.LJIIIZ(emoji, "emoji");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("emoji_id", emoji.toString());
        c188727au.LJIIIZ("emoji_source", str);
        c188727au.LIZLLL(i, "emoji_num");
        c188727au.LJFF(num, "emoji_score");
        c188727au.LJIIIZ("emoji_strategy_type", str2);
        FMX.LJIIL("click_emoji", c188727au.LIZ);
    }

    public static final void LJJIJIIJIL(String str, String str2, int i, Comment comment, String str3) {
        o.LJIIIZ(comment, "comment");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", str);
        c188727au.LJIIIZ("position", "comment_panel");
        LJJIJ("translate_comment_show", comment, str2, str3, i, c188727au.LIZ);
    }

    public static final void LJJIJIL(Comment comment, String str, String str2, int i, Aweme aweme) {
        String str3;
        o.LJIIIZ(comment, "comment");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("position", "comment_panel");
        c188727au.LJIIIZ("enter_method", str);
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        LJJIJ("see_original_comment", comment, str2, str3, i, c188727au.LIZ);
    }

    public static final void LJJIJL(Comment comment, String str, String str2, int i, Aweme aweme) {
        o.LJIIIZ(comment, "comment");
        o.LJIIIZ(aweme, "aweme");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("position", "comment_panel");
        c188727au.LJIIIZ("enter_method", str);
        int i2 = 1;
        if (comment.getCommentType() != 1) {
            i2 = 2;
        }
        c188727au.LIZLLL(i2, "comment_level");
        c188727au.LJIIIZ("target_lang", C178406zM.LJFF());
        c188727au.LIZLLL(V16.LJJIZ(comment) ? 1 : 0, "is_recommendation");
        LJJIJ("translate_comment", comment, str2, aweme.getAuthorUid(), i, c188727au.LIZ);
    }

    public static final void LIZJ(String str, Comment comment, Aweme aweme, int i, boolean z, boolean z2) {
        String str2;
        String cid;
        String str3;
        String str4;
        if (comment == null || aweme == null) {
            return;
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        User user = comment.getUser();
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        boolean LJ = o.LJ(curUserId, str2);
        boolean LJ2 = o.LJ(((RBX) HG3.LJIILL()).getCurUserId(), aweme.getAuthorUid());
        if (comment.getCommentType() == 2) {
            cid = comment.getReplyId();
        } else {
            cid = comment.getCid();
        }
        if (!TextUtils.isEmpty(comment.getReplyToReplyCommentId()) && !TextUtils.equals(comment.getReplyToReplyCommentId(), CardStruct.IStatusCode.DEFAULT)) {
            str3 = "reply_to_reply";
        } else if (!TextUtils.isEmpty(comment.getReplyId()) && !TextUtils.equals(comment.getReplyId(), CardStruct.IStatusCode.DEFAULT)) {
            str3 = "reply";
        } else {
            str3 = "original";
        }
        if (z) {
            str4 = "long-press pop-up";
        } else {
            str4 = "comment panel";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("comment_id", comment.getCid());
        c188727au.LJIIIZ("comment_user_id", comment.getUser().getUid());
        c188727au.LJIIIZ("group_id", comment.getAwemeId());
        c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
        c188727au.LIZLLL(LJ ? 1 : 0, "is_self");
        c188727au.LIZLLL(LJ2 ? 1 : 0, "is_author");
        c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("parent_id", cid);
        c188727au.LJIIIZ("comment_category", str3);
        c188727au.LJIIIZ("relation_tag", C227768wm.LJIJ(comment.getUser()));
        c188727au.LIZLLL(i, "rank");
        c188727au.LJIIIZ("enter_from", str4);
        c188727au.LIZLLL(z2 ? 1 : 0, "is_recommendation");
        c188727au.LIZLLL(aweme.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static final void LJJIFFI(int i, String str, String str2, String str3, String str4, String str5) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", str);
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("group_id", str3);
        c188727au.LJIIIZ("author_id", str4);
        c188727au.LIZLLL(i, "is_others_video");
        if (str5 != null) {
            c188727au.LJI("location", str5);
        }
        FMX.LJIIL("reply_via_video_show", c188727au.LIZ);
    }

    public static final void LJJIJ(String str, Comment comment, String str2, String str3, int i, java.util.Map<String, String> map) {
        String str4;
        int i2;
        o.LJIIIZ(comment, "comment");
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null) {
            str4 = ((RBX) LJIILL).getCurUserId();
        } else {
            str4 = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("author_id", str3);
        c188727au.LJIIIZ("enter_from", str2);
        String cid = comment.getCid();
        String str5 = "";
        if (cid == null) {
            cid = "";
        }
        c188727au.LJIIIZ("comment_id", cid);
        c188727au.LJIIIZ("user_id", str4);
        int i3 = 0;
        if (comment.getCommentType() == 1) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        c188727au.LIZLLL(i2, "comment_level");
        c188727au.LIZLLL(i, "position_rank");
        c188727au.LJIIIZ("comment_source_lang", comment.getCommentLanguage());
        c188727au.LJIIIZ("target_lang", C178406zM.LJFF());
        if (comment.isAuthorDigged()) {
            i3 = 1;
        }
        c188727au.LIZLLL(i3, "is_liked_by_author");
        String awemeId = comment.getAwemeId();
        if (awemeId != null) {
            str5 = awemeId;
        }
        c188727au.LJIIIZ("group_id", str5);
        if (map != null) {
            c188727au.LJIIIIZZ(map);
        }
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LJI(String str, String str2, String str3, String actionType, String toStatus, String storyType, String popUpType, String authResult, java.util.Map extra, int i) {
        if ((i & 8) != 0) {
            actionType = "";
        }
        if ((i & 16) != 0) {
            toStatus = "";
        }
        if ((i & 32) != 0) {
            storyType = "";
        }
        if ((i & 64) != 0) {
            popUpType = "";
        }
        if ((i & 128) != 0) {
            authResult = "";
        }
        if ((i & 256) != 0) {
            extra = new LinkedHashMap();
        }
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(toStatus, "toStatus");
        o.LJIIIZ(storyType, "storyType");
        o.LJIIIZ(popUpType, "popUpType");
        o.LJIIIZ(authResult, "authResult");
        o.LJIIIZ(extra, "extra");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("enter_method", str3);
        c188727au.LJIIIZ("action_type", actionType);
        c188727au.LJIIIZ("to_status", toStatus);
        c188727au.LJIIIZ("story_type", storyType);
        c188727au.LJIIIZ("pop_up_type", popUpType);
        c188727au.LJIIIZ("auth_result", authResult);
        java.util.Map<String, String> map = c188727au.LIZ;
        for (Map.Entry entry : extra.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            o.LJIIIIZZ(map, "this");
            ((HashMap) map).put(key, value);
        }
        FMX.LJIIL(str, map);
    }

    public static /* synthetic */ void LJJI(Aweme aweme, CharSequence charSequence, String str, String str2, String str3, Comment comment, String str4, String str5, String str6, int i, String str7, C177156xL c177156xL, int i2) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        int i3 = i;
        String str22 = str6;
        String str23 = str7;
        if ((i2 & 1024) != 0) {
            str22 = "";
        }
        String str24 = null;
        if ((i2 & 2048) != 0) {
            str8 = "";
        } else {
            str8 = null;
        }
        if ((i2 & 4096) != 0) {
            str9 = "";
        } else {
            str9 = null;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            str10 = "";
        } else {
            str10 = null;
        }
        if ((65536 & i2) != 0) {
            str11 = "";
        } else {
            str11 = null;
        }
        if ((131072 & i2) != 0) {
            str12 = "";
        } else {
            str12 = null;
        }
        if ((262144 & i2) != 0) {
            str13 = "";
        } else {
            str13 = null;
        }
        if ((524288 & i2) != 0) {
            str14 = "";
        } else {
            str14 = null;
        }
        if ((1048576 & i2) != 0) {
            str15 = "";
        } else {
            str15 = null;
        }
        if ((2097152 & i2) != 0) {
            str16 = "";
        } else {
            str16 = null;
        }
        if ((8388608 & i2) != 0) {
            str17 = "";
        } else {
            str17 = null;
        }
        if ((33554432 & i2) != 0) {
            str18 = "";
        } else {
            str18 = null;
        }
        if ((67108864 & i2) != 0) {
            str19 = "";
        } else {
            str19 = null;
        }
        if ((134217728 & i2) != 0) {
            i3 = 1;
        }
        if ((268435456 & i2) != 0) {
            str23 = "";
        }
        if ((536870912 & i2) != 0) {
            str20 = "";
        } else {
            str20 = null;
        }
        if ((1073741824 & i2) != 0) {
            str21 = "";
        } else {
            str21 = null;
        }
        if ((i2 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            str24 = "";
        }
        LJJ(aweme, charSequence, str, str2, str3, comment, str4, str5, 0, str22, str8, str9, str10, false, false, str11, str12, str13, str14, str15, str16, false, str17, 0, str18, str19, i3, str23, str20, str21, str24, "", "", "", "", "", "", "", null, c177156xL, null, "", 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJ(final com.ss.android.ugc.aweme.feed.model.Aweme r23, java.lang.CharSequence r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, com.ss.android.ugc.aweme.comment.model.Comment r28, java.lang.String r29, java.lang.String r30, int r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, boolean r36, boolean r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, boolean r44, java.lang.String r45, int r46, java.lang.String r47, java.lang.String r48, int r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, X.C177156xL r62, java.lang.String r63, java.lang.String r64, int r65, java.util.HashMap r66) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74Z.LJJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.comment.model.Comment, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.6xL, java.lang.String, java.lang.String, int, java.util.HashMap):void");
    }
}
