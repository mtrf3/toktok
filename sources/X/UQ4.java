package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.lobby.auth.AuthResult;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UQ4 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LJII() {
        if (UPZ.LIZ.LIZIZ()) {
            return "on";
        }
        return "off";
    }

    public static String LJIIIIZZ() {
        if (C77134UPa.LIZ.LIZIZ()) {
            return "on";
        }
        return "off";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIZ(java.lang.String r1) {
        /*
            java.lang.String r0 = "platform"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = "facebook"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1c
            X.UUc r0 = X.C77266UUc.LIZIZ
            X.UQ5 r0 = r0.LJIIJ()
            boolean r0 = r0.LJ()
            if (r0 == 0) goto L31
        L19:
            java.lang.String r0 = "on"
        L1b:
            return r0
        L1c:
            X.UUc r0 = X.C77266UUc.LIZIZ
            X.Mfn r0 = r0.LJIILLIIL()
            boolean r1 = r0.LJ()
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            boolean r0 = X.C58743N3r.LIZ(r0)
            if (r1 == 0) goto L2f
            goto L19
        L2f:
            if (r0 == 0) goto L34
        L31:
            java.lang.String r0 = "off"
            goto L1b
        L34:
            java.lang.String r0 = "unknown"
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQ4.LJIIIZ(java.lang.String):java.lang.String");
    }

    public static String LJIIJ(String platform) {
        boolean LIZIZ;
        o.LJIIIZ(platform, "platform");
        if (o.LJ(platform, "facebook")) {
            LIZIZ = C77266UUc.LIZIZ.LJIIJ().LIZIZ();
        } else {
            LIZIZ = C77266UUc.LIZIZ.LJIILLIIL().LIZIZ();
        }
        if (LIZIZ) {
            return "on";
        }
        return "off";
    }

    public static String LJI(String str, String str2) {
        if (o.LJ(str, "on")) {
            return "uid";
        }
        if (o.LJ(str2, "off")) {
            return "both";
        }
        return "did";
    }

    public static void LJIILJJIL(int i, String str) {
        C188727au LIZJ = C78920UyC.LIZJ(i, "errorcode");
        if (str == null) {
            str = "";
        }
        LIZJ.LJIIIZ("errorMsg", str);
        FMX.LJIIL("social_pop_fail_reason", LIZJ.LIZ);
    }

    public static void LJIIJJI(java.util.Map map, String str, String str2, C188727au c188727au) {
        int currentTimeMillis;
        String str3;
        String str4;
        boolean z;
        boolean z2;
        boolean z3;
        String str5;
        boolean z4 = true;
        if (map != null) {
            if (map.containsKey("is_passive") && o.LJ(map.get("is_passive"), "on")) {
                int i = UQ2.LIZ().LIZ.getInt("reask_count", 0) + UQ2.LIZ().LIZ.getInt("contact_pop_up_count", 0);
                long j = UQ2.LIZ().LIZ.getLong("last_show_contact_time", 0L);
                if (j == 0) {
                    currentTimeMillis = 0;
                } else {
                    currentTimeMillis = (int) ((System.currentTimeMillis() - j) / 86400000);
                }
                c188727au.LIZLLL(i, "show_index");
                c188727au.LIZLLL(currentTimeMillis, "time_int");
                if (map != null) {
                    str3 = (String) map.get("is_followed_pop_up");
                } else {
                    str3 = null;
                }
                c188727au.LJI("followed_another", str3);
                if (o.LJ(str, "following_list") || o.LJ(str, "follower_list")) {
                    if (UQ2.LIZ().LIZ.getBoolean("is_my_self", false)) {
                        str4 = "personal_homepage";
                    } else {
                        str4 = "others_homepage";
                    }
                    c188727au.LJI("previous_page", str4);
                }
                Keva keva = UQ2.LIZ().LIZ;
                if (!keva.getBoolean("has_go_through_process", false) && keva.getInt("rules_major_stage", 0) < 4) {
                    z = true;
                } else {
                    z = false;
                }
                if (UQ2.LIZ().LIZ.getLong("sync_off_contact_time", 0L) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (UQ2.LIZ().LIZ.getLong("sync_off_facebook_time", 0L) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((!z2 || !o.LJ(str2, "contact")) && (!z3 || !o.LJ(str2, "facebook"))) {
                    z4 = false;
                }
                if (z) {
                    str5 = "normal";
                } else if (z4) {
                    str5 = "turn_off";
                } else {
                    str5 = "reject_all";
                }
                c188727au.LJI("reason", str5);
                return;
            }
            c188727au.LJIIIIZZ(map);
        }
    }

    public static void LJFF(String enterFrom, String enterMethod, Boolean bool, Integer num, AuthResult authResult, boolean z) {
        String str;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(authResult, "authResult");
        String valueOf = String.valueOf(authResult.mIsSuccessful);
        String valueOf2 = String.valueOf(authResult.mIsCancelled);
        String valueOf3 = String.valueOf(TextUtils.isEmpty(authResult.mToken));
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("enter_method", enterMethod);
        c188727au.LJIIIZ("platform", "facebook");
        c188727au.LJIIIZ("is_successful", valueOf);
        c188727au.LJIIIZ("is_success_auth", String.valueOf(z));
        c188727au.LJIIIZ("is_cancelled", valueOf2);
        c188727au.LJIIIZ("is_token_empty", valueOf3);
        Bundle bundle = authResult.mBundle;
        o.LJIIIIZZ(bundle, "facebookAuthResult.bundle");
        String[] stringArray = bundle.getStringArray("fb_granted_permissions");
        if (stringArray == null || stringArray.length == 0) {
            str = "";
        } else {
            str = ORY.LJJJJLL(stringArray, null, null, null, null, 63);
        }
        c188727au.LJIIIZ("fb_permissions", str);
        if (o.LJ("facebook", "facebook")) {
            c188727au.LJFF(bool, "fb_token_expired");
            if (num != null) {
                c188727au.LIZLLL(num.intValue(), "server_fb_token");
            }
        }
        FMX.LJIIL("fb_authorize_callback_track", c188727au.LIZ);
    }

    public static void LJIIL(String str, String str2, String str3, String str4, String str5, String str6, Integer num, java.util.Map map) {
        Object obj;
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str4, "enterMethod");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("pop_up_type", str2);
        LIZ2.LJIIIZ("platform", str3);
        LIZ2.LJIIIZ("did_status", str5);
        LIZ2.LJIIIZ("uid_status", str6);
        LIZ2.LJIIIZ("enter_method", str4);
        if (o.LJ(str3, "facebook")) {
            Boolean LJIIL = C77134UPa.LIZ.LJIIL(((RBX) HG3.LJIILL()).getCurUserId());
            if (LJIIL != null) {
                obj = Integer.valueOf(LJIIL.booleanValue() ? 1 : 0);
            } else {
                obj = null;
            }
            LIZ2.LJFF(obj, "fb_token_expired");
            if (num != null) {
                LIZ2.LIZLLL(num.intValue(), "server_fb_token");
            }
        }
        if (o.LJ(str3, "contact")) {
            C77266UUc.LIZIZ.LIZLLL().LJ();
        }
        LJIIJJI(map, str, str3, LIZ2);
        FMX.LJIIL("show_authorize_pop_up", LIZ2.LIZ);
    }

    public static /* synthetic */ void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6, int i, java.util.Map map, int i2) {
        java.util.Map map2 = map;
        if ((i2 & 512) != 0) {
            map2 = null;
        }
        LIZ(str, str2, str3, str4, str5, str6, 1, i, null, map2, null, null);
    }

    public static void LIZJ(String enterFrom, String popUpType, String str, String enterMethod, String authType, String str2, Boolean bool, Integer num, java.util.Map map) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(popUpType, "popUpType");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(authType, "authType");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("pop_up_type", popUpType);
        c188727au.LJIIIZ("platform", str);
        c188727au.LJIIIZ("auth_type", authType);
        c188727au.LJIIIZ("sync_type", str2);
        c188727au.LJIIIZ("enter_method", enterMethod);
        if (o.LJ(str, "facebook")) {
            c188727au.LJFF(bool, "fb_token_expired");
            if (num != null) {
                c188727au.LIZLLL(num.intValue(), "server_fb_token");
            }
        }
        LJIIJJI(map, enterFrom, str, c188727au);
        FMX.LJIIL("authorize_finish", c188727au.LIZ);
    }

    public static /* synthetic */ void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, Integer num, java.util.Map map, int i) {
        java.util.Map map2 = map;
        Integer num2 = num;
        if ((i & 128) != 0) {
            num2 = null;
        }
        if ((i & 256) != 0) {
            map2 = null;
        }
        LIZJ(str, str2, str3, str4, str5, str6, null, num2, map2);
    }

    public static /* synthetic */ void LJIILIIL(String str, String str2, String str3, String str4, String str5, String str6, Integer num, java.util.Map map, int i) {
        Integer num2 = num;
        java.util.Map map2 = null;
        if ((i & 64) != 0) {
            num2 = null;
        }
        if ((i & 128) == 0) {
            map2 = map;
        }
        LJIIL(str, str2, str3, str4, str5, str6, num2, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, Integer num, java.util.Map map, int i) {
        boolean z3 = z2;
        if ((i & 16) != 0) {
            z3 = 1;
        }
        Integer num2 = null;
        if ((i & 256) != 0) {
            num = null;
        }
        if ((i & 512) != 0) {
            map = null;
        }
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str4, "enterMethod");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("pop_up_type", str2);
        LIZ2.LJFF(Boolean.valueOf(z), "is_allow");
        LIZ2.LJIIIZ("platform", str3);
        LIZ2.LJIIIZ("did_status", str5);
        LIZ2.LJIIIZ("uid_status", str6);
        LIZ2.LJIIIZ("enter_method", str4);
        if (!z && o.LJ(str2, "system")) {
            LIZ2.LIZLLL(!z3, "deny_type");
        }
        if (o.LJ(str3, "facebook")) {
            Boolean LJIIL = C77134UPa.LIZ.LJIIL(((RBX) HG3.LJIILL()).getCurUserId());
            if (LJIIL != null) {
                num2 = Integer.valueOf(LJIIL.booleanValue() ? 1 : 0);
            }
            LIZ2.LJFF(num2, "fb_token_expired");
            if (num != null) {
                LIZ2.LIZLLL(num.intValue(), "server_fb_token");
            }
        }
        LJIIJJI(map, str, str3, LIZ2);
        FMX.LJIIL("click_authorize_pop_up", LIZ2.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Integer num, java.util.Map map, Integer num2, Integer num3) {
        C188727au LIZ2 = C78928UyK.LIZ(str, "enterFrom", str5, "enterMethod");
        LIZ2.LJIIIZ("enter_from", str);
        LIZ2.LJIIIZ("pop_up_type", str2);
        LIZ2.LJIIIZ("platform", str3);
        LIZ2.LJIIIZ("auth_type", str4);
        LIZ2.LJIIIZ("enter_method", str5);
        LIZ2.LJIIIZ("sync_type", str6);
        LIZ2.LIZLLL(i, "has_uid_errorcode");
        LIZ2.LIZLLL(i2, "retry");
        if (num2 != null) {
            LIZ2.LIZLLL(num2.intValue(), "has_token");
        }
        if (num3 != null) {
            LIZ2.LIZLLL(num3.intValue(), "has_fbsdk_errorcode");
        }
        if (o.LJ(str3, "facebook") && num != null) {
            LIZ2.LIZLLL(num.intValue(), "server_fb_token");
        }
        LJIIJJI(map, str, str3, LIZ2);
        FMX.LJIIL("authorize_fail_after_allow", LIZ2.LIZ);
    }
}
