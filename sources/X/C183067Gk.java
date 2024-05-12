package X;

import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import kotlin.jvm.internal.o;

/* renamed from: X.7Gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183067Gk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String comment, UpvotePublishMobParam upvotePublishMobParam) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        o.LJIIIZ(comment, "comment");
        OSZ[] oszArr = new OSZ[9];
        String str9 = null;
        if (upvotePublishMobParam != null) {
            str2 = upvotePublishMobParam.enterFrom;
        } else {
            str2 = null;
        }
        oszArr[0] = new OSZ("enter_from", str2);
        if (upvotePublishMobParam != null) {
            str3 = upvotePublishMobParam.groupId;
        } else {
            str3 = null;
        }
        oszArr[1] = new OSZ("group_id", str3);
        if (upvotePublishMobParam != null) {
            str4 = upvotePublishMobParam.authorId;
        } else {
            str4 = null;
        }
        oszArr[2] = new OSZ("author_id", str4);
        if (upvotePublishMobParam != null) {
            str5 = upvotePublishMobParam.followStatus;
        } else {
            str5 = null;
        }
        oszArr[3] = new OSZ("follow_status", str5);
        oszArr[4] = new OSZ("recommendation_id", str);
        oszArr[5] = new OSZ("enter_method", "button");
        if (upvotePublishMobParam != null) {
            str6 = upvotePublishMobParam.isFirst;
        } else {
            str6 = null;
        }
        oszArr[6] = new OSZ("is_first", str6);
        if (upvotePublishMobParam != null) {
            str7 = upvotePublishMobParam.isRecommend;
        } else {
            str7 = null;
        }
        oszArr[7] = new OSZ("is_recommend", str7);
        if (upvotePublishMobParam != null) {
            str9 = upvotePublishMobParam.recommendCount;
        }
        oszArr[8] = new OSZ("recommend_cnt", str9);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        EF7.LIZIZ();
        int LIZIZ = C118824lS.LIZIZ(comment);
        if (LIZIZ != 0) {
            if (LIZIZ != 1) {
                str8 = "text_emoji";
            } else {
                str8 = "emoji";
            }
        } else {
            str8 = "text";
        }
        LJJLIIIIJ.put("message_type", str8);
        FMX.LJIIL("add_recommendation_finish_success", LJJLIIIIJ);
    }
}
