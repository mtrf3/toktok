package X;

import android.util.Base64;
import java.util.Map;

/* renamed from: X.BTh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28833BTh {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C16880lQ.LJLLILLLL(C28833BTh.class);
    }

    public static String LIZ(String str) {
        try {
            return new String(Base64.decode(str, 2), "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String LIZIZ(java.util.Map<String, Long> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue());
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
