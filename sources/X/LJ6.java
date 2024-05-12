package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJ6 {
    public static final Keva LIZ;

    static {
        Keva repo = Keva.getRepo("Nearby-Keva");
        o.LJIIIIZZ(repo, "getRepo(\"Nearby-Keva\")");
        LIZ = repo;
    }

    public static RoamingLocationInfo LIZ() {
        String string = LIZ.getString(LIZJ("last_roaming_region"), null);
        if (!C78685UuP.LJJJZ(string)) {
            return null;
        }
        return (RoamingLocationInfo) JsonParseUtils.LIZJ(RoamingLocationInfo.class, string);
    }

    public static String[] LIZIZ() {
        String[] stringArray = LIZ.getStringArray("publish_landing_nearby_insert_awemes", new String[0]);
        o.LJIIIIZZ(stringArray, "INSTANCE.getStringArray(…rt_awemes\", emptyArray())");
        return stringArray;
    }

    public static String LIZJ(String str) {
        return C00F.LIZIZ(((RBX) HG3.LJIILL()).getCurUserId(), '_', str);
    }

    public static void LIZLLL(PoiData poiData) {
        if (poiData == null) {
            return;
        }
        Gson LIZ2 = GsonHolder.LIZLLL().LIZ();
        Keva keva = LIZ;
        java.util.Set<String> stringSet = keva.getStringSet("publish_landing_nearby_insert_awemes_poi", OQY.INSTANCE);
        o.LJIIIIZZ(stringSet, "INSTANCE.getStringSet(\"p…_awemes_poi\", emptySet())");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(poiData.getPoiId());
        LIZ3.append('_');
        LIZ3.append(GsonProtectorUtils.toJson(LIZ2, poiData));
        stringSet.add(X1D.LIZIZ(LIZ3));
        keva.storeStringSet("publish_landing_nearby_insert_awemes_poi", stringSet);
    }
}
