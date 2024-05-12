package X;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EWM {
    public static final int LIZ;
    public static volatile boolean LIZIZ;
    public static final C5H3 LIZJ;
    public static final C5H3 LIZLLL;
    public static final C5H3 LJ;

    static {
        LIZ = 4;
        LIZIZ = true;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (i <= 28) {
                LIZ = 3;
            } else {
                LIZ = 4;
            }
        } else {
            LIZIZ = false;
        }
        EnumC221088m0 enumC221088m0 = EnumC221088m0.PUBLICATION;
        LIZJ = C221108m2.LIZ(enumC221088m0, EWO.LJLIL);
        LIZLLL = C221108m2.LIZ(enumC221088m0, EWK.LJLIL);
        LJ = C221108m2.LIZ(enumC221088m0, EWL.LJLIL);
    }

    public static void LIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8939054786237580891")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }
}
