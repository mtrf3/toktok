package X;

import android.text.TextUtils;

/* renamed from: X.Mys, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58578Mys {
    public static String LIZ = "";
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C58579Myt.LJLIL);

    public static String LIZ(long j) {
        String str = (String) ((java.util.Map) LIZIZ.getValue()).get(Long.valueOf(j));
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void LIZIZ(long j) {
        String str = LIZ;
        if ((!TextUtils.isEmpty(str)) && str != null) {
            ((java.util.Map) LIZIZ.getValue()).put(Long.valueOf(j), LIZ);
        }
    }
}
