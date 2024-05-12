package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.protection.common.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserDetailsInfoBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xu4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86308Xu4 {
    public static final Keva LIZ;
    public static UserNightScreenTimeSettings LIZIZ;
    public static UserDetailsInfoBean LIZJ;
    public static DoNotDisturbSettings LIZLLL;
    public static DoNotDisturbSettings LJ;
    public static List<ScreenTimeManagementDaySetting> LJFF;

    static {
        Keva repo = Keva.getRepo("protection_repo_cache");
        o.LJIIIIZZ(repo, "getRepo(PROTECTION_REPO)");
        LIZ = repo;
    }

    public static DoNotDisturbSettings LIZ() {
        if (LIZLLL == null) {
            try {
                LIZLLL = (DoNotDisturbSettings) C75792yF.LIZ(LIZ.getString(LJ("do_not_disturb_settings"), null), DoNotDisturbSettings.class);
            } catch (Exception unused) {
                LIZLLL = new DoNotDisturbSettings(null, null, null, null, null, 31, null);
            }
        }
        return LIZLLL;
    }

    public static UserNightScreenTimeSettings LIZIZ() {
        if (LIZIZ == null) {
            try {
                LIZIZ = (UserNightScreenTimeSettings) C75792yF.LIZ(LIZ.getString(LJ("night_screen_time_status"), null), UserNightScreenTimeSettings.class);
            } catch (Exception unused) {
            }
        }
        return LIZIZ;
    }

    public static List LIZJ() {
        if (LJFF == null) {
            try {
                Object LJI = GsonHolder.LIZLLL().LIZ().LJI(LIZ.getString(LJ("screen_time_management_week_settings"), null), ScreenTimeManagementDaySetting[].class);
                o.LJIIIIZZ(LJI, "get().gson.fromJson(cach…tDaySetting>::class.java)");
                LJFF = ORY.LJJZZIII((Object[]) LJI);
            } catch (Exception unused) {
            }
        }
        return LJFF;
    }

    public static DoNotDisturbSettings LIZLLL() {
        if (LJ == null) {
            try {
                LJ = (DoNotDisturbSettings) C75792yF.LIZ(LIZ.getString(LJ("system_mute_settings"), null), DoNotDisturbSettings.class);
            } catch (Exception unused) {
                LJ = new DoNotDisturbSettings(null, null, null, null, null, 31, null);
            }
        }
        return LJ;
    }

    public static String LJ(String str) {
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null || curUserId.length() == 0) {
            return str;
        }
        return i0.LJFF(str, curUserId);
    }

    public static void LJFF(UserNightScreenTimeSettings userNightScreenTimeSettings) {
        LIZIZ = userNightScreenTimeSettings;
        if (userNightScreenTimeSettings == null) {
            LIZ.erase(LJ("night_screen_time_status"));
        } else {
            LIZ.storeString(LJ("night_screen_time_status"), C75792yF.LIZJ(userNightScreenTimeSettings));
        }
    }

    public static void LJI(List list) {
        LJFF = list;
        if (list == null) {
            LIZ.erase(LJ("screen_time_management_week_settings"));
        } else {
            LIZ.storeString(LJ("screen_time_management_week_settings"), C75792yF.LIZJ(list));
        }
    }

    public static void LJII(UserDetailsInfoBean userDetailsInfoBean) {
        if (o.LJ(userDetailsInfoBean, LIZJ)) {
            return;
        }
        LIZJ = userDetailsInfoBean;
        if (userDetailsInfoBean == null) {
            LIZ.erase(LJ("user_detail_info"));
        } else {
            LIZ.storeString(LJ("user_detail_info"), C75792yF.LIZJ(userDetailsInfoBean));
        }
    }
}
