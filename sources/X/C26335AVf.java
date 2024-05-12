package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.EcommerceStoreBizLogServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.ShopTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ConcurrentModificationException;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.AVf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26335AVf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "click_hint");
        FMX.LJIIL("enter_profile_bio", c188727au.LIZ);
    }

    public static void LJJIJIIJI() {
        FMX.LJIIL("show_profile_bio_hint", new C188727au().LIZ);
    }

    public static String LIZIZ(User user) {
        o.LJIIIZ(user, "user");
        if (AV1.LJIJ(user)) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r2 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
    
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
    
        if (r2 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r7) {
        /*
            boolean r0 = X.C78983UzD.LJJJJ(r7)
            if (r0 == 0) goto L9a
            boolean r1 = X.C54305LSz.LIZJ()
            r6 = 0
            java.lang.String r0 = "tab_name"
            java.lang.String r4 = "enter_personal_homepage"
            java.lang.String r5 = ""
            if (r1 != 0) goto L61
            X.7au r3 = new X.7au
            r3.<init>()
            r3.LJIIIZ(r0, r7)
            int r1 = X.C54362LVe.LJFF()
            java.lang.String r0 = "notification_cnt"
            r3.LIZLLL(r1, r0)
            long r1 = X.AVO.LIZ()
            java.lang.String r0 = "dm_notification_cnt"
            r3.LJ(r1, r0)
            X.Yp3 r2 = X.C88545Yp3.LIZIZ
            if (r2 == 0) goto L37
            java.lang.String r1 = r2.LJ()
            if (r1 != 0) goto L3a
        L37:
            r1 = r5
            if (r2 == 0) goto L3e
        L3a:
            boolean r6 = r2.isConnected()
        L3e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r3.LJFF(r0, r1)
            if (r2 == 0) goto L4d
            java.lang.String r1 = r2.LIZIZ()
            if (r1 != 0) goto L50
        L4d:
            r1 = r5
            if (r2 == 0) goto L56
        L50:
            java.lang.String r0 = r2.LJIILJJIL()
            if (r0 != 0) goto L5f
        L56:
            r3.LJIIIZ(r1, r5)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.LIZ
            X.FMX.LJIIL(r4, r0)
            return
        L5f:
            r5 = r0
            goto L56
        L61:
            X.7au r3 = new X.7au
            r3.<init>()
            r3.LJIIIZ(r0, r7)
            X.Yp3 r2 = X.C88545Yp3.LIZIZ
            if (r2 == 0) goto L73
            java.lang.String r1 = r2.LJ()
            if (r1 != 0) goto L76
        L73:
            r1 = r5
            if (r2 == 0) goto L7a
        L76:
            boolean r6 = r2.isConnected()
        L7a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r3.LJFF(r0, r1)
            if (r2 == 0) goto L89
            java.lang.String r1 = r2.LIZIZ()
            if (r1 != 0) goto L8c
        L89:
            r1 = r5
            if (r2 == 0) goto L92
        L8c:
            java.lang.String r0 = r2.LJIILJJIL()
            if (r0 != 0) goto L9b
        L92:
            r3.LJIIIZ(r1, r5)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.LIZ
            X.FMX.LJIIL(r4, r0)
        L9a:
            return
        L9b:
            r5 = r0
            goto L92
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26335AVf.LIZJ(java.lang.String):void");
    }

    public static void LJFF(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("action_type", str);
        FMX.LJIIL("click_live_event_icon", c188727au.LIZ);
    }

    public static void LJIJI(int i) {
        C188727au LIZJ = C78920UyC.LIZJ(i, "status");
        LIZJ.LJIIIZ("enter_from", "others_homepage");
        FMX.LJIIL("show_follow_card_entrance", LIZJ.LIZ);
    }

    public static void LJJIIJZLJL(String str) {
        C188727au LIZLLL = KNV.LIZLLL(str, "cert");
        LIZLLL.LJIIIZ("cert", str);
        FMX.LJIIL("profile_permission_failuer", LIZLLL.LIZ);
    }

    public static void LIZ(User user, String str) {
        String bioEmail;
        if (user != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", LIZIZ(user));
            c188727au.LJIIIZ("link_type", str);
            c188727au.LJIIIZ("author_id", user.getUid());
            if (o.LJ(str, "weblink")) {
                bioEmail = user.getBioUrl();
            } else {
                bioEmail = user.getBioEmail();
            }
            c188727au.LJIIIZ("link", bioEmail);
            FMX.LJIIL("click_link", c188727au.LIZ);
        }
    }

    public static void LJI(C26336AVg c26336AVg, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(c26336AVg.LIZ, "draft_cnt");
        c188727au.LJIIIZ("method", str);
        FMX.LJIIL("draft_entrance_show", c188727au.LIZ);
    }

    public static void LJIIJ(String str, boolean z) {
        String str2;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("has_label", str2);
        c188727au.LJIIIZ("enter_from", "others_homepage");
        FMX.LJIIL("follow_refuse", c188727au.LIZ);
    }

    public static void LJIILIIL(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        c188727au.LJIIIZ("previous_page", str);
        c188727au.LJIIIZ("group_id", str2);
        FMX.LJIIL("just_watched_tag_click", c188727au.LIZ);
    }

    public static void LJIILJJIL(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        c188727au.LJIIIZ("previous_page", str);
        c188727au.LJIIIZ("group_id", str2);
        FMX.LJIIL("just_watched_tag_show", c188727au.LIZ);
    }

    public static void LJIJ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        c188727au.LJIIIZ("type", str2);
        c188727au.LJIIIZ("to_user_id", str);
        FMX.LJIIL("profile_set_user_data", c188727au.LIZ);
    }

    public static void LJIJJ(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", str2);
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("show_follow_request_pop_up", c188727au.LIZ);
    }

    public static void LJIJJLI(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", str);
        c188727au.LJIIIZ("enter_from", str2);
        FMX.LJIIL("spread_follow_card", c188727au.LIZ);
    }

    public static void LJIL(String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str, "from");
        LIZLLL.LJIIIZ("enter_from", str);
        if (str2 != null) {
            LIZLLL.LJI("new_fans_count", str2);
        }
        FMX.LJIIL("click_fans_count", LIZLLL.LIZ);
    }

    public static void LJJIFFI(int i, Context context) {
        if (context instanceof InterfaceC55058LjC) {
            FMX.LJIIL("tiktokec_list_entrance_show", C113554cx.LJJLIIIIJ(new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("page_name", "personal_homepage"), new OSZ("enter_from", "personal_homepage"), new OSZ("list_name", "favorite"), new OSZ("list_num", String.valueOf(i + 1)), new OSZ("previous_page", "personal_homepage")));
        }
    }

    public static void LJIIIIZZ(int i, String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str2, "enterMethod");
        LIZLLL.LJIIIZ("enter_method", str2);
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LIZLLL(i, "is_exit");
        FMX.LJIIL("fold_follow_card", LIZLLL.LIZ);
    }

    public static void LJIIIZ(String str, String str2, boolean z) {
        String str3;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", str);
        c188727au.LJIIIZ("enter_from", "others_homepage");
        c188727au.LJIIIZ("follow_type", str2);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("has_label", str3);
        FMX.LJIIL("follow_approve", c188727au.LIZ);
    }

    public static void LJIIJJI(int i, String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", str2);
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LIZLLL(i, "action_type");
        FMX.LJIIL("follow_request_pop_up_response", c188727au.LIZ);
    }

    public static void LJIILL(int i, String str, String str2) {
        C188727au LIZJ = C78920UyC.LIZJ(i, "status");
        LIZJ.LJIIIZ("avatar_type", str);
        if (str2 != null) {
            LIZJ.LJI("error_code", str2);
        }
        FMX.LJIIL("profile_avatar_upload_result", LIZJ.LIZ);
    }

    public static void LJIILLIIL(int i, int i2, String str) {
        String str2;
        if (i == 1 && C26197APx.LIZIZ() == 16 && i2 > 1) {
            str2 = "two_avatars";
        } else {
            str2 = "normal";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LIZLLL(i, "profile_visitor_status");
        c188727au.LIZLLL(i2, "viewers_cnt");
        c188727au.LJIIIZ("action_type", str);
        c188727au.LJIIIZ("entrance_type", str2);
        FMX.LJIIL("profile_viewers_fix_entrance", c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r3 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIJ(com.ss.android.ugc.aweme.profile.model.User r5, java.lang.String r6, java.lang.String r7) {
        /*
            if (r5 != 0) goto La
            java.lang.String r1 = "Profile.ProfileStatics"
            java.lang.String r0 = "user is null"
            X.C221018lt.LJFF(r1, r0)
            return
        La:
            X.7au r4 = new X.7au
            r4.<init>()
            X.HG3.LJIIL()
            com.ss.android.ugc.aweme.IAccountService r0 = X.HG3.LJLJL
            X.RBY r0 = r0.LJFF()
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "user_id"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = r5.getAccurateRecType()
            java.lang.String r0 = "rec_type"
            r4.LJIIIZ(r0, r1)
            java.lang.String r0 = "enter_from"
            r4.LJIIIZ(r0, r6)
            java.lang.String r0 = "enter_method"
            r4.LJIIIZ(r0, r7)
            java.lang.String r1 = r5.getUid()
            java.lang.String r0 = "to_user_id"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = "relation_tag"
            int r0 = r5.getFollowStatus()
            r4.LIZLLL(r0, r1)
            java.lang.String r1 = X.C227768wm.LJIL(r5)
            java.lang.String r0 = "to_user_type"
            r4.LJIIIZ(r0, r1)
            X.Yp3 r3 = X.C88545Yp3.LIZIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L5b
            java.lang.String r1 = r3.LJ()
            if (r1 != 0) goto L5e
        L5b:
            r1 = r2
            if (r3 == 0) goto L8c
        L5e:
            boolean r0 = r3.isConnected()
        L62:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LJFF(r0, r1)
            if (r3 == 0) goto L71
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L74
        L71:
            r1 = r2
            if (r3 == 0) goto L7a
        L74:
            java.lang.String r0 = r3.LJIILJJIL()
            if (r0 != 0) goto L8a
        L7a:
            r4.LJIIIZ(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "enter_personal_detail_backup_v2"
            X.FMX.LJIIL(r0, r1)
            java.lang.String r0 = "enter_profile"
            X.C225318sp.LIZLLL(r5, r7, r0)
            return
        L8a:
            r2 = r0
            goto L7a
        L8c:
            r0 = 0
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26335AVf.LJJIIJ(com.ss.android.ugc.aweme.profile.model.User, java.lang.String, java.lang.String):void");
    }

    public static void LJJIJ(User user, String str, String str2) {
        String bioEmail;
        if (user != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("link_type", str2);
            if (o.LJ(str2, "weblink")) {
                bioEmail = user.getBioUrl();
            } else {
                bioEmail = user.getBioEmail();
            }
            c188727au.LJIIIZ("link", bioEmail);
            c188727au.LJIIIZ("scene_id", "1008");
            c188727au.LJIIIZ("author_id", user.getUid());
            FMX.LJIIL("show_link", c188727au.LIZ);
        }
    }

    public static void LJII(String str, String str2, String str3, String str4) {
        C188727au LIZLLL = KNV.LIZLLL(str, "from");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("enter_method", str2);
        LIZLLL.LJIIIZ("to_user_id", str3);
        if (str4 != null) {
            LIZLLL.LJI("new_fans_count", str4);
        }
        FMX.LJIIL("enter_relation_tab", LIZLLL.LIZ);
    }

    public static void LJIIL(String enterFrom, String uid, String awemeId, String scene) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(scene, "scene");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("to_user_id", uid);
        c188727au.LJIIIZ("group_id", awemeId);
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, scene);
        FMX.LJIIL("profile_info_click", c188727au.LIZ);
    }

    public static void LJJ(String str, String str2, String str3, String str4) {
        FMX.LJIIL(str, C113554cx.LJJLIIIIJ(new OSZ("tab_name", "repost_history"), new OSZ("enter_from", str2), new OSZ("to_user_id", str3), new OSZ("enter_method", str4)));
    }

    public static void LJJI(Context context, String beforeTab, int i, String enterMethod) {
        o.LJIIIZ(beforeTab, "beforeTab");
        o.LJIIIZ(enterMethod, "enterMethod");
        if (context instanceof InterfaceC55058LjC) {
            FMX.LJIIL("tiktokec_enter_list", C113554cx.LJJLIIIIJ(new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("page_name", "personal_homepage"), new OSZ("enter_from", "personal_homepage"), new OSZ("list_name", "favorite"), new OSZ("list_num", String.valueOf(i)), new OSZ("previous_page", "personal_homepage"), new OSZ("previous_list_name", beforeTab), new OSZ("enter_method", enterMethod)));
        }
    }

    public static final void LJJII(int i, long j, Context context, String beforeTab) {
        o.LJIIIZ(beforeTab, "beforeTab");
        if ((context instanceof InterfaceC55058LjC) && o.LJ(beforeTab, "favorite")) {
            FMX.LJIIL("tiktokec_stay_list", C113554cx.LJJLIIIIJ(new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI"), new OSZ("page_name", "personal_homepage"), new OSZ("enter_from", "personal_homepage"), new OSZ("list_name", "favorite"), new OSZ("list_num", String.valueOf(i)), new OSZ("previous_page", "personal_homepage"), new OSZ("previous_list_name", beforeTab), new OSZ("stay_time", String.valueOf(j))));
        }
    }

    public static void LJJIIZ(String str, UrlModel urlModel, String str2, JSONObject jSONObject) {
        List<String> list;
        try {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("tag", str);
            List<String> list2 = null;
            if (urlModel != null) {
                list = urlModel.getUrlList();
            } else {
                list = null;
            }
            c188727au.LJFF(list, "url_model");
            c188727au.LJIIIZ("request_id", str2);
            c188727au.LJFF(jSONObject, "load_json_object");
            FMX.LJIIL("post_cover_load_error", c188727au.LIZ);
            if (urlModel != null) {
                list2 = urlModel.getUrlList();
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("tag: ");
            LIZ2.append(str);
            LIZ2.append(", urlModel: ");
            LIZ2.append(urlModel);
            LIZ2.append(", urlList: ");
            LIZ2.append(list2);
            LIZ2.append(", requestId: ");
            LIZ2.append(str2);
            LIZ2.append(", jsonObject: ");
            LIZ2.append(jSONObject);
            C221018lt.LJFF("profile.PostCover", X1D.LIZIZ(LIZ2));
        } catch (ConcurrentModificationException | Exception unused) {
        }
    }

    public static void LJ(int i, String str, boolean z, String str2, String str3) {
        String str4;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str3);
        c188727au.LJIIIZ("live_event_id", str);
        c188727au.LIZLLL(i, "live_event_cnt");
        if (z) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str4 = "1";
        }
        c188727au.LJIIIZ("is_free_event", str4);
        c188727au.LJIIIZ("action_type", str2);
        FMX.LJIIL("livesdk_live_event_card", c188727au.LIZ);
    }

    public static void LJIIZILJ(int i, String str, String str2, String str3, String str4) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "profile_visitor_list");
        c188727au.LJIIIZ("previous_page", str);
        c188727au.LJIIIZ("to_user_id", str2);
        c188727au.LJIIIZ("follow_status", str3);
        c188727au.LIZLLL(i, "unread_num");
        if (str4 != null) {
            c188727au.LJI("active_status", str4);
        }
        FMX.LJIIL("profile_visitors_list_show", c188727au.LIZ);
    }

    public static void LJJIII(String str, String str2, String str3, String str4, String str5) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str5, "previousMehtod");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("to_user_id", str2);
        LIZ2.LJIIIZ("group_id", str3);
        LIZ2.LJIIIZ("ranking_method", str4);
        LIZ2.LJIIIZ("previous_method", str5);
        LIZ2.LJIIIZ("current_tab", "output");
        FMX.LJIIL("click_profile_vv_ranking", LIZ2.LIZ);
    }

    public static void LJJIJIIJIL(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ(str4, str2);
        if (z) {
            str5 = "anchor";
        } else {
            str5 = "user";
        }
        oszArr[1] = new OSZ("user_type", str5);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (!z) {
            LJJLIIIIJ.put("subscribe_state", str3);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIIZZ(LJJLIIIIJ);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public static void LJJIIZI(String str, Integer num, String str2, User user, String str3, int i) {
        String str4;
        TabSetting tabSetting;
        ShopTab shopTab;
        String str5 = str3;
        if ((i & 256) != 0) {
            str5 = null;
        }
        String str6 = "";
        if ((i & 512) != 0) {
            str4 = "";
        } else {
            str4 = "shop_list";
        }
        java.util.Map<String, String> LLJLLIL = Z9N.LIZIZ.LLJLLIL(str2, "");
        String str7 = LLJLLIL.get("search_id");
        String str8 = LLJLLIL.get("search_result_id");
        if (user != null && (tabSetting = user.getTabSetting()) != null && (shopTab = tabSetting.shopTab) != null) {
            String shopSchemaV2 = shopTab.shopSchemaV2;
            String shopSchema = shopTab.shopSchema;
            if (C78857UxB.LJJJIL(shopSchemaV2)) {
                o.LJIIIIZZ(shopSchemaV2, "shopSchemaV2");
                android.net.Uri parse = UriProtector.parse(shopSchemaV2);
                o.LJIIIIZZ(parse, "Uri.parse(this)");
                str6 = UriProtector.getQueryParameter(parse, "sellerId");
            } else if (C78857UxB.LJJJIL(shopSchema)) {
                o.LJIIIIZZ(shopSchema, "shopSchema");
                android.net.Uri parse2 = UriProtector.parse(shopSchema);
                o.LJIIIIZZ(parse2, "Uri.parse(this)");
                str6 = UriProtector.getQueryParameter(parse2, "sellerId");
            }
        }
        EcommerceStoreBizLogServiceImpl.LJI().LIZ(user, str6, str, num, str2, null, null, str7, str8, str5, str4);
    }
}
