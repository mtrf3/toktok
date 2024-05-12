package X;

import com.bytedance.keva.Keva;
import defpackage.m0;
import kotlin.jvm.internal.o;

/* renamed from: X.5Sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135125Sa {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C5SZ.LJLIL);

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static boolean LIZIZ(String str) {
        if (str == null) {
            return false;
        }
        return m0.LIZLLL("large_followings", str, LIZ(), false);
    }

    public static boolean LIZJ(String uid) {
        o.LJIIIZ(uid, "uid");
        return m0.LIZLLL("guideAnimUidShow_", uid, LIZ(), false);
    }

    public static void LIZLLL(String uid) {
        o.LJIIIZ(uid, "uid");
        C65429Pm5.LJ("guideAnimUidShow_", uid, LIZ(), true);
    }
}
