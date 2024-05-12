package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.F7e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38450F7e {
    public static final C62822Ol8 LIZ;
    public static boolean LIZIZ;

    static {
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C38453F7h.LJLIL);
        LIZ = LIZIZ2;
        Object value = LIZIZ2.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        LIZIZ = ((Keva) value).getBoolean("useSurfaceView", false);
    }
}
