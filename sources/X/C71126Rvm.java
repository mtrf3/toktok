package X;

import android.content.Context;
import android.graphics.Rect;

/* renamed from: X.Rvm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71126Rvm {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53178Kty.LJLIL);

    public static int LIZIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static Rect LIZ(Context context, InterfaceC31752CdA interfaceC31752CdA) {
        EnumC30736C4m enumC30736C4m;
        if (context == null || LIZIZ() == 0 || LIZIZ() == 1) {
            return null;
        }
        int LIZIZ = LIZIZ();
        if (LIZIZ != 2 && LIZIZ != 3) {
            enumC30736C4m = EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR;
        } else {
            enumC30736C4m = EnumC30736C4m.SLOT_LIVE_WATCHER_L2_TOOLBAR;
        }
        Rect LIZ2 = C31749Cd7.LIZ(context, enumC30736C4m);
        if (LIZ2 == null) {
            return null;
        }
        if (LIZ2.exactCenterX() == 0.0f && (LIZIZ() == 2 || LIZIZ() == 3)) {
            LIZ2.set(LIZ2.left, LIZ2.top, C60996Nwm.LJII(), LIZ2.bottom);
        }
        return LIZ2;
    }
}
