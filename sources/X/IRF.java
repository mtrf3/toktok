package X;

import java.util.Random;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IRF {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(IRG.LJLIL);

    public static boolean LIZ(float f) {
        Random r = (Random) LIZ.getValue();
        o.LJIIIZ(r, "r");
        boolean z = true;
        if (f == 0.0f) {
            return false;
        }
        float f2 = f * 1.0f;
        if (f2 < 1.0f && f2 >= 0.0f && r.nextFloat() >= f2) {
            z = false;
        }
        return z;
    }
}
