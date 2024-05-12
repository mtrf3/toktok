package X;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: X.Vdl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC80201Vdl implements Runnable {
    public final View LJLIL;
    public final boolean LJLILLLLZI;
    public final /* synthetic */ SwipeDismissBehavior LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        C80203Vdn c80203Vdn;
        try {
            C270714l c270714l = this.LJLJI.LIZ;
            if (c270714l != null && c270714l.LJIIIIZZ()) {
                C16300kU.LJIIL(this.LJLIL, this);
            } else if (this.LJLILLLLZI && (c80203Vdn = this.LJLJI.LIZIZ) != null) {
                c80203Vdn.LIZ(this.LJLIL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80201Vdl(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.LJLJI = swipeDismissBehavior;
        this.LJLIL = view;
        this.LJLILLLLZI = z;
    }
}
