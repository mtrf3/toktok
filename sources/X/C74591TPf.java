package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.TPf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74591TPf extends C1C9 {
    @Override // X.C1C9
    public final int LJIILIIL() {
        return -1;
    }

    public C74591TPf(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        o.LJIIIZ(displayMetrics, "displayMetrics");
        return 440.0f / displayMetrics.densityDpi;
    }

    @Override // X.C1C9, X.C0AB
    public final void LJFF(View targetView, C0AC state, C0A9 action) {
        o.LJIIIZ(targetView, "targetView");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        int LJIIIIZZ = LJIIIIZZ(-1, targetView);
        int LJIIL = LJIIL(LJIIIIZZ);
        if (LJIIL > 0) {
            action.LIZIZ(-LJIIIIZZ, 0, LJIIL, this.LJII);
        }
    }
}
