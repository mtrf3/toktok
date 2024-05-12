package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.7HL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7HL {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r11, com.ss.android.ugc.aweme.feed.model.Aweme r12, java.lang.String r13) {
        /*
            r5 = 0
            if (r12 != 0) goto L7f
            r0 = r5
        L4:
            r9 = -1
        L6:
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = X.C1FP.LJIIIIZZ(r0)
            r8 = 0
            r7 = 1
            r6 = 2
            if (r0 == 0) goto L7d
            r1 = 1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7b
            r4 = 2
        L16:
            r0 = 6
            X.OSZ[] r3 = new X.OSZ[r0]
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "action_type"
            r1.<init>(r11, r0)
            r3[r8] = r1
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "enter_from"
            r1.<init>(r13, r0)
            r3[r7] = r1
            if (r12 == 0) goto L31
            java.lang.String r5 = r12.getAid()
        L31:
            java.lang.String r2 = ""
            if (r5 != 0) goto L36
            r5 = r2
        L36:
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "group_id"
            r1.<init>(r5, r0)
            r3[r6] = r1
            if (r12 == 0) goto L4d
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.getAuthor()
            if (r0 == 0) goto L4d
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L79
        L4d:
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "author_id"
            r1.<init>(r2, r0)
            r0 = 3
            r3[r0] = r1
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "repost_num"
            r1.<init>(r2, r0)
            r0 = 4
            r3[r0] = r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "is_self"
            r1.<init>(r2, r0)
            r0 = 5
            r3[r0] = r1
            java.lang.String r0 = "recommend_avatar"
            X.FMX.LJIILL(r0, r3)
            return
        L79:
            r2 = r0
            goto L4d
        L7b:
            r4 = 1
            goto L16
        L7d:
            r4 = 0
            goto L16
        L7f:
            java.lang.String r1 = r12.getAid()
            java.lang.String r0 = "aweme.aid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r0 = X.C7H2.LIZ(r1)
            if (r0 == 0) goto L4
            long r9 = r0.getTotal()
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7HL.LIZIZ(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    public static void LIZ(String str, String str2, String str3, Aweme aweme) {
        String str4;
        User author;
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ(str, "action_type");
        oszArr[1] = new OSZ(str2, "enter_from");
        String str5 = null;
        if (aweme != null) {
            str5 = aweme.getAid();
        }
        if (str5 == null) {
            str5 = "";
        }
        oszArr[2] = new OSZ(str5, "group_id");
        if (aweme == null || (author = aweme.getAuthor()) == null || (str4 = author.getUid()) == null) {
            str4 = "";
        }
        oszArr[3] = new OSZ(str4, "author_id");
        if (str3 == null) {
            str3 = "";
        }
        oszArr[4] = new OSZ(str3, "click_method");
        FMX.LJIILL("recommend_add_comment", oszArr);
    }

    public static void LIZJ(String str, String str2, Aweme aweme, UpvoteStruct upvoteStruct) {
        String str3;
        String str4;
        User author;
        String uid;
        o.LJIIIZ(upvoteStruct, "upvoteStruct");
        User user = upvoteStruct.getUser();
        String str5 = null;
        if (user != null) {
            str3 = user.getUid();
        } else {
            str3 = null;
        }
        boolean LJ = o.LJ(str3, ((RBX) HG3.LJIILL()).getCurUserId());
        User user2 = upvoteStruct.getUser();
        if (user2 != null) {
            str5 = user2.getUid();
        }
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        OSZ[] oszArr = new OSZ[6];
        oszArr[0] = new OSZ(str, "action_type");
        oszArr[1] = new OSZ(str2, "enter_from");
        if (aweme == null || (str4 = aweme.getAid()) == null) {
            str4 = "";
        }
        oszArr[2] = new OSZ(str4, "group_id");
        if (aweme != null && (author = aweme.getAuthor()) != null && (uid = author.getUid()) != null) {
            str6 = uid;
        }
        oszArr[3] = new OSZ(str6, "author_id");
        oszArr[4] = new OSZ(Integer.valueOf(LJ ? 1 : 0), "is_self");
        oszArr[5] = new OSZ(str5, "repost_user_id");
        FMX.LJIILL("recommend_comment", oszArr);
    }

    public static void LIZLLL(String enter_from, String trigger, Aweme aweme, String str, String str2, boolean z) {
        User author;
        String uid;
        o.LJIIIZ(enter_from, "enter_from");
        o.LJIIIZ(trigger, "trigger");
        OSZ[] oszArr = new OSZ[7];
        oszArr[0] = new OSZ(enter_from, "enter_from");
        oszArr[1] = new OSZ(trigger, "trigger");
        String str3 = null;
        if (aweme != null) {
            str3 = aweme.getAid();
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        oszArr[2] = new OSZ(str3, "group_id");
        if (aweme != null && (author = aweme.getAuthor()) != null && (uid = author.getUid()) != null) {
            str4 = uid;
        }
        oszArr[3] = new OSZ(str4, "author_id");
        oszArr[4] = new OSZ(str, "position");
        oszArr[5] = new OSZ(str2, "trace_id");
        oszArr[6] = new OSZ(Integer.valueOf(z ? 1 : 0), "clientAI");
        FMX.LJIILL("recommend_entrance_show", oszArr);
    }
}
