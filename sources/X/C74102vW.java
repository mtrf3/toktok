package X;

import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.2vW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74102vW {
    public static final java.util.Map<String, C74092vV> LIZ = new LinkedHashMap();

    public static JSONObject LIZ(String str) {
        boolean z;
        C74092vV c74092vV;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (c74092vV = (C74092vV) ((LinkedHashMap) LIZ).get(str)) == null) {
            return null;
        }
        return c74092vV.LIZ;
    }
}
