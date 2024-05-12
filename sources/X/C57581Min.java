package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Min, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57581Min {
    public static final java.util.Set<String> LIZ = C77275UUl.LJIIIIZZ("3-10", "3-11", "3-12", "3-13", "3-14");

    public static final String LIZ(User user) {
        String recType;
        o.LJIIIZ(user, "<this>");
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct == null || (recType = matchedFriendStruct.getRecType()) == null) {
            return user.getRecType();
        }
        return recType;
    }

    public static final String LIZJ(User user) {
        String recommendReason;
        o.LJIIIZ(user, "<this>");
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct == null || (recommendReason = matchedFriendStruct.getRecommendReason()) == null) {
            return user.getRecommendReason();
        }
        return recommendReason;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r0 != null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct r12, X.C26310AUg r13) {
        /*
            X.Mii r11 = X.C57576Mii.LIZ
            r7 = 0
            if (r12 == 0) goto Lb
            boolean r0 = r12.isValid()
            if (r0 != 0) goto Lc
        Lb:
            return r7
        Lc:
            java.lang.String r0 = r12.getCacheReason()
            r8 = 51
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L36
            java.lang.String r0 = r12.getHashedPhoneNumber()
            if (r0 == 0) goto L22
            int r0 = r0.length()
            if (r0 != 0) goto L23
        L22:
            r6 = 1
        L23:
            if (r6 != 0) goto L33
            X.MqI r0 = X.EnumC58046MqI.CONTACT
        L27:
            X.AUg r0 = X.C26310AUg.LJ(r13, r0, r5, r7, r8)
            r0.LIZLLL(r7)
            java.lang.String r7 = r12.getCacheReason()
            goto Lb
        L33:
            X.MqI r0 = X.EnumC58046MqI.FACEBOOK
            goto L27
        L36:
            java.lang.String r1 = r12.getHashedPhoneNumber()
            java.lang.String r0 = r12.getExternalUsername()
            if (r0 == 0) goto L63
            java.lang.String r10 = X.C27484AqW.LIZ(r0)
        L44:
            r0 = 2131843576(0x7f1159f8, float:1.932052E38)
            java.lang.String r4 = X.C86V.LJFF(r0)
            java.lang.String r3 = "format(this, *args)"
            java.lang.String r2 = "formatText"
            if (r1 == 0) goto La0
            int r0 = r1.length()
            if (r0 != 0) goto L61
            r0 = 1
        L58:
            if (r0 != 0) goto L5f
        L5a:
            if (r1 == 0) goto La0
            X.MqI r9 = X.EnumC58046MqI.CONTACT
            goto L65
        L5f:
            r1 = r7
            goto L5a
        L61:
            r0 = 0
            goto L58
        L63:
            r10 = r7
            goto L44
        L65:
            java.lang.String r1 = r11.LIZ(r1)     // Catch: java.lang.Throwable -> L83
            X.AUg r0 = X.C26310AUg.LJ(r13, r9, r5, r7, r8)     // Catch: java.lang.Throwable -> L83
            r0.LIZLLL(r7)     // Catch: java.lang.Throwable -> L83
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r2)     // Catch: java.lang.Throwable -> L83
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L83
            r0[r6] = r1     // Catch: java.lang.Throwable -> L83
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = X.C16880lQ.LLLZ(r4, r0)     // Catch: java.lang.Throwable -> L83
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)     // Catch: java.lang.Throwable -> L83
            goto L9e
        L83:
            r1 = move-exception
            boolean r0 = r1 instanceof X.C57578Mik
            if (r0 == 0) goto Lc6
            X.Mik r1 = (X.C57578Mik) r1
        L8a:
            if (r1 == 0) goto L92
            X.Mij r1 = r1.getReason()
            if (r1 != 0) goto L94
        L92:
            X.Mij r1 = X.EnumC57577Mij.UNKNOWN
        L94:
            r0 = 35
            X.AUg r0 = X.C26310AUg.LJ(r13, r9, r6, r1, r0)
            r0.LIZLLL(r7)
            r0 = r7
        L9e:
            if (r0 != 0) goto Lbe
        La0:
            if (r10 == 0) goto Lbf
            boolean r0 = ujb.o.LJJJJJL(r10)
            if (r0 != 0) goto Lc4
        La8:
            if (r10 == 0) goto Lbf
            X.MqI r0 = X.EnumC58046MqI.FACEBOOK
            X.AUg r0 = X.C26310AUg.LJ(r13, r0, r5, r7, r8)
            r0.LIZLLL(r7)
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r2)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r6] = r10
            java.lang.String r0 = X.Q8U.LIZIZ(r0, r5, r4, r3)
        Lbe:
            r7 = r0
        Lbf:
            r12.setCacheReason(r7)
            goto Lb
        Lc4:
            r10 = r7
            goto La8
        Lc6:
            r1 = r7
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57581Min.LIZIZ(com.ss.android.ugc.aweme.profile.model.ExternalRecommendReasonStruct, X.AUg):java.lang.String");
    }

    public static final boolean LIZLLL(RecUser recUser, C57867MnP c57867MnP) {
        o.LJIIIZ(recUser, "<this>");
        if (!C53211KuV.LIZ(recUser) || c57867MnP == null || c57867MnP.LIZ != 401) {
            return false;
        }
        return true;
    }

    public static void LJ(User user, Context context, String enterFrom, String str, String str2, String str3, EnumC57366MfK enumC57366MfK, boolean z, Integer num, String str4, String str5, String str6, boolean z2, Boolean bool, String str7, boolean z3, int i) {
        boolean z4;
        RecUser recUser;
        RecUser recUser2;
        boolean z5 = z3;
        String str8 = str7;
        boolean z6 = z2;
        String str9 = str5;
        String str10 = str4;
        boolean z7 = z;
        String str11 = str;
        Boolean bool2 = bool;
        String enterMethod = str3;
        String previousPage = str2;
        EnumC57366MfK enumC57366MfK2 = enumC57366MfK;
        Integer num2 = num;
        String str12 = "";
        if ((i & 4) != 0) {
            str11 = "";
        }
        if ((i & 8) != 0) {
            previousPage = "";
        }
        if ((i & 16) != 0) {
            enterMethod = "";
        }
        AbstractC57378MfW abstractC57378MfW = null;
        if ((i & 32) != 0) {
            enumC57366MfK2 = null;
        }
        if ((i & 64) != 0) {
            z7 = false;
        }
        if ((i & 256) != 0) {
            num2 = null;
        }
        if ((i & 512) != 0) {
            str10 = null;
        }
        if ((i & 1024) != 0) {
            str9 = null;
        }
        if ((i & 2048) != 0) {
            str6 = "";
        }
        if ((i & 4096) != 0) {
            z6 = false;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            bool2 = Boolean.FALSE;
        }
        if ((i & 16384) != 0) {
            str8 = null;
        }
        if ((i & 32768) != 0) {
            z5 = false;
        }
        o.LJIIIZ(user, "<this>");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(enterMethod, "enterMethod");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        buildRoute.withParam("uid", user.getUid());
        buildRoute.withParam("sec_user_id", user.getSecUid());
        buildRoute.withParam("enter_from", enterFrom);
        buildRoute.withParam("enter_method", enterMethod);
        buildRoute.withParam("enter_from_request_id", user.getRequestId());
        buildRoute.withParam("extra_from_pre_page", previousPage);
        buildRoute.withParam("extra_previous_page_position", "card_head");
        buildRoute.withParam("need_track_compare_recommend_reason", 1);
        String recommendReason = user.getRecommendReason();
        if (recommendReason == null) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                recommendReason = matchedFriendStruct.getRecommendReason();
            } else {
                recommendReason = null;
            }
        }
        buildRoute.withParam("previous_recommend_reason", recommendReason);
        buildRoute.withParam("recommend_from_type", "card");
        if (enumC57366MfK2 == null) {
            enumC57366MfK2 = EnumC57366MfK.CARD;
        }
        String recType = user.getRecType();
        if (recType == null) {
            MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                recType = matchedFriendStruct2.getRecType();
            } else {
                recType = null;
            }
        }
        C57364MfI.Companion.getClass();
        EnumC199997t5 LIZ2 = C200007t6.LIZ(user);
        String uid = user.getUid();
        String requestId = user.getRequestId();
        String friendTypeStr = user.getFriendTypeStr();
        if (friendTypeStr == null) {
            MatchedFriendStruct matchedFriendStruct3 = user.getMatchedFriendStruct();
            if (matchedFriendStruct3 != null) {
                friendTypeStr = matchedFriendStruct3.getRelationType();
            } else {
                friendTypeStr = null;
            }
        }
        String socialInfo = user.getSocialInfo();
        if (socialInfo == null) {
            MatchedFriendStruct matchedFriendStruct4 = user.getMatchedFriendStruct();
            if (matchedFriendStruct4 != null) {
                socialInfo = matchedFriendStruct4.getSocialInfo();
            } else {
                socialInfo = null;
            }
        }
        MatchedFriendStruct matchedFriendStruct5 = user.getMatchedFriendStruct();
        boolean z8 = user instanceof RecUser;
        if (z8 && (recUser2 = (RecUser) user) != null) {
            abstractC57378MfW = recUser2.getFrom();
        }
        if (z8 && (recUser = (RecUser) user) != null) {
            z4 = recUser.isRelatedRec();
        } else {
            z4 = false;
        }
        buildRoute.withParam("recommend_enter_profile_params", new C57364MfI(enterFrom, previousPage, enumC57366MfK2, recType, LIZ2, uid, null, str10, requestId, str11, friendTypeStr, socialInfo, matchedFriendStruct5, null, num2, abstractC57378MfW, z4, enterMethod, str9, null, null, z6, str8, z5, 1572864, null));
        buildRoute.withParam("is_show_follow_btn_on_bottom", z7);
        if (str6 != null) {
            str12 = str6;
        }
        buildRoute.withParam("source_page", str12);
        buildRoute.withParam("is_new_suggested", bool2);
        buildRoute.open();
    }
}
