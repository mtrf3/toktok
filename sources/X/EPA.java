package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EPA {
    public static final C5H3 LIZ;
    public static final C5H3 LIZIZ;
    public static final C5H3 LIZJ;
    public static final C62822Ol8 LIZLLL;

    static {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        LIZ = C221108m2.LIZ(enumC221088m0, EPC.LJLIL);
        LIZIZ = C221108m2.LIZ(enumC221088m0, C36343EOd.INSTANCE);
        LIZJ = C221108m2.LIZ(enumC221088m0, EPB.LJLIL);
        LIZLLL = C221108m2.LIZIZ(EP9.LJLIL);
    }

    public static final java.util.Set<String> LIZIZ() {
        try {
            java.util.Set<String> installedModules = F5W.LIZIZ.getInstalledModules();
            o.LJIIIIZZ(installedModules, "{\n        MorpheusSplitI…er.installedModules\n    }");
            return installedModules;
        } catch (Throwable unused) {
            return C77275UUl.LJII("!!ERROR!!");
        }
    }

    public static final int LIZJ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final java.util.Set<String> LIZ() {
        java.util.Set<String> LJLIL;
        Context LIZIZ2 = EF7.LIZIZ();
        try {
            String[] strArr = C16880lQ.LLLLLLZ(LIZIZ2.getPackageManager(), LIZIZ2.getPackageName(), 0).splitNames;
            if (strArr == null || (LJLIL = ORY.LJLIL(strArr)) == null) {
                return OQY.INSTANCE;
            }
            return LJLIL;
        } catch (Throwable unused) {
            return OQY.INSTANCE;
        }
    }
}
