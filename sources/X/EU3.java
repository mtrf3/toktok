package X;

import Y.ACallableS41S0000000_6;
import Y.AObjectS22S0001000_6;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import p83.a;

/* loaded from: classes7.dex */
public final class EU3 {
    public static String LIZ;
    public static boolean LIZIZ;
    public static final SharedPreferences LIZJ;

    public static String LIZIZ(ContentResolver contentResolver) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, "android_id"};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "-5268421170780688209");
        C39519Ff9 LIZJ2 = c03880Dg.LIZJ(102003, "android/provider/Settings$System", "getString", Settings.System.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ2.LIZ) {
            c03880Dg.LIZIZ(102003, "android/provider/Settings$System", "getString", null, objArr, Settings.System.class, c65300Pk0, false);
            return (String) LIZJ2.LIZIZ;
        }
        String string = Settings.System.getString(contentResolver, "android_id");
        c03880Dg.LIZIZ(102003, "android/provider/Settings$System", "getString", string, objArr, Settings.System.class, c65300Pk0, true);
        return string;
    }

    static {
        C16880lQ.LJLLJ(EU3.class);
        LIZIZ = false;
        LIZJ = F9J.LIZIZ(EF7.LIZIZ(), 0, "gaid_sp_name");
    }

    public static String LIZJ() {
        if (LIZ == null) {
            if (Looper.myLooper() == C16880lQ.LLJJJJ() || FCO.LIZLLL) {
                return LIZJ.getString("key_gaid", "");
            }
            LJFF();
        }
        return LIZ;
    }

    public static String LIZLLL() {
        String str = LIZ;
        if (str == null) {
            if (EU2.LIZIZ()) {
                C10K.LIZIZ(new ACallableS41S0000000_6(13), C38995FSd.LIZLLL(), null);
            } else {
                C10K.LIZJ(new ACallableS41S0000000_6(14));
            }
            return LIZJ.getString("key_gaid", "");
        }
        return str;
    }

    public static void LJ() {
        String str;
        if (FCO.LIZLLL && (!C56662Kg.LIZ().LJIIIIZZ("feed_total") || LIZIZ)) {
            return;
        }
        SharedPreferences.Editor edit = LIZJ.edit();
        try {
            Context LIZIZ2 = EF7.LIZIZ();
            C39253Far.LIZJ.getClass();
            a.C0043a LIZIZ3 = C39252Faq.LIZIZ(LIZIZ2);
            if (LIZIZ3 != null && !TextUtils.isEmpty(LIZIZ3.LIZ)) {
                edit.putString("key_gaid", LIZIZ3.LIZ);
                LIZ = LIZIZ3.LIZ;
            }
        } catch (Exception unused) {
        }
        try {
            str = LIZ(EF7.LIZIZ().getContentResolver());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            edit.putString("key_android_id", str);
        }
        edit.commit();
        if (FCO.LIZLLL) {
            LIZIZ = true;
        }
    }

    public static void LJFF() {
        if (LIZIZ) {
            return;
        }
        try {
            E3F.LIZJ("aid_update_opt", new AObjectS22S0001000_6(2, 4), new AObjectS22S0001000_6(2, 5), ((Boolean) DN4.LIZJ.getValue()).booleanValue());
            AppLog.setGoogleAId(LIZ);
            if (!FCO.LIZLLL) {
                LIZIZ = true;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static String LIZ(ContentResolver contentResolver) {
        if (TextUtils.equals("android_id", "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102003)) {
                return "";
            }
            if (TextUtils.isEmpty(C36490ETu.LIZ)) {
                C36490ETu.LIZ = LIZIZ(contentResolver);
            }
            return C36490ETu.LIZ;
        }
        return LIZIZ(contentResolver);
    }
}
