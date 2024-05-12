package X;

import com.bytedance.keva.Keva;

/* renamed from: X.3sP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97653sP {
    public static final Keva LIZ = Keva.getRepo("unified_frequency_control_repo");
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C97693sT.LJLIL);

    public static boolean LIZ() {
        if (System.currentTimeMillis() - LIZ.getLong("key_unified_push_permission", 0L) > ((Number) LIZIZ.getValue()).longValue() * 86400000) {
            return true;
        }
        return false;
    }
}
