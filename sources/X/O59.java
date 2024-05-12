package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O59 {
    public static O58 LIZ(JSONObject jSONObject, String str, java.util.Map map) {
        O58 o58 = new O58();
        o58.LIZLLL = str;
        o58.LIZIZ = jSONObject.optInt("rate", 75);
        String optString = jSONObject.optString("target_format");
        if (optString.length() == 0) {
            optString = O58.LJI.name();
        }
        o.LJFF(optString, "imageJson.optString(KEY_…AULT_TARGET_FORMAT.name }");
        Locale locale = Locale.US;
        o.LJFF(locale, "Locale.US");
        String upperCase = optString.toUpperCase(locale);
        o.LJFF(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        O5A valueOf = O5A.valueOf(upperCase);
        o.LJIIJ(valueOf, "<set-?>");
        o58.LIZ = valueOf;
        String optString2 = jSONObject.optString("src_format");
        if (optString2.length() == 0) {
            optString2 = O58.LJII.name();
        }
        o.LJFF(optString2, "imageJson.optString(KEY_…DEFAULT_SRC_FORMAT.name }");
        String upperCase2 = optString2.toUpperCase(locale);
        o.LJFF(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
        O5A valueOf2 = O5A.valueOf(upperCase2);
        o.LJIIJ(valueOf2, "<set-?>");
        o58.LIZJ = valueOf2;
        String string = JSONObjectProtectorUtils.getString(jSONObject, "ext_path");
        o.LJFF(string, "imageJson.getString(KEY_EXT_PATH)");
        o58.LJ = string;
        o58.LJFF = map;
        return o58;
    }
}
