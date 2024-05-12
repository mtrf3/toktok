package X;

import android.text.TextUtils;

/* renamed from: X.ODj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61543ODj {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL = 1;
    public int LJ;
    public int LJFF;
    public String LJI;

    public static String LIZ(java.util.Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = map.get("x-tt-logid");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String str2 = map.get("X-Tt-Logid");
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            String str3 = map.get("X-TT-LOGID");
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return "";
    }
}
