package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class LQ8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        String manualRegionName;
        java.util.Map<String, String> locationCommonParamsIfHave;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LQA lqa = LQA.LIZIZ;
        HashMap<String, String> LJIL = lqa.LJIL();
        if (LJIL != null) {
            linkedHashMap.putAll(LJIL);
        }
        ILocationService LJIJJ = LocationServiceImpl.LJIJJ();
        if (LJIJJ != null && (locationCommonParamsIfHave = LJIJJ.getLocationCommonParamsIfHave()) != null) {
            linkedHashMap.putAll(locationCommonParamsIfHave);
        }
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        String str3 = CardStruct.IStatusCode.DEFAULT;
        linkedHashMap.put("is_top_tab", CardStruct.IStatusCode.DEFAULT);
        RoamingLocationInfo LJFF = LJ5.LJFF();
        int i = 0;
        if (LJFF != null && (manualRegionName = LJFF.getManualRegionName()) != null && manualRegionName.length() <= C53209KuT.LIZ() && manualRegionName.length() > 0) {
            i = 1;
        }
        linkedHashMap.put("is_city_name", String.valueOf(i));
        PermissionCache.LJLIL.getClass();
        if (PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION")) {
            str3 = "1";
        }
        linkedHashMap.put("enable_location", str3);
        FMX.LJIIL("enter_homepage_nearby", linkedHashMap);
        lqa.LJIILL();
    }
}
