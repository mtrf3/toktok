package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73732uv {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C73742uw.LJLIL);
    public static final java.util.Map<String, AbstractC73692ur> LIZIZ = new LinkedHashMap();

    public static boolean LIZ(String bizScene) {
        o.LJIIIZ(bizScene, "bizScene");
        if (((LinkedHashMap) LIZIZ).get(bizScene) != null) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(String bizScene) {
        o.LJIIIZ(bizScene, "bizScene");
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C73752ux(bizScene, null), 3);
    }
}
