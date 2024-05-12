package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class DPP {
    public static int LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C33771DNf.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(DPU.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C33774DNi.LJLIL);

    public static int LIZ() {
        Object LIZ2;
        if (LIZ == 0) {
            try {
                LIZ2 = Integer.valueOf(FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_coldboot_background_opt(), "new_user_coldboot_background_opt"));
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (C3C5.m10exceptionOrNullimpl(LIZ2) != null) {
                LIZ2 = 0;
            }
            LIZ = ((Number) LIZ2).intValue();
        }
        return LIZ;
    }

    public static final boolean LIZIZ() {
        return ((Boolean) LIZLLL.getValue()).booleanValue();
    }
}
