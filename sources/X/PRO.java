package X;

import Y.ARunnableS16S1000000_11;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PRO implements PQN {
    @Override // X.PQN
    public final void LIZIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        if (C34015DWp.LIZ) {
            C37179EiV.LJFF.post(new ARunnableS16S1000000_11(scene, 0));
        }
    }

    @Override // X.PQN
    public final void onStop(String scene) {
        o.LJIIIZ(scene, "scene");
        if (C34015DWp.LIZ && C35810E3q.LJIIIIZZ()) {
            Handler handler = C37179EiV.LJFF;
            handler.post(new ARunnableS16S1000000_11(scene, 1));
            handler.postDelayed(new ARunnableS16S1000000_11(scene, 2), 500L);
        }
    }
}
