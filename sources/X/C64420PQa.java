package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PQa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64420PQa implements PQN {
    @Override // X.PQN
    public final void LIZIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        if (C53240Kuy.LIZIZ(scene)) {
            C64453PRh.LIZ(scene).LJ();
        }
    }

    @Override // X.PQN
    public final void onStop(String scene) {
        o.LJIIIZ(scene, "scene");
        if (C53240Kuy.LIZIZ(scene)) {
            C64453PRh.LIZ(scene).LIZ = false;
        }
    }
}
