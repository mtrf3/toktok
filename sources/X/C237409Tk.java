package X;

import com.bytedance.keva.Keva;
import com.google.gson.s;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.9Tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237409Tk {
    public static ProfileUser LIZ;
    public static ProfileUser LIZIZ;
    public static final Keva LIZJ = Keva.getRepo("profile_page_model_file");
    public static volatile Object LIZLLL = new Object();
    public static final String LJ;
    public static final String LJFF;

    static {
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(new LEA() { // from class: X.9Tc
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5 = null;
                if (!z) {
                    StringBuilder LJ2 = C7MY.LJ("type: ", i, " failed, nickname:");
                    if (user != null) {
                        str4 = user.getNickname();
                    } else {
                        str4 = null;
                    }
                    LJ2.append(str4);
                    LJ2.append(" , uid:");
                    if (user != null) {
                        str5 = user.getUid();
                    }
                    b0.LJFF(LJ2, str5, LJ2, "Profile.ProfilePageModelStore");
                    return;
                }
                if (i == 3) {
                    Keva keva = C237409Tk.LIZJ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("profile_page_model_");
                    if (user != null) {
                        str = user.getUid();
                    } else {
                        str = null;
                    }
                    LIZ2.append(str);
                    keva.erase(X1D.LIZIZ(LIZ2));
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("account logout nickname: ");
                    if (user != null) {
                        str2 = user.getNickname();
                    } else {
                        str2 = null;
                    }
                    LIZ3.append(str2);
                    LIZ3.append(", uid:");
                    if (user != null) {
                        str3 = user.getUid();
                    } else {
                        str3 = null;
                    }
                    b0.LJFF(LIZ3, str3, LIZ3, "Profile.ProfilePageModelStore");
                    C237409Tk.LIZ = null;
                    return;
                }
                StringBuilder LJ3 = C7MY.LJ("type: ", i, ", re load profile user, curAccount: ");
                LJ3.append(((RBX) HG3.LJIILL()).getCurUser().getNickname());
                LJ3.append(", uid:");
                LJ3.append(((RBX) HG3.LJIILL()).getCurUser().getUid());
                C221018lt.LJFF("Profile.ProfilePageModelStore", X1D.LIZIZ(LJ3));
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C237319Tb(null), 3);
            }
        });
        LJ = "\n        {\n            \"nav_bar\":{\n                \"component_id\":\"nav_bar\",\n                \"name\":\"nav_bar\",\n                \"components\":[\n                    {\n                        \"component_id\":\"nav_bar_center\",\n                        \"name\":\"nav_bar_center\",\n                        \"components\":[\n                            {\n                                \"component_id\":\"nav_bar_center_nickname\",\n                                \"name\":\"nav_bar_center_nickname\",\n                                \"biz_data\":{\n                                    \"icon\":{\n                                        \"icon_key\":\"icon_chevron_down_fill\"\n                                    }\n                                }\n                            }\n                        ]\n                    },\n                    {\n                        \"component_id\":\"nav_bar_end\",\n                        \"name\":\"nav_bar_end\",\n                        \"components\":[\n                            {\n                                \"component_id\":\"nav_bar_end_settings\",\n                                \"name\":\"nav_bar_end_settings\",\n                                \"biz_data\":{\n                                    \"icon\":{\n                                        \"icon_key\":\"icon_3_lines_horizontal_2\"\n                                    }\n                                }\n                            }\n                        ]\n                    }\n                ]\n            },\n            \"header\":{\n                \"component_id\":\"header\",\n                \"name\":\"header\",\n                \"components\":[\n                    {\n                        \"component_id\":\"header_avatar\",\n                        \"name\":\"header_avatar\",\n                        \"components\":[\n                            {\n                                \"component_id\":\"avatar_normal\",\n                                \"name\":\"avatar_normal\",\n                                \"biz_data\":{\n\n                                }\n                            }\n                        ]\n                    },\n                    {\n                        \"component_id\":\"info\",\n                        \"name\":\"info\",\n                        \"components\":[\n                            {\n                                \"component_id\":\"user_info\",\n                                \"name\":\"user_info\",\n                                \"components\":[\n                                    {\n                                        \"component_id\":\"user_account_base_info\",\n                                        \"name\":\"user_account_base_info\",\n                                        \"components\":[\n                                            {\n                                                \"component_id\":\"user_account_user_name\",\n                                                \"name\":\"user_account_user_name\",\n                                                \"biz_data\":{\n                                                    \"username_update_reminder\":false,\n                                                    \"describe\":{\n                                                        \"text\":\"@\"\n                                                    }\n                                                }\n                                            }\n                                        ]\n                                    }\n                                ]\n                            },\n                            {\n                                \"component_id\":\"user_relation_info\",\n                                \"name\":\"user_relation_info\",\n                                \"components\":[\n                                    {\n                                        \"component_id\":\"relation_info_following\",\n                                        \"name\":\"relation_info_following\",\n                                        \"biz_data\":{\n                                            \"describe\":{\n                                                \"starling_key\":\"mus_following\"\n                                            }\n                                        }\n                                    },\n                                    {\n                                        \"component_id\":\"relation_info_follower\",\n                                        \"name\":\"relation_info_follower\",\n                                        \"biz_data\":{\n                                            \"describe\":{\n                                                \"starling_key\":\"mus_follower\"\n                                            }\n                                        }\n                                    },\n                                    {\n                                        \"component_id\":\"relation_info_like\",\n                                        \"name\":\"relation_info_like\",\n                                        \"biz_data\":{\n                                            \"describe\":{\n                                                \"starling_key\":\"mus_hearts\"\n                                            }\n                                        }\n                                    }\n                                ]\n                            }\n                        ]\n                    },\n                    {\n                        \"component_id\":\"cta\",\n                        \"name\":\"cta\",\n                        \"components\":[\n                            {\n                                \"component_id\":\"cta_edit_profile\",\n                                \"name\":\"cta_edit_profile\",\n                                \"biz_data\":{\n                                    \"describe\":{\n                                        \"starling_key\":\"edit_profile\"\n                                    }\n                                },\n                                \"action\":[\n                                    {\n                                        \"type\":\"router\",\n                                        \"router\":{\n                                            \"url\":\"aweme://profile_edit\"\n                                        }\n                                    }\n                                ]\n                            }\n                        ]\n                    }\n                ]\n            },\n            \"profile_tab\":{\n                \"component_id\":\"profile_tab\",\n                \"name\":\"profile_tab\",\n                \"components\":[\n                    {\n                        \"component_id\":\"profile_tab_public_post\",\n                        \"name\":\"profile_tab_public_post\",\n                        \"biz_data\":{\n                            \"icon\":{\n                                \"icon_key\":\"icon_3pt_collection\"\n                            },\n                            \"user_profile_guide\":[\n                                {\n                                    \"guide_text\":\"\",\n                                    \"guide_key\":\"\"\n                                }\n                            ],\n                            \"user_now_pack_info\":{\n                                \"user_now_status\":1\n                            }\n                        }\n                    },\n                    {\n                        \"component_id\":\"profile_tab_private\",\n                        \"name\":\"profile_tab_private\",\n                        \"biz_data\":{\n                            \"icon\":{\n                                \"icon_key\":\" icon_3pt_lock_keyhole\"\n                            }\n                        }\n                    },\n                    {\n                        \"component_id\":\"profile_tab_favorite\",\n                        \"name\":\"profile_tab_favorite\",\n                        \"icon\":{\n                            \"icon_key\":\"icon_3pt_bookmark_eye_slash\"\n                        }\n                    },\n                    {\n                        \"component_id\":\"profile_tab_like\",\n                        \"name\":\"profile_tab_like\",\n                        \"biz_data\":{\n                            \"icon\":{\n                                \"icon_key\":\"icon_3pt_heart\"\n                            }\n                        }\n                    }\n                ]\n            },\n            \"common\":{\n                \"mode\":\"normal_mode\"\n            }\n        }\n    ";
        LJFF = "\n        {\n\t\"nav_bar\": {\n\t\t\"component_id\": \"nav_bar\",\n\t\t\"name\": \"nav_bar\",\n\t\t\"components\": [\n\t\t\t{\n\t\t\t\t\"component_id\": \"nav_bar_center\",\n\t\t\t\t\"name\": \"nav_bar_center\",\n\t\t\t\t\"components\": [\n\t\t\t\t\t{\n\t\t\t\t\t\t\"component_id\": \"nav_bar_center_nickname\",\n\t\t\t\t\t\t\"name\": \"nav_bar_center_nickname\",\n\t\t\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\t\t\"icon\": {\n\t\t\t\t\t\t\t\t\"icon_key\": \"icon_chevron_down_fill\"\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t]\n\t\t\t},\n\t\t\t{\n\t\t\t\t\"component_id\": \"nav_bar_end\",\n\t\t\t\t\"name\": \"nav_bar_end\",\n\t\t\t\t\"components\": [\n\t\t\t\t\t{\n\t\t\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\t\t\"icon\": {\n\t\t\t\t\t\t\t\t\"icon_key\": \"icon_bell_activation\"\n\t\t\t\t\t\t\t},\n\t\t\t\t\t\t\t\"live_push_notification_status\": 2,\n\t\t\t\t\t\t\t\"nudge_guide_info\": {\n\t\t\t\t\t\t\t\t\"guide_time\": 0,\n\t\t\t\t\t\t\t\t\"show_guide\": false\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t},\n\t\t\t\t\t\t\"component_id\": \"nav_bar_end_bell\",\n\t\t\t\t\t\t\"name\": \"nav_bar_end_bell\"\n\t\t\t\t\t},\n\t\t\t\t\t{\n\t\t\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\t\t\"icon\": {\n\t\t\t\t\t\t\t\t\"icon_key\": \"icon_arrow_turn_up_right\"\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t},\n\t\t\t\t\t\t\"component_id\": \"nav_bar_end_more\",\n\t\t\t\t\t\t\"name\": \"nav_bar_end_more\"\n\t\t\t\t\t}\n\t\t\t\t]\n\t\t\t}\n\t\t]\n\t},\n\t\"header\": {\n\t\t\"component_id\": \"header\",\n\t\t\"name\": \"header\",\n\t\t\"components\": [\n\t\t\t{\n\t\t\t\t\"component_id\": \"header_avatar\",\n\t\t\t\t\"name\": \"header_avatar\",\n\t\t\t\t\"components\": [\n\t\t\t\t\t{\n\t\t\t\t\t\t\"component_id\": \"avatar_normal\",\n\t\t\t\t\t\t\"name\": \"avatar_normal\",\n\t\t\t\t\t\t\"biz_data\": {}\n\t\t\t\t\t}\n\t\t\t\t]\n\t\t\t},\n\t\t\t{\n\t\t\t\t\"component_id\": \"info\",\n\t\t\t\t\"name\": \"info\",\n\t\t\t\t\"components\": [\n\t\t\t\t\t{\n\t\t\t\t\t\t\"component_id\": \"user_info\",\n\t\t\t\t\t\t\"name\": \"user_info\",\n\t\t\t\t\t\t\"components\": [\n\t\t\t\t\t\t\t{\n\t\t\t\t\t\t\t\t\"component_id\": \"user_account_base_info\",\n\t\t\t\t\t\t\t\t\"name\": \"user_account_base_info\",\n\t\t\t\t\t\t\t\t\"components\": [\n\t\t\t\t\t\t\t\t\t{\n\t\t\t\t\t\t\t\t\t\t\"component_id\": \"user_account_user_name\",\n\t\t\t\t\t\t\t\t\t\t\"name\": \"user_account_user_name\",\n\t\t\t\t\t\t\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\t\t\t\t\t\t\"username_update_reminder\": false,\n\t\t\t\t\t\t\t\t\t\t\t\"describe\": {\n\t\t\t\t\t\t\t\t\t\t\t\t\"text\": \"@\"\n\t\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t]\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t]\n\t\t\t\t\t},\n\t\t\t\t\t{\n\t\t\t\t\t\t\"component_id\": \"user_relation_info\",\n\t\t\t\t\t\t\"name\": \"user_relation_info\",\n\t\t\t\t\t\t\"components\": [\n\t\t\t\t\t\t\t{\n\t\t\t\t\t\t\t\t\"component_id\": \"relation_info_following\",\n\t\t\t\t\t\t\t\t\"name\": \"relation_info_following\",\n\t\t\t\t\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\t\t\t\t\"describe\": {\n\t\t\t\t\t\t\t\t\t\t\"starling_key\": \"mus_following\"\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t},\n\t\t\t\t\t\t\t{\n\t\t\t\t\t\t\t\t\"component_id\": \"relation_info_follower\",\n\t\t\t\t\t\t\t\t\"name\": \"relation_info_follower\",\n\t\t\t\t\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\t\t\t\t\"describe\": {\n\t\t\t\t\t\t\t\t\t\t\"starling_key\": \"mus_follower\"\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t},\n\t\t\t\t\t\t\t{\n\t\t\t\t\t\t\t\t\"component_id\": \"relation_info_like\",\n\t\t\t\t\t\t\t\t\"name\": \"relation_info_like\",\n\t\t\t\t\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\t\t\t\t\"describe\": {\n\t\t\t\t\t\t\t\t\t\t\"starling_key\": \"mus_hearts\"\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t]\n\t\t\t\t\t}\n\t\t\t\t]\n\t\t\t},\n\t\t\t{\n\t\t\t\t\"component_id\": \"cta\",\n\t\t\t\t\"components\": [\n\t\t\t\t\t{\n\t\t\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\t\t\"can_message_follow_status_list\": [\n\t\t\t\t\t\t\t\t0,\n\t\t\t\t\t\t\t\t1,\n\t\t\t\t\t\t\t\t2,\n\t\t\t\t\t\t\t\t4\n\t\t\t\t\t\t\t],\n\t\t\t\t\t\t\t\"show_messaging_entrance_on_profile\": false\n\t\t\t\t\t\t},\n\t\t\t\t\t\t\"component_id\": \"cta_social_interaction\",\n\t\t\t\t\t\t\"name\": \"cta_social_interaction\"\n\t\t\t\t\t},\n\t\t\t\t\t{\n\t\t\t\t\t\t\"component_id\": \"cta_recommend_button\",\n\t\t\t\t\t\t\"name\": \"cta_recommend_button\"\n\t\t\t\t\t}\n\t\t\t\t],\n\t\t\t\t\"name\": \"cta\"\n\t\t\t},\n\t\t\t{\n\t\t\t\t\"component_id\": \"bio\",\n\t\t\t\t\"components\": [\n\t\t\t\t\t{\n\t\t\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\t\t\"describe\": {\n\t\t\t\t\t\t\t\t\"text\": \"\"\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t},\n\t\t\t\t\t\t\"component_id\": \"bio_signature\",\n\t\t\t\t\t\t\"name\": \"bio_signature\"\n\t\t\t\t\t}\n\t\t\t\t],\n\t\t\t\t\"name\": \"bio\"\n\t\t\t}\n\t\t]\n\t},\n\t\"profile_tab\": {\n\t\t\"component_id\": \"profile_tab\",\n\t\t\"name\": \"profile_tab\",\n\t\t\"components\": [\n\t\t\t{\n\t\t\t\t\"component_id\": \"profile_tab_public_post\",\n\t\t\t\t\"name\": \"profile_tab_public_post\",\n\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\"icon\": {\n\t\t\t\t\t\t\"icon_key\": \"icon_3pt_collection\"\n\t\t\t\t\t},\n\t\t\t\t\t\"user_profile_guide\": [\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t\"guide_text\": \"\",\n\t\t\t\t\t\t\t\"guide_key\": \"\"\n\t\t\t\t\t\t}\n\t\t\t\t\t],\n\t\t\t\t\t\"user_now_pack_info\": {\n\t\t\t\t\t\t\"user_now_status\": 1\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t},\n\t\t\t{\n\t\t\t\t\"component_id\": \"profile_tab_like\",\n\t\t\t\t\"name\": \"profile_tab_like\",\n\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\"icon\": {\n\t\t\t\t\t\t\"icon_key\": \"icon_3pt_heart\"\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t]\n\t},\n\t\"common\": {\n\t\t\"mode\": \"normal_mode\"\n\t}\n}\n  \n    ";
    }

    public static ProfileUser LIZIZ(String str) {
        ProfileUser profileUser = LIZ;
        if (profileUser != null) {
            return profileUser;
        }
        LIZ(str, true);
        return LIZ;
    }

    public static void LIZJ(ProfileUser profileUser) {
        if (profileUser == null) {
            return;
        }
        synchronized (LIZLLL) {
            LIZ = profileUser;
            try {
                Keva keva = LIZJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("profile_page_model_");
                LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                String LIZIZ3 = C237429Tm.LIZIZ(profileUser);
                if (LIZIZ3 == null) {
                    LIZIZ3 = "";
                }
                keva.storeString(LIZIZ2, LIZIZ3);
            } catch (Throwable th) {
                C221018lt.LIZJ("Profile.ProfilePageModelStore", "updatePageModel exception: ", th.getCause());
            }
        }
    }

    public static void LIZ(String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (z) {
                synchronized (LIZLLL) {
                    Keva pageModelKeVa = LIZJ;
                    o.LJIIIIZZ(pageModelKeVa, "pageModelKeVa");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("profile_page_model_");
                    LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
                    String LJJIFFI = C79057V0z.LJJIFFI(pageModelKeVa, X1D.LIZIZ(LIZ2));
                    ProfileUser profileUser = null;
                    try {
                        Object LJII = C27739Aud.LJFF().LJII(LJJIFFI, C65330PkU.LIZJ(C65352Pkq.LIZLLL(ProfileUser.class)));
                        if (!(LJII instanceof ProfileUser)) {
                            LJII = null;
                        }
                        profileUser = (ProfileUser) LJII;
                    } catch (s unused) {
                    }
                    LIZ = profileUser;
                    if (profileUser == null) {
                        LIZ = (ProfileUser) C237429Tm.LIZ(LJ, ProfileUser.class);
                    }
                }
            } else if (LIZIZ == null) {
                LIZIZ = (ProfileUser) C237429Tm.LIZ(LJFF, ProfileUser.class);
            }
        } catch (Throwable th) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("loadProfilePageModel exception: ");
            LIZ3.append(th.getMessage());
            C221018lt.LIZIZ("Profile.ProfilePageModelStore", X1D.LIZIZ(LIZ3));
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("profile_attributes", C237259Sv.LJIIIIZZ);
        c188727au.LJIIIZ("report_scene", str);
        c188727au.LJ(currentTimeMillis2, "profile_platform_load_page_model_cost_time");
        FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
    }
}
