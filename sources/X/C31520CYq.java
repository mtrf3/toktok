package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CYq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31520CYq {
    public static final HashMap<OSZ<Integer, Integer>, String> LIZ = new HashMap<>();

    public static String LIZ(int i, int i2, boolean z) {
        if (!z) {
            return LIZ.get(new OSZ(Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return LIZ.get(new OSZ(Integer.valueOf(-i), Integer.valueOf(i2)));
    }

    public static void LIZIZ(int i, int i2, String responseData, boolean z) {
        o.LJIIIZ(responseData, "responseData");
        if (!z) {
            LIZ.put(new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2)), responseData);
        } else {
            LIZ.put(new OSZ<>(Integer.valueOf(-i), Integer.valueOf(i2)), responseData);
        }
    }
}
