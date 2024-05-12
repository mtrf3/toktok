package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KuX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53213KuX {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C52652KlU.LJLIL);

    public static boolean LIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        if (o.LJ(scene, "others_homepage") || o.LJ(scene, "personal_homepage") || o.LJ(scene, "general_search") || o.LJ(scene, "single_song")) {
            return true;
        }
        return false;
    }
}
