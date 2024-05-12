package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.YMm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87260YMm {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C49453Jaz.LJLIL);

    public static final String LIZ(java.util.Map<String, String> map) {
        o.LJIIIZ(map, "<this>");
        String str = map.get("group_id");
        if (str == null) {
            String str2 = map.get("aweme_id");
            if (str2 == null) {
                return map.get("from_group_id");
            }
            return str2;
        }
        return str;
    }

    public static final String LIZIZ(JSONObject jSONObject) {
        o.LJIIIZ(jSONObject, "<this>");
        String it = jSONObject.optString("group_id");
        o.LJIIIIZZ(it, "it");
        if (it.length() > 0 || 0 != 0) {
            return it;
        }
        String it2 = jSONObject.optString("aweme_id");
        o.LJIIIIZZ(it2, "it");
        if (it2.length() > 0) {
            return it2;
        }
        return jSONObject.optString("from_group_id");
    }

    public static final String LIZJ(java.util.Map<String, String> map) {
        o.LJIIIZ(map, "<this>");
        String str = map.get("enter_from");
        if (str != null && str.length() > 0) {
            return str;
        }
        return map.get("enter_from_info");
    }

    public static final String LIZLLL(JSONObject jSONObject) {
        o.LJIIIZ(jSONObject, "<this>");
        String it = jSONObject.optString("enter_from");
        o.LJIIIIZZ(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return jSONObject.optString("enter_from_info");
    }

    public static final String LJ(java.util.Map<String, String> map) {
        o.LJIIIZ(map, "<this>");
        return map.get("last_group_id");
    }

    public static final String LJFF(java.util.Map<String, String> map) {
        o.LJIIIZ(map, "<this>");
        return map.get("duration");
    }

    public static final String LJI(JSONObject jSONObject) {
        o.LJIIIZ(jSONObject, "<this>");
        return jSONObject.optString("duration");
    }

    public static final String LJII(java.util.Map<String, String> map) {
        o.LJIIIZ(map, "<this>");
        return map.get("rank");
    }

    public static final String LJIIIIZZ(JSONObject jSONObject) {
        o.LJIIIZ(jSONObject, "<this>");
        return jSONObject.optString("rank");
    }

    public static final String LJIIIZ(java.util.Map<String, String> map) {
        o.LJIIIZ(map, "<this>");
        return map.get("token_type");
    }

    public static final boolean LJIIJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return o.LJ(str, "homepage_hot");
    }

    public static final boolean LJIIJJI(java.util.Map<String, String> map) {
        o.LJIIIZ(map, "<this>");
        return o.LJ(map.get("is_search_scene"), "1");
    }
}
