package X;

import com.bytedance.keva.Keva;

/* renamed from: X.4LB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LB {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C4LC.LJLIL);

    public static boolean LIZ() {
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tooltip_shown_");
        LIZ2.append(C80763Ey.LIZIZ());
        return keva.getBoolean(X1D.LIZIZ(LIZ2), false);
    }

    public static void LIZIZ() {
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tooltip_shown_");
        LIZ2.append(C80763Ey.LIZIZ());
        keva.storeBoolean(X1D.LIZIZ(LIZ2), true);
    }
}
