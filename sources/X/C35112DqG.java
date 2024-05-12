package X;

import kotlin.jvm.internal.o;

/* renamed from: X.DqG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35112DqG {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C35110DqE.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35113DqH.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C35111DqF.LJLIL);

    public static boolean LIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        if (((Boolean) LIZJ.getValue()).booleanValue() && !o.LJ(scene, "homepage_hot") && !o.LJ(scene, "system_launch")) {
            return false;
        }
        return true;
    }
}
