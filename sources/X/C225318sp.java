package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225318sp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Activity activity) {
        Intent intent;
        String LLJJIJIIJIL;
        JSONObject jSONObject;
        if (activity != null && (intent = activity.getIntent()) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extra_params")) != null) {
            try {
                jSONObject = new JSONObject(LLJJIJIIJIL);
            } catch (JSONException unused) {
            }
            if (jSONObject.isNull("follow_recommend_params")) {
                return;
            }
            jSONObject.remove("follow_recommend_params");
            intent.putExtra("extra_params", jSONObject.toString());
            activity.setIntent(intent);
        }
    }

    public static JSONObject LJI(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("label", UriProtector.getQueryParameter(uri, "label"));
            jSONObject.put("gd_label", UriProtector.getQueryParameter(uri, "gd_label"));
            jSONObject.put("enter_from", UriProtector.getQueryParameter(uri, "enter_from"));
            jSONObject.put("scene_type", UriProtector.getQueryParameter(uri, "scene_type"));
            jSONObject.put("to_user_id", UriProtector.getQueryParameter(uri, "to_user_id"));
            jSONObject.put("rec_type", UriProtector.getQueryParameter(uri, "rec_type"));
            jSONObject.put("relation_type", UriProtector.getQueryParameter(uri, "relation_type"));
            jSONObject.put("follow_type", UriProtector.getQueryParameter(uri, "follow_type"));
            jSONObject.put("social_info_friend_type_str", UriProtector.getQueryParameter(uri, "social_info_friend_type_str"));
            jSONObject.put("social_info_rec_type", UriProtector.getQueryParameter(uri, "social_info_rec_type"));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void LIZLLL(User user, String str, String actionType) {
        o.LJIIIZ(actionType, "actionType");
        if (user != null && o.LJ(str, "guide_dm")) {
            C57362MfG c57362MfG = new C57362MfG();
            c57362MfG.LJJIIZI("notification_page");
            c57362MfG.LJJIJ("guide_dm");
            c57362MfG.LJJLI = EnumC57366MfK.CARD;
            c57362MfG.LJJJJI();
            c57362MfG.LJJLIIIIJ = C57362MfG.LJJIJIIJIL(actionType);
            c57362MfG.LJJJJIZL(user);
            c57362MfG.LJJJJ(user.getRequestId());
            c57362MfG.LJJJ("inbox_first_page");
            c57362MfG.LJIILIIL();
        }
    }

    public static void LIZIZ(Aweme aweme, Context context, String str, EnumC2049482o enterMethod) {
        M89 m89;
        User user;
        User author;
        User user2;
        User author2;
        o.LJIIIZ(enterMethod, "enterMethod");
        String str2 = null;
        if (context != null) {
            m89 = C2S6.LIZ(context);
            if (m89 != null && m89.isCard()) {
                C220488l2 c220488l2 = C220488l2.LIZIZ;
                C57362MfG c57362MfG = new C57362MfG();
                String followRecommendTrackEnterFrom = m89.getFollowRecommendTrackEnterFrom();
                if (followRecommendTrackEnterFrom == null) {
                    followRecommendTrackEnterFrom = m89.getEventType();
                }
                c57362MfG.LJJIIZI(followRecommendTrackEnterFrom);
                c57362MfG.LJJLI = EnumC57366MfK.CARD;
                c57362MfG.LJJJJI();
                c57362MfG.LJJLIIIIJ = EnumC57365MfJ.ENTER_PROFILE;
                c57362MfG.LJJIJIIJI(enterMethod);
                c57362MfG.LJJIIZ(aweme);
                if (aweme != null) {
                    user2 = aweme.getAuthor();
                } else {
                    user2 = null;
                }
                c57362MfG.LJJJJIZL(user2);
                if (aweme != null && (author2 = aweme.getAuthor()) != null) {
                    str2 = author2.getRequestId();
                }
                c57362MfG.LJJJJ(str2);
                c57362MfG.LJJIJLIJ(m89.getMatchedFriendStructTrack());
                c57362MfG.LJLI = m89.isBigCard();
                ((JHM) c220488l2.LJII(aweme, c57362MfG)).LJIILIIL();
                return;
            }
        } else {
            m89 = null;
        }
        C220488l2 c220488l22 = C220488l2.LIZIZ;
        C57362MfG c57362MfG2 = new C57362MfG();
        if (str == null) {
            if (m89 != null) {
                str = m89.getEventType();
            } else {
                str = null;
            }
        }
        c57362MfG2.LJJIIZI(str);
        c57362MfG2.LJJLI = EnumC57366MfK.ITEM;
        c57362MfG2.LJJJJI();
        c57362MfG2.LJJLIIIIJ = EnumC57365MfJ.ENTER_PROFILE;
        c57362MfG2.LJJIJIIJI(enterMethod);
        c57362MfG2.LJJIIZ(aweme);
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        c57362MfG2.LJJJJIZL(user);
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            str2 = author.getRequestId();
        }
        c57362MfG2.LJJJJ(str2);
        c57362MfG2.LJLJI = C79004UzY.LJJJIL(context, aweme);
        ((C57362MfG) c220488l22.LJII(aweme, c57362MfG2)).LJJIZ();
    }

    public static void LIZJ(Activity activity, String actionType, LSC page, Aweme aweme) {
        Intent intent;
        String LLJJIJIIJIL;
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(page, "page");
        if (activity != null && (intent = activity.getIntent()) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extra_params")) != null) {
            try {
                JSONObject jSONObject = new JSONObject(LLJJIJIIJIL);
                if (jSONObject.isNull("follow_recommend_params")) {
                    return;
                }
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "follow_recommend_params");
                C57362MfG c57362MfG = new C57362MfG();
                c57362MfG.LJJLIIIIJ = C57362MfG.LJJIJIIJIL(actionType);
                if (o.LJ(actionType, "show")) {
                    c57362MfG.LJJIJ("new_video");
                }
                if (page == LSC.FEED) {
                    c57362MfG.LJJIIZI(jSONObject2.optString("label"));
                } else {
                    c57362MfG.LJJIIZI(jSONObject2.optString("enter_from"));
                }
                String optString = jSONObject2.optString("follow_type");
                o.LJIIIIZZ(optString, "followParam.optString(NoticeMob.Key.FOLLOW_TYPE)");
                EnumC199997t5 enumC199997t5 = EnumC199997t5.SINGLE;
                if (!o.LJ(optString, enumC199997t5.getType())) {
                    enumC199997t5 = EnumC199997t5.MUTUAL;
                    if (!o.LJ(optString, enumC199997t5.getType())) {
                        enumC199997t5 = EnumC199997t5.NO_RELATION;
                        if (!o.LJ(optString, enumC199997t5.getType())) {
                            enumC199997t5 = null;
                        }
                    }
                }
                c57362MfG.LJJLIIIJ = enumC199997t5;
                c57362MfG.LJJLI = C57362MfG.LJJIJIL(jSONObject2.optString("scene_type"));
                c57362MfG.LJJJJI();
                String optString2 = jSONObject2.optString("to_user_id");
                String str = "";
                if (optString2 == null) {
                    optString2 = "";
                }
                c57362MfG.LJJLIIIJILLIZJL = optString2;
                c57362MfG.LJJJIL(jSONObject2.optString("rec_type"));
                String optString3 = jSONObject2.optString("relation_type");
                if (optString3 != null) {
                    str = optString3;
                }
                c57362MfG.LJJLIIIJLLLLLLLZ = str;
                c57362MfG.LJLJI = C79004UzY.LJJJIL(activity, aweme);
                c57362MfG.LIZLLL("previous_page", "prop_page");
                c57362MfG.LIZLLL("social_info_friend_type_str", jSONObject2.optString("social_info_friend_type_str"));
                c57362MfG.LIZLLL("social_info_rec_type", jSONObject2.optString("social_info_rec_type"));
                C220488l2.LIZIZ.LJII(aweme, c57362MfG);
                c57362MfG.LJIILIIL();
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r6.equals("search_result") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        r3.LJJIIZI(r6);
        r3.LJJJI(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r6.equals("general_search") == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(com.ss.android.ugc.aweme.profile.model.User r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            r3 = 0
            if (r4 == 0) goto L2c
            java.lang.String r0 = r4.getRecType()
        L7:
            if (r0 == 0) goto Lf
            int r0 = r0.length()
            if (r0 != 0) goto L2e
        Lf:
            if (r4 == 0) goto L23
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r4.getMatchedFriendStruct()
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.getRecType()
            if (r0 == 0) goto L23
            int r0 = r0.length()
            if (r0 != 0) goto L2e
        L23:
            if (r8 == 0) goto L2b
            int r0 = r8.length()
            if (r0 != 0) goto L2e
        L2b:
            return
        L2c:
            r0 = r3
            goto L7
        L2e:
            if (r7 == 0) goto L36
            int r0 = r7.length()
            if (r0 != 0) goto L37
        L36:
            return
        L37:
            X.MfG r2 = new X.MfG
            r2.<init>()
            X.8l2 r1 = X.C220488l2.LIZIZ
            r2.LJJJIL(r8)
            r2.LJJJJIZL(r4)
            X.MfK r0 = X.EnumC57366MfK.RELATION_LABEL
            r2.LJJLI = r0
            r2.LJJJJI()
            if (r5 == 0) goto L51
            X.MfJ r3 = X.C57362MfG.LJJIJIIJIL(r5)
        L51:
            r2.LJJLIIIIJ = r3
            java.lang.Object r3 = r1.LJII(r10, r2)
            X.MfG r3 = (X.C57362MfG) r3
            if (r6 == 0) goto L70
            int r2 = r6.hashCode()
            r0 = 998835423(0x3b8904df, float:0.004181489)
            if (r2 == r0) goto L94
            r0 = 1425879700(0x54fd3294, float:8.6998023E12)
            java.lang.String r1 = "search_result"
            if (r2 == r0) goto L8d
            r0 = 1839865103(0x6daa1d0f, float:6.5809477E27)
            if (r2 == r0) goto L7d
        L70:
            boolean r0 = X.C78685UuP.LJJJZ(r9)
            if (r0 == 0) goto L79
            r3.LJJIJ(r9)
        L79:
            r3.LJIILIIL()
            return
        L7d:
            java.lang.String r0 = "find_friends"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L86
            goto L70
        L86:
            r3.LJJIIZI(r1)
            r3.LJJJI(r7)
            goto L70
        L8d:
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L9d
            goto L70
        L94:
            java.lang.String r0 = "general_search"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L9d
            goto L70
        L9d:
            r3.LJJIIZI(r6)
            r3.LJJJI(r7)
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C225318sp.LJ(com.ss.android.ugc.aweme.profile.model.User, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
