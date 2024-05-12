package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PQg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64426PQg implements PQN {
    @Override // X.PQN
    public final void LIZIZ(String scene) {
        InterfaceC64427PQh LIZ;
        o.LJIIIZ(scene, "scene");
        if (FN1.LIZ && (LIZ = C38861FMz.LIZ(scene)) != null) {
            LIZ.start();
        }
    }

    @Override // X.PQN
    public final void onStop(String scene) {
        InterfaceC64427PQh LIZ;
        o.LJIIIZ(scene, "scene");
        if (FN1.LIZ && (LIZ = C38861FMz.LIZ(scene)) != null) {
            LIZ.stop();
        }
    }
}
