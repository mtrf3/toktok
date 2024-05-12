package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;

/* loaded from: classes10.dex */
public final class LJE {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZJ(int i) {
        return i * 24 * 60 * 60 * 1000;
    }

    public static boolean LIZ() {
        Keva keva = LJ6.LIZ;
        int i = keva.getInt(LJ6.LIZJ("nearby_gps_permission_dialog_last_action"), 0);
        long currentTimeMillis = System.currentTimeMillis() - keva.getLong(LJ6.LIZJ("nearby_gps_permission_dialog_show_time"), 0L);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("canShowPermissionDialog: timeGap in day: ");
        LIZ2.append(currentTimeMillis / 86400000);
        LIZ2.append(", normalTimeLimit: ");
        LIZ2.append(NearbyTabConfig.LJ());
        LIZ2.append(", allowOnceFreq: ");
        LIZ2.append(NearbyTabConfig.LIZ());
        LIZ2.append(", lastUserAction: ");
        LIZ2.append(i);
        LIZ2.append(", ");
        L8O.LIZ(X1D.LIZIZ(LIZ2));
        long LIZJ = LIZJ(7);
        if (i != 1) {
            if ((i != 2 && i != 3) || NearbyTabConfig.LJ() == -1) {
                return true;
            }
            if (NearbyTabConfig.LJ() > 0) {
                LIZJ = LIZJ(NearbyTabConfig.LJ());
            }
            if (currentTimeMillis <= LIZJ) {
                return false;
            }
            return true;
        }
        if (NearbyTabConfig.LIZ() == -1) {
            return true;
        }
        if (NearbyTabConfig.LIZ() > 0) {
            LIZJ = LIZJ(NearbyTabConfig.LIZ());
        }
        if (currentTimeMillis <= LIZJ) {
            return false;
        }
        return true;
    }

    public static void LJFF() {
        LJ6.LIZ.storeLong(LJ6.LIZJ("nearby_turn_on_banner_show_time"), System.currentTimeMillis());
    }

    public static boolean LIZIZ() {
        int i;
        int i2;
        long j;
        Integer num = NearbyTabConfig.LIZIZ().bannerPopupFreq;
        if (num != null && num.intValue() < 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - LJ6.LIZ.getLong(LJ6.LIZJ("nearby_turn_on_banner_show_time"), 0L);
        Integer num2 = NearbyTabConfig.LIZIZ().bannerPopupFreq;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 1;
        }
        if (i == 0) {
            j = 86400000;
        } else {
            Integer num3 = NearbyTabConfig.LIZIZ().bannerPopupFreq;
            if (num3 != null) {
                i2 = num3.intValue();
            } else {
                i2 = 1;
            }
            j = i2 * 24 * 60 * 60 * 1000;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("canShowTurnOnBanner: timeGap: ");
        LIZ2.append(currentTimeMillis / 86400000);
        LIZ2.append(", timeLimit: ");
        LIZ2.append(j / 86400000);
        L8O.LIZ(X1D.LIZIZ(LIZ2));
        if (currentTimeMillis > j) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("justShowOnceHasNotConsume(), getJustOnceIntroShowTime(): ");
        Keva keva = LJ6.LIZ;
        LIZ2.append(keva.getLong(LJ6.LIZJ("just_once_nearby_intro_show_time"), 0L));
        L8O.LIZ(X1D.LIZIZ(LIZ2));
        if (keva.getLong(LJ6.LIZJ("just_once_nearby_intro_show_time"), 0L) <= 0) {
            return true;
        }
        return false;
    }

    public static void LJ(int i) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onUserActionInPermissionDialogInNearby, action: ");
        LIZ2.append(i);
        L8O.LIZ(X1D.LIZIZ(LIZ2));
        LJ6.LIZ.storeInt(LJ6.LIZJ("nearby_gps_permission_dialog_last_action"), i);
    }
}
