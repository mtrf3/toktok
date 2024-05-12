package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PRE implements PQN {
    @Override // X.PQN
    public final void LIZIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        if (C60792a3.LIZ()) {
            if (!C64448PRc.LIZIZ) {
                C64448PRc.LIZ(new C48863JFr(), new C72085SQv(), new C47261Igj(), new C66851QLn());
            }
            C64448PRc.LIZIZ(scene);
        }
    }

    @Override // X.PQN
    public final void onStop(String scene) {
        o.LJIIIZ(scene, "scene");
        if (C60792a3.LIZ()) {
            C64448PRc.LIZJ(scene);
        }
    }
}
