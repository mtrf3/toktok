package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.E7k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35908E7k {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C35909E7l.LJLIL);

    static {
        if (LIZIZ().getBoolean("key_compatible_fyp_popup", false)) {
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) LIZLLL("fyp_poi_permission_popup_showed")).entrySet()) {
            Keva LIZIZ = LIZIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("fyp_poi_permission_popup_showed_");
            LIZ2.append((String) entry.getKey());
            LIZIZ.storeBoolean(X1D.LIZIZ(LIZ2), ((Boolean) entry.getValue()).booleanValue());
        }
        for (Map.Entry entry2 : ((LinkedHashMap) LIZLLL("fyp_poi_permission_popup_time")).entrySet()) {
            try {
                Keva LIZIZ2 = LIZIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("fyp_poi_permission_popup_time_");
                LIZ3.append((String) entry2.getKey());
                LIZIZ2.storeLong(X1D.LIZIZ(LIZ3), CastLongProtector.parseLong((String) entry2.getValue()));
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        LIZIZ().storeBoolean("key_compatible_fyp_popup", true);
    }

    public static Keva LIZIZ() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public static long LIZ() {
        Keva LIZIZ = LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("app_first_launch_time_");
        LIZ2.append(((RBX) HG3.LJIILL()).getCurUserId());
        return LIZIZ.getLong(X1D.LIZIZ(LIZ2), -1L);
    }

    public static int LIZJ() {
        return LIZIZ().getInt("system_location_permission_show_count", 0);
    }

    public static java.util.Map LIZLLL(String str) {
        String string = LIZIZ().getString(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String it = keys.next();
                    o.LJIIIIZZ(it, "it");
                    linkedHashMap.put(it, jSONObject.opt(it));
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return linkedHashMap;
    }

    public static void LJ(String uid) {
        o.LJIIIZ(uid, "uid");
        if (C2QE.LIZ()) {
            C65429Pm5.LJ("fyp_poi_permission_popup_showed_", uid, LIZIZ(), true);
            return;
        }
        java.util.Map LIZLLL = LIZLLL("fyp_poi_permission_popup_showed");
        LIZLLL.put(uid, Boolean.TRUE);
        LIZIZ().storeString("fyp_poi_permission_popup_showed", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), LIZLLL));
        LJFF(System.currentTimeMillis(), uid);
    }

    public static void LJFF(long j, String uid) {
        o.LJIIIZ(uid, "uid");
        if (C2QE.LIZ()) {
            Keva LIZIZ = LIZIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("fyp_poi_permission_popup_time_");
            LIZ2.append(uid);
            LIZIZ.storeLong(X1D.LIZIZ(LIZ2), j);
            return;
        }
        java.util.Map LIZLLL = LIZLLL("fyp_poi_permission_popup_time");
        LIZLLL.put(uid, String.valueOf(j));
        LIZIZ().storeString("fyp_poi_permission_popup_time", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), LIZLLL));
    }
}
