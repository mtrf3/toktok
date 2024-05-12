package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.6tc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174846tc {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C174856td.LJLIL);

    public static boolean LIZ(String uid, String aid) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(aid, "aid");
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("red_dot_shown_");
        LIZ2.append(uid);
        LIZ2.append('_');
        LIZ2.append(aid);
        return !keva.getBoolean(X1D.LIZIZ(LIZ2), false);
    }

    public static void LIZIZ(String uid, String aid) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(aid, "aid");
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("red_dot_shown_");
        LIZ2.append(uid);
        LIZ2.append('_');
        LIZ2.append(aid);
        keva.storeBoolean(X1D.LIZIZ(LIZ2), true);
    }
}
