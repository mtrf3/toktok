package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DK3 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(DJ5.LJLIL);

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static Object LIZIZ(String str) {
        if (o.LJ(str, "added_")) {
            return Integer.valueOf(LIZ().getInt(str, -1));
        }
        if (o.LJ(str, "deleted_")) {
            return Boolean.valueOf(LIZ().getBoolean(str, false));
        }
        return null;
    }
}
