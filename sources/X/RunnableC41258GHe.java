package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GHe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC41258GHe implements Runnable {
    public final /* synthetic */ C81993WFx LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    public RunnableC41258GHe(C81993WFx c81993WFx, float f) {
        this.LJLIL = c81993WFx;
        this.LJLILLLLZI = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLIL.LLLF != null) {
                this.LJLIL.scrollBy((int) (r0.getViewWidth() * this.LJLILLLLZI), 0);
            } else {
                o.LJIJI("cutMusicView");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
