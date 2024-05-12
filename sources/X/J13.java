package X;

import com.ss.android.ugc.tiktok.location.permission.LocationPermissionFetcher$showGotoSettingDialog$5$1;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class J13 {
    public LocationPermissionFetcher$showGotoSettingDialog$5$1 LIZ;

    public static void LIZ(int i) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("key", "location_permission_callback");
            linkedHashMap.put("value_int1", String.valueOf(i));
            FMX.LJIIL("location_power_track", linkedHashMap);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
