package X;

import android.util.ArrayMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jr5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50451Jr5 {
    public static final ArrayMap<String, String> LIZ = new ArrayMap<>(4);

    public static String LIZ(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        ArrayMap<String, String> arrayMap = LIZ;
        if (!arrayMap.containsKey(str)) {
            return "";
        }
        String str2 = arrayMap.get(str);
        o.LJI(str2);
        return str2;
    }
}
