package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IGZ {
    public static final IHZ LIZ = new IHZ("onPlayProgressChange_fyp");

    public static void LIZ(String str, String str2, String str3, float f) {
        if (o.LJ("homepage_hot", str2) && f > 1.0f && f < 3.0f) {
            IHZ ihz = LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str3);
            LIZ2.append(" progress: ");
            LIZ2.append(f);
            LIZ2.append(", aid: ");
            LIZ2.append(str);
            ihz.LJIIIZ("onPlayProgressChange_fyp", null, X1D.LIZIZ(LIZ2));
        }
    }
}
