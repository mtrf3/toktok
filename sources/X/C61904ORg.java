package X;

import android.content.ContentValues;
import java.util.Map;

/* renamed from: X.ORg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61904ORg {
    public static final OQY LIZ;

    static {
        C113554cx.LJJJLIIL();
        LIZ = OQY.INSTANCE;
    }

    public static String LIZ(ContentValues contentValues, boolean z) {
        java.util.Set<Map.Entry<String, Object>> set;
        try {
            set = contentValues.valueSet();
            if (set == null) {
                set = LIZ;
            }
        } catch (Exception unused) {
            set = LIZ;
        }
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<String, Object> entry : set) {
            sb.append(entry.getKey());
            sb.append("=");
            if (z) {
                sb.append("*");
            } else {
                sb.append(entry.getValue());
            }
            sb.append(", ");
        }
        return C0EH.LIZJ(sb, "}", "sb.toString()");
    }
}
