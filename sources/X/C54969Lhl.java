package X;

import com.bytedance.keva.Keva;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Lhl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54969Lhl {
    public static C73411SrX LIZIZ;
    public static long LJ;
    public static int LJFF;
    public static int LJI;
    public static final Keva LIZ = Keva.getRepo("new_user_popup_clean_v2_repo");
    public static long LIZJ = System.currentTimeMillis();
    public static long LIZLLL = System.currentTimeMillis();
    public static final C55652Lsm LJII = new C55652Lsm("NewUserPopupRecordManager");

    public static float LIZJ() {
        return (((float) (System.currentTimeMillis() - LIZJ)) / 3600000.0f) + LIZ.getFloat(LIZ("nu_last_session_stay_time"), 0.0f);
    }

    public static int LIZLLL() {
        return LIZ.getInt(LIZ("nu_popup_time_window_status"), 0);
    }

    public static long LJ() {
        return LIZ.getLong(LIZ("nu_vv_count"), 0L);
    }

    public static int LJFF() {
        return LIZ.getInt(LIZ("nu_popup_vv_window_status"), 0);
    }

    public static void LJI() {
        String str = "";
        try {
            Keva keva = LIZ;
            String string = keva.getString(LIZ("nu_last_active_day"), "");
            String format = new SimpleDateFormat("yyyy-MMMM-dd", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis()));
            int i = keva.getInt(LIZ("nu_active_day"), 0);
            if (!o.LJ(format, string)) {
                i++;
            }
            keva.storeInt(LIZ("nu_active_day"), i);
            keva.storeString(LIZ("nu_last_active_day"), format);
        } catch (Exception e) {
            C55652Lsm c55652Lsm = LJII;
            String message = e.getMessage();
            if (message != null) {
                str = message;
            }
            c55652Lsm.LIZLLL(str);
        }
    }

    public static void LJII() {
        Keva keva = LIZ;
        keva.storeInt(LIZ("nu_dialog_clean_cold_start_count"), keva.getInt(LIZ("nu_dialog_clean_cold_start_count"), 0) + 1);
        LJI();
        LIZLLL = System.currentTimeMillis();
        LJFF = 0;
    }

    public static String LIZ(String str) {
        String str2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        HG3.LJIIL();
        if (HG3.LJLJL.LJFF().isLogin()) {
            str2 = ((RBX) HG3.LJIILL()).getCurSecUserId();
        } else {
            str2 = "";
        }
        LIZ2.append(str2);
        return X1D.LIZIZ(LIZ2);
    }

    public static void LJIIIIZZ(int i, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                LIZ.storeInt(LIZ("nu_popup_vv_window_status"), i2);
                return;
            }
            LIZ.storeInt(LIZ("nu_popup_time_window_status"), i2);
            return;
        }
        LJI = i2;
    }
}
